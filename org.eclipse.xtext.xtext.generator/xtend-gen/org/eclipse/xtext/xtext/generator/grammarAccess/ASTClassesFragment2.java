package org.eclipse.xtext.xtext.generator.grammarAccess;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.BecomesDecl;
import org.eclipse.xtext.BecomesDeclAttribute;
import org.eclipse.xtext.BecomesDeclCustomAttribute;
import org.eclipse.xtext.BecomesDeclGeneratedClass;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GeneratedJavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

@SuppressWarnings("all")
public class ASTClassesFragment2 extends AbstractXtextGeneratorFragment {
  @Inject
  private FileAccessFactory fileAccessFactory;
  
  @Inject
  @Extension
  private XtextGeneratorNaming _xtextGeneratorNaming;
  
  @Override
  public void generate() {
    final Function1<GeneratedMetamodel, EList<EClassifier>> _function = (GeneratedMetamodel it) -> {
      return it.getEPackage().getEClassifiers();
    };
    final Iterable<EClassifier> generatedClasses = Iterables.<EClassifier>concat(IterableExtensions.<EList<EClassifier>>toList(IterableExtensions.<GeneratedMetamodel, EList<EClassifier>>map(Iterables.<GeneratedMetamodel>filter(GrammarUtil.allMetamodelDeclarations(this.getGrammar()), GeneratedMetamodel.class), _function)));
    final HashSet<String> astClassNames = CollectionLiterals.<String>newHashSet();
    final HashMap<String, String> astClassesList = CollectionLiterals.<String, String>newHashMap();
    AbstractRule _get = this.getGrammar().getRules().get(0);
    BecomesDecl _becomes = ((ParserRule) _get).getBecomes();
    final boolean enabled = (_becomes != null);
    final HashMap<EClass, ParserRule> rulesClasses = CollectionLiterals.<EClass, ParserRule>newHashMap();
    final ArrayList<EEnum> rulesEnums = CollectionLiterals.<EEnum>newArrayList();
    for (final EClassifier classifier : generatedClasses) {
      {
        final AbstractRule rule = GrammarUtil.findRuleForName(this.getGrammar(), classifier.getName());
        if ((rule == null)) {
          if (enabled) {
            rulesClasses.put(((EClass) classifier), null);
            astClassNames.add(this._xtextGeneratorNaming.getASTClassName(classifier.getName()));
          }
        } else {
          if ((rule instanceof ParserRule)) {
            BecomesDecl _becomes_1 = ((ParserRule) rule).getBecomes();
            boolean _tripleNotEquals = (_becomes_1 != null);
            if (_tripleNotEquals) {
              rulesClasses.put(((EClass) classifier), ((ParserRule) rule));
              astClassNames.add(this._xtextGeneratorNaming.getASTClassName(classifier.getName()));
              boolean _isList = ((ParserRule) rule).getBecomes().isList();
              if (_isList) {
                astClassesList.put(this._xtextGeneratorNaming.getASTClassName(classifier.getName()), ((ParserRule) rule).getBecomes().getListType());
              }
            }
          } else {
            if (((rule instanceof EnumRule) && (classifier instanceof EEnum))) {
              boolean _isBecomes = ((EnumRule) rule).isBecomes();
              if (_isBecomes) {
                rulesEnums.add(((EEnum) classifier));
                astClassNames.add(this._xtextGeneratorNaming.getASTClassName(classifier.getName()));
              }
            }
          }
        }
      }
    }
    Set<Map.Entry<EClass, ParserRule>> _entrySet = rulesClasses.entrySet();
    for (final Map.Entry<EClass, ParserRule> entry : _entrySet) {
      {
        final EClass type = entry.getKey();
        final ParserRule rule = entry.getValue();
        if ((((rule == null) && enabled) || (((rule instanceof ParserRule) && (((ParserRule) rule).getBecomes() != null)) && 
          (((ParserRule) rule).getBecomes().getDescriptor() instanceof BecomesDeclGeneratedClass)))) {
          final ParserRule pr = ((ParserRule) rule);
          BecomesDecl _xifexpression = null;
          if ((pr == null)) {
            _xifexpression = null;
          } else {
            _xifexpression = pr.getBecomes();
          }
          final BecomesDecl becomes = _xifexpression;
          final TypeReference astType = this._xtextGeneratorNaming.getASTClass(this.getGrammar(), type.getName());
          final HashMap<String, Object> features = CollectionLiterals.<String, Object>newHashMap();
          EList<EStructuralFeature> _eStructuralFeatures = type.getEStructuralFeatures();
          for (final EStructuralFeature attr : _eStructuralFeatures) {
            if (((attr instanceof EAttribute) && (!(((EAttribute) attr).getEAttributeType() instanceof EEnum)))) {
              final Class<?> clazz = ((EAttribute) attr).getEAttributeType().getInstanceClass();
              String _name = attr.getName();
              Serializable _xifexpression_1 = null;
              boolean _isPrimitive = clazz.isPrimitive();
              if (_isPrimitive) {
                _xifexpression_1 = clazz.toString();
              } else {
                _xifexpression_1 = clazz;
              }
              features.put(_name, _xifexpression_1);
            } else {
              EClassifier _xifexpression_2 = null;
              if ((attr instanceof EReference)) {
                _xifexpression_2 = ((EReference)attr).getEReferenceType();
              } else {
                _xifexpression_2 = ((EAttribute) attr).getEAttributeType();
              }
              final EClassifier referencedType = _xifexpression_2;
              final boolean isListType = astClassesList.containsKey(this._xtextGeneratorNaming.getASTClassName(referencedType.getName()));
              final String customListType = astClassesList.get(this._xtextGeneratorNaming.getASTClassName(referencedType.getName()));
              final TypeReference referencedASTType = this._xtextGeneratorNaming.getASTClass(this.getGrammar(), referencedType.getName());
              String _xifexpression_3 = null;
              if ((customListType != null)) {
                _xifexpression_3 = this._xtextGeneratorNaming.replaceASTTypeReferences(this.getGrammar(), customListType);
              } else {
                StringConcatenation _builder = new StringConcatenation();
                TypeReference _typeReference = new TypeReference(List.class);
                _builder.append(_typeReference);
                _builder.append("<");
                _builder.append(referencedASTType);
                _builder.append(">");
                _xifexpression_3 = _builder.toString();
              }
              final String listType = _xifexpression_3;
              if ((isListType || attr.isMany())) {
                features.put(attr.getName(), listType);
              } else {
                features.put(attr.getName(), referencedASTType);
              }
            }
          }
          final LinkedHashMap<String, Object> attributes = CollectionLiterals.<String, Object>newLinkedHashMap();
          if (((becomes == null) || becomes.getDescriptor().getAttributes().isEmpty())) {
            Set<Map.Entry<String, Object>> _entrySet_1 = features.entrySet();
            for (final Map.Entry<String, Object> e : _entrySet_1) {
              attributes.put(e.getKey(), e.getValue());
            }
          } else {
            EList<BecomesDeclAttribute> _attributes = becomes.getDescriptor().getAttributes();
            for (final BecomesDeclAttribute attr_1 : _attributes) {
              if ((attr_1 instanceof BecomesDeclCustomAttribute)) {
                attributes.put(((BecomesDeclCustomAttribute)attr_1).getName(), this._xtextGeneratorNaming.replaceASTTypeReferences(this.getGrammar(), ((BecomesDeclCustomAttribute)attr_1).getType()));
              } else {
                attributes.put(attr_1.getName(), features.get(attr_1.getName()));
              }
            }
          }
          final boolean isInterface = type.isInterface();
          final Function1<EClass, Boolean> _function_1 = (EClass it) -> {
            return Boolean.valueOf(astClassNames.contains(this._xtextGeneratorNaming.getASTClassName(it.getName())));
          };
          final Iterable<EClass> superTypes = IterableExtensions.<EClass>filter(type.getESuperTypes(), _function_1);
          final ArrayList<TypeReference> extending = CollectionLiterals.<TypeReference>newArrayList();
          final ArrayList<TypeReference> implementing = CollectionLiterals.<TypeReference>newArrayList();
          for (final EClass t : superTypes) {
            {
              final TypeReference name = this._xtextGeneratorNaming.getASTClass(this.getGrammar(), t.getName());
              if ((t.isInterface() && (!isInterface))) {
                implementing.add(name);
              } else {
                extending.add(name);
              }
            }
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          {
            boolean _hasElements = false;
            for(final TypeReference s : extending) {
              if (!_hasElements) {
                _hasElements = true;
                _builder_1.append(" extends ");
              } else {
                _builder_1.appendImmediate(", ", "");
              }
              _builder_1.append(s);
            }
          }
          final String extendsDeclaration = _builder_1.toString();
          StringConcatenation _builder_2 = new StringConcatenation();
          {
            boolean _hasElements_1 = false;
            for(final TypeReference s_1 : implementing) {
              if (!_hasElements_1) {
                _hasElements_1 = true;
                _builder_2.append(" implements ");
              } else {
                _builder_2.appendImmediate(", ", "");
              }
              _builder_2.append(s_1);
            }
          }
          final String implementsDeclaration = _builder_2.toString();
          final GeneratedJavaFileAccess javaFile = this.fileAccessFactory.createGeneratedJavaFile(astType);
          javaFile.setImportNestedTypeThreshold(JavaFileAccess.DONT_IMPORT_NESTED_TYPES);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("public ");
              String _xifexpression = null;
              if (isInterface) {
                _xifexpression = "interface";
              } else {
                _xifexpression = "class";
              }
              _builder.append(_xifexpression);
              _builder.append(" ");
              String _simpleName = astType.getSimpleName();
              _builder.append(_simpleName);
              _builder.append(extendsDeclaration);
              _builder.append(implementsDeclaration);
              _builder.append(" {");
              _builder.newLineIfNotEmpty();
              {
                if ((!isInterface)) {
                  _builder.append("\t");
                  _builder.append("public ");
                  String _simpleName_1 = astType.getSimpleName();
                  _builder.append(_simpleName_1, "\t");
                  _builder.append("(){}");
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _isEmpty = attributes.isEmpty();
                    boolean _not = (!_isEmpty);
                    if (_not) {
                      _builder.append("\t");
                      _builder.append("public ");
                      String _simpleName_2 = astType.getSimpleName();
                      _builder.append(_simpleName_2, "\t");
                      _builder.append("(");
                      {
                        Set<Map.Entry<String, Object>> _entrySet = attributes.entrySet();
                        boolean _hasElements = false;
                        for(final Map.Entry<String, Object> e : _entrySet) {
                          if (!_hasElements) {
                            _hasElements = true;
                          } else {
                            _builder.appendImmediate(", ", "\t");
                          }
                          Object _value = e.getValue();
                          _builder.append(_value, "\t");
                          _builder.append(" ");
                          String _key = e.getKey();
                          _builder.append(_key, "\t");
                        }
                      }
                      _builder.append("){");
                      _builder.newLineIfNotEmpty();
                      {
                        Set<String> _keySet = attributes.keySet();
                        for(final String n : _keySet) {
                          _builder.append("\t");
                          _builder.append("\t");
                          _builder.append("this.");
                          _builder.append(n, "\t\t");
                          _builder.append(" = ");
                          _builder.append(n, "\t\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                      _builder.append("\t");
                      _builder.append("}");
                      _builder.newLine();
                    }
                  }
                  _builder.append("\t");
                  _builder.newLine();
                  {
                    Set<Map.Entry<String, Object>> _entrySet_1 = attributes.entrySet();
                    for(final Map.Entry<String, Object> e_1 : _entrySet_1) {
                      _builder.append("\t");
                      _builder.append("public ");
                      Object _value_1 = e_1.getValue();
                      _builder.append(_value_1, "\t");
                      _builder.append(" ");
                      String _key_1 = e_1.getKey();
                      _builder.append(_key_1, "\t");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
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
      }
    }
    for (final EEnum type : rulesEnums) {
      {
        final TypeReference astType = this._xtextGeneratorNaming.getASTClass(this.getGrammar(), type.getName());
        final GeneratedJavaFileAccess javaFile = this.fileAccessFactory.createGeneratedJavaFile(astType);
        javaFile.setImportNestedTypeThreshold(JavaFileAccess.DONT_IMPORT_NESTED_TYPES);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("public enum ");
            String _simpleName = astType.getSimpleName();
            _builder.append(_simpleName);
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            {
              EList<EEnumLiteral> _eLiterals = type.getELiterals();
              boolean _hasElements = false;
              for(final EEnumLiteral l : _eLiterals) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "\t");
                }
                String _name = l.getName();
                _builder.append(_name, "\t");
              }
              if (_hasElements) {
                _builder.append(";", "\t");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        };
        javaFile.setContent(_client);
        javaFile.writeTo(this.getProjectConfig().getRuntime().getSrcGen());
      }
    }
  }
}
