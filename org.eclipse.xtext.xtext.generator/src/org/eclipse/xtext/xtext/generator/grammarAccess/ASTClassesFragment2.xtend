package org.eclipse.xtext.xtext.generator.grammarAccess

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.BecomesDeclCustomAttribute
import org.eclipse.xtext.BecomesDeclGeneratedClass
import org.eclipse.xtext.EnumRule
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference

class ASTClassesFragment2 extends AbstractXtextGeneratorFragment {
	@Inject FileAccessFactory fileAccessFactory
	@Inject extension XtextGeneratorNaming
	@Inject extension ASTUtils

	override generate() {
		val generatedClasses = GrammarUtil.allMetamodelDeclarations(grammar).filter(GeneratedMetamodel).map [
			EPackage.EClassifiers
		].toList.flatten

		// whether to generate AST classes for CST classes without corresponding explicit rules  
		val enabled = (grammar.rules.get(0) as ParserRule).becomes !== null

		// list of all ast class names
		val astClassNames = newHashSet
		// ast class name -> becomes.listType
		val astClassesListType = newHashMap
		// classes generated from parser rules, mapping EClass to rule
		val objectClasses = newHashMap
		// classes generated from enum rules
		val enumClasses = newHashSet
		// ast classes that become interfaces 
		val interfaceClasses = newHashSet
		for (classifier : generatedClasses) {
			val rule = GrammarUtil.findRuleForName(grammar, classifier.name)
			if (rule === null) {
				if (enabled) {
					objectClasses.put(classifier as EClass, null)
					astClassNames.add(classifier.name.ASTClassName)
					interfaceClasses.add(classifier.name.ASTClassName)
				}
			} else if (rule instanceof ParserRule) {
				if ((rule as ParserRule).becomes !== null &&
					(rule as ParserRule).becomes.descriptor instanceof BecomesDeclGeneratedClass) {
					objectClasses.put(classifier as EClass, rule as ParserRule)
					astClassNames.add(classifier.name.ASTClassName)
					if (rule.isUnassigningRule) {
						interfaceClasses.add(classifier.name.ASTClassName)
					}
					if ((rule as ParserRule).becomes.list) {
						astClassesListType.put(classifier.name.ASTClassName, (rule as ParserRule).becomes.listType)
					}
				}
			} else if (rule instanceof EnumRule && classifier instanceof EEnum) {
				if ((rule as EnumRule).becomes) {
					enumClasses.add(classifier as EEnum)
					astClassNames.add(classifier.name.ASTClassName)
				}
			}
		}

		for (entry : objectClasses.entrySet) {
			val type = entry.key
			val rule = entry.value
			val becomes = rule === null ? null : rule.becomes
			val astType = grammar.getASTClass(type.name)
			// feature name -> type (string/class)
			val structuralFeatures = newHashMap
			for (attr : type.EAllStructuralFeatures) {
				if (attr instanceof EAttribute && !((attr as EAttribute).EAttributeType instanceof EEnum)) {
					val clazz = (attr as EAttribute).EAttributeType.instanceClass
					structuralFeatures.put(
						attr.name,
						clazz.isPrimitive ? clazz.toString() : clazz
					)
				} else {
					val referencedType = attr instanceof EReference ? attr.EReferenceType : (attr as EAttribute).
							EAttributeType
					val referencedASTType = getASTClass(grammar, referencedType.name)

					val isListType = astClassesListType.containsKey(referencedASTType.simpleName)
					val customListType = astClassesListType.get(referencedASTType.simpleName)

					val listType = (customListType !== null && !attr.many) ? grammar.
							replaceASTTypeReferences(
								customListType) : '''«new TypeReference(List)»<«referencedASTType»>'''
					if (isListType || attr.many) {
						structuralFeatures.put(attr.name, listType)
					} else {
						structuralFeatures.put(attr.name, referencedASTType)
					}
				}
			}

			// unassigned rule calls or implicit classes become interfaces
			val isInterface = rule === null || interfaceClasses.contains(astType.simpleName)
			val attributes = newLinkedHashMap
			if (isInterface) {
				// no attributes
			} else if (becomes.descriptor.attributes.empty) {
				// implicitly copy everything
				for (e : structuralFeatures.entrySet) {
					attributes.put(e.key, e.value)
				}
			} else {
				for (attr : becomes.descriptor.attributes) {
					if (attr instanceof BecomesDeclCustomAttribute) {
						attributes.put(attr.name, grammar.replaceASTTypeReferences(attr.type))
					} else {
						val feature = structuralFeatures.get(attr.name);
						if (feature === null) {
							throw new RuntimeException(
								"The rule " + rule.name + " declared the non-existing AST attribute: " + attr.name);
						}
						attributes.put(attr.name, feature)
					}
				}
			}

			val superClasses = newArrayList
			val superInterfaces = newArrayList
			for (c : type.ESuperTypes) {
				val cAST = getASTClass(grammar, c.name);
				if (astClassNames.contains(cAST.simpleName)) {
					if (interfaceClasses.contains(cAST.simpleName)) {
						superInterfaces.add(cAST)
					} else {
						if (isInterface) {
							throw new RuntimeException(
								"The AST class for rule " + rule.name +
									" is an interface but would need to extend the class: " + cAST.simpleName);
						}
						superClasses.add(cAST)
					}
				}
			}

			val implementsDeclaration = isInterface ? "" : '''«FOR s : superInterfaces BEFORE " implements " SEPARATOR ', '»«s»«ENDFOR»'''
			val extendsDeclaration = '''«FOR s : (isInterface ? superInterfaces : superClasses) BEFORE " extends " SEPARATOR ', '»«s»«ENDFOR»'''

			val javaFile = fileAccessFactory.createGeneratedJavaFile(astType)
			javaFile.importNestedTypeThreshold = JavaFileAccess.DONT_IMPORT_NESTED_TYPES
			javaFile.content = '''
				public «isInterface ? "interface" : "class"» «astType.simpleName»«implementsDeclaration»«extendsDeclaration» {
					«IF !isInterface»
						public «astType.simpleName»(){}
						«IF !attributes.empty»
							public «astType.simpleName»(«FOR e : attributes.entrySet SEPARATOR ', '»«e.value» «e.key»«ENDFOR»){
								«FOR n : attributes.keySet»
									this.«n» = «n»;
								«ENDFOR»
							}
						«ENDIF»
						
						«FOR e : attributes.entrySet»
							public «e.value» «e.key»;
						«ENDFOR»
					«ENDIF»
				}
			'''
			javaFile.writeTo(projectConfig.runtime.srcGen)
		}

		for (type : enumClasses) {
			val astType = getASTClass(grammar, type.name)

			val javaFile = fileAccessFactory.createGeneratedJavaFile(astType)
			javaFile.importNestedTypeThreshold = JavaFileAccess.DONT_IMPORT_NESTED_TYPES
			javaFile.content = '''
				public enum «astType.simpleName» {
					«FOR l : type.ELiterals SEPARATOR ', ' AFTER ';'»«l.name»«ENDFOR»
				}
			'''
			javaFile.writeTo(projectConfig.runtime.srcGen)
		}
	}
}
