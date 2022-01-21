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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalASTConversionSimpleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'auto'", "';'", "'auto-explicit'", "'manual'", "'custom'", "'custom-copy'", "'other'", "'element'", "'='", "'sequence'", "'+'", "'returns-new'", "'action-new'", "'['", "','", "']'", "':'", "'altX'", "'altY'", "'hoistA'", "'hoistB'", "'add'", "'move'", "'remove'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalASTConversionSimpleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalASTConversionSimpleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalASTConversionSimpleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalASTConversionSimple.g"; }



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




    // $ANTLR start "entryRuleProgram"
    // InternalASTConversionSimple.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalASTConversionSimple.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalASTConversionSimple.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalASTConversionSimple.g:72:1: ruleProgram returns [EObject current=null] : ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) ( (lv_hoistingAlternative_5_0= ruleHoistingAlternative ) ) ( (lv_hoistingActionNew_6_0= ruleHoistingActionNew ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;

        EObject lv_sequence_1_0 = null;

        EObject lv_returnsNew_2_0 = null;

        EObject lv_actionNew_3_0 = null;

        EObject lv_list_4_0 = null;

        EObject lv_hoistingAlternative_5_0 = null;

        EObject lv_hoistingActionNew_6_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:78:2: ( ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) ( (lv_hoistingAlternative_5_0= ruleHoistingAlternative ) ) ( (lv_hoistingActionNew_6_0= ruleHoistingActionNew ) ) ) )
            // InternalASTConversionSimple.g:79:2: ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) ( (lv_hoistingAlternative_5_0= ruleHoistingAlternative ) ) ( (lv_hoistingActionNew_6_0= ruleHoistingActionNew ) ) )
            {
            // InternalASTConversionSimple.g:79:2: ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) ( (lv_hoistingAlternative_5_0= ruleHoistingAlternative ) ) ( (lv_hoistingActionNew_6_0= ruleHoistingActionNew ) ) )
            // InternalASTConversionSimple.g:80:3: ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) ( (lv_hoistingAlternative_5_0= ruleHoistingAlternative ) ) ( (lv_hoistingActionNew_6_0= ruleHoistingActionNew ) )
            {
            // InternalASTConversionSimple.g:80:3: ( (lv_entries_0_0= ruleEntry ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalASTConversionSimple.g:81:4: (lv_entries_0_0= ruleEntry )
            	    {
            	    // InternalASTConversionSimple.g:81:4: (lv_entries_0_0= ruleEntry )
            	    // InternalASTConversionSimple.g:82:5: lv_entries_0_0= ruleEntry
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getEntriesEntryParserRuleCall_0_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_entries_0_0=ruleEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_0_0,
            	    						"org.eclipse.xtext.astconversion.ASTConversionSimple.Entry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalASTConversionSimple.g:99:3: ( (lv_sequence_1_0= ruleSequence ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalASTConversionSimple.g:100:4: (lv_sequence_1_0= ruleSequence )
            	    {
            	    // InternalASTConversionSimple.g:100:4: (lv_sequence_1_0= ruleSequence )
            	    // InternalASTConversionSimple.g:101:5: lv_sequence_1_0= ruleSequence
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getSequenceSequenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_sequence_1_0=ruleSequence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sequence",
            	    						lv_sequence_1_0,
            	    						"org.eclipse.xtext.astconversion.ASTConversionSimple.Sequence");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalASTConversionSimple.g:118:3: ( (lv_returnsNew_2_0= ruleReturnsNew ) )
            // InternalASTConversionSimple.g:119:4: (lv_returnsNew_2_0= ruleReturnsNew )
            {
            // InternalASTConversionSimple.g:119:4: (lv_returnsNew_2_0= ruleReturnsNew )
            // InternalASTConversionSimple.g:120:5: lv_returnsNew_2_0= ruleReturnsNew
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getReturnsNewReturnsNewParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
            lv_returnsNew_2_0=ruleReturnsNew();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"returnsNew",
            						lv_returnsNew_2_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.ReturnsNew");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:137:3: ( (lv_actionNew_3_0= ruleActionNew ) )
            // InternalASTConversionSimple.g:138:4: (lv_actionNew_3_0= ruleActionNew )
            {
            // InternalASTConversionSimple.g:138:4: (lv_actionNew_3_0= ruleActionNew )
            // InternalASTConversionSimple.g:139:5: lv_actionNew_3_0= ruleActionNew
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getActionNewActionNewParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_actionNew_3_0=ruleActionNew();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"actionNew",
            						lv_actionNew_3_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.ActionNew");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:156:3: ( (lv_list_4_0= ruleLists ) )
            // InternalASTConversionSimple.g:157:4: (lv_list_4_0= ruleLists )
            {
            // InternalASTConversionSimple.g:157:4: (lv_list_4_0= ruleLists )
            // InternalASTConversionSimple.g:158:5: lv_list_4_0= ruleLists
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getListListsParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_7);
            lv_list_4_0=ruleLists();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_4_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Lists");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:175:3: ( (lv_hoistingAlternative_5_0= ruleHoistingAlternative ) )
            // InternalASTConversionSimple.g:176:4: (lv_hoistingAlternative_5_0= ruleHoistingAlternative )
            {
            // InternalASTConversionSimple.g:176:4: (lv_hoistingAlternative_5_0= ruleHoistingAlternative )
            // InternalASTConversionSimple.g:177:5: lv_hoistingAlternative_5_0= ruleHoistingAlternative
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHoistingAlternativeHoistingAlternativeParserRuleCall_5_0());
            				
            pushFollow(FollowSets000.FOLLOW_8);
            lv_hoistingAlternative_5_0=ruleHoistingAlternative();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"hoistingAlternative",
            						lv_hoistingAlternative_5_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.HoistingAlternative");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:194:3: ( (lv_hoistingActionNew_6_0= ruleHoistingActionNew ) )
            // InternalASTConversionSimple.g:195:4: (lv_hoistingActionNew_6_0= ruleHoistingActionNew )
            {
            // InternalASTConversionSimple.g:195:4: (lv_hoistingActionNew_6_0= ruleHoistingActionNew )
            // InternalASTConversionSimple.g:196:5: lv_hoistingActionNew_6_0= ruleHoistingActionNew
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHoistingActionNewHoistingActionNewParserRuleCall_6_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_hoistingActionNew_6_0=ruleHoistingActionNew();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"hoistingActionNew",
            						lv_hoistingActionNew_6_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.HoistingActionNew");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleEntry"
    // InternalASTConversionSimple.g:217:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalASTConversionSimple.g:217:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalASTConversionSimple.g:218:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalASTConversionSimple.g:224:1: ruleEntry returns [EObject current=null] : (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject this_AutoClass_0 = null;

        EObject this_AutoExplicitClass_1 = null;

        EObject this_ManualClass_2 = null;

        EObject this_CustomASTClass_3 = null;

        EObject this_CustomCopyASTClass_4 = null;

        EObject this_Other_5 = null;

        EObject this_Element_6 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:230:2: ( (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) )
            // InternalASTConversionSimple.g:231:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
            {
            // InternalASTConversionSimple.g:231:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalASTConversionSimple.g:232:3: this_AutoClass_0= ruleAutoClass
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getAutoClassParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AutoClass_0=ruleAutoClass();

                    state._fsp--;


                    			current = this_AutoClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:241:3: this_AutoExplicitClass_1= ruleAutoExplicitClass
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getAutoExplicitClassParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AutoExplicitClass_1=ruleAutoExplicitClass();

                    state._fsp--;


                    			current = this_AutoExplicitClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalASTConversionSimple.g:250:3: this_ManualClass_2= ruleManualClass
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getManualClassParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ManualClass_2=ruleManualClass();

                    state._fsp--;


                    			current = this_ManualClass_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalASTConversionSimple.g:259:3: this_CustomASTClass_3= ruleCustomASTClass
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getCustomASTClassParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CustomASTClass_3=ruleCustomASTClass();

                    state._fsp--;


                    			current = this_CustomASTClass_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalASTConversionSimple.g:268:3: this_CustomCopyASTClass_4= ruleCustomCopyASTClass
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getCustomCopyASTClassParserRuleCall_4());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CustomCopyASTClass_4=ruleCustomCopyASTClass();

                    state._fsp--;


                    			current = this_CustomCopyASTClass_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalASTConversionSimple.g:277:3: this_Other_5= ruleOther
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getOtherParserRuleCall_5());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Other_5=ruleOther();

                    state._fsp--;


                    			current = this_Other_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalASTConversionSimple.g:286:3: this_Element_6= ruleElement
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getElementParserRuleCall_6());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Element_6=ruleElement();

                    state._fsp--;


                    			current = this_Element_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleAutoClass"
    // InternalASTConversionSimple.g:298:1: entryRuleAutoClass returns [EObject current=null] : iv_ruleAutoClass= ruleAutoClass EOF ;
    public final EObject entryRuleAutoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoClass = null;


        try {
            // InternalASTConversionSimple.g:298:50: (iv_ruleAutoClass= ruleAutoClass EOF )
            // InternalASTConversionSimple.g:299:2: iv_ruleAutoClass= ruleAutoClass EOF
            {
             newCompositeNode(grammarAccess.getAutoClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAutoClass=ruleAutoClass();

            state._fsp--;

             current =iv_ruleAutoClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutoClass"


    // $ANTLR start "ruleAutoClass"
    // InternalASTConversionSimple.g:305:1: ruleAutoClass returns [EObject current=null] : (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:311:2: ( (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:312:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:312:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:313:3: otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoClassAccess().getAutoKeyword_0());
            		
            // InternalASTConversionSimple.g:317:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:318:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:318:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:319:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_ref_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutoClassRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:336:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:337:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:337:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:338:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAutoClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutoClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAutoClassAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutoClass"


    // $ANTLR start "entryRuleAutoExplicitClass"
    // InternalASTConversionSimple.g:362:1: entryRuleAutoExplicitClass returns [EObject current=null] : iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF ;
    public final EObject entryRuleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoExplicitClass = null;


        try {
            // InternalASTConversionSimple.g:362:58: (iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF )
            // InternalASTConversionSimple.g:363:2: iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF
            {
             newCompositeNode(grammarAccess.getAutoExplicitClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAutoExplicitClass=ruleAutoExplicitClass();

            state._fsp--;

             current =iv_ruleAutoExplicitClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutoExplicitClass"


    // $ANTLR start "ruleAutoExplicitClass"
    // InternalASTConversionSimple.g:369:1: ruleAutoExplicitClass returns [EObject current=null] : (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:375:2: ( (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:376:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:376:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:377:3: otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoExplicitClassAccess().getAutoExplicitKeyword_0());
            		
            // InternalASTConversionSimple.g:381:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:382:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:382:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:383:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoExplicitClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_ref_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutoExplicitClassRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:400:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:401:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:401:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:402:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAutoExplicitClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutoExplicitClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAutoExplicitClassAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutoExplicitClass"


    // $ANTLR start "entryRuleManualClass"
    // InternalASTConversionSimple.g:426:1: entryRuleManualClass returns [EObject current=null] : iv_ruleManualClass= ruleManualClass EOF ;
    public final EObject entryRuleManualClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualClass = null;


        try {
            // InternalASTConversionSimple.g:426:52: (iv_ruleManualClass= ruleManualClass EOF )
            // InternalASTConversionSimple.g:427:2: iv_ruleManualClass= ruleManualClass EOF
            {
             newCompositeNode(grammarAccess.getManualClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleManualClass=ruleManualClass();

            state._fsp--;

             current =iv_ruleManualClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManualClass"


    // $ANTLR start "ruleManualClass"
    // InternalASTConversionSimple.g:433:1: ruleManualClass returns [EObject current=null] : (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleManualClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:439:2: ( (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:440:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:440:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:441:3: otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getManualClassAccess().getManualKeyword_0());
            		
            // InternalASTConversionSimple.g:445:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:446:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:446:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:447:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getManualClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_ref_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManualClassRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:464:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:465:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:465:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:466:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getManualClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManualClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getManualClassAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManualClass"


    // $ANTLR start "entryRuleCustomASTClass"
    // InternalASTConversionSimple.g:490:1: entryRuleCustomASTClass returns [EObject current=null] : iv_ruleCustomASTClass= ruleCustomASTClass EOF ;
    public final EObject entryRuleCustomASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomASTClass = null;


        try {
            // InternalASTConversionSimple.g:490:55: (iv_ruleCustomASTClass= ruleCustomASTClass EOF )
            // InternalASTConversionSimple.g:491:2: iv_ruleCustomASTClass= ruleCustomASTClass EOF
            {
             newCompositeNode(grammarAccess.getCustomASTClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCustomASTClass=ruleCustomASTClass();

            state._fsp--;

             current =iv_ruleCustomASTClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomASTClass"


    // $ANTLR start "ruleCustomASTClass"
    // InternalASTConversionSimple.g:497:1: ruleCustomASTClass returns [EObject current=null] : (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:503:2: ( (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:504:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:504:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:505:3: otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomASTClassAccess().getCustomKeyword_0());
            		
            // InternalASTConversionSimple.g:509:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:510:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:510:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:511:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomASTClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_ref_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomASTClassRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:528:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:529:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:529:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:530:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCustomASTClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomASTClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomASTClassAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomASTClass"


    // $ANTLR start "entryRuleCustomCopyASTClass"
    // InternalASTConversionSimple.g:554:1: entryRuleCustomCopyASTClass returns [EObject current=null] : iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF ;
    public final EObject entryRuleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCopyASTClass = null;


        try {
            // InternalASTConversionSimple.g:554:59: (iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF )
            // InternalASTConversionSimple.g:555:2: iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF
            {
             newCompositeNode(grammarAccess.getCustomCopyASTClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCustomCopyASTClass=ruleCustomCopyASTClass();

            state._fsp--;

             current =iv_ruleCustomCopyASTClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomCopyASTClass"


    // $ANTLR start "ruleCustomCopyASTClass"
    // InternalASTConversionSimple.g:561:1: ruleCustomCopyASTClass returns [EObject current=null] : (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:567:2: ( (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:568:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:568:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:569:3: otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCopyASTClassAccess().getCustomCopyKeyword_0());
            		
            // InternalASTConversionSimple.g:573:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:574:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:574:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:575:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomCopyASTClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_ref_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomCopyASTClassRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:592:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:593:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:593:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:594:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCustomCopyASTClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomCopyASTClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomCopyASTClassAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomCopyASTClass"


    // $ANTLR start "entryRuleReference"
    // InternalASTConversionSimple.g:618:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalASTConversionSimple.g:618:50: (iv_ruleReference= ruleReference EOF )
            // InternalASTConversionSimple.g:619:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalASTConversionSimple.g:625:1: ruleReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:631:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:632:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:632:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:633:3: (lv_name_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:633:3: (lv_name_0_0= RULE_ID )
            // InternalASTConversionSimple.g:634:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReferenceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleOther"
    // InternalASTConversionSimple.g:653:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // InternalASTConversionSimple.g:653:46: (iv_ruleOther= ruleOther EOF )
            // InternalASTConversionSimple.g:654:2: iv_ruleOther= ruleOther EOF
            {
             newCompositeNode(grammarAccess.getOtherRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOther=ruleOther();

            state._fsp--;

             current =iv_ruleOther; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOther"


    // $ANTLR start "ruleOther"
    // InternalASTConversionSimple.g:660:1: ruleOther returns [EObject current=null] : (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_content_2_1 = null;

        EObject lv_content_2_2 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:666:2: ( (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) )
            // InternalASTConversionSimple.g:667:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            {
            // InternalASTConversionSimple.g:667:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            // InternalASTConversionSimple.g:668:3: otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherAccess().getOtherKeyword_0());
            		
            // InternalASTConversionSimple.g:672:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:673:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:673:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:674:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOtherAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalASTConversionSimple.g:690:3: ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            // InternalASTConversionSimple.g:691:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            {
            // InternalASTConversionSimple.g:691:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            // InternalASTConversionSimple.g:692:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
            {
            // InternalASTConversionSimple.g:692:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalASTConversionSimple.g:693:6: lv_content_2_1= ruleReference
                    {

                    						newCompositeNode(grammarAccess.getOtherAccess().getContentReferenceParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_content_2_1=ruleReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherRule());
                    						}
                    						set(
                    							current,
                    							"content",
                    							lv_content_2_1,
                    							"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:709:6: lv_content_2_2= ruleAutoClass
                    {

                    						newCompositeNode(grammarAccess.getOtherAccess().getContentAutoClassParserRuleCall_2_0_1());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_content_2_2=ruleAutoClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherRule());
                    						}
                    						set(
                    							current,
                    							"content",
                    							lv_content_2_2,
                    							"org.eclipse.xtext.astconversion.ASTConversionSimple.AutoClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOther"


    // $ANTLR start "entryRuleElement"
    // InternalASTConversionSimple.g:731:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalASTConversionSimple.g:731:48: (iv_ruleElement= ruleElement EOF )
            // InternalASTConversionSimple.g:732:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalASTConversionSimple.g:738:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_2_0 = null;

        Enumerator lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:744:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) )
            // InternalASTConversionSimple.g:745:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            {
            // InternalASTConversionSimple.g:745:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            // InternalASTConversionSimple.g:746:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalASTConversionSimple.g:750:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:751:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:751:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:752:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalASTConversionSimple.g:768:3: ( (lv_type_2_0= ruleChangeKind ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=32 && LA5_0<=34)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalASTConversionSimple.g:769:4: (lv_type_2_0= ruleChangeKind )
                    {
                    // InternalASTConversionSimple.g:769:4: (lv_type_2_0= ruleChangeKind )
                    // InternalASTConversionSimple.g:770:5: lv_type_2_0= ruleChangeKind
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTypeChangeKindEnumRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_type_2_0=ruleChangeKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.eclipse.xtext.astconversion.ASTConversionSimple.ChangeKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getEqualsSignKeyword_3());
            		
            // InternalASTConversionSimple.g:791:3: ( (lv_value_4_0= ruleChangeKind ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=32 && LA6_0<=34)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalASTConversionSimple.g:792:4: (lv_value_4_0= ruleChangeKind )
            	    {
            	    // InternalASTConversionSimple.g:792:4: (lv_value_4_0= ruleChangeKind )
            	    // InternalASTConversionSimple.g:793:5: lv_value_4_0= ruleChangeKind
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getValueChangeKindEnumRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_value_4_0=ruleChangeKind();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_4_0,
            	    						"org.eclipse.xtext.astconversion.ASTConversionSimple.ChangeKind");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getElementAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleSequence"
    // InternalASTConversionSimple.g:818:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalASTConversionSimple.g:818:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalASTConversionSimple.g:819:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalASTConversionSimple.g:825:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Addition_1 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:831:2: ( (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' ) )
            // InternalASTConversionSimple.g:832:2: (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' )
            {
            // InternalASTConversionSimple.g:832:2: (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' )
            // InternalASTConversionSimple.g:833:3: otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSequenceAccess().getAdditionParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_16);
            this_Addition_1=ruleAddition();

            state._fsp--;


            			current = this_Addition_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalASTConversionSimple.g:845:3: ( () ( (lv_expressions_3_0= ruleAddition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalASTConversionSimple.g:846:4: () ( (lv_expressions_3_0= ruleAddition ) )
            	    {
            	    // InternalASTConversionSimple.g:846:4: ()
            	    // InternalASTConversionSimple.g:847:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getSequenceAccess().getSequenceExpressionsAction_2_0(),
            	    						current);
            	    				

            	    }

            	    // InternalASTConversionSimple.g:853:4: ( (lv_expressions_3_0= ruleAddition ) )
            	    // InternalASTConversionSimple.g:854:5: (lv_expressions_3_0= ruleAddition )
            	    {
            	    // InternalASTConversionSimple.g:854:5: (lv_expressions_3_0= ruleAddition )
            	    // InternalASTConversionSimple.g:855:6: lv_expressions_3_0= ruleAddition
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccess().getExpressionsAdditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_expressions_3_0=ruleAddition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_3_0,
            	    							"org.eclipse.xtext.astconversion.ASTConversionSimple.Addition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleAddition"
    // InternalASTConversionSimple.g:881:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalASTConversionSimple.g:881:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalASTConversionSimple.g:882:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalASTConversionSimple.g:888:1: ruleAddition returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token lv_right_2_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:894:2: ( ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) ) )
            // InternalASTConversionSimple.g:895:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) )
            {
            // InternalASTConversionSimple.g:895:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:896:3: ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:896:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:897:4: (lv_left_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:897:4: (lv_left_0_0= RULE_ID )
            // InternalASTConversionSimple.g:898:5: lv_left_0_0= RULE_ID
            {
            lv_left_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

            					newLeafNode(lv_left_0_0, grammarAccess.getAdditionAccess().getLeftIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionAccess().getPlusSignKeyword_1());
            		
            // InternalASTConversionSimple.g:918:3: ( (lv_right_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:919:4: (lv_right_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:919:4: (lv_right_2_0= RULE_ID )
            // InternalASTConversionSimple.g:920:5: lv_right_2_0= RULE_ID
            {
            lv_right_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_right_2_0, grammarAccess.getAdditionAccess().getRightIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleReturnsNew"
    // InternalASTConversionSimple.g:940:1: entryRuleReturnsNew returns [EObject current=null] : iv_ruleReturnsNew= ruleReturnsNew EOF ;
    public final EObject entryRuleReturnsNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsNew = null;


        try {
            // InternalASTConversionSimple.g:940:51: (iv_ruleReturnsNew= ruleReturnsNew EOF )
            // InternalASTConversionSimple.g:941:2: iv_ruleReturnsNew= ruleReturnsNew EOF
            {
             newCompositeNode(grammarAccess.getReturnsNewRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReturnsNew=ruleReturnsNew();

            state._fsp--;

             current =iv_ruleReturnsNew; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnsNew"


    // $ANTLR start "ruleReturnsNew"
    // InternalASTConversionSimple.g:947:1: ruleReturnsNew returns [EObject current=null] : (otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturnsNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:953:2: ( (otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalASTConversionSimple.g:954:2: (otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalASTConversionSimple.g:954:2: (otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalASTConversionSimple.g:955:3: otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnsNewAccess().getReturnsNewKeyword_0());
            		
            // InternalASTConversionSimple.g:959:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:960:4: (lv_value_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:960:4: (lv_value_1_0= RULE_ID )
            // InternalASTConversionSimple.g:961:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_value_1_0, grammarAccess.getReturnsNewAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnsNewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReturnsNewAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnsNew"


    // $ANTLR start "entryRuleActionNew"
    // InternalASTConversionSimple.g:985:1: entryRuleActionNew returns [EObject current=null] : iv_ruleActionNew= ruleActionNew EOF ;
    public final EObject entryRuleActionNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionNew = null;


        try {
            // InternalASTConversionSimple.g:985:50: (iv_ruleActionNew= ruleActionNew EOF )
            // InternalASTConversionSimple.g:986:2: iv_ruleActionNew= ruleActionNew EOF
            {
             newCompositeNode(grammarAccess.getActionNewRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActionNew=ruleActionNew();

            state._fsp--;

             current =iv_ruleActionNew; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionNew"


    // $ANTLR start "ruleActionNew"
    // InternalASTConversionSimple.g:992:1: ruleActionNew returns [EObject current=null] : ( () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleActionNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:998:2: ( ( () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:999:2: ( () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:999:2: ( () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:1000:3: () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalASTConversionSimple.g:1000:3: ()
            // InternalASTConversionSimple.g:1001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionNewAccess().getActionNewXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getActionNewAccess().getActionNewKeyword_1());
            		
            // InternalASTConversionSimple.g:1011:3: ( (lv_value_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1012:4: (lv_value_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1012:4: (lv_value_2_0= RULE_ID )
            // InternalASTConversionSimple.g:1013:5: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_value_2_0, grammarAccess.getActionNewAccess().getValueIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionNewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getActionNewAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionNew"


    // $ANTLR start "entryRuleLists"
    // InternalASTConversionSimple.g:1037:1: entryRuleLists returns [EObject current=null] : iv_ruleLists= ruleLists EOF ;
    public final EObject entryRuleLists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLists = null;


        try {
            // InternalASTConversionSimple.g:1037:46: (iv_ruleLists= ruleLists EOF )
            // InternalASTConversionSimple.g:1038:2: iv_ruleLists= ruleLists EOF
            {
             newCompositeNode(grammarAccess.getListsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLists=ruleLists();

            state._fsp--;

             current =iv_ruleLists; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLists"


    // $ANTLR start "ruleLists"
    // InternalASTConversionSimple.g:1044:1: ruleLists returns [EObject current=null] : ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ( (lv_e_8_0= ruleMapEntryCustom2 ) ) otherlv_9= ';' ) ;
    public final EObject ruleLists() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_c_4_0 = null;

        EObject lv_d_6_0 = null;

        EObject lv_e_8_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:1050:2: ( ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ( (lv_e_8_0= ruleMapEntryCustom2 ) ) otherlv_9= ';' ) )
            // InternalASTConversionSimple.g:1051:2: ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ( (lv_e_8_0= ruleMapEntryCustom2 ) ) otherlv_9= ';' )
            {
            // InternalASTConversionSimple.g:1051:2: ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ( (lv_e_8_0= ruleMapEntryCustom2 ) ) otherlv_9= ';' )
            // InternalASTConversionSimple.g:1052:3: ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ( (lv_e_8_0= ruleMapEntryCustom2 ) ) otherlv_9= ';'
            {
            // InternalASTConversionSimple.g:1052:3: ( (lv_a_0_0= ruleMapEntry ) )
            // InternalASTConversionSimple.g:1053:4: (lv_a_0_0= ruleMapEntry )
            {
            // InternalASTConversionSimple.g:1053:4: (lv_a_0_0= ruleMapEntry )
            // InternalASTConversionSimple.g:1054:5: lv_a_0_0= ruleMapEntry
            {

            					newCompositeNode(grammarAccess.getListsAccess().getAMapEntryParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_10);
            lv_a_0_0=ruleMapEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListsRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_0_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getListsAccess().getSemicolonKeyword_1());
            		
            // InternalASTConversionSimple.g:1075:3: ( (lv_b_2_0= ruleMapEntryCustom ) )
            // InternalASTConversionSimple.g:1076:4: (lv_b_2_0= ruleMapEntryCustom )
            {
            // InternalASTConversionSimple.g:1076:4: (lv_b_2_0= ruleMapEntryCustom )
            // InternalASTConversionSimple.g:1077:5: lv_b_2_0= ruleMapEntryCustom
            {

            					newCompositeNode(grammarAccess.getListsAccess().getBMapEntryCustomParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_10);
            lv_b_2_0=ruleMapEntryCustom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListsRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_2_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntryCustom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getListsAccess().getSemicolonKeyword_3());
            		
            // InternalASTConversionSimple.g:1098:3: ( (lv_c_4_0= ruleMapEntry ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1099:4: (lv_c_4_0= ruleMapEntry )
            	    {
            	    // InternalASTConversionSimple.g:1099:4: (lv_c_4_0= ruleMapEntry )
            	    // InternalASTConversionSimple.g:1100:5: lv_c_4_0= ruleMapEntry
            	    {

            	    					newCompositeNode(grammarAccess.getListsAccess().getCMapEntryParserRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_c_4_0=ruleMapEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"c",
            	    						lv_c_4_0,
            	    						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getListsAccess().getSemicolonKeyword_5());
            		
            // InternalASTConversionSimple.g:1121:3: ( (lv_d_6_0= ruleMapEntryCustom ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1122:4: (lv_d_6_0= ruleMapEntryCustom )
            	    {
            	    // InternalASTConversionSimple.g:1122:4: (lv_d_6_0= ruleMapEntryCustom )
            	    // InternalASTConversionSimple.g:1123:5: lv_d_6_0= ruleMapEntryCustom
            	    {

            	    					newCompositeNode(grammarAccess.getListsAccess().getDMapEntryCustomParserRuleCall_6_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_d_6_0=ruleMapEntryCustom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"d",
            	    						lv_d_6_0,
            	    						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntryCustom");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getListsAccess().getSemicolonKeyword_7());
            		
            // InternalASTConversionSimple.g:1144:3: ( (lv_e_8_0= ruleMapEntryCustom2 ) )
            // InternalASTConversionSimple.g:1145:4: (lv_e_8_0= ruleMapEntryCustom2 )
            {
            // InternalASTConversionSimple.g:1145:4: (lv_e_8_0= ruleMapEntryCustom2 )
            // InternalASTConversionSimple.g:1146:5: lv_e_8_0= ruleMapEntryCustom2
            {

            					newCompositeNode(grammarAccess.getListsAccess().getEMapEntryCustom2ParserRuleCall_8_0());
            				
            pushFollow(FollowSets000.FOLLOW_10);
            lv_e_8_0=ruleMapEntryCustom2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListsRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_8_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.MapEntryCustom2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getListsAccess().getSemicolonKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLists"


    // $ANTLR start "entryRuleMapEntry"
    // InternalASTConversionSimple.g:1171:1: entryRuleMapEntry returns [EObject current=null] : iv_ruleMapEntry= ruleMapEntry EOF ;
    public final EObject entryRuleMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntry = null;


        try {
            // InternalASTConversionSimple.g:1171:49: (iv_ruleMapEntry= ruleMapEntry EOF )
            // InternalASTConversionSimple.g:1172:2: iv_ruleMapEntry= ruleMapEntry EOF
            {
             newCompositeNode(grammarAccess.getMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapEntry=ruleMapEntry();

            state._fsp--;

             current =iv_ruleMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapEntry"


    // $ANTLR start "ruleMapEntry"
    // InternalASTConversionSimple.g:1178:1: ruleMapEntry returns [EObject current=null] : (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) ) ;
    public final EObject ruleMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keys_1_0=null;
        Token otherlv_2=null;
        Token lv_keys_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:1184:2: ( (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) ) )
            // InternalASTConversionSimple.g:1185:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) )
            {
            // InternalASTConversionSimple.g:1185:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) )
            // InternalASTConversionSimple.g:1186:3: otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMapEntryAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalASTConversionSimple.g:1190:3: ( (lv_keys_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1191:4: (lv_keys_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1191:4: (lv_keys_1_0= RULE_ID )
            // InternalASTConversionSimple.g:1192:5: lv_keys_1_0= RULE_ID
            {
            lv_keys_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); 

            					newLeafNode(lv_keys_1_0, grammarAccess.getMapEntryAccess().getKeysIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapEntryRule());
            					}
            					addWithLastConsumed(
            						current,
            						"keys",
            						lv_keys_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalASTConversionSimple.g:1208:3: (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1209:4: otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapEntryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalASTConversionSimple.g:1213:4: ( (lv_keys_3_0= RULE_ID ) )
            	    // InternalASTConversionSimple.g:1214:5: (lv_keys_3_0= RULE_ID )
            	    {
            	    // InternalASTConversionSimple.g:1214:5: (lv_keys_3_0= RULE_ID )
            	    // InternalASTConversionSimple.g:1215:6: lv_keys_3_0= RULE_ID
            	    {
            	    lv_keys_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); 

            	    						newLeafNode(lv_keys_3_0, grammarAccess.getMapEntryAccess().getKeysIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMapEntryRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"keys",
            	    							lv_keys_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getMapEntryAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getMapEntryAccess().getColonKeyword_4());
            		
            // InternalASTConversionSimple.g:1240:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalASTConversionSimple.g:1241:4: (lv_value_6_0= RULE_INT )
            {
            // InternalASTConversionSimple.g:1241:4: (lv_value_6_0= RULE_INT )
            // InternalASTConversionSimple.g:1242:5: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_value_6_0, grammarAccess.getMapEntryAccess().getValueINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapEntry"


    // $ANTLR start "entryRuleMapEntryCustom"
    // InternalASTConversionSimple.g:1262:1: entryRuleMapEntryCustom returns [EObject current=null] : iv_ruleMapEntryCustom= ruleMapEntryCustom EOF ;
    public final EObject entryRuleMapEntryCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryCustom = null;


        try {
            // InternalASTConversionSimple.g:1262:55: (iv_ruleMapEntryCustom= ruleMapEntryCustom EOF )
            // InternalASTConversionSimple.g:1263:2: iv_ruleMapEntryCustom= ruleMapEntryCustom EOF
            {
             newCompositeNode(grammarAccess.getMapEntryCustomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapEntryCustom=ruleMapEntryCustom();

            state._fsp--;

             current =iv_ruleMapEntryCustom; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapEntryCustom"


    // $ANTLR start "ruleMapEntryCustom"
    // InternalASTConversionSimple.g:1269:1: ruleMapEntryCustom returns [EObject current=null] : (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) ) ;
    public final EObject ruleMapEntryCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keys_1_0=null;
        Token otherlv_2=null;
        Token lv_keys_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:1275:2: ( (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) ) )
            // InternalASTConversionSimple.g:1276:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) )
            {
            // InternalASTConversionSimple.g:1276:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) )
            // InternalASTConversionSimple.g:1277:3: otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMapEntryCustomAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalASTConversionSimple.g:1281:3: ( (lv_keys_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1282:4: (lv_keys_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1282:4: (lv_keys_1_0= RULE_ID )
            // InternalASTConversionSimple.g:1283:5: lv_keys_1_0= RULE_ID
            {
            lv_keys_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); 

            					newLeafNode(lv_keys_1_0, grammarAccess.getMapEntryCustomAccess().getKeysIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapEntryCustomRule());
            					}
            					addWithLastConsumed(
            						current,
            						"keys",
            						lv_keys_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalASTConversionSimple.g:1299:3: (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1300:4: otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapEntryCustomAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalASTConversionSimple.g:1304:4: ( (lv_keys_3_0= RULE_ID ) )
            	    // InternalASTConversionSimple.g:1305:5: (lv_keys_3_0= RULE_ID )
            	    {
            	    // InternalASTConversionSimple.g:1305:5: (lv_keys_3_0= RULE_ID )
            	    // InternalASTConversionSimple.g:1306:6: lv_keys_3_0= RULE_ID
            	    {
            	    lv_keys_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); 

            	    						newLeafNode(lv_keys_3_0, grammarAccess.getMapEntryCustomAccess().getKeysIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMapEntryCustomRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"keys",
            	    							lv_keys_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getMapEntryCustomAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMapEntryCustomAccess().getColonKeyword_4());
            		
            // InternalASTConversionSimple.g:1331:3: ( (lv_value_6_0= ruleReference ) )
            // InternalASTConversionSimple.g:1332:4: (lv_value_6_0= ruleReference )
            {
            // InternalASTConversionSimple.g:1332:4: (lv_value_6_0= ruleReference )
            // InternalASTConversionSimple.g:1333:5: lv_value_6_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getMapEntryCustomAccess().getValueReferenceParserRuleCall_5_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_6_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapEntryCustomRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapEntryCustom"


    // $ANTLR start "entryRuleMapEntryCustom2"
    // InternalASTConversionSimple.g:1354:1: entryRuleMapEntryCustom2 returns [EObject current=null] : iv_ruleMapEntryCustom2= ruleMapEntryCustom2 EOF ;
    public final EObject entryRuleMapEntryCustom2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryCustom2 = null;


        try {
            // InternalASTConversionSimple.g:1354:56: (iv_ruleMapEntryCustom2= ruleMapEntryCustom2 EOF )
            // InternalASTConversionSimple.g:1355:2: iv_ruleMapEntryCustom2= ruleMapEntryCustom2 EOF
            {
             newCompositeNode(grammarAccess.getMapEntryCustom2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapEntryCustom2=ruleMapEntryCustom2();

            state._fsp--;

             current =iv_ruleMapEntryCustom2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapEntryCustom2"


    // $ANTLR start "ruleMapEntryCustom2"
    // InternalASTConversionSimple.g:1361:1: ruleMapEntryCustom2 returns [EObject current=null] : (otherlv_0= '[' ( (lv_keys_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_INT ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) ) ;
    public final EObject ruleMapEntryCustom2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keys_1_0=null;
        Token otherlv_2=null;
        Token lv_keys_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:1367:2: ( (otherlv_0= '[' ( (lv_keys_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_INT ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) ) )
            // InternalASTConversionSimple.g:1368:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_INT ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) )
            {
            // InternalASTConversionSimple.g:1368:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_INT ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) )
            // InternalASTConversionSimple.g:1369:3: otherlv_0= '[' ( (lv_keys_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_INT ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getMapEntryCustom2Access().getLeftSquareBracketKeyword_0());
            		
            // InternalASTConversionSimple.g:1373:3: ( (lv_keys_1_0= RULE_INT ) )
            // InternalASTConversionSimple.g:1374:4: (lv_keys_1_0= RULE_INT )
            {
            // InternalASTConversionSimple.g:1374:4: (lv_keys_1_0= RULE_INT )
            // InternalASTConversionSimple.g:1375:5: lv_keys_1_0= RULE_INT
            {
            lv_keys_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_19); 

            					newLeafNode(lv_keys_1_0, grammarAccess.getMapEntryCustom2Access().getKeysINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapEntryCustom2Rule());
            					}
            					addWithLastConsumed(
            						current,
            						"keys",
            						lv_keys_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalASTConversionSimple.g:1391:3: (otherlv_2= ',' ( (lv_keys_3_0= RULE_INT ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1392:4: otherlv_2= ',' ( (lv_keys_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapEntryCustom2Access().getCommaKeyword_2_0());
            	    			
            	    // InternalASTConversionSimple.g:1396:4: ( (lv_keys_3_0= RULE_INT ) )
            	    // InternalASTConversionSimple.g:1397:5: (lv_keys_3_0= RULE_INT )
            	    {
            	    // InternalASTConversionSimple.g:1397:5: (lv_keys_3_0= RULE_INT )
            	    // InternalASTConversionSimple.g:1398:6: lv_keys_3_0= RULE_INT
            	    {
            	    lv_keys_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_19); 

            	    						newLeafNode(lv_keys_3_0, grammarAccess.getMapEntryCustom2Access().getKeysINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMapEntryCustom2Rule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"keys",
            	    							lv_keys_3_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getMapEntryCustom2Access().getRightSquareBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMapEntryCustom2Access().getColonKeyword_4());
            		
            // InternalASTConversionSimple.g:1423:3: ( (lv_value_6_0= ruleReference ) )
            // InternalASTConversionSimple.g:1424:4: (lv_value_6_0= ruleReference )
            {
            // InternalASTConversionSimple.g:1424:4: (lv_value_6_0= ruleReference )
            // InternalASTConversionSimple.g:1425:5: lv_value_6_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getMapEntryCustom2Access().getValueReferenceParserRuleCall_5_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_6_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapEntryCustom2Rule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapEntryCustom2"


    // $ANTLR start "entryRuleHoistingAlternative"
    // InternalASTConversionSimple.g:1446:1: entryRuleHoistingAlternative returns [EObject current=null] : iv_ruleHoistingAlternative= ruleHoistingAlternative EOF ;
    public final EObject entryRuleHoistingAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoistingAlternative = null;


        try {
            // InternalASTConversionSimple.g:1446:60: (iv_ruleHoistingAlternative= ruleHoistingAlternative EOF )
            // InternalASTConversionSimple.g:1447:2: iv_ruleHoistingAlternative= ruleHoistingAlternative EOF
            {
             newCompositeNode(grammarAccess.getHoistingAlternativeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHoistingAlternative=ruleHoistingAlternative();

            state._fsp--;

             current =iv_ruleHoistingAlternative; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHoistingAlternative"


    // $ANTLR start "ruleHoistingAlternative"
    // InternalASTConversionSimple.g:1453:1: ruleHoistingAlternative returns [EObject current=null] : (this_X_0= ruleX | this_Y_1= ruleY ) ;
    public final EObject ruleHoistingAlternative() throws RecognitionException {
        EObject current = null;

        EObject this_X_0 = null;

        EObject this_Y_1 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:1459:2: ( (this_X_0= ruleX | this_Y_1= ruleY ) )
            // InternalASTConversionSimple.g:1460:2: (this_X_0= ruleX | this_Y_1= ruleY )
            {
            // InternalASTConversionSimple.g:1460:2: (this_X_0= ruleX | this_Y_1= ruleY )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalASTConversionSimple.g:1461:3: this_X_0= ruleX
                    {

                    			newCompositeNode(grammarAccess.getHoistingAlternativeAccess().getXParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_X_0=ruleX();

                    state._fsp--;


                    			current = this_X_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:1470:3: this_Y_1= ruleY
                    {

                    			newCompositeNode(grammarAccess.getHoistingAlternativeAccess().getYParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Y_1=ruleY();

                    state._fsp--;


                    			current = this_Y_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHoistingAlternative"


    // $ANTLR start "entryRuleX"
    // InternalASTConversionSimple.g:1482:1: entryRuleX returns [EObject current=null] : iv_ruleX= ruleX EOF ;
    public final EObject entryRuleX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX = null;


        try {
            // InternalASTConversionSimple.g:1482:42: (iv_ruleX= ruleX EOF )
            // InternalASTConversionSimple.g:1483:2: iv_ruleX= ruleX EOF
            {
             newCompositeNode(grammarAccess.getXRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleX=ruleX();

            state._fsp--;

             current =iv_ruleX; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleX"


    // $ANTLR start "ruleX"
    // InternalASTConversionSimple.g:1489:1: ruleX returns [EObject current=null] : (otherlv_0= 'altX' ( (lv_val_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:1495:2: ( (otherlv_0= 'altX' ( (lv_val_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalASTConversionSimple.g:1496:2: (otherlv_0= 'altX' ( (lv_val_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalASTConversionSimple.g:1496:2: (otherlv_0= 'altX' ( (lv_val_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalASTConversionSimple.g:1497:3: otherlv_0= 'altX' ( (lv_val_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getXAccess().getAltXKeyword_0());
            		
            // InternalASTConversionSimple.g:1501:3: ( (lv_val_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1502:4: (lv_val_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1502:4: (lv_val_1_0= RULE_ID )
            // InternalASTConversionSimple.g:1503:5: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_val_1_0, grammarAccess.getXAccess().getValIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getXAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleX"


    // $ANTLR start "entryRuleY"
    // InternalASTConversionSimple.g:1527:1: entryRuleY returns [EObject current=null] : iv_ruleY= ruleY EOF ;
    public final EObject entryRuleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY = null;


        try {
            // InternalASTConversionSimple.g:1527:42: (iv_ruleY= ruleY EOF )
            // InternalASTConversionSimple.g:1528:2: iv_ruleY= ruleY EOF
            {
             newCompositeNode(grammarAccess.getYRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleY=ruleY();

            state._fsp--;

             current =iv_ruleY; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // InternalASTConversionSimple.g:1534:1: ruleY returns [EObject current=null] : (otherlv_0= 'altY' ( (lv_val_1_0= RULE_ID ) ) ( (lv_y_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:1540:2: ( (otherlv_0= 'altY' ( (lv_val_1_0= RULE_ID ) ) ( (lv_y_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:1541:2: (otherlv_0= 'altY' ( (lv_val_1_0= RULE_ID ) ) ( (lv_y_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:1541:2: (otherlv_0= 'altY' ( (lv_val_1_0= RULE_ID ) ) ( (lv_y_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:1542:3: otherlv_0= 'altY' ( (lv_val_1_0= RULE_ID ) ) ( (lv_y_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getYAccess().getAltYKeyword_0());
            		
            // InternalASTConversionSimple.g:1546:3: ( (lv_val_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1547:4: (lv_val_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1547:4: (lv_val_1_0= RULE_ID )
            // InternalASTConversionSimple.g:1548:5: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            					newLeafNode(lv_val_1_0, grammarAccess.getYAccess().getValIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalASTConversionSimple.g:1564:3: ( (lv_y_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1565:4: (lv_y_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1565:4: (lv_y_2_0= RULE_ID )
            // InternalASTConversionSimple.g:1566:5: lv_y_2_0= RULE_ID
            {
            lv_y_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_y_2_0, grammarAccess.getYAccess().getYIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getYAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleHoistingActionNew"
    // InternalASTConversionSimple.g:1590:1: entryRuleHoistingActionNew returns [EObject current=null] : iv_ruleHoistingActionNew= ruleHoistingActionNew EOF ;
    public final EObject entryRuleHoistingActionNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoistingActionNew = null;


        try {
            // InternalASTConversionSimple.g:1590:58: (iv_ruleHoistingActionNew= ruleHoistingActionNew EOF )
            // InternalASTConversionSimple.g:1591:2: iv_ruleHoistingActionNew= ruleHoistingActionNew EOF
            {
             newCompositeNode(grammarAccess.getHoistingActionNewRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHoistingActionNew=ruleHoistingActionNew();

            state._fsp--;

             current =iv_ruleHoistingActionNew; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHoistingActionNew"


    // $ANTLR start "ruleHoistingActionNew"
    // InternalASTConversionSimple.g:1597:1: ruleHoistingActionNew returns [EObject current=null] : ( ( () otherlv_1= 'hoistA' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) | (otherlv_4= 'hoistB' ( (lv_x_5_0= RULE_ID ) ) otherlv_6= ';' ) ) ;
    public final EObject ruleHoistingActionNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_x_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:1603:2: ( ( ( () otherlv_1= 'hoistA' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) | (otherlv_4= 'hoistB' ( (lv_x_5_0= RULE_ID ) ) otherlv_6= ';' ) ) )
            // InternalASTConversionSimple.g:1604:2: ( ( () otherlv_1= 'hoistA' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) | (otherlv_4= 'hoistB' ( (lv_x_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            {
            // InternalASTConversionSimple.g:1604:2: ( ( () otherlv_1= 'hoistA' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) | (otherlv_4= 'hoistB' ( (lv_x_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalASTConversionSimple.g:1605:3: ( () otherlv_1= 'hoistA' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalASTConversionSimple.g:1605:3: ( () otherlv_1= 'hoistA' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
                    // InternalASTConversionSimple.g:1606:4: () otherlv_1= 'hoistA' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalASTConversionSimple.g:1606:4: ()
                    // InternalASTConversionSimple.g:1607:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getHoistingActionNewAccess().getHoistingActionNewXAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getHoistingActionNewAccess().getHoistAKeyword_0_1());
                    			
                    // InternalASTConversionSimple.g:1617:4: ( (lv_value_2_0= RULE_ID ) )
                    // InternalASTConversionSimple.g:1618:5: (lv_value_2_0= RULE_ID )
                    {
                    // InternalASTConversionSimple.g:1618:5: (lv_value_2_0= RULE_ID )
                    // InternalASTConversionSimple.g:1619:6: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getHoistingActionNewAccess().getValueIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHoistingActionNewRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getHoistingActionNewAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:1641:3: (otherlv_4= 'hoistB' ( (lv_x_5_0= RULE_ID ) ) otherlv_6= ';' )
                    {
                    // InternalASTConversionSimple.g:1641:3: (otherlv_4= 'hoistB' ( (lv_x_5_0= RULE_ID ) ) otherlv_6= ';' )
                    // InternalASTConversionSimple.g:1642:4: otherlv_4= 'hoistB' ( (lv_x_5_0= RULE_ID ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getHoistingActionNewAccess().getHoistBKeyword_1_0());
                    			
                    // InternalASTConversionSimple.g:1646:4: ( (lv_x_5_0= RULE_ID ) )
                    // InternalASTConversionSimple.g:1647:5: (lv_x_5_0= RULE_ID )
                    {
                    // InternalASTConversionSimple.g:1647:5: (lv_x_5_0= RULE_ID )
                    // InternalASTConversionSimple.g:1648:6: lv_x_5_0= RULE_ID
                    {
                    lv_x_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

                    						newLeafNode(lv_x_5_0, grammarAccess.getHoistingActionNewAccess().getXIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHoistingActionNewRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getHoistingActionNewAccess().getSemicolonKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHoistingActionNew"


    // $ANTLR start "ruleChangeKind"
    // InternalASTConversionSimple.g:1673:1: ruleChangeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) ;
    public final Enumerator ruleChangeKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:1679:2: ( ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) )
            // InternalASTConversionSimple.g:1680:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            {
            // InternalASTConversionSimple.g:1680:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalASTConversionSimple.g:1681:3: (enumLiteral_0= 'add' )
                    {
                    // InternalASTConversionSimple.g:1681:3: (enumLiteral_0= 'add' )
                    // InternalASTConversionSimple.g:1682:4: enumLiteral_0= 'add'
                    {
                    enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:1689:3: (enumLiteral_1= 'move' )
                    {
                    // InternalASTConversionSimple.g:1689:3: (enumLiteral_1= 'move' )
                    // InternalASTConversionSimple.g:1690:4: enumLiteral_1= 'move'
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalASTConversionSimple.g:1697:3: (enumLiteral_2= 'remove' )
                    {
                    // InternalASTConversionSimple.g:1697:3: (enumLiteral_2= 'remove' )
                    // InternalASTConversionSimple.g:1698:4: enumLiteral_2= 'remove'
                    {
                    enumLiteral_2=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getREMOVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getChangeKindAccess().getREMOVEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeKind"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000017E800L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000810L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000700080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000700000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000700001000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001001000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    }


}