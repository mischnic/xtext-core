package org.eclipse.xtext.xtext.generator.grammarAccess

import com.google.inject.Inject
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.BecomesDeclCopyAttribute
import org.eclipse.xtext.BecomesDeclCustomAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess

class ASTClassesFragment2 extends AbstractXtextGeneratorFragment {
	@Inject FileAccessFactory fileAccessFactory
	@Inject extension XtextGeneratorNaming
		
	override generate() {
		val astClassNames = newHashSet
		for(rule : grammar.rules) {
			if(rule instanceof ParserRule && (rule as ParserRule).becomes !== null && (rule as ParserRule).type.classifier instanceof EClass){
				astClassNames.add(getASTClassName(rule));
			}
		}
		
		for(rule : grammar.rules){
			if(rule instanceof ParserRule && (rule as ParserRule).becomes !== null && (rule as ParserRule).type.classifier instanceof EClass){
				val pr = rule as ParserRule;
				val type = getASTClass(grammar, pr);
				val eClass = pr.type.classifier as EClass;
				val javaFile = fileAccessFactory.createGeneratedJavaFile(type)

				val features = newHashMap
				for(attr : eClass.EStructuralFeatures) {
					if (attr instanceof EAttribute) {
						features.put(attr.name, attr.EAttributeType.instanceClass);
					} else if (attr instanceof EReference) {
						val referencedType = attr.EReferenceType;
						val referencedASTType = referencedType.instanceClass !== null ?
							referencedType.instanceClass :
							getASTClass(grammar, rule);
						features.put(attr.name, referencedASTType);	
					} else {
						throw new UnsupportedOperationException("Unknown feature type");
					}
				}
				
				val attributes = newLinkedHashMap
				if(pr.becomes.attributes.empty){
					for(e : features.entrySet) {
						attributes.put(e.key, '''«e.value» «e.key»''');
					}
				} else {
					for(attr : pr.becomes.attributes) {
						// TODO pull name into supertype
						if (attr instanceof BecomesDeclCopyAttribute) {
							attributes.put(attr.name, '''«features.get(attr.name)» «attr.name»''');
						} else if (attr instanceof BecomesDeclCustomAttribute){
							val attrType = astClassNames.contains(attr.type) ?
								new TypeReference(getASTPackage(grammar), attr.type)
								: attr.type;
							attributes.put(attr.name, '''«attrType» «attr.name»''');
						}
					}
				}
				
				val abstractModifier = (eClass.EStructuralFeatures.empty && pr.becomes.attributes.empty) ? "public abstract" : "public"
				
				javaFile.content = '''
					«abstractModifier» class «type.simpleName» {
						public «type.simpleName»(){}
						«IF !attributes.empty»
							public «type.simpleName»(«attributes.values.join(", ")»){
								«FOR n : attributes.keySet»
									this.«n» = «n»;
								«ENDFOR»
							}
						«ENDIF»
						
						«FOR attr : attributes.values»
							«attr»;
						«ENDFOR»
					}
				''';
				javaFile.writeTo(projectConfig.runtime.srcGen)
			}
		}
	}
}