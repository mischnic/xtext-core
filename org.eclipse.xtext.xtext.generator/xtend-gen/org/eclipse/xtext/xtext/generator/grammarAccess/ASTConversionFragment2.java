/**
 * Copyright (c) 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.grammarAccess;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.BecomesDecl;
import org.eclipse.xtext.BecomesDeclAttribute;
import org.eclipse.xtext.BecomesDeclCustomAttribute;
import org.eclipse.xtext.BecomesDeclGeneratedClass;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessExtensions;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

@SuppressWarnings("all")
public class ASTConversionFragment2 {
  @Inject
  @Extension
  private XtextGeneratorNaming _xtextGeneratorNaming;
  
  @Inject
  @Extension
  private GrammarAccessExtensions _grammarAccessExtensions;
  
  @Inject
  private Grammar grammar;
  
  public CharSequence getASTConversionClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class ASTConversion {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ASTConversion() {}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<AbstractRule> _allRules = GrammarUtil.allRules(this.grammar);
      for(final AbstractRule rule : _allRules) {
        {
          if ((rule instanceof ParserRule)) {
            {
              if ((((((ParserRule)rule).getBecomes() != null) && (((ParserRule)rule).getType().getClassifier() instanceof EClass)) && ((!((EClass) ((ParserRule)rule).getType().getClassifier()).getEStructuralFeatures().isEmpty()) || (!((ParserRule)rule).getBecomes().getDescriptor().getAttributes().isEmpty())))) {
                _builder.append("\t");
                CharSequence _childrenClass = this.getChildrenClass(((ParserRule)rule));
                _builder.append(_childrenClass, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("public Object ");
                String _gaRuleBecomeMethodName = this._grammarAccessExtensions.gaRuleBecomeMethodName(rule);
                _builder.append(_gaRuleBecomeMethodName, "\t");
                _builder.append("(");
                String _runtimeBasePackage = this._xtextGeneratorNaming.getRuntimeBasePackage(this.grammar);
                String _plus = (_runtimeBasePackage + ".myDsl");
                String _name = ((ParserRule)rule).getType().getClassifier().getName();
                TypeReference _typeReference = new TypeReference(_plus, _name);
                _builder.append(_typeReference, "\t");
                _builder.append(" node, ");
                String _childrenClassName = this.getChildrenClassName(((ParserRule)rule));
                _builder.append(_childrenClassName, "\t");
                _builder.append(" children){");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isList = ((ParserRule)rule).getBecomes().isList();
                  boolean _not = (!_isList);
                  if (_not) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("return new ");
                    TypeReference _aSTClass = this._xtextGeneratorNaming.getASTClass(this.grammar, ((ParserRule)rule).getName());
                    _builder.append(_aSTClass, "\t\t");
                    _builder.append("() {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    TypeReference _aSTClass_1 = this._xtextGeneratorNaming.getASTClass(this.grammar, ((ParserRule)rule).getName());
                    _builder.append(_aSTClass_1, "\t\t\t");
                    _builder.append(" XTEXT_INIT() {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t\t");
                    String _codeSnippet = this.codeSnippet(((ParserRule)rule));
                    _builder.append(_codeSnippet, "\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("return this;");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}.XTEXT_INIT();");
                    _builder.newLine();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("return new ");
                    String _listType = this.getListType(((ParserRule)rule));
                    _builder.append(_listType, "\t\t");
                    _builder.append("<");
                    TypeReference _aSTClass_2 = this._xtextGeneratorNaming.getASTClass(this.grammar, ((ParserRule)rule));
                    _builder.append(_aSTClass_2, "\t\t");
                    _builder.append(">() {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("private static final long serialVersionUID = 0;");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t\t");
                    String _listType_1 = this.getListType(((ParserRule)rule));
                    _builder.append(_listType_1, "\t\t\t\t");
                    _builder.append("<");
                    TypeReference _aSTClass_3 = this._xtextGeneratorNaming.getASTClass(this.grammar, ((ParserRule)rule));
                    _builder.append(_aSTClass_3, "\t\t\t\t");
                    _builder.append("> XTEXT_INIT() {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t\t");
                    String _codeSnippet_1 = this.codeSnippet(((ParserRule)rule));
                    _builder.append(_codeSnippet_1, "\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("return this;");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}.XTEXT_INIT();");
                    _builder.newLine();
                  }
                }
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence getChildrenClass(final ParserRule rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class ");
    String _childrenClassName = this.getChildrenClassName(rule);
    _builder.append(_childrenClassName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EClassifier _classifier = rule.getType().getClassifier();
      EList<EReference> _eAllReferences = ((EClass) _classifier).getEAllReferences();
      for(final EReference f : _eAllReferences) {
        _builder.append("\t");
        _builder.append("public ");
        String _childrenClassPropertyType = this.getChildrenClassPropertyType(f);
        _builder.append(_childrenClassPropertyType, "\t");
        _builder.append(" ");
        String _name = f.getName();
        _builder.append(_name, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private String getChildrenClassPropertyType(final EReference feature) {
    final String typeName = feature.getEType().getName();
    final AbstractRule referencedAbstractRule = GrammarUtil.findRuleForName(this.grammar, typeName);
    if ((!(referencedAbstractRule instanceof ParserRule))) {
      throw new IllegalStateException("Referenced type doesn\'t belong to parser rule.");
    }
    final ParserRule referencedRule = ((ParserRule) referencedAbstractRule);
    if ((referencedRule.getBecomes().isList() || feature.isMany())) {
      StringConcatenation _builder = new StringConcatenation();
      String _listTypeAbstract = this.getListTypeAbstract(referencedRule);
      _builder.append(_listTypeAbstract);
      _builder.append("<");
      TypeReference _aSTClass = this._xtextGeneratorNaming.getASTClass(this.grammar, typeName);
      _builder.append(_aSTClass);
      _builder.append(">");
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      TypeReference _aSTClass_1 = this._xtextGeneratorNaming.getASTClass(this.grammar, typeName);
      _builder_1.append(_aSTClass_1);
      return _builder_1.toString();
    }
  }
  
  private String codeSnippet(final ParserRule rule) {
    EClassifier _classifier = rule.getType().getClassifier();
    final EClass type = ((EClass) _classifier);
    final BecomesDecl becomes = rule.getBecomes();
    final boolean shouldCopyAllAttributes = ((becomes.getDescriptor() instanceof BecomesDeclGeneratedClass) && 
      becomes.getDescriptor().getAttributes().isEmpty());
    final HashSet<String> attributeNamesToCopy = CollectionLiterals.<String>newHashSet();
    final HashMap<String, String> attributeNamesToCopyChangeType = CollectionLiterals.<String, String>newHashMap();
    EList<BecomesDeclAttribute> _attributes = becomes.getDescriptor().getAttributes();
    for (final BecomesDeclAttribute attr : _attributes) {
      if ((attr instanceof BecomesDeclCustomAttribute)) {
        boolean _isCopy = ((BecomesDeclCustomAttribute)attr).isCopy();
        if (_isCopy) {
          attributeNamesToCopyChangeType.put(((BecomesDeclCustomAttribute)attr).getName(), ((BecomesDeclCustomAttribute)attr).getType());
        }
      } else {
        attributeNamesToCopy.add(attr.getName());
      }
    }
    final ArrayList<String> assignments = CollectionLiterals.<String>newArrayList();
    EList<EStructuralFeature> _eStructuralFeatures = type.getEStructuralFeatures();
    for (final EStructuralFeature f : _eStructuralFeatures) {
      if ((f instanceof EReference)) {
        if ((attributeNamesToCopy.contains(((EReference)f).getName()) || shouldCopyAllAttributes)) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("this.");
          String _name = ((EReference)f).getName();
          _builder.append(_name);
          _builder.append(" = children.");
          String _name_1 = ((EReference)f).getName();
          _builder.append(_name_1);
          _builder.append(";");
          assignments.add(_builder.toString());
        } else {
          boolean _containsKey = attributeNamesToCopyChangeType.containsKey(((EReference)f).getName());
          if (_containsKey) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("this.");
            String _name_2 = ((EReference)f).getName();
            _builder_1.append(_name_2);
            _builder_1.append(" = new ");
            String _replaceASTTypeReferences = this._xtextGeneratorNaming.replaceASTTypeReferences(this.grammar, attributeNamesToCopyChangeType.get(((EReference)f).getName()));
            _builder_1.append(_replaceASTTypeReferences);
            _builder_1.append("(children.");
            String _name_3 = ((EReference)f).getName();
            _builder_1.append(_name_3);
            _builder_1.append(");");
            assignments.add(_builder_1.toString());
          }
        }
      } else {
        if ((f instanceof EAttribute)) {
          if ((attributeNamesToCopy.contains(((EAttribute)f).getName()) || shouldCopyAllAttributes)) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("this.");
            String _name_4 = ((EAttribute)f).getName();
            _builder_2.append(_name_4);
            _builder_2.append(" = node.");
            String _nameToGetter = this.nameToGetter(((EAttribute)f).getName());
            _builder_2.append(_nameToGetter);
            _builder_2.append("();");
            assignments.add(_builder_2.toString());
          } else {
            boolean _containsKey_1 = attributeNamesToCopyChangeType.containsKey(((EAttribute)f).getName());
            if (_containsKey_1) {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("this.");
              String _name_5 = ((EAttribute)f).getName();
              _builder_3.append(_name_5);
              _builder_3.append(" = new ");
              String _replaceASTTypeReferences_1 = this._xtextGeneratorNaming.replaceASTTypeReferences(this.grammar, attributeNamesToCopyChangeType.get(((EAttribute)f).getName()));
              _builder_3.append(_replaceASTTypeReferences_1);
              _builder_3.append("(node.");
              String _nameToGetter_1 = this.nameToGetter(((EAttribute)f).getName());
              _builder_3.append(_nameToGetter_1);
              _builder_3.append("());");
              assignments.add(_builder_3.toString());
            }
          }
        } else {
          throw new UnsupportedOperationException("Unknown feature type");
        }
      }
    }
    StringConcatenation _builder_4 = new StringConcatenation();
    {
      for(final String a : assignments) {
        _builder_4.append(a);
        _builder_4.newLineIfNotEmpty();
      }
    }
    {
      String _code = becomes.getCode();
      boolean _tripleNotEquals = (_code != null);
      if (_tripleNotEquals) {
        String _code_1 = becomes.getCode();
        int _length = becomes.getCode().length();
        int _minus = (_length - 2);
        String _replaceASTTypeReferences_2 = this._xtextGeneratorNaming.replaceASTTypeReferences(this.grammar, _code_1.substring(3, _minus));
        _builder_4.append(_replaceASTTypeReferences_2);
        _builder_4.newLineIfNotEmpty();
      }
    }
    return _builder_4.toString();
  }
  
  private String nameToGetter(final String name) {
    String _upperCase = name.substring(0, 1).toUpperCase();
    String _plus = ("get" + _upperCase);
    String _substring = name.substring(1);
    return (_plus + _substring);
  }
  
  private String getChildrenClassName(final ParserRule rule) {
    String _name = rule.getName();
    return (_name + "Children");
  }
  
  private String getListTypeAbstract(final ParserRule rule) {
    StringConcatenation _builder = new StringConcatenation();
    TypeReference _xifexpression = null;
    String _listType = rule.getBecomes().getListType();
    boolean _tripleNotEquals = (_listType != null);
    if (_tripleNotEquals) {
      String _aSTPackage = this._xtextGeneratorNaming.getASTPackage(this.grammar);
      String _listType_1 = rule.getBecomes().getListType();
      _xifexpression = new TypeReference(_aSTPackage, _listType_1);
    } else {
      _xifexpression = new TypeReference(List.class);
    }
    _builder.append(_xifexpression);
    return _builder.toString();
  }
  
  private String getListType(final ParserRule rule) {
    StringConcatenation _builder = new StringConcatenation();
    TypeReference _xifexpression = null;
    String _listType = rule.getBecomes().getListType();
    boolean _tripleNotEquals = (_listType != null);
    if (_tripleNotEquals) {
      String _aSTPackage = this._xtextGeneratorNaming.getASTPackage(this.grammar);
      String _listType_1 = rule.getBecomes().getListType();
      _xifexpression = new TypeReference(_aSTPackage, _listType_1);
    } else {
      _xifexpression = new TypeReference(ArrayList.class);
    }
    _builder.append(_xifexpression);
    return _builder.toString();
  }
}
