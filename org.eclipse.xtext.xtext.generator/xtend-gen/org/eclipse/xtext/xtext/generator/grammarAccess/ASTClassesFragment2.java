package org.eclipse.xtext.xtext.generator.grammarAccess;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
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
    final HashSet<String> astClassNames = CollectionLiterals.<String>newHashSet();
    EList<AbstractRule> _rules = this.getGrammar().getRules();
    for (final AbstractRule rule : _rules) {
      if ((((rule instanceof ParserRule) && (((ParserRule) rule).getBecomes() != null)) && (((ParserRule) rule).getType().getClassifier() instanceof EClass))) {
        astClassNames.add(this._xtextGeneratorNaming.getASTClassName(rule.getName()));
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
          return Boolean.valueOf(astClassNames.contains(this._xtextGeneratorNaming.getASTClassName(it.getName())));
        };
        final Function1<EClass, TypeReference> _function_1 = (EClass it) -> {
          return this._xtextGeneratorNaming.getASTClass(this.getGrammar(), it.getName());
        };
        final Iterable<TypeReference> superTypes = IterableExtensions.<EClass, TypeReference>map(IterableExtensions.<EClass>filter(eClass.getESuperTypes(), _function), _function_1);
        final HashMap<String, Object> features = CollectionLiterals.<String, Object>newHashMap();
        EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
        for (final EStructuralFeature attr : _eStructuralFeatures) {
          if ((attr instanceof EAttribute)) {
            features.put(((EAttribute)attr).getName(), ((EAttribute)attr).getEAttributeType().getInstanceClass());
          } else {
            if ((attr instanceof EReference)) {
              final EClass referencedType = ((EReference)attr).getEReferenceType();
              Object _xifexpression = null;
              Class<?> _instanceClass = referencedType.getInstanceClass();
              boolean _tripleNotEquals = (_instanceClass != null);
              if (_tripleNotEquals) {
                _xifexpression = referencedType.getInstanceClass();
              } else {
                _xifexpression = this._xtextGeneratorNaming.getASTClass(this.getGrammar(), rule_1.getName());
              }
              final Object referencedASTType = _xifexpression;
              features.put(((EReference)attr).getName(), referencedASTType);
            } else {
              throw new UnsupportedOperationException("Unknown feature type");
            }
          }
        }
        final LinkedHashMap<String, Object> attributes = CollectionLiterals.<String, Object>newLinkedHashMap();
        boolean _isEmpty = pr.getBecomes().getAttributes().isEmpty();
        if (_isEmpty) {
          Set<Map.Entry<String, Object>> _entrySet = features.entrySet();
          for (final Map.Entry<String, Object> e : _entrySet) {
            String _key = e.getKey();
            StringConcatenation _builder = new StringConcatenation();
            Object _value = e.getValue();
            _builder.append(_value);
            _builder.append(" ");
            String _key_1 = e.getKey();
            _builder.append(_key_1);
            attributes.put(_key, _builder.toString());
          }
        } else {
          EList<BecomesDeclAttribute> _attributes = pr.getBecomes().getAttributes();
          for (final BecomesDeclAttribute attr_1 : _attributes) {
            if ((attr_1 instanceof BecomesDeclCopyAttribute)) {
              String _name = ((BecomesDeclCopyAttribute)attr_1).getName();
              StringConcatenation _builder_1 = new StringConcatenation();
              Object _get = features.get(((BecomesDeclCopyAttribute)attr_1).getName());
              _builder_1.append(_get);
              _builder_1.append(" ");
              String _name_1 = ((BecomesDeclCopyAttribute)attr_1).getName();
              _builder_1.append(_name_1);
              attributes.put(_name, _builder_1.toString());
            } else {
              if ((attr_1 instanceof BecomesDeclCustomAttribute)) {
                Object _xifexpression_1 = null;
                boolean _contains = astClassNames.contains(((BecomesDeclCustomAttribute)attr_1).getType());
                if (_contains) {
                  String _aSTPackage = this._xtextGeneratorNaming.getASTPackage(this.getGrammar());
                  String _type = ((BecomesDeclCustomAttribute)attr_1).getType();
                  _xifexpression_1 = new TypeReference(_aSTPackage, _type);
                } else {
                  _xifexpression_1 = ((BecomesDeclCustomAttribute)attr_1).getType();
                }
                final Object attrType = _xifexpression_1;
                String _name_2 = ((BecomesDeclCustomAttribute)attr_1).getName();
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append(attrType);
                _builder_2.append(" ");
                String _name_3 = ((BecomesDeclCustomAttribute)attr_1).getName();
                _builder_2.append(_name_3);
                attributes.put(_name_2, _builder_2.toString());
              }
            }
          }
        }
        final GeneratedJavaFileAccess javaFile = this.fileAccessFactory.createGeneratedJavaFile(type);
        final boolean isInterface = (eClass.getEStructuralFeatures().isEmpty() && pr.getBecomes().getAttributes().isEmpty());
        String _xifexpression_2 = null;
        boolean _isEmpty_1 = IterableExtensions.isEmpty(superTypes);
        boolean _not = (!_isEmpty_1);
        if (_not) {
          String _join = IterableExtensions.join(superTypes, "");
          _xifexpression_2 = ("implements " + _join);
        } else {
          _xifexpression_2 = "";
        }
        final String superModifier = _xifexpression_2;
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
            _builder.append(" ");
            _builder.append(superModifier);
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
                    String _join = IterableExtensions.join(attributes.values(), ", ");
                    _builder.append(_join, "\t\t");
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
                  Collection<Object> _values = attributes.values();
                  for(final Object attr : _values) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("public ");
                    _builder.append(attr, "\t\t");
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
