/*
 * generated by Xtext
 */
package org.eclipse.xtext.grammarinheritance.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.grammarinheritance.ametamodel.AModel;
import org.eclipse.xtext.grammarinheritance.ametamodel.AType;
import org.eclipse.xtext.grammarinheritance.ametamodel.AmetamodelPackage;
import org.eclipse.xtext.grammarinheritance.services.AbstractTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractAbstractTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AbstractTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AmetamodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AmetamodelPackage.AMODEL:
				if (rule == grammarAccess.getAbstractCallExtendedParserRuleRule()) {
					sequence_AbstractCallExtendedParserRule(context, (AModel) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAbstractCallOverridenParserRuleRule()) {
					sequence_AbstractCallOverridenParserRule(context, (AModel) semanticObject); 
					return; 
				}
				else break;
			case AmetamodelPackage.ATYPE:
				if (rule == grammarAccess.getExtendableParserRuleRule()) {
					sequence_ExtendableParserRule(context, (AType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getInheritedParserRuleRule()) {
					sequence_InheritedParserRule(context, (AType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOverridableParserRule2Rule()) {
					sequence_OverridableParserRule2(context, (AType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOverridableParserRuleRule()) {
					sequence_OverridableParserRule(context, (AType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractCallExtendedParserRule returns AModel
	 *
	 * Constraint:
	 *     elements+=ExtendableParserRule+
	 * </pre>
	 */
	protected void sequence_AbstractCallExtendedParserRule(ISerializationContext context, AModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractCallOverridenParserRule returns AModel
	 *
	 * Constraint:
	 *     elements+=OverridableParserRule+
	 * </pre>
	 */
	protected void sequence_AbstractCallOverridenParserRule(ISerializationContext context, AModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ExtendableParserRule returns AType
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_ExtendableParserRule(ISerializationContext context, AType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AmetamodelPackage.Literals.ATYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmetamodelPackage.Literals.ATYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExtendableParserRuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InheritedParserRule returns AType
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_InheritedParserRule(ISerializationContext context, AType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AmetamodelPackage.Literals.ATYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmetamodelPackage.Literals.ATYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInheritedParserRuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OverridableParserRule2 returns AType
	 *
	 * Constraint:
	 *     name=STRING
	 * </pre>
	 */
	protected void sequence_OverridableParserRule2(ISerializationContext context, AType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AmetamodelPackage.Literals.ATYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmetamodelPackage.Literals.ATYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOverridableParserRule2Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OverridableParserRule returns AType
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_OverridableParserRule(ISerializationContext context, AType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AmetamodelPackage.Literals.ATYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmetamodelPackage.Literals.ATYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOverridableParserRuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
