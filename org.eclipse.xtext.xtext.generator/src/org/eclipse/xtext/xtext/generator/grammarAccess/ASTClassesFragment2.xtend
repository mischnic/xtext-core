package org.eclipse.xtext.xtext.generator.grammarAccess

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.BecomesDeclCopyAttribute
import org.eclipse.xtext.BecomesDeclCustomAttribute
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.BecomesDeclGeneratedClass

class ASTClassesFragment2 extends AbstractXtextGeneratorFragment {
	@Inject FileAccessFactory fileAccessFactory
	@Inject extension XtextGeneratorNaming
	
	override generate() {
		val astClassNames = newHashMap
		for(rule : grammar.rules) {
			if(rule instanceof ParserRule && (rule as ParserRule).becomes !== null && (rule as ParserRule).type.classifier instanceof EClass){
				astClassNames.put(rule.name.ASTClassName, (rule as ParserRule).becomes.list)
			}
		}
		
		for(rule : grammar.rules){
			if(rule instanceof ParserRule &&
				(rule as ParserRule).becomes !== null &&
				(rule as ParserRule).becomes.descriptor instanceof BecomesDeclGeneratedClass &&
				(rule as ParserRule).type.classifier instanceof EClass
			){
				val pr = rule as ParserRule
				val type = getASTClass(grammar, pr.name)
				val eClass = pr.type.classifier as EClass
				val superTypes = eClass.ESuperTypes
					.filter[astClassNames.containsKey(name.ASTClassName)]
					.map[getASTClass(grammar, name)]

				val features = newHashMap
				for(attr : eClass.EStructuralFeatures) {
					if (attr instanceof EAttribute) {
						features.put(attr.name, attr.EAttributeType.instanceClass.isPrimitive ?
							attr.EAttributeType.instanceClass.toString() :
							attr.EAttributeType.instanceClass
						)
					} else if (attr instanceof EReference) {
						val referencedType = attr.EReferenceType
//						if(referencedType.instanceClass !== null) {
//							val referencedASTType = referencedType.instanceClass
//							features.put(attr.name, referencedASTType)
//						} else {
						var isListType = astClassNames.get(referencedType.name.ASTClassName);
						if(isListType === null) {
							throw new IllegalStateException("Unvalid type: " + referencedType.name)
						}
						
						val referencedASTType = getASTClass(grammar, referencedType.name)
						if(isListType == true && attr.many == true){
							features.put(attr.name, '''«new TypeReference(List)»<«new TypeReference(List)»<«referencedASTType»>>''' )
						} else if(isListType == true || attr.many){
							features.put(attr.name, '''«new TypeReference(List)»<«referencedASTType»>''' )
						} else {
							features.put(attr.name, referencedASTType)
						}						
					} else {
						throw new UnsupportedOperationException("Unknown feature type")
					}
				}

				val declaredAttributes = pr.becomes.descriptor.attributes
				
				val attributes = newLinkedHashMap
				if(declaredAttributes.empty){
					// implicitly copy everything
					for(e : features.entrySet) {
						attributes.put(e.key, e.value)
					}
				} else {
					for(attr : declaredAttributes) {
						// TODO pull name into supertype
						if (attr instanceof BecomesDeclCopyAttribute) {
							attributes.put(attr.name, features.get(attr.name))
						} else if (attr instanceof BecomesDeclCustomAttribute){
							val attrType = astClassNames.containsKey(attr.type) ?
								new TypeReference(getASTPackage(grammar), attr.type)
								: attr.type
							attributes.put(attr.name, attrType)
						}
					}
				}
				
				val javaFile = fileAccessFactory.createGeneratedJavaFile(type)
				javaFile.importNestedTypeThreshold = JavaFileAccess.DONT_IMPORT_NESTED_TYPES
				val isInterface = (eClass.EStructuralFeatures.empty && declaredAttributes.empty)
				// TODO can the parent types have attributes? multiple inheritance???
				javaFile.content = '''
					public «isInterface ? "interface" : "class"» «type.simpleName»«FOR s : superTypes BEFORE " implements " SEPARATOR ', '»«s»«ENDFOR» {
						«IF !isInterface»
							public «type.simpleName»(){}
							«IF !attributes.empty»
								public «type.simpleName»(«FOR e : attributes.entrySet SEPARATOR ', '»«e.value» «e.key»«ENDFOR»){
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
	}
}