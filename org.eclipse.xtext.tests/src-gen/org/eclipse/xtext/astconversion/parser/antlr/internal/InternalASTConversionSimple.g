/*
 * generated by Xtext
 */
grammar InternalASTConversionSimple;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.astconversion.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.astconversion.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.astconversion.services.ASTConversionSimpleGrammarAccess;

}

@parser::members {

 	private ASTConversionSimpleGrammarAccess grammarAccess;

    public InternalASTConversionSimpleParser(TokenStream input, ASTConversionSimpleGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected ASTConversionSimpleGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getEntriesEntryParserRuleCall_0_0());
				}
				lv_entries_0_0=ruleEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"entries",
						lv_entries_0_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Entry");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getSequenceSequenceParserRuleCall_1_0());
				}
				lv_sequence_1_0=ruleSequence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"sequence",
						lv_sequence_1_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Sequence");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getReturnsNewReturnsNewParserRuleCall_2_0());
				}
				lv_returnsNew_2_0=ruleReturnsNew
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"returnsNew",
						lv_returnsNew_2_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.ReturnsNew");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getActionNewActionNewParserRuleCall_3_0());
				}
				lv_actionNew_3_0=ruleActionNew
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"actionNew",
						lv_actionNew_3_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.ActionNew");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getListListsParserRuleCall_4_0());
				}
				lv_list_4_0=ruleLists
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"list",
						lv_list_4_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Lists");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getHoistingAlternativeHoistingAlternativeParserRuleCall_5_0());
				}
				lv_hoistingAlternative_5_0=ruleHoistingAlternative
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"hoistingAlternative",
						lv_hoistingAlternative_5_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.HoistingAlternative");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getHoistingActionNewHoistingActionNewParserRuleCall_6_0());
				}
				lv_hoistingActionNew_6_0=ruleHoistingActionNew
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"hoistingActionNew",
						lv_hoistingActionNew_6_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.HoistingActionNew");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEntry
entryRuleEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntryRule()); }
	iv_ruleEntry=ruleEntry
	{ $current=$iv_ruleEntry.current; }
	EOF;

// Rule Entry
ruleEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEntryAccess().getAutoClassParserRuleCall_0());
		}
		this_AutoClass_0=ruleAutoClass
		{
			$current = $this_AutoClass_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntryAccess().getAutoExplicitClassParserRuleCall_1());
		}
		this_AutoExplicitClass_1=ruleAutoExplicitClass
		{
			$current = $this_AutoExplicitClass_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntryAccess().getManualClassParserRuleCall_2());
		}
		this_ManualClass_2=ruleManualClass
		{
			$current = $this_ManualClass_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntryAccess().getCustomASTClassParserRuleCall_3());
		}
		this_CustomASTClass_3=ruleCustomASTClass
		{
			$current = $this_CustomASTClass_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntryAccess().getCustomCopyASTClassParserRuleCall_4());
		}
		this_CustomCopyASTClass_4=ruleCustomCopyASTClass
		{
			$current = $this_CustomCopyASTClass_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntryAccess().getOtherParserRuleCall_5());
		}
		this_Other_5=ruleOther
		{
			$current = $this_Other_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntryAccess().getElementParserRuleCall_6());
		}
		this_Element_6=ruleElement
		{
			$current = $this_Element_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAutoClass
entryRuleAutoClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAutoClassRule()); }
	iv_ruleAutoClass=ruleAutoClass
	{ $current=$iv_ruleAutoClass.current; }
	EOF;

// Rule AutoClass
ruleAutoClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='auto'
		{
			newLeafNode(otherlv_0, grammarAccess.getAutoClassAccess().getAutoKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAutoClassAccess().getRefReferenceParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAutoClassRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAutoClassAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAutoClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getAutoClassAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleAutoExplicitClass
entryRuleAutoExplicitClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAutoExplicitClassRule()); }
	iv_ruleAutoExplicitClass=ruleAutoExplicitClass
	{ $current=$iv_ruleAutoExplicitClass.current; }
	EOF;

