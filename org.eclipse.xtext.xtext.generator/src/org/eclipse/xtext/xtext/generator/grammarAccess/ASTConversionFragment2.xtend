/*******************************************************************************
 * Copyright (c) 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.grammarAccess

import com.google.inject.Inject
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.model.annotations.SingletonClassAnnotation

import static extension org.eclipse.xtext.GrammarUtil.*
import org.eclipse.xtext.BecomesDeclGeneratedClass
import org.eclipse.xtext.BecomesDeclCopyAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.BecomesDeclCustomAttribute
import org.eclipse.emf.ecore.EAttribute

class ASTConversionFragment2 extends AbstractXtextGeneratorFragment {
	@Inject FileAccessFactory fileAccessFactory

	@Inject extension XtextGeneratorNaming
	@Inject extension GrammarAccessExtensions

	override generate() {
		val javaFile = fileAccessFactory.createGeneratedJavaFile(grammar.ASTConversion)
		javaFile.importNestedTypeThreshold = JavaFileAccess.DONT_IMPORT_NESTED_TYPES
		javaFile.annotations += new SingletonClassAnnotation
		javaFile.content = '''
			public class �language.grammar.ASTConversion.simpleName� {
				
				@�Inject�
				public �language.grammar.ASTConversion.simpleName�() {}
				
				�FOR rule : language.grammar.allRules�
					�IF rule instanceof ParserRule�
						�IF rule.becomes !== null && rule.type.classifier instanceof EClass && (!(rule.type.classifier as EClass).EStructuralFeatures.empty || !rule.becomes.descriptor.attributes.empty)�
							public Object �rule.gaRuleBecomeMethodName�(�new TypeReference(grammar.runtimeBasePackage + ".myDsl", rule.type.classifier.name)� node, �HashMap�<String, Object> children){
								�IF !rule.becomes.list�
									return new �grammar.getASTClass(rule.name)�() {
										�grammar.getASTClass(rule.name)� XTEXT_INIT() {
											�rule.codeSnippet�
											return this;
										}
									}.XTEXT_INIT();
								�ELSE�
									return new �if (rule.becomes.listType !== null) new TypeReference(grammar.getASTPackage, rule.becomes.listType) else ArrayList�<�grammar.getASTClass(rule)�>() {
										private static final long serialVersionUID = 0;
											�if (rule.becomes.listType !== null) rule.becomes.listType else ArrayList�<�grammar.getASTClass(rule)�> XTEXT_INIT() {
											�rule.codeSnippet�
											return this;
										}
									}.XTEXT_INIT();
								�ENDIF�
							}
						�ENDIF�
					�ENDIF�
				�ENDFOR�
			}
		'''
		javaFile.writeTo(projectConfig.runtime.srcGen)
	}

	private def codeSnippet(ParserRule rule) {
		val type = rule.type.classifier as EClass;
		val becomes = rule.becomes;

		val shouldCopyAllAttributes = becomes.getDescriptor() instanceof BecomesDeclGeneratedClass &&
			becomes.descriptor.attributes.empty
		val attributeNamesToCopy = newHashSet
		val attributeNamesToCopyChangeType = newHashMap
		for (attr : becomes.descriptor.attributes) {
			if (attr instanceof BecomesDeclCustomAttribute) {
				if (attr.copy) {
					attributeNamesToCopyChangeType.put(attr.name, attr.type);
				}
			} else {
				attributeNamesToCopy.add(attr.getName());
			}
		}

		val assignments = newArrayList
		for (f : type.EStructuralFeatures) {
			if (f instanceof EReference) {
				if (attributeNamesToCopy.contains(f.name) || shouldCopyAllAttributes) {
					assignments.add('''this.�f.name� = children.get("�f.name�");''');
				} else if (attributeNamesToCopyChangeType.containsKey(f.name)) {
					assignments.
						add('''this.�f.name� = new �grammar.replaceASTTypeReferences(attributeNamesToCopyChangeType.get(f.name))�(children.get("�f.name�"));''');
				}
			} else if (f instanceof EAttribute) {
				if (attributeNamesToCopy.contains(f.name) || shouldCopyAllAttributes) {
					assignments.add('''this.�f.name� = node.�f.name.nameToGetter�();''');
				} else if (attributeNamesToCopyChangeType.containsKey(f.name)) {
					assignments.
						add('''this.�f.name� = new �grammar.replaceASTTypeReferences(attributeNamesToCopyChangeType.get(f.name))�(node.�f.name.nameToGetter�());''');
				}
			} else {
				throw new UnsupportedOperationException("Unknown feature type");
			}
		}

		return '''
			�FOR a : assignments�
				�a�
			�ENDFOR�
			�IF becomes.code !== null�
				�grammar.replaceASTTypeReferences(becomes.code.substring(3, becomes.code.length - 2))�
			�ENDIF�
		'''
	}

	private def nameToGetter(String name) {
		return "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
	}
}
