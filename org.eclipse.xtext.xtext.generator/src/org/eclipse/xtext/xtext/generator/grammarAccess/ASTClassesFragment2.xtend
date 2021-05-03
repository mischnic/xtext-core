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

class ASTClassesFragment2 extends AbstractXtextGeneratorFragment {
	@Inject FileAccessFactory fileAccessFactory
	@Inject extension XtextGeneratorNaming
		
	override generate() {
		val astClassNames = newHashSet
		for(rule : grammar.rules) {
			if(rule instanceof ParserRule && (rule as ParserRule).becomes !== null && (rule as ParserRule).type.classifier instanceof EClass){
				astClassNames.add("AST" + rule.name);
			}
		}
		
		for(rule : grammar.rules){
			if(rule instanceof ParserRule && (rule as ParserRule).becomes !== null && (rule as ParserRule).type.classifier instanceof EClass){
				val pr = rule as ParserRule;
				val name = "AST" + rule.name;
				val clazz = pr.type.classifier as EClass;
				System.out.println(pr);
//				System.out.println(pr.type.classifier);
//				System.out.println(pr.type.metamodel);
				val type = new TypeReference(getRuntimeBasePackage(grammar) + ".ast", name);
				val javaFile = fileAccessFactory.createGeneratedJavaFile(type)
				

				val ruleCopyAttributes = newHashSet
				val ruleCustomAttributes = newHashMap
				for(attr : pr.becomes.attributes) {
					// TODO pull name into supertype
					if(attr instanceof BecomesDeclCopyAttribute){
						ruleCopyAttributes.add(attr.name);
					}else if(attr instanceof BecomesDeclCustomAttribute){
						ruleCustomAttributes.put(attr.name, 
							astClassNames.contains(attr.type) ?
								(getRuntimeBasePackage(grammar) + ".ast." + attr.type)
								: attr.type
						);
					}
				}
//				System.out.println(ruleCopyAttributes);
//				System.out.println(ruleCustomAttributes);

				val attributes = newArrayList
				for(attr : clazz.EStructuralFeatures) {
					System.out.println(attr)
					if(pr.becomes.attributes.empty || ruleCopyAttributes.contains(attr.name)) {
						if(attr instanceof EAttribute){
							attributes.add('''
								«attr.EAttributeType.instanceClass» «attr.name»;
							''');					
						} else if(attr instanceof EReference) {
							val referencedType = attr.EReferenceType;
							val referencedASTType = referencedType.instanceClass !== null ?
								referencedType.instanceClass :
								new TypeReference(getRuntimeBasePackage(grammar) + ".ast", name);
							attributes.add('''
								«referencedASTType» «attr.name»;
							''');	
						} else {
							throw new UnsupportedOperationException("Unknown feature type");
						}
					}
				}
				
				val abstractModifier = (clazz.EStructuralFeatures.empty && pr.becomes.attributes.empty) ? "public abstract" : "public"
				
				javaFile.content = '''
					«abstractModifier» class «name» {
						public «name»(){}
«««						TODO constructor
						«FOR attr : attributes»
							«attr»
						«ENDFOR»
						«FOR entry : ruleCustomAttributes.entrySet»
							«entry.value» «entry.key»;
						«ENDFOR»
					}
				''';
				javaFile.writeTo(projectConfig.runtime.srcGen)
			}
		}
	}
}