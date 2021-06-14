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
import java.util.stream.Collectors
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.BecomesDeclCustomAttribute
import org.eclipse.xtext.BecomesDeclGeneratedClass
import org.eclipse.xtext.BecomesDeclManualClass
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.TypeReference

import static extension org.eclipse.xtext.GrammarUtil.*

class ASTConversionFragment2 {
	@Inject extension XtextGeneratorNaming

	@Inject
	Grammar grammar;

	def getASTConversionClass() {
		val generatedClasses = GrammarUtil.allMetamodelDeclarations(grammar).filter(GeneratedMetamodel).map [
			EPackage.EClassifiers
		].toList.flatten

		// TODO??
		val enabled = (grammar.rules.get(0) as ParserRule).becomes !== null;
		val rules = newHashMap
		for (classifier : generatedClasses) {
			val rule = GrammarUtil.findRuleForName(grammar, classifier.name);
			if (rule === null) {
				if (enabled) {
					rules.put(classifier as EClass, null);
				}
			} else if (rule instanceof ParserRule) {
				if ((rule as ParserRule).becomes !== null) {
					rules.put(classifier as EClass, rule as ParserRule)
				}
			}
		}

		return '''
			public static class ASTConversion {
				public ASTConversion() {}
				
				«FOR entry : rules.entrySet»
					«IF entry.key instanceof EClass»
						«getChildrenClass(entry.key as EClass)»
						«getConvertMethod(entry.key, entry.value)»
					«ENDIF»
				«ENDFOR»
			}
		'''
	}

	private def getConvertMethod(EClass type, ParserRule rule) {
		val resultType = getASTType(type, rule)
		return '''
			public Object convert«type.name»(«new TypeReference(grammar.runtimeBasePackage + ".myDsl", type.name)» node, «type.childrenClassName» children){
				«IF rule === null || !rule.becomes.list»
					return new «resultType»() {
						«resultType» XTEXT_INIT() {
							«codeSnippetClass(type, rule)»
							return this;
						}
					}.XTEXT_INIT();
				«ELSE»
					return new «rule.getListType(resultType)»() {
						private static final long serialVersionUID = 0;
							«rule.getListType(resultType)» XTEXT_INIT() {
							«codeSnippetClass(type, rule)»
							return this;
						}
					}.XTEXT_INIT();
				«ENDIF»
			}
		'''
	}

	private def getChildrenClass(EClass type) '''
		public static class «type.childrenClassName» {
			«FOR f : type.EAllReferences»
				public «f.childrenClassPropertyType» «f.name»;
			«ENDFOR»
		}
	'''

	private def getChildrenClassPropertyType(EReference feature) {
		val typeName = feature.EType.name;
		val referencedRule = grammar.findRuleForName(typeName) as ParserRule
		if ((referencedRule !== null && referencedRule.becomes !== null && referencedRule.becomes.list) ||
			feature.many) {
			return '''«referencedRule.getListTypeAbstract(grammar.getASTClass(typeName))»'''
		} else {
			return '''«grammar.getASTClass(typeName)»'''
		}
	}

	private def codeSnippetClass(EClass type, ParserRule rule) {
		val becomes = rule !== null ? rule.becomes : null

		val shouldCopyAllAttributes = becomes === null ||
			(becomes.getDescriptor() instanceof BecomesDeclGeneratedClass && becomes.descriptor.attributes.empty)
		val attributeNamesToCopy = newHashSet
		val attributeNamesToCopyChangeType = newHashMap
		if (becomes !== null) {
			for (attr : becomes.descriptor.attributes) {
				if (attr instanceof BecomesDeclCustomAttribute) {
					if (attr.copy) {
						attributeNamesToCopyChangeType.put(attr.name, attr.type)
					}
				} else {
					attributeNamesToCopy.add(attr.getName())
				}
			}
		}

		val assignments = newArrayList
		for (f : type.EStructuralFeatures) {
			if (f instanceof EReference) {
				if (attributeNamesToCopy.contains(f.name) || shouldCopyAllAttributes) {
					assignments.add('''this.«f.name» = children.«f.name»;''');
				} else if (attributeNamesToCopyChangeType.containsKey(f.name)) {
					assignments.
						add('''this.«f.name» = new «grammar.replaceASTTypeReferences(attributeNamesToCopyChangeType.get(f.name))»(children.«f.name»);''')
				}
			} else if (f instanceof EAttribute) {
				if (f.EAttributeType instanceof EEnum) {
					if (f.many) {
						assignments.
							add('''this.«f.name» = node.getValue().stream().map(e -> «grammar.getASTClass(f.EAttributeType.name)».valueOf(e.name())).collect(«new TypeReference(Collectors)».toList());''');
					} else {
						assignments.
							add('''this.«f.name» = «grammar.getASTClass(f.EAttributeType.name)».valueOf(node.«f.name.nameToGetter»().name());''')

					}
				} else {
					if (attributeNamesToCopy.contains(f.name) || shouldCopyAllAttributes) {
						assignments.add('''this.«f.name» = node.«f.name.nameToGetter»();''')
					} else if (attributeNamesToCopyChangeType.containsKey(f.name)) {
						assignments.
							add('''this.«f.name» = new «grammar.replaceASTTypeReferences(attributeNamesToCopyChangeType.get(f.name))»(node.«f.name.nameToGetter»());''')
					}
				}
			} else {
				throw new UnsupportedOperationException("Unknown feature type")
			}
		}

		return '''
			«FOR a : assignments»
				«a»
			«ENDFOR»
			«IF becomes !== null && becomes.code !== null»
				«grammar.replaceASTTypeReferences(becomes.code.substring(3, becomes.code.length - 2))»
			«ENDIF»
		'''
	}

	private def nameToGetter(String name) {
		return "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	private def getChildrenClassName(EClassifier type) {
		return type.name + "Children";
	}

	private def getASTType(EClassifier type, ParserRule rule) {
		if (rule !== null && rule.becomes !== null && rule.becomes.descriptor instanceof BecomesDeclManualClass) {
			return new TypeReference(getASTPackage(grammar), (rule.becomes.descriptor as BecomesDeclManualClass).type)
		} else {
			return grammar.getASTClass(type.name)
		}
	}

	private def getListTypeAbstract(ParserRule rule, TypeReference of) {
		return if (rule !== null && rule.becomes !== null && rule.becomes.listType !== null)
			grammar.replaceASTTypeReferences(rule.becomes.listType)
		else
			'''«new TypeReference(List)»<«of»>'''
	}

	private def getListType(ParserRule rule, TypeReference of) {
		return if (rule !== null && rule.becomes !== null && rule.becomes.listType !== null)
			grammar.replaceASTTypeReferences(rule.becomes.listType)
		else
			'''«new TypeReference(ArrayList)»<«of»>'''
	}
}