// Rule AutoExplicitClass
ruleAutoExplicitClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='auto-explicit'
		{
			newLeafNode(otherlv_0, grammarAccess.getAutoExplicitClassAccess().getAutoExplicitKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAutoExplicitClassAccess().getRefReferenceParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAutoExplicitClassRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAutoExplicitClassAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAutoExplicitClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getAutoExplicitClassAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleManualClass
entryRuleManualClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getManualClassRule()); }
	iv_ruleManualClass=ruleManualClass
	{ $current=$iv_ruleManualClass.current; }
	EOF;

// Rule ManualClass
ruleManualClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='manual'
		{
			newLeafNode(otherlv_0, grammarAccess.getManualClassAccess().getManualKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getManualClassAccess().getRefReferenceParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getManualClassRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getManualClassAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getManualClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getManualClassAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleCustomASTClass
entryRuleCustomASTClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCustomASTClassRule()); }
	iv_ruleCustomASTClass=ruleCustomASTClass
	{ $current=$iv_ruleCustomASTClass.current; }
	EOF;

// Rule CustomASTClass
ruleCustomASTClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='custom'
		{
			newLeafNode(otherlv_0, grammarAccess.getCustomASTClassAccess().getCustomKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCustomASTClassAccess().getRefReferenceParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCustomASTClassRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCustomASTClassAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCustomASTClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getCustomASTClassAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleCustomCopyASTClass
entryRuleCustomCopyASTClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCustomCopyASTClassRule()); }
	iv_ruleCustomCopyASTClass=ruleCustomCopyASTClass
	{ $current=$iv_ruleCustomCopyASTClass.current; }
	EOF;

// Rule CustomCopyASTClass
ruleCustomCopyASTClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='custom-copy'
		{
			newLeafNode(otherlv_0, grammarAccess.getCustomCopyASTClassAccess().getCustomCopyKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCustomCopyASTClassAccess().getRefReferenceParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCustomCopyASTClassRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCustomCopyASTClassAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCustomCopyASTClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getCustomCopyASTClassAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;

// Rule Reference
ruleReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getReferenceRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleOther
entryRuleOther returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOtherRule()); }
	iv_ruleOther=ruleOther
	{ $current=$iv_ruleOther.current; }
	EOF;

// Rule Other
ruleOther returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='other'
		{
			newLeafNode(otherlv_0, grammarAccess.getOtherAccess().getOtherKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOtherAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOtherRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getOtherAccess().getContentReferenceParserRuleCall_2_0_0());
					}
					lv_content_2_1=ruleReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOtherRule());
						}
						set(
							$current,
							"content",
							lv_content_2_1,
							"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getOtherAccess().getContentAutoClassParserRuleCall_2_0_1());
					}
					lv_content_2_2=ruleAutoClass
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOtherRule());
						}
						set(
							$current,
							"content",
							lv_content_2_2,
							"org.eclipse.xtext.astconversion.ASTConversionSimple.AutoClass");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getElementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getTypeChangeKindEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleChangeKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.ChangeKind");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getValueChangeKindEnumRuleCall_4_0());
				}
				lv_value_4_0=ruleChangeKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					add(
						$current,
						"value",
						lv_value_4_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.ChangeKind");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getElementAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleSequence
entryRuleSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSequenceRule()); }
	iv_ruleSequence=ruleSequence
	{ $current=$iv_ruleSequence.current; }
	EOF;

// Rule Sequence
ruleSequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='sequence'
		{
			newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getSequenceAccess().getAdditionParserRuleCall_1());
		}
		this_Addition_1=ruleAddition
		{
			$current = $this_Addition_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getSequenceAccess().getSequenceExpressionsAction_2_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSequenceAccess().getExpressionsAdditionParserRuleCall_2_1_0());
					}
					lv_expressions_3_0=ruleAddition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSequenceRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_3_0,
							"org.eclipse.xtext.astconversion.ASTConversionSimple.Addition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	iv_ruleAddition=ruleAddition
	{ $current=$iv_ruleAddition.current; }
	EOF;

