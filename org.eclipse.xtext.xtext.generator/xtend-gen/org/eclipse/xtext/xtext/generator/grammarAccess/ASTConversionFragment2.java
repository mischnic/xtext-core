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
import java.io.Serializable;
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
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.BecomesDecl;
import org.eclipse.xtext.BecomesDeclAttribute;
import org.eclipse.xtext.BecomesDeclCustomAttribute;
import org.eclipse.xtext.BecomesDeclGeneratedClass;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessExtensions;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GeneratedJavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.model.annotations.IClassAnnotation;
import org.eclipse.xtext.xtext.generator.model.annotations.SingletonClassAnnotation;

@SuppressWarnings("all")
public class ASTConversionFragment2 extends AbstractXtextGeneratorFragment {
  @Inject
  private FileAccessFactory fileAccessFactory;
  
  @Inject
  @Extension
  private XtextGeneratorNaming _xtextGeneratorNaming;
  
  @Inject
  @Extension
  private GrammarAccessExtensions _grammarAccessExtensions;
  
  @Override
  public void generate() {
    final GeneratedJavaFileAccess javaFile = this.fileAccessFactory.createGeneratedJavaFile(this._grammarAccessExtensions.getASTConversion(this.getGrammar()));
    javaFile.setImportNestedTypeThreshold(JavaFileAccess.DONT_IMPORT_NESTED_TYPES);
    List<IClassAnnotation> _annotations = javaFile.getAnnotations();
    SingletonClassAnnotation _singletonClassAnnotation = new SingletonClassAnnotation();
    _annotations.add(_singletonClassAnnotation);
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("public class ");
        String _simpleName = ASTConversionFragment2.this._grammarAccessExtensions.getASTConversion(ASTConversionFragment2.this.getLanguage().getGrammar()).getSimpleName();
        _builder.append(_simpleName);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public ");
        String _simpleName_1 = ASTConversionFragment2.this._grammarAccessExtensions.getASTConversion(ASTConversionFragment2.this.getLanguage().getGrammar()).getSimpleName();
        _builder.append(_simpleName_1, "\t");
        _builder.append("() {}");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        {
          List<AbstractRule> _allRules = GrammarUtil.allRules(ASTConversionFragment2.this.getLanguage().getGrammar());
          for(final AbstractRule rule : _allRules) {
            {
              if ((rule instanceof ParserRule)) {
                {
                  if ((((((ParserRule)rule).getBecomes() != null) && (((ParserRule)rule).getType().getClassifier() instanceof EClass)) && ((!((EClass) ((ParserRule)rule).getType().getClassifier()).getEStructuralFeatures().isEmpty()) || (!((ParserRule)rule).getBecomes().getDescriptor().getAttributes().isEmpty())))) {
                    _builder.append("\t");
                    _builder.append("public Object ");
                    String _gaRuleBecomeMethodName = ASTConversionFragment2.this._grammarAccessExtensions.gaRuleBecomeMethodName(rule);
                    _builder.append(_gaRuleBecomeMethodName, "\t");
                    _builder.append("(");
                    String _runtimeBasePackage = ASTConversionFragment2.this._xtextGeneratorNaming.getRuntimeBasePackage(ASTConversionFragment2.this.getGrammar());
                    String _plus = (_runtimeBasePackage + ".myDsl");
                    String _name = ((ParserRule)rule).getType().getClassifier().getName();
                    TypeReference _typeReference = new TypeReference(_plus, _name);
                    _builder.append(_typeReference, "\t");
                    _builder.append(" node, ");
                    _builder.append(HashMap.class, "\t");
                    _builder.append("<String, Object> children){");
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _isList = ((ParserRule)rule).getBecomes().isList();
                      boolean _not = (!_isList);
                      if (_not) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("return new ");
                        TypeReference _aSTClass = ASTConversionFragment2.this._xtextGeneratorNaming.getASTClass(ASTConversionFragment2.this.getGrammar(), ((ParserRule)rule).getName());
                        _builder.append(_aSTClass, "\t\t");
                        _builder.append("() {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        TypeReference _aSTClass_1 = ASTConversionFragment2.this._xtextGeneratorNaming.getASTClass(ASTConversionFragment2.this.getGrammar(), ((ParserRule)rule).getName());
                        _builder.append(_aSTClass_1, "\t\t\t");
                        _builder.append(" XTEXT_INIT() {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t\t");
                        String _codeSnippet = ASTConversionFragment2.this.codeSnippet(((ParserRule)rule));
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
                        Object _xifexpression = null;
                        String _listType = ((ParserRule)rule).getBecomes().getListType();
                        boolean _tripleNotEquals = (_listType != null);
                        if (_tripleNotEquals) {
                          String _aSTPackage = ASTConversionFragment2.this._xtextGeneratorNaming.getASTPackage(ASTConversionFragment2.this.getGrammar());
                          String _listType_1 = ((ParserRule)rule).getBecomes().getListType();
                          _xifexpression = new TypeReference(_aSTPackage, _listType_1);
                        } else {
                          _xifexpression = ArrayList.class;
                        }
                        _builder.append(_xifexpression, "\t\t");
                        _builder.append("<");
                        TypeReference _aSTClass_2 = ASTConversionFragment2.this._xtextGeneratorNaming.getASTClass(ASTConversionFragment2.this.getGrammar(), ((ParserRule)rule));
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
                        Serializable _xifexpression_1 = null;
                        String _listType_2 = ((ParserRule)rule).getBecomes().getListType();
                        boolean _tripleNotEquals_1 = (_listType_2 != null);
                        if (_tripleNotEquals_1) {
                          _xifexpression_1 = ((ParserRule)rule).getBecomes().getListType();
                        } else {
                          _xifexpression_1 = ArrayList.class;
                        }
                        _builder.append(_xifexpression_1, "\t\t\t\t");
                        _builder.append("<");
                        TypeReference _aSTClass_3 = ASTConversionFragment2.this._xtextGeneratorNaming.getASTClass(ASTConversionFragment2.this.getGrammar(), ((ParserRule)rule));
                        _builder.append(_aSTClass_3, "\t\t\t\t");
                        _builder.append("> XTEXT_INIT() {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t\t");
                        String _codeSnippet_1 = ASTConversionFragment2.this.codeSnippet(((ParserRule)rule));
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
                  }
                }
              }
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    };
    javaFile.setContent(_client);
    javaFile.writeTo(this.getProjectConfig().getRuntime().getSrcGen());
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
          _builder.append(" = children.get(\"");
          String _name_1 = ((EReference)f).getName();
          _builder.append(_name_1);
          _builder.append("\");");
          assignments.add(_builder.toString());
        } else {
          boolean _containsKey = attributeNamesToCopyChangeType.containsKey(((EReference)f).getName());
          if (_containsKey) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("this.");
            String _name_2 = ((EReference)f).getName();
            _builder_1.append(_name_2);
            _builder_1.append(" = new ");
            String _replaceASTTypeReferences = this._xtextGeneratorNaming.replaceASTTypeReferences(this.getGrammar(), attributeNamesToCopyChangeType.get(((EReference)f).getName()));
            _builder_1.append(_replaceASTTypeReferences);
            _builder_1.append("(children.get(\"");
            String _name_3 = ((EReference)f).getName();
            _builder_1.append(_name_3);
            _builder_1.append("\"));");
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
              String _replaceASTTypeReferences_1 = this._xtextGeneratorNaming.replaceASTTypeReferences(this.getGrammar(), attributeNamesToCopyChangeType.get(((EAttribute)f).getName()));
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
        String _replaceASTTypeReferences_2 = this._xtextGeneratorNaming.replaceASTTypeReferences(this.getGrammar(), _code_1.substring(3, _minus));
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
}
