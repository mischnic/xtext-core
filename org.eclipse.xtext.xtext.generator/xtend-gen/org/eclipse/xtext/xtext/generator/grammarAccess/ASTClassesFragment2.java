package org.eclipse.xtext.xtext.generator.grammarAccess;

import com.google.inject.Inject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.BecomesDeclAttribute;
import org.eclipse.xtext.BecomesDeclCopyAttribute;
import org.eclipse.xtext.BecomesDeclCustomAttribute;
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
    final HashMap<String, Boolean> astClassNames = CollectionLiterals.<String, Boolean>newHashMap();
    EList<AbstractRule> _rules = this.getGrammar().getRules();
    for (final AbstractRule rule : _rules) {
      if ((((rule instanceof ParserRule) && (((ParserRule) rule).getBecomes() != null)) && (((ParserRule) rule).getType().getClassifier() instanceof EClass))) {
        astClassNames.put(this._xtextGeneratorNaming.getASTClassName(rule.getName()), Boolean.valueOf(((ParserRule) rule).getBecomes().isList()));
      }
    }
    EList<AbstractRule> _rules_1 = this.getGrammar().getRules();
    for (final AbstractRule rule_1 : _rules_1) {
      if ((((rule_1 instanceof ParserRule) && (((ParserRule) rule_1).getBecomes() != null)) && (((ParserRule) rule_1).getType().getClassifier() instanceof EClass))) {
        final ParserRule pr = ((ParserRule) rule_1);
        final TypeReference type = this._xtextGeneratorNaming.getASTClass(this.getGrammar(), pr.getName());
        EClassifier _classifier = pr.getType().getClassifier();
        final EClass eClass = ((EClass) _classifier);
        final Function1<EClass, Boolean> _function = (EClass it) -> {
          return Boolean.valueOf(astClassNames.containsKey(this._xtextGeneratorNaming.getASTClassName(it.getName())));
        };
        final Function1<EClass, TypeReference> _function_1 = (EClass it) -> {
          return this._xtextGeneratorNaming.getASTClass(this.getGrammar(), it.getName());
        };
        final Iterable<TypeReference> superTypes = IterableExtensions.<EClass, TypeReference>map(IterableExtensions.<EClass>filter(eClass.getESuperTypes(), _function), _function_1);
        System.out.println(pr);
        final HashMap<String, Object> features = CollectionLiterals.<String, Object>newHashMap();
        EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
        for (final EStructuralFeature attr : _eStructuralFeatures) {
          if ((attr instanceof EAttribute)) {
            String _name = ((EAttribute)attr).getName();
            Serializable _xifexpression = null;
            boolean _isPrimitive = ((EAttribute)attr).getEAttributeType().getInstanceClass().isPrimitive();
            if (_isPrimitive) {
              _xifexpression = ((EAttribute)attr).getEAttributeType().getInstanceClass().toString();
            } else {
              _xifexpression = ((EAttribute)attr).getEAttributeType().getInstanceClass();
            }
            features.put(_name, _xifexpression);
          } else {
            if ((attr instanceof EReference)) {
              final EClass referencedType = ((EReference)attr).getEReferenceType();
              Boolean isListType = astClassNames.get(this._xtextGeneratorNaming.getASTClassName(referencedType.getName()));
              if ((isListType == null)) {
                String _name_1 = referencedType.getName();
                String _plus = ("Unvalid type: " + _name_1);
                throw new IllegalStateException(_plus);
              }
              final TypeReference referencedASTType = this._xtextGeneratorNaming.getASTClass(this.getGrammar(), referencedType.getName());
              if ((((isListType).booleanValue() == true) && (((EReference)attr).isMany() == true))) {
                String _name_2 = ((EReference)attr).getName();
                StringConcatenation _builder = new StringConcatenation();
                TypeReference _typeReference = new TypeReference(List.class);
                _builder.append(_typeReference);
                _builder.append("<");
                TypeReference _typeReference_1 = new TypeReference(List.class);
                _builder.append(_typeReference_1);
                _builder.append("<");
                _builder.append(referencedASTType);
                _builder.append(">>");
                features.put(_name_2, _builder.toString());
              } else {
                if ((((isListType).booleanValue() == true) || ((EReference)attr).isMany())) {
                  String _name_3 = ((EReference)attr).getName();
                  StringConcatenation _builder_1 = new StringConcatenation();
                  TypeReference _typeReference_2 = new TypeReference(List.class);
                  _builder_1.append(_typeReference_2);
                  _builder_1.append("<");
                  _builder_1.append(referencedASTType);
                  _builder_1.append(">");
                  features.put(_name_3, _builder_1.toString());
                } else {
                  features.put(((EReference)attr).getName(), referencedASTType);
                }
              }
            } else {
              throw new UnsupportedOperationException("Unknown feature type");
            }
          }
        }
        System.out.println(features);
        final LinkedHashMap<String, Object> attributes = CollectionLiterals.<String, Object>newLinkedHashMap();
        boolean _isEmpty = pr.getBecomes().getAttributes().isEmpty();
        if (_isEmpty) {
          Set<Map.Entry<String, Object>> _entrySet = features.entrySet();
          for (final Map.Entry<String, Object> e : _entrySet) {
            attributes.put(e.getKey(), e.getValue());
          }
        } else {
          EList<BecomesDeclAttribute> _attributes = pr.getBecomes().getAttributes();
          for (final BecomesDeclAttribute attr_1 : _attributes) {
            if ((attr_1 instanceof BecomesDeclCopyAttribute)) {
              attributes.put(((BecomesDeclCopyAttribute)attr_1).getName(), features.get(((BecomesDeclCopyAttribute)attr_1).getName()));
            } else {
              if ((attr_1 instanceof BecomesDeclCustomAttribute)) {
                Object _xifexpression_1 = null;
                boolean _containsKey = astClassNames.containsKey(((BecomesDeclCustomAttribute)attr_1).getType());
                if (_containsKey) {
                  String _aSTPackage = this._xtextGeneratorNaming.getASTPackage(this.getGrammar());
                  String _type = ((BecomesDeclCustomAttribute)attr_1).getType();
                  _xifexpression_1 = new TypeReference(_aSTPackage, _type);
                } else {
                  _xifexpression_1 = ((BecomesDeclCustomAttribute)attr_1).getType();
                }
                final Object attrType = _xifexpression_1;
                attributes.put(((BecomesDeclCustomAttribute)attr_1).getName(), attrType);
              }
            }
          }
        }
        final GeneratedJavaFileAccess javaFile = this.fileAccessFactory.createGeneratedJavaFile(type);
        javaFile.setImportNestedTypeThreshold(JavaFileAccess.DONT_IMPORT_NESTED_TYPES);
        final boolean isInterface = (eClass.getEStructuralFeatures().isEmpty() && pr.getBecomes().getAttributes().isEmpty());
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
            String _simpleName = type.getSimpleName();
            _builder.append(_simpleName);
            {
              boolean _hasElements = false;
              for(final TypeReference s : superTypes) {
                if (!_hasElements) {
                  _hasElements = true;
                  _builder.append(" implements ");
                } else {
                  _builder.appendImmediate(", ", "");
                }
                _builder.append(s);
              }
            }
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            {
              if ((!isInterface)) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("public ");
                String _simpleName_1 = type.getSimpleName();
                _builder.append(_simpleName_1, "\t\t");
                _builder.append("(){}");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isEmpty = attributes.isEmpty();
                  boolean _not = (!_isEmpty);
                  if (_not) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("public ");
                    String _simpleName_2 = type.getSimpleName();
                    _builder.append(_simpleName_2, "\t\t");
                    _builder.append("(");
                    {
                      Set<Map.Entry<String, Object>> _entrySet = attributes.entrySet();
                      boolean _hasElements_1 = false;
                      for(final Map.Entry<String, Object> e : _entrySet) {
                        if (!_hasElements_1) {
                          _hasElements_1 = true;
                        } else {
                          _builder.appendImmediate(", ", "\t\t");
                        }
                        Object _value = e.getValue();
                        _builder.append(_value, "\t\t");
                        _builder.append(" ");
                        String _key = e.getKey();
                        _builder.append(_key, "\t\t");
                      }
                    }
                    _builder.append("){");
                    _builder.newLineIfNotEmpty();
                    {
                      Set<String> _keySet = attributes.keySet();
                      for(final String n : _keySet) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("this.");
                        _builder.append(n, "\t\t\t");
                        _builder.append(" = ");
                        _builder.append(n, "\t\t\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t");
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
                    _builder.append("\t");
                    _builder.append("public ");
                    Object _value_1 = e_1.getValue();
                    _builder.append(_value_1, "\t\t");
                    _builder.append(" ");
                    String _key_1 = e_1.getKey();
                    _builder.append(_key_1, "\t\t");
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
}