// Rule Addition
ruleAddition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_ID
				{
					newLeafNode(lv_left_0_0, grammarAccess.getAdditionAccess().getLeftIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAdditionRule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='+'
		{
			newLeafNode(otherlv_1, grammarAccess.getAdditionAccess().getPlusSignKeyword_1());
		}
		(
			(
				lv_right_2_0=RULE_ID
				{
					newLeafNode(lv_right_2_0, grammarAccess.getAdditionAccess().getRightIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAdditionRule());
					}
					setWithLastConsumed(
						$current,
						"right",
						lv_right_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleReturnsNew
entryRuleReturnsNew returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReturnsNewRule()); }
	iv_ruleReturnsNew=ruleReturnsNew
	{ $current=$iv_ruleReturnsNew.current; }
	EOF;

// Rule ReturnsNew
ruleReturnsNew returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='returns-new'
		{
			newLeafNode(otherlv_0, grammarAccess.getReturnsNewAccess().getReturnsNewKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_ID
				{
					newLeafNode(lv_value_1_0, grammarAccess.getReturnsNewAccess().getValueIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReturnsNewRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getReturnsNewAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleActionNew
entryRuleActionNew returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionNewRule()); }
	iv_ruleActionNew=ruleActionNew
	{ $current=$iv_ruleActionNew.current; }
	EOF;

// Rule ActionNew
ruleActionNew returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActionNewAccess().getActionNewXAction_0(),
					$current);
			}
		)
		otherlv_1='action-new'
		{
			newLeafNode(otherlv_1, grammarAccess.getActionNewAccess().getActionNewKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_ID
				{
					newLeafNode(lv_value_2_0, grammarAccess.getActionNewAccess().getValueIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionNewRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getActionNewAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleLists
entryRuleLists returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListsRule()); }
	iv_ruleLists=ruleLists
	{ $current=$iv_ruleLists.current; }
	EOF;

// Rule Lists
ruleLists returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getListsAccess().getAMapEntryParserRuleCall_0_0());
				}
				lv_a_0_0=ruleMapEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListsRule());
					}
					set(
						$current,
						"a",
						lv_a_0_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getListsAccess().getSemicolonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getListsAccess().getBMapEntryCustomParserRuleCall_2_0());
				}
				lv_b_2_0=ruleMapEntryCustom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListsRule());
					}
					set(
						$current,
						"b",
						lv_b_2_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntryCustom");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getListsAccess().getSemicolonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getListsAccess().getCMapEntryParserRuleCall_4_0());
				}
				lv_c_4_0=ruleMapEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListsRule());
					}
					add(
						$current,
						"c",
						lv_c_4_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getListsAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getListsAccess().getDMapEntryCustomParserRuleCall_6_0());
				}
				lv_d_6_0=ruleMapEntryCustom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListsRule());
					}
					add(
						$current,
						"d",
						lv_d_6_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntryCustom");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getListsAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleMapEntry
entryRuleMapEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMapEntryRule()); }
	iv_ruleMapEntry=ruleMapEntry
	{ $current=$iv_ruleMapEntry.current; }
	EOF;

