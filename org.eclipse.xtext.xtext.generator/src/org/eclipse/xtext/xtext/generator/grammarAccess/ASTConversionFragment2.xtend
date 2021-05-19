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

class ASTConversionFragment2 extends AbstractXtextGeneratorFragment {
	@Inject FileAccessFactory fileAccessFactory

	@Inject extension XtextGeneratorNaming
	@Inject extension GrammarAccessExtensions

	override generate() {
		val javaFile = fileAccessFactory.createGeneratedJavaFile(grammar.ASTConversion)
		javaFile.importNestedTypeThreshold = JavaFileAccess.DONT_IMPORT_NESTED_TYPES
		javaFile.annotations += new SingletonClassAnnotation
		javaFile.content = '''
			public class «language.grammar.ASTConversion.simpleName» {
				
				@«Inject»
				public «language.grammar.ASTConversion.simpleName»() {}
				
				«FOR rule : language.grammar.allRules»
					«IF rule instanceof ParserRule»
						«IF rule.becomes !== null && rule.type.classifier instanceof EClass && (!(rule.type.classifier as EClass).EStructuralFeatures.empty || !rule.becomes.descriptor.attributes.empty)»
							public Object «rule.gaRuleBecomeMethodName»(«new TypeReference(grammar.runtimeBasePackage + ".myDsl", rule.type.classifier.name)» node, «HashMap»<String, Object> children){
								«IF !rule.becomes.list»
									«IF rule.becomes.code !== null»
										return new «getASTClass(grammar, rule.name)»() {
											«getASTClass(grammar, rule.name)» XTEXT_INIT() {
												«rule.becomes.code.substring(3, rule.becomes.code.length - 2)»
												return this;
											}
										}.XTEXT_INIT();
									«ELSE»
										return new «getASTClass(grammar, rule.name)»();
									«ENDIF»
								«ELSE»
									return new «if (rule.becomes.listType !== null) rule.becomes.listType else ArrayList»<«getASTClass(grammar, rule)»>() {
										private static final long serialVersionUID = 0;
										«if (rule.becomes.listType !== null) rule.becomes.listType else ArrayList»<«getASTClass(grammar, rule)»> XTEXT_INIT() {
											«rule.becomes.code.substring(3, rule.becomes.code.length - 2)»
											return this;
										}
									}.XTEXT_INIT();
								«ENDIF»
							}
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			}
		'''
		javaFile.writeTo(projectConfig.runtime.srcGen)
	}
}
