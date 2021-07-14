/**
 * Copyright (c) 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.grammarAccess;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.BecomesDecl;
import org.eclipse.xtext.BecomesDeclAttribute;
import org.eclipse.xtext.BecomesDeclClass;
import org.eclipse.xtext.BecomesDeclCustomAttribute;
import org.eclipse.xtext.BecomesDeclGeneratedClass;
import org.eclipse.xtext.BecomesDeclManualClass;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.grammarAccess.ASTUtils;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

@SuppressWarnings("all")
public class ASTConversionFragment2 {
  @Inject
  @Extension
  private XtextGeneratorNaming _xtextGeneratorNaming;
  
  @Inject
  @Extension
  private ASTUtils _aSTUtils;
  
  @Inject
  private Grammar grammar;
  
  public String getASTConversionClass() {
    final Iterable<GeneratedMetamodel> generatedMetaModels = Iterables.<GeneratedMetamodel>filter(GrammarUtil.allMetamodelDeclarations(this.grammar), GeneratedMetamodel.class);
    final Function1<GeneratedMetamodel, EList<EClassifier>> _function = (GeneratedMetamodel it) -> {
      return it.getEPackage().getEClassifiers();
    };
    final Iterable<EClassifier> generatedClasses = Iterables.<EClassifier>concat(IterableExtensions.<EList<EClassifier>>toList(IterableExtensions.<GeneratedMetamodel, EList<EClassifier>>map(generatedMetaModels, _function)));
    AbstractRule _get = this.grammar.getRules().get(0);
    BecomesDecl _becomes = ((ParserRule) _get).getBecomes();
    final boolean enabled = (_becomes != null);
    final HashMap<EClass, ParserRule> rules = CollectionLiterals.<EClass, ParserRule>newHashMap();
    for (final EClassifier classifier : generatedClasses) {
      {
        final AbstractRule rule = GrammarUtil.findRuleForName(this.grammar, classifier.getName());
        if ((rule == null)) {
          if (enabled) {
            rules.put(((EClass) classifier), null);
          }
        } else {
          if ((rule instanceof ParserRule)) {
            BecomesDecl _becomes_1 = ((ParserRule) rule).getBecomes();
            boolean _tripleNotEquals = (_becomes_1 != null);
            if (_tripleNotEquals) {
              rules.put(((EClass) classifier), ((ParserRule) rule));
            }
          }
        }
      }
    }
    String _xifexpression = null;
    boolean _isEmpty = IterableExtensions.isEmpty(generatedMetaModels);
    if (_isEmpty) {
      _xifexpression = null;
    } else {
      _xifexpression = (((GeneratedMetamodel[])Conversions.unwrapArray(generatedMetaModels, GeneratedMetamodel.class))[0]).getName();
    }
    final String modelName = _xifexpression;
    if (((!rules.isEmpty()) && (modelName == null))) {
      String _name = this.grammar.getName();
      String _plus = ("Need a model for " + _name);
      throw new RuntimeException(_plus);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class ASTConversion {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ASTConversion() {}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      Set<Map.Entry<EClass, ParserRule>> _entrySet = rules.entrySet();
      for(final Map.Entry<EClass, ParserRule> entry : _entrySet) {
        {
          if (((entry.getKey() instanceof EClass) && ((entry.getValue() == null) || (!this._aSTUtils.isUnassigningRule(entry.getValue()))))) {
            _builder.append("\t");
            EClass _key = entry.getKey();
            CharSequence _childrenClass = this.getChildrenClass(((EClass) _key));
            _builder.append(_childrenClass, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _convertMethod = this.getConvertMethod(entry.getKey(), entry.getValue(), modelName);
            _builder.append(_convertMethod, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String getConvertMethod(final EClass type, final ParserRule rule, final String modelName) {
    final TypeReference resultType = this.getASTType(type, rule);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public Object convert");
    String _name = type.getName();
    _builder.append(_name);
    _builder.append("(");
    String _runtimeBasePackage = this._xtextGeneratorNaming.getRuntimeBasePackage(this.grammar);
    String _plus = (_runtimeBasePackage + ".");
    String _plus_1 = (_plus + modelName);
    String _name_1 = type.getName();
    TypeReference _typeReference = new TypeReference(_plus_1, _name_1);
    _builder.append(_typeReference);
    _builder.append(" node, ");
    String _childrenClassName = this.getChildrenClassName(type);
    _builder.append(_childrenClassName);
    _builder.append(" children){");
    _builder.newLineIfNotEmpty();
    {
      if (((rule == null) || (!rule.getBecomes().isList()))) {
        _builder.append("\t");
        _builder.append("return new ");
        _builder.append(resultType, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(resultType, "\t\t");
        _builder.append(" XTEXT_INIT() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        String _codeSnippetClass = this.codeSnippetClass(type, rule);
        _builder.append(_codeSnippetClass, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return this;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}.XTEXT_INIT();");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("return new ");
        String _listType = this.getListType(false, rule, resultType);
        _builder.append(_listType, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("private static final long serialVersionUID = 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        String _listType_1 = this.getListType(false, rule, resultType);
        _builder.append(_listType_1, "\t\t\t");
        _builder.append(" XTEXT_INIT() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        String _codeSnippetClass_1 = this.codeSnippetClass(type, rule);
        _builder.append(_codeSnippetClass_1, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return this;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}.XTEXT_INIT();");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private CharSequence getChildrenClass(final EClass type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class ");
    String _childrenClassName = this.getChildrenClassName(type);
    _builder.append(_childrenClassName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<EReference> _eAllReferences = type.getEAllReferences();
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
    AbstractRule _findRuleForName = GrammarUtil.findRuleForName(this.grammar, typeName);
    final ParserRule referencedRule = ((ParserRule) _findRuleForName);
    if (((((referencedRule != null) && (referencedRule.getBecomes() != null)) && referencedRule.getBecomes().isList()) || 
      feature.isMany())) {
      StringConcatenation _builder = new StringConcatenation();
      String _listTypeAbstract = this.getListTypeAbstract(feature.isMany(), referencedRule, this._xtextGeneratorNaming.getASTClass(this.grammar, typeName));
      _builder.append(_listTypeAbstract);
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      TypeReference _aSTClass = this._xtextGeneratorNaming.getASTClass(this.grammar, typeName);
      _builder_1.append(_aSTClass);
      return _builder_1.toString();
    }
  }
  
  private String codeSnippetClass(final EClass type, final ParserRule rule) {
    BecomesDecl _xifexpression = null;
    if ((rule != null)) {
      _xifexpression = rule.getBecomes();
    } else {
      _xifexpression = null;
    }
    final BecomesDecl becomes = _xifexpression;
    final boolean shouldCopyAllAttributes = ((becomes == null) || ((becomes.getDescriptor() instanceof BecomesDeclGeneratedClass) && becomes.getDescriptor().getAttributes().isEmpty()));
    final HashSet<String> attributeNamesToCopy = CollectionLiterals.<String>newHashSet();
    final HashMap<String, String> attributeNamesToCopyChangeType = CollectionLiterals.<String, String>newHashMap();
    if ((becomes != null)) {
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
    }
    final ArrayList<String> assignments = CollectionLiterals.<String>newArrayList();
    EList<EStructuralFeature> _eAllStructuralFeatures = type.getEAllStructuralFeatures();
    for (final EStructuralFeature f : _eAllStructuralFeatures) {
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
          EDataType _eAttributeType = ((EAttribute)f).getEAttributeType();
          if ((_eAttributeType instanceof EEnum)) {
            boolean _isMany = ((EAttribute)f).isMany();
            if (_isMany) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("this.");
              String _name_4 = ((EAttribute)f).getName();
              _builder_2.append(_name_4);
              _builder_2.append(" = node.getValue().stream().map(e -> ");
              TypeReference _aSTClass = this._xtextGeneratorNaming.getASTClass(this.grammar, ((EAttribute)f).getEAttributeType().getName());
              _builder_2.append(_aSTClass);
              _builder_2.append(".valueOf(e.name())).collect(");
              TypeReference _typeReference = new TypeReference(Collectors.class);
              _builder_2.append(_typeReference);
              _builder_2.append(".toList());");
              assignments.add(_builder_2.toString());
            } else {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("this.");
              String _name_5 = ((EAttribute)f).getName();
              _builder_3.append(_name_5);
              _builder_3.append(" = ");
              TypeReference _aSTClass_1 = this._xtextGeneratorNaming.getASTClass(this.grammar, ((EAttribute)f).getEAttributeType().getName());
              _builder_3.append(_aSTClass_1);
              _builder_3.append(".valueOf(node.");
              String _nameToGetter = this.nameToGetter(((EAttribute)f).getName());
              _builder_3.append(_nameToGetter);
              _builder_3.append("().name());");
              assignments.add(_builder_3.toString());
            }
          } else {
            if ((attributeNamesToCopy.contains(((EAttribute)f).getName()) || shouldCopyAllAttributes)) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("this.");
              String _name_6 = ((EAttribute)f).getName();
              _builder_4.append(_name_6);
              _builder_4.append(" = node.");
              String _nameToGetter_1 = this.nameToGetter(((EAttribute)f).getName());
              _builder_4.append(_nameToGetter_1);
              _builder_4.append("();");
              assignments.add(_builder_4.toString());
            } else {
              boolean _containsKey_1 = attributeNamesToCopyChangeType.containsKey(((EAttribute)f).getName());
              if (_containsKey_1) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("this.");
                String _name_7 = ((EAttribute)f).getName();
                _builder_5.append(_name_7);
                _builder_5.append(" = new ");
                String _replaceASTTypeReferences_1 = this._xtextGeneratorNaming.replaceASTTypeReferences(this.grammar, attributeNamesToCopyChangeType.get(((EAttribute)f).getName()));
                _builder_5.append(_replaceASTTypeReferences_1);
                _builder_5.append("(node.");
                String _nameToGetter_2 = this.nameToGetter(((EAttribute)f).getName());
                _builder_5.append(_nameToGetter_2);
                _builder_5.append("());");
                assignments.add(_builder_5.toString());
              }
            }
          }
        } else {
          throw new UnsupportedOperationException("Unknown feature type");
        }
      }
    }
    StringConcatenation _builder_6 = new StringConcatenation();
    {
      for(final String a : assignments) {
        _builder_6.append(a);
        _builder_6.newLineIfNotEmpty();
      }
    }
    {
      if (((becomes != null) && (becomes.getCode() != null))) {
        String _code = becomes.getCode();
        int _length = becomes.getCode().length();
        int _minus = (_length - 2);
        String _replaceASTTypeReferences_2 = this._xtextGeneratorNaming.replaceASTTypeReferences(this.grammar, _code.substring(3, _minus));
        _builder_6.append(_replaceASTTypeReferences_2);
        _builder_6.newLineIfNotEmpty();
      }
    }
    return _builder_6.toString();
  }
  
  private String nameToGetter(final String name) {
    String _upperCase = name.substring(0, 1).toUpperCase();
    String _plus = ("get" + _upperCase);
    String _substring = name.substring(1);
    return (_plus + _substring);
  }
  
  private String getChildrenClassName(final EClassifier type) {
    String _name = type.getName();
    return (_name + "Children");
  }
  
  private TypeReference getASTType(final EClassifier type, final ParserRule rule) {
    TypeReference _xifexpression = null;
    if ((((rule != null) && (rule.getBecomes() != null)) && (rule.getBecomes().getDescriptor() instanceof BecomesDeclManualClass))) {
      String _aSTPackage = this._xtextGeneratorNaming.getASTPackage(this.grammar);
      BecomesDeclClass _descriptor = rule.getBecomes().getDescriptor();
      String _type = ((BecomesDeclManualClass) _descriptor).getType();
      _xifexpression = new TypeReference(_aSTPackage, _type);
    } else {
      _xifexpression = this._xtextGeneratorNaming.getASTClass(this.grammar, type.getName());
    }
    return _xifexpression;
  }
  
  private String getListTypeAbstract(final boolean isMany, final ParserRule rule, final TypeReference of) {
    String _xifexpression = null;
    if (((((rule != null) && (rule.getBecomes() != null)) && (rule.getBecomes().getListType() != null)) && (!isMany))) {
      _xifexpression = this._xtextGeneratorNaming.replaceASTTypeReferences(this.grammar, rule.getBecomes().getListType());
    } else {
      StringConcatenation _builder = new StringConcatenation();
      TypeReference _typeReference = new TypeReference(List.class);
      _builder.append(_typeReference);
      _builder.append("<");
      _builder.append(of);
      _builder.append(">");
      _xifexpression = _builder.toString();
    }
    return _xifexpression;
  }
  
  private String getListType(final boolean isMany, final ParserRule rule, final TypeReference of) {
    String _xifexpression = null;
    if (((((rule != null) && (rule.getBecomes() != null)) && (rule.getBecomes().getListType() != null)) && (!isMany))) {
      _xifexpression = this._xtextGeneratorNaming.replaceASTTypeReferences(this.grammar, rule.getBecomes().getListType());
    } else {
      StringConcatenation _builder = new StringConcatenation();
      TypeReference _typeReference = new TypeReference(ArrayList.class);
      _builder.append(_typeReference);
      _builder.append("<");
      _builder.append(of);
      _builder.append(">");
      _xifexpression = _builder.toString();
    }
    return _xifexpression;
  }
}