// Rule MapEntry
ruleMapEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getMapEntryAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				lv_keys_1_0=RULE_ID
				{
					newLeafNode(lv_keys_1_0, grammarAccess.getMapEntryAccess().getKeysIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMapEntryRule());
					}
					addWithLastConsumed(
						$current,
						"keys",
						lv_keys_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getMapEntryAccess().getCommaKeyword_2_0());
			}
			(
				(
					lv_keys_3_0=RULE_ID
					{
						newLeafNode(lv_keys_3_0, grammarAccess.getMapEntryAccess().getKeysIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMapEntryRule());
						}
						addWithLastConsumed(
							$current,
							"keys",
							lv_keys_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getMapEntryAccess().getRightSquareBracketKeyword_3());
		}
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getMapEntryAccess().getColonKeyword_4());
		}
		(
			(
				lv_value_6_0=RULE_INT
				{
					newLeafNode(lv_value_6_0, grammarAccess.getMapEntryAccess().getValueINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMapEntryRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleMapEntryCustom
entryRuleMapEntryCustom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMapEntryCustomRule()); }
	iv_ruleMapEntryCustom=ruleMapEntryCustom
	{ $current=$iv_ruleMapEntryCustom.current; }
	EOF;

// Rule MapEntryCustom
ruleMapEntryCustom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getMapEntryCustomAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				lv_keys_1_0=RULE_ID
				{
					newLeafNode(lv_keys_1_0, grammarAccess.getMapEntryCustomAccess().getKeysIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMapEntryCustomRule());
					}
					addWithLastConsumed(
						$current,
						"keys",
						lv_keys_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getMapEntryCustomAccess().getCommaKeyword_2_0());
			}
			(
				(
					lv_keys_3_0=RULE_ID
					{
						newLeafNode(lv_keys_3_0, grammarAccess.getMapEntryCustomAccess().getKeysIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMapEntryCustomRule());
						}
						addWithLastConsumed(
							$current,
							"keys",
							lv_keys_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getMapEntryCustomAccess().getRightSquareBracketKeyword_3());
		}
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getMapEntryCustomAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMapEntryCustomAccess().getValueReferenceParserRuleCall_5_0());
				}
				lv_value_6_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapEntryCustomRule());
					}
					set(
						$current,
						"value",
						lv_value_6_0,
						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleHoistingAlternative
entryRuleHoistingAlternative returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHoistingAlternativeRule()); }
	iv_ruleHoistingAlternative=ruleHoistingAlternative
	{ $current=$iv_ruleHoistingAlternative.current; }
	EOF;

// Rule HoistingAlternative
ruleHoistingAlternative returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getHoistingAlternativeAccess().getXParserRuleCall_0());
		}
		this_X_0=ruleX
		{
			$current = $this_X_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHoistingAlternativeAccess().getYParserRuleCall_1());
		}
		this_Y_1=ruleY
		{
			$current = $this_Y_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleX
entryRuleX returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXRule()); }
	iv_ruleX=ruleX
	{ $current=$iv_ruleX.current; }
	EOF;

// Rule X
ruleX returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='altX'
		{
			newLeafNode(otherlv_0, grammarAccess.getXAccess().getAltXKeyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getXAccess().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getXAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleY
entryRuleY returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getYRule()); }
	iv_ruleY=ruleY
	{ $current=$iv_ruleY.current; }
	EOF;

// Rule Y
ruleY returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='altY'
		{
			newLeafNode(otherlv_0, grammarAccess.getYAccess().getAltYKeyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getYAccess().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getYRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_y_2_0=RULE_ID
				{
					newLeafNode(lv_y_2_0, grammarAccess.getYAccess().getYIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getYRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getYAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleHoistingActionNew
entryRuleHoistingActionNew returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHoistingActionNewRule()); }
	iv_ruleHoistingActionNew=ruleHoistingActionNew
	{ $current=$iv_ruleHoistingActionNew.current; }
	EOF;

// Rule HoistingActionNew
ruleHoistingActionNew returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getHoistingActionNewAccess().getHoistingActionNewXAction_0_0(),
						$current);
				}
			)
			otherlv_1='hoistA'
			{
				newLeafNode(otherlv_1, grammarAccess.getHoistingActionNewAccess().getHoistAKeyword_0_1());
			}
			(
				(
					lv_value_2_0=RULE_ID
					{
						newLeafNode(lv_value_2_0, grammarAccess.getHoistingActionNewAccess().getValueIDTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHoistingActionNewRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getHoistingActionNewAccess().getSemicolonKeyword_0_3());
			}
		)
		    |
		(
			otherlv_4='hoistB'
			{
				newLeafNode(otherlv_4, grammarAccess.getHoistingActionNewAccess().getHoistBKeyword_1_0());
			}
			(
				(
					lv_x_5_0=RULE_ID
					{
						newLeafNode(lv_x_5_0, grammarAccess.getHoistingActionNewAccess().getXIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHoistingActionNewRule());
						}
						setWithLastConsumed(
							$current,
							"x",
							lv_x_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getHoistingActionNewAccess().getSemicolonKeyword_1_2());
			}
		)
	)
;

// Rule ChangeKind
ruleChangeKind returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='add'
			{
				$current = grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='move'
			{
				$current = grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='remove'
			{
				$current = grammarAccess.getChangeKindAccess().getREMOVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getChangeKindAccess().getREMOVEEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
