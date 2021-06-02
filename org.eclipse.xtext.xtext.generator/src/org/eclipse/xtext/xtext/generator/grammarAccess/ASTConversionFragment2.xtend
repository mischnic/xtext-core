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
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.BecomesDeclCustomAttribute
import org.eclipse.xtext.BecomesDeclGeneratedClass
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.TypeReference

import static extension org.eclipse.xtext.GrammarUtil.*

class ASTConversionFragment2 {
	@Inject extension XtextGeneratorNaming
	@Inject extension GrammarAccessExtensions

	@Inject
	Grammar grammar;

	def getASTConversionClass() '''
		public static class ASTConversion {
			public ASTConversion() {}
			
			«FOR rule : grammar.allRules»
				«IF rule instanceof ParserRule»
					«IF rule.becomes !== null && rule.type.classifier instanceof EClass && (!(rule.type.classifier as EClass).EStructuralFeatures.empty || !rule.becomes.descriptor.attributes.empty)»
						«getChildrenClass(rule)»
						public Object «rule.gaRuleBecomeMethodName»(«new TypeReference(grammar.runtimeBasePackage + ".myDsl", rule.type.classifier.name)» node, «rule.childrenClassName» children){
							«IF !rule.becomes.list»
								return new «grammar.getASTClass(rule.name)»() {
									«grammar.getASTClass(rule.name)» XTEXT_INIT() {
										«rule.codeSnippet»
										return this;
									}
								}.XTEXT_INIT();
							«ELSE»
								return new «rule.getListType(grammar.getASTClass(rule))»() {
									private static final long serialVersionUID = 0;
										«rule.getListType(grammar.getASTClass(rule))» XTEXT_INIT() {
										«rule.codeSnippet»
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

	private def getChildrenClass(ParserRule rule) '''
		public static class «rule.childrenClassName» {
			«FOR f : (rule.type.classifier as EClass).EAllReferences»
				public «f.childrenClassPropertyType» «f.name»;
			«ENDFOR»
		}
	'''

	private def getChildrenClassPropertyType(EReference feature) {
		val typeName = feature.EType.name;
		val referencedAbstractRule = grammar.findRuleForName(typeName);
		if (!(referencedAbstractRule instanceof ParserRule)) {
			throw new IllegalStateException("Referenced type doesn't belong to parser rule.")
		}
		val referencedRule = referencedAbstractRule as ParserRule;
		if (referencedRule.becomes.list || feature.many) {
			return '''«referencedRule.getListTypeAbstract(grammar.getASTClass(typeName))»'''
		} else {
			return '''«grammar.getASTClass(typeName)»'''
		}
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
					assignments.add('''this.«f.name» = children.«f.name»;''');
				} else if (attributeNamesToCopyChangeType.containsKey(f.name)) {
					assignments.
						add('''this.«f.name» = new «grammar.replaceASTTypeReferences(attributeNamesToCopyChangeType.get(f.name))»(children.«f.name»);''');
				}
			} else if (f instanceof EAttribute) {
				if (attributeNamesToCopy.contains(f.name) || shouldCopyAllAttributes) {
					assignments.add('''this.«f.name» = node.«f.name.nameToGetter»();''');
				} else if (attributeNamesToCopyChangeType.containsKey(f.name)) {
					assignments.
						add('''this.«f.name» = new «grammar.replaceASTTypeReferences(attributeNamesToCopyChangeType.get(f.name))»(node.«f.name.nameToGetter»());''');
				}
			} else {
				throw new UnsupportedOperationException("Unknown feature type");
			}
		}

		return '''
			«FOR a : assignments»
				«a»
			«ENDFOR»
			«IF becomes.code !== null»
				«grammar.replaceASTTypeReferences(becomes.code.substring(3, becomes.code.length - 2))»
			«ENDIF»
		'''
	}

	private def nameToGetter(String name) {
		return "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	private def getChildrenClassName(ParserRule rule) {
		return rule.name + "Children";
	}

	private def getListTypeAbstract(ParserRule rule, TypeReference of) {
		return if (rule.becomes.listType !== null) grammar.replaceASTTypeReferences(rule.becomes.listType) else '''«new TypeReference(List)»<«of»>'''
	}

	private def getListType(ParserRule rule, TypeReference of) {
		return if (rule.becomes.listType !== null) grammar.replaceASTTypeReferences(rule.becomes.listType) else '''«new TypeReference(ArrayList)»<«of»>'''
	}
}
