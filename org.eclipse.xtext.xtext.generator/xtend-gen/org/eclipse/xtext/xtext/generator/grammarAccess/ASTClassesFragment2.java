package org.eclipse.xtext.xtext.generator.grammarAccess;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
        String _name = rule.getName();
        String _plus = ("AST" + _name);
        astClassNames.add(_plus);
      }
    }
    EList<AbstractRule> _rules_1 = this.getGrammar().getRules();
    for (final AbstractRule rule_1 : _rules_1) {
      if ((((rule_1 instanceof ParserRule) && (((ParserRule) rule_1).getBecomes() != null)) && (((ParserRule) rule_1).getType().getClassifier() instanceof EClass))) {
        final ParserRule pr = ((ParserRule) rule_1);
        String _name_1 = rule_1.getName();
        final String name = ("AST" + _name_1);
        EClassifier _classifier = pr.getType().getClassifier();
        final EClass clazz = ((EClass) _classifier);
        System.out.println(pr);
        String _runtimeBasePackage = this._xtextGeneratorNaming.getRuntimeBasePackage(this.getGrammar());
        String _plus_1 = (_runtimeBasePackage + ".ast");
        final TypeReference type = new TypeReference(_plus_1, name);
        final GeneratedJavaFileAccess javaFile = this.fileAccessFactory.createGeneratedJavaFile(type);
        final HashSet<String> ruleCopyAttributes = CollectionLiterals.<String>newHashSet();
        final HashMap<String, String> ruleCustomAttributes = CollectionLiterals.<String, String>newHashMap();
        EList<BecomesDeclAttribute> _attributes = pr.getBecomes().getAttributes();
        for (final BecomesDeclAttribute attr : _attributes) {
          if ((attr instanceof BecomesDeclCopyAttribute)) {
            ruleCopyAttributes.add(((BecomesDeclCopyAttribute)attr).getName());
          } else {
            if ((attr instanceof BecomesDeclCustomAttribute)) {
              String _name_2 = ((BecomesDeclCustomAttribute)attr).getName();
              String _xifexpression = null;
              boolean _contains = astClassNames.contains(((BecomesDeclCustomAttribute)attr).getType());
              if (_contains) {
                String _runtimeBasePackage_1 = this._xtextGeneratorNaming.getRuntimeBasePackage(this.getGrammar());
                String _plus_2 = (_runtimeBasePackage_1 + ".ast.");
                String _type = ((BecomesDeclCustomAttribute)attr).getType();
                _xifexpression = (_plus_2 + _type);
              } else {
                _xifexpression = ((BecomesDeclCustomAttribute)attr).getType();
              }
              ruleCustomAttributes.put(_name_2, _xifexpression);
            }
          }
        }
        final ArrayList<String> attributes = CollectionLiterals.<String>newArrayList();
        EList<EStructuralFeature> _eStructuralFeatures = clazz.getEStructuralFeatures();
        for (final EStructuralFeature attr_1 : _eStructuralFeatures) {
          {
            System.out.println(attr_1);
            if ((pr.getBecomes().getAttributes().isEmpty() || ruleCopyAttributes.contains(attr_1.getName()))) {
              if ((attr_1 instanceof EAttribute)) {
                StringConcatenation _builder = new StringConcatenation();
                Class<?> _instanceClass = ((EAttribute)attr_1).getEAttributeType().getInstanceClass();
                _builder.append(_instanceClass);
                _builder.append(" ");
                String _name_3 = ((EAttribute)attr_1).getName();
                _builder.append(_name_3);
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                attributes.add(_builder.toString());
              } else {
                if ((attr_1 instanceof EReference)) {
                  final EClass referencedType = ((EReference)attr_1).getEReferenceType();
                  Object _xifexpression_1 = null;
                  Class<?> _instanceClass_1 = referencedType.getInstanceClass();
                  boolean _tripleNotEquals = (_instanceClass_1 != null);
                  if (_tripleNotEquals) {
                    _xifexpression_1 = referencedType.getInstanceClass();
                  } else {
                    String _runtimeBasePackage_2 = this._xtextGeneratorNaming.getRuntimeBasePackage(this.getGrammar());
                    String _plus_3 = (_runtimeBasePackage_2 + ".ast");
                    _xifexpression_1 = new TypeReference(_plus_3, name);
                  }
                  final Object referencedASTType = _xifexpression_1;
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append(referencedASTType);
                  _builder_1.append(" ");
                  String _name_4 = ((EReference)attr_1).getName();
                  _builder_1.append(_name_4);
                  _builder_1.append(";");
                  _builder_1.newLineIfNotEmpty();
                  attributes.add(_builder_1.toString());
                } else {
                  throw new UnsupportedOperationException("Unknown feature type");
                }
              }
            }
          }
        }
        String _xifexpression_1 = null;
        if ((clazz.getEStructuralFeatures().isEmpty() && pr.getBecomes().getAttributes().isEmpty())) {
          _xifexpression_1 = "public abstract";
        } else {
          _xifexpression_1 = "public";
        }
        final String abstractModifier = _xifexpression_1;
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append(abstractModifier);
            _builder.append(" class ");
            _builder.append(name);
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("public ");
            _builder.append(name, "\t");
            _builder.append("(){}");
            _builder.newLineIfNotEmpty();
            {
              for(final String attr : attributes) {
                _builder.append("\t");
                _builder.append(attr, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Set<Map.Entry<String, String>> _entrySet = ruleCustomAttributes.entrySet();
              for(final Map.Entry<String, String> entry : _entrySet) {
                _builder.append("\t");
                String _value = entry.getValue();
                _builder.append(_value, "\t");
                _builder.append(" ");
                String _key = entry.getKey();
                _builder.append(_key, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
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
