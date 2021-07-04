package org.eclipse.xtext.xtext.generator.grammarAccess

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.Assignment
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

	override generate() {
		val generatedClasses = GrammarUtil.allMetamodelDeclarations(grammar).filter(GeneratedMetamodel).map [
			EPackage.EClassifiers
		].toList.flatten

		// whether to generate AST classes for CST classes without corresponding explicit rules  
		val enabled = (grammar.rules.get(0) as ParserRule).becomes !== null;

		val astClassNames = newHashSet
		val astClassesListType = newHashMap
		val interfaceTypes = newHashSet
		val objectClasses = newHashMap
		val enumClasses = newArrayList
		for (classifier : generatedClasses) {
			val rule = GrammarUtil.findRuleForName(grammar, classifier.name);
			if (rule === null) {
				if (enabled) {
					objectClasses.put(classifier as EClass, null);
					astClassNames.add(classifier.name.ASTClassName)
					interfaceTypes.add(classifier as EClass);
				}
			} else if (rule instanceof ParserRule) {
				if ((rule as ParserRule).becomes !== null) {
					objectClasses.put(classifier as EClass, rule as ParserRule)
					astClassNames.add(classifier.name.ASTClassName)
					if ((rule as ParserRule).becomes.list) {
						astClassesListType.put(classifier.name.ASTClassName, (rule as ParserRule).becomes.listType)
					}
					if (rule.unassignedRuleCall) {
						interfaceTypes.add(classifier as EClass);
					}
				}
			} else if (rule instanceof EnumRule && classifier instanceof EEnum) {
				if ((rule as EnumRule).becomes) {
					enumClasses.add(classifier as EEnum);
					astClassNames.add(classifier.name.ASTClassName)
				}
			}
		}

		for (entry : objectClasses.entrySet) {
			val type = entry.key
			val rule = entry.value
			// TODO cleanup?
			if ((rule === null && enabled) || (rule instanceof ParserRule && (rule as ParserRule).becomes !== null &&
				(rule as ParserRule).becomes.descriptor instanceof BecomesDeclGeneratedClass)) {

				val pr = rule as ParserRule
				val becomes = pr === null ? null : pr.becomes;
				val astType = getASTClass(grammar, type.name)
				val features = newHashMap
				for (attr : type.EAllStructuralFeatures) {
					if (attr instanceof EAttribute && !((attr as EAttribute).EAttributeType instanceof EEnum)) {
						val clazz = (attr as EAttribute).EAttributeType.instanceClass;
						features.put(
							attr.name,
							clazz.isPrimitive ? clazz.toString() : clazz
						)

					} else {
						val referencedType = attr instanceof EReference ? attr.EReferenceType : (attr as EAttribute).
								EAttributeType
						val isListType = astClassesListType.containsKey(referencedType.name.ASTClassName);
						val customListType = astClassesListType.get(referencedType.name.ASTClassName);

						val referencedASTType = getASTClass(grammar, referencedType.name)
						// TODO nested lists
						val listType = customListType !== null ? grammar.
								replaceASTTypeReferences(
									customListType) : '''«new TypeReference(List)»<«referencedASTType»>''';

//						if (isListType && attr.many) {
//							features.put(attr.name, listType)
//						} else 
						if (isListType || attr.many) {
							features.put(attr.name, listType)
						} else {
							features.put(attr.name, referencedASTType)
						}
					}
				}

				// unassigned rule call or implicit class, becomes an interface
				val isInterface = interfaceTypes.contains(type);
				val attributes = newLinkedHashMap
				if (isInterface) {
					// no attributes
				} else if (becomes === null || becomes.descriptor.attributes.empty) {
					// implicitly copy everything
					for (e : features.entrySet) {
						attributes.put(e.key, e.value)
					}
				} else {
					for (attr : becomes.descriptor.attributes) {
						if (attr instanceof BecomesDeclCustomAttribute) {
							attributes.put(attr.name, grammar.replaceASTTypeReferences(attr.type));
						} else {
							attributes.put(attr.name, features.get(attr.name))
						}
					}
				}

				val superTypes = type.ESuperTypes.filter[astClassNames.contains(name.ASTClassName)].map [
					getASTClass(grammar, name)
				]

				val implementsDeclaration = '''«FOR s : superTypes BEFORE " implements " SEPARATOR ', '»«s»«ENDFOR»''';

				val javaFile = fileAccessFactory.createGeneratedJavaFile(astType)
				javaFile.importNestedTypeThreshold = JavaFileAccess.DONT_IMPORT_NESTED_TYPES
				javaFile.content = '''
					public «isInterface ? "interface" : "class"» «astType.simpleName»«implementsDeclaration» {
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

	private def unassignedRuleCall(ParserRule rule) {
		// TODO is there a better way?
		val ti = rule.eAllContents();
		while (ti.hasNext()) {
			val obj = ti.next();
			if (obj instanceof Assignment) {
				return false;
			}
		}
		return true;
	}
}
