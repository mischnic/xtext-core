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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'auto'", "';'", "'auto-explicit'", "'manual'", "'custom'", "'custom-copy'", "'other'", "'element'", "'='", "'sequence'", "'+'", "'returns-new'", "'action-new'", "'['", "','", "']'", "':'", "'add'", "'move'", "'remove'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
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
    // InternalASTConversionSimple.g:72:1: ruleProgram returns [EObject current=null] : ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;

        EObject lv_sequence_1_0 = null;

        EObject lv_returnsNew_2_0 = null;

        EObject lv_actionNew_3_0 = null;

        EObject lv_list_4_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:78:2: ( ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) ) )
            // InternalASTConversionSimple.g:79:2: ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) )
            {
            // InternalASTConversionSimple.g:79:2: ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) ) )
            // InternalASTConversionSimple.g:80:3: ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_returnsNew_2_0= ruleReturnsNew ) ) ( (lv_actionNew_3_0= ruleActionNew ) ) ( (lv_list_4_0= ruleLists ) )
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
            				
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalASTConversionSimple.g:179:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalASTConversionSimple.g:179:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalASTConversionSimple.g:180:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalASTConversionSimple.g:186:1: ruleEntry returns [EObject current=null] : (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) ;
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
            // InternalASTConversionSimple.g:192:2: ( (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) )
            // InternalASTConversionSimple.g:193:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
            {
            // InternalASTConversionSimple.g:193:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
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
                    // InternalASTConversionSimple.g:194:3: this_AutoClass_0= ruleAutoClass
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
                    // InternalASTConversionSimple.g:203:3: this_AutoExplicitClass_1= ruleAutoExplicitClass
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
                    // InternalASTConversionSimple.g:212:3: this_ManualClass_2= ruleManualClass
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
                    // InternalASTConversionSimple.g:221:3: this_CustomASTClass_3= ruleCustomASTClass
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
                    // InternalASTConversionSimple.g:230:3: this_CustomCopyASTClass_4= ruleCustomCopyASTClass
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
                    // InternalASTConversionSimple.g:239:3: this_Other_5= ruleOther
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
                    // InternalASTConversionSimple.g:248:3: this_Element_6= ruleElement
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
    // InternalASTConversionSimple.g:260:1: entryRuleAutoClass returns [EObject current=null] : iv_ruleAutoClass= ruleAutoClass EOF ;
    public final EObject entryRuleAutoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoClass = null;


        try {
            // InternalASTConversionSimple.g:260:50: (iv_ruleAutoClass= ruleAutoClass EOF )
            // InternalASTConversionSimple.g:261:2: iv_ruleAutoClass= ruleAutoClass EOF
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
    // InternalASTConversionSimple.g:267:1: ruleAutoClass returns [EObject current=null] : (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:273:2: ( (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:274:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:274:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:275:3: otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoClassAccess().getAutoKeyword_0());
            		
            // InternalASTConversionSimple.g:279:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:280:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:280:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:281:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_7);
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

            // InternalASTConversionSimple.g:298:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:299:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:299:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:300:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

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
    // InternalASTConversionSimple.g:324:1: entryRuleAutoExplicitClass returns [EObject current=null] : iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF ;
    public final EObject entryRuleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoExplicitClass = null;


        try {
            // InternalASTConversionSimple.g:324:58: (iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF )
            // InternalASTConversionSimple.g:325:2: iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF
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
    // InternalASTConversionSimple.g:331:1: ruleAutoExplicitClass returns [EObject current=null] : (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:337:2: ( (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:338:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:338:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:339:3: otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoExplicitClassAccess().getAutoExplicitKeyword_0());
            		
            // InternalASTConversionSimple.g:343:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:344:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:344:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:345:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoExplicitClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_7);
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

            // InternalASTConversionSimple.g:362:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:363:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:363:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:364:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

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
    // InternalASTConversionSimple.g:388:1: entryRuleManualClass returns [EObject current=null] : iv_ruleManualClass= ruleManualClass EOF ;
    public final EObject entryRuleManualClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualClass = null;


        try {
            // InternalASTConversionSimple.g:388:52: (iv_ruleManualClass= ruleManualClass EOF )
            // InternalASTConversionSimple.g:389:2: iv_ruleManualClass= ruleManualClass EOF
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
    // InternalASTConversionSimple.g:395:1: ruleManualClass returns [EObject current=null] : (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleManualClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:401:2: ( (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:402:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:402:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:403:3: otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getManualClassAccess().getManualKeyword_0());
            		
            // InternalASTConversionSimple.g:407:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:408:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:408:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:409:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getManualClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_7);
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

            // InternalASTConversionSimple.g:426:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:427:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:427:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:428:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

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
    // InternalASTConversionSimple.g:452:1: entryRuleCustomASTClass returns [EObject current=null] : iv_ruleCustomASTClass= ruleCustomASTClass EOF ;
    public final EObject entryRuleCustomASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomASTClass = null;


        try {
            // InternalASTConversionSimple.g:452:55: (iv_ruleCustomASTClass= ruleCustomASTClass EOF )
            // InternalASTConversionSimple.g:453:2: iv_ruleCustomASTClass= ruleCustomASTClass EOF
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
    // InternalASTConversionSimple.g:459:1: ruleCustomASTClass returns [EObject current=null] : (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:465:2: ( (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:466:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:466:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:467:3: otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomASTClassAccess().getCustomKeyword_0());
            		
            // InternalASTConversionSimple.g:471:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:472:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:472:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:473:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomASTClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_7);
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

            // InternalASTConversionSimple.g:490:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:491:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:491:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:492:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

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
    // InternalASTConversionSimple.g:516:1: entryRuleCustomCopyASTClass returns [EObject current=null] : iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF ;
    public final EObject entryRuleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCopyASTClass = null;


        try {
            // InternalASTConversionSimple.g:516:59: (iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF )
            // InternalASTConversionSimple.g:517:2: iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF
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
    // InternalASTConversionSimple.g:523:1: ruleCustomCopyASTClass returns [EObject current=null] : (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:529:2: ( (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:530:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:530:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:531:3: otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCopyASTClassAccess().getCustomCopyKeyword_0());
            		
            // InternalASTConversionSimple.g:535:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:536:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:536:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:537:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomCopyASTClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_7);
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

            // InternalASTConversionSimple.g:554:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:555:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:555:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:556:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

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
    // InternalASTConversionSimple.g:580:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalASTConversionSimple.g:580:50: (iv_ruleReference= ruleReference EOF )
            // InternalASTConversionSimple.g:581:2: iv_ruleReference= ruleReference EOF
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
    // InternalASTConversionSimple.g:587:1: ruleReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:593:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:594:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:594:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:595:3: (lv_name_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:595:3: (lv_name_0_0= RULE_ID )
            // InternalASTConversionSimple.g:596:4: lv_name_0_0= RULE_ID
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
    // InternalASTConversionSimple.g:615:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // InternalASTConversionSimple.g:615:46: (iv_ruleOther= ruleOther EOF )
            // InternalASTConversionSimple.g:616:2: iv_ruleOther= ruleOther EOF
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
    // InternalASTConversionSimple.g:622:1: ruleOther returns [EObject current=null] : (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_content_2_1 = null;

        EObject lv_content_2_2 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:628:2: ( (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) )
            // InternalASTConversionSimple.g:629:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            {
            // InternalASTConversionSimple.g:629:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            // InternalASTConversionSimple.g:630:3: otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherAccess().getOtherKeyword_0());
            		
            // InternalASTConversionSimple.g:634:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:635:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:635:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:636:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

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

            // InternalASTConversionSimple.g:652:3: ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            // InternalASTConversionSimple.g:653:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            {
            // InternalASTConversionSimple.g:653:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            // InternalASTConversionSimple.g:654:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
            {
            // InternalASTConversionSimple.g:654:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
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
                    // InternalASTConversionSimple.g:655:6: lv_content_2_1= ruleReference
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
                    // InternalASTConversionSimple.g:671:6: lv_content_2_2= ruleAutoClass
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
    // InternalASTConversionSimple.g:693:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalASTConversionSimple.g:693:48: (iv_ruleElement= ruleElement EOF )
            // InternalASTConversionSimple.g:694:2: iv_ruleElement= ruleElement EOF
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
    // InternalASTConversionSimple.g:700:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) ;
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
            // InternalASTConversionSimple.g:706:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) )
            // InternalASTConversionSimple.g:707:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            {
            // InternalASTConversionSimple.g:707:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            // InternalASTConversionSimple.g:708:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalASTConversionSimple.g:712:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:713:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:713:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:714:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

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

            // InternalASTConversionSimple.g:730:3: ( (lv_type_2_0= ruleChangeKind ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=28 && LA5_0<=30)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalASTConversionSimple.g:731:4: (lv_type_2_0= ruleChangeKind )
                    {
                    // InternalASTConversionSimple.g:731:4: (lv_type_2_0= ruleChangeKind )
                    // InternalASTConversionSimple.g:732:5: lv_type_2_0= ruleChangeKind
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTypeChangeKindEnumRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_11);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getEqualsSignKeyword_3());
            		
            // InternalASTConversionSimple.g:753:3: ( (lv_value_4_0= ruleChangeKind ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=28 && LA6_0<=30)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalASTConversionSimple.g:754:4: (lv_value_4_0= ruleChangeKind )
            	    {
            	    // InternalASTConversionSimple.g:754:4: (lv_value_4_0= ruleChangeKind )
            	    // InternalASTConversionSimple.g:755:5: lv_value_4_0= ruleChangeKind
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getValueChangeKindEnumRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalASTConversionSimple.g:780:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalASTConversionSimple.g:780:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalASTConversionSimple.g:781:2: iv_ruleSequence= ruleSequence EOF
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
    // InternalASTConversionSimple.g:787:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Addition_1 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:793:2: ( (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' ) )
            // InternalASTConversionSimple.g:794:2: (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' )
            {
            // InternalASTConversionSimple.g:794:2: (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' )
            // InternalASTConversionSimple.g:795:3: otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSequenceAccess().getAdditionParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_14);
            this_Addition_1=ruleAddition();

            state._fsp--;


            			current = this_Addition_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalASTConversionSimple.g:807:3: ( () ( (lv_expressions_3_0= ruleAddition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalASTConversionSimple.g:808:4: () ( (lv_expressions_3_0= ruleAddition ) )
            	    {
            	    // InternalASTConversionSimple.g:808:4: ()
            	    // InternalASTConversionSimple.g:809:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getSequenceAccess().getSequenceExpressionsAction_2_0(),
            	    						current);
            	    				

            	    }

            	    // InternalASTConversionSimple.g:815:4: ( (lv_expressions_3_0= ruleAddition ) )
            	    // InternalASTConversionSimple.g:816:5: (lv_expressions_3_0= ruleAddition )
            	    {
            	    // InternalASTConversionSimple.g:816:5: (lv_expressions_3_0= ruleAddition )
            	    // InternalASTConversionSimple.g:817:6: lv_expressions_3_0= ruleAddition
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccess().getExpressionsAdditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalASTConversionSimple.g:843:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalASTConversionSimple.g:843:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalASTConversionSimple.g:844:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalASTConversionSimple.g:850:1: ruleAddition returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token lv_right_2_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:856:2: ( ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) ) )
            // InternalASTConversionSimple.g:857:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) )
            {
            // InternalASTConversionSimple.g:857:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:858:3: ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:858:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:859:4: (lv_left_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:859:4: (lv_left_0_0= RULE_ID )
            // InternalASTConversionSimple.g:860:5: lv_left_0_0= RULE_ID
            {
            lv_left_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); 

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

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionAccess().getPlusSignKeyword_1());
            		
            // InternalASTConversionSimple.g:880:3: ( (lv_right_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:881:4: (lv_right_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:881:4: (lv_right_2_0= RULE_ID )
            // InternalASTConversionSimple.g:882:5: lv_right_2_0= RULE_ID
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
    // InternalASTConversionSimple.g:902:1: entryRuleReturnsNew returns [EObject current=null] : iv_ruleReturnsNew= ruleReturnsNew EOF ;
    public final EObject entryRuleReturnsNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsNew = null;


        try {
            // InternalASTConversionSimple.g:902:51: (iv_ruleReturnsNew= ruleReturnsNew EOF )
            // InternalASTConversionSimple.g:903:2: iv_ruleReturnsNew= ruleReturnsNew EOF
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
    // InternalASTConversionSimple.g:909:1: ruleReturnsNew returns [EObject current=null] : (otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturnsNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:915:2: ( (otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalASTConversionSimple.g:916:2: (otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalASTConversionSimple.g:916:2: (otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalASTConversionSimple.g:917:3: otherlv_0= 'returns-new' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnsNewAccess().getReturnsNewKeyword_0());
            		
            // InternalASTConversionSimple.g:921:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:922:4: (lv_value_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:922:4: (lv_value_1_0= RULE_ID )
            // InternalASTConversionSimple.g:923:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

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
    // InternalASTConversionSimple.g:947:1: entryRuleActionNew returns [EObject current=null] : iv_ruleActionNew= ruleActionNew EOF ;
    public final EObject entryRuleActionNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionNew = null;


        try {
            // InternalASTConversionSimple.g:947:50: (iv_ruleActionNew= ruleActionNew EOF )
            // InternalASTConversionSimple.g:948:2: iv_ruleActionNew= ruleActionNew EOF
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
    // InternalASTConversionSimple.g:954:1: ruleActionNew returns [EObject current=null] : ( () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleActionNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:960:2: ( ( () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:961:2: ( () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:961:2: ( () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:962:3: () otherlv_1= 'action-new' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalASTConversionSimple.g:962:3: ()
            // InternalASTConversionSimple.g:963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionNewAccess().getActionNewXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getActionNewAccess().getActionNewKeyword_1());
            		
            // InternalASTConversionSimple.g:973:3: ( (lv_value_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:974:4: (lv_value_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:974:4: (lv_value_2_0= RULE_ID )
            // InternalASTConversionSimple.g:975:5: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

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
    // InternalASTConversionSimple.g:999:1: entryRuleLists returns [EObject current=null] : iv_ruleLists= ruleLists EOF ;
    public final EObject entryRuleLists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLists = null;


        try {
            // InternalASTConversionSimple.g:999:46: (iv_ruleLists= ruleLists EOF )
            // InternalASTConversionSimple.g:1000:2: iv_ruleLists= ruleLists EOF
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
    // InternalASTConversionSimple.g:1006:1: ruleLists returns [EObject current=null] : ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ) ;
    public final EObject ruleLists() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_c_4_0 = null;

        EObject lv_d_6_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:1012:2: ( ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ) )
            // InternalASTConversionSimple.g:1013:2: ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' )
            {
            // InternalASTConversionSimple.g:1013:2: ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' )
            // InternalASTConversionSimple.g:1014:3: ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';'
            {
            // InternalASTConversionSimple.g:1014:3: ( (lv_a_0_0= ruleMapEntry ) )
            // InternalASTConversionSimple.g:1015:4: (lv_a_0_0= ruleMapEntry )
            {
            // InternalASTConversionSimple.g:1015:4: (lv_a_0_0= ruleMapEntry )
            // InternalASTConversionSimple.g:1016:5: lv_a_0_0= ruleMapEntry
            {

            					newCompositeNode(grammarAccess.getListsAccess().getAMapEntryParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_8);
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
            		
            // InternalASTConversionSimple.g:1037:3: ( (lv_b_2_0= ruleMapEntryCustom ) )
            // InternalASTConversionSimple.g:1038:4: (lv_b_2_0= ruleMapEntryCustom )
            {
            // InternalASTConversionSimple.g:1038:4: (lv_b_2_0= ruleMapEntryCustom )
            // InternalASTConversionSimple.g:1039:5: lv_b_2_0= ruleMapEntryCustom
            {

            					newCompositeNode(grammarAccess.getListsAccess().getBMapEntryCustomParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_8);
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
            		
            // InternalASTConversionSimple.g:1060:3: ( (lv_c_4_0= ruleMapEntry ) )+
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
            	    // InternalASTConversionSimple.g:1061:4: (lv_c_4_0= ruleMapEntry )
            	    {
            	    // InternalASTConversionSimple.g:1061:4: (lv_c_4_0= ruleMapEntry )
            	    // InternalASTConversionSimple.g:1062:5: lv_c_4_0= ruleMapEntry
            	    {

            	    					newCompositeNode(grammarAccess.getListsAccess().getCMapEntryParserRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_16);
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
            		
            // InternalASTConversionSimple.g:1083:3: ( (lv_d_6_0= ruleMapEntryCustom ) )+
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
            	    // InternalASTConversionSimple.g:1084:4: (lv_d_6_0= ruleMapEntryCustom )
            	    {
            	    // InternalASTConversionSimple.g:1084:4: (lv_d_6_0= ruleMapEntryCustom )
            	    // InternalASTConversionSimple.g:1085:5: lv_d_6_0= ruleMapEntryCustom
            	    {

            	    					newCompositeNode(grammarAccess.getListsAccess().getDMapEntryCustomParserRuleCall_6_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_16);
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

            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getListsAccess().getSemicolonKeyword_7());
            		

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
    // InternalASTConversionSimple.g:1110:1: entryRuleMapEntry returns [EObject current=null] : iv_ruleMapEntry= ruleMapEntry EOF ;
    public final EObject entryRuleMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntry = null;


        try {
            // InternalASTConversionSimple.g:1110:49: (iv_ruleMapEntry= ruleMapEntry EOF )
            // InternalASTConversionSimple.g:1111:2: iv_ruleMapEntry= ruleMapEntry EOF
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
    // InternalASTConversionSimple.g:1117:1: ruleMapEntry returns [EObject current=null] : (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) ) ;
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
            // InternalASTConversionSimple.g:1123:2: ( (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) ) )
            // InternalASTConversionSimple.g:1124:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) )
            {
            // InternalASTConversionSimple.g:1124:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) )
            // InternalASTConversionSimple.g:1125:3: otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMapEntryAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalASTConversionSimple.g:1129:3: ( (lv_keys_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1130:4: (lv_keys_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1130:4: (lv_keys_1_0= RULE_ID )
            // InternalASTConversionSimple.g:1131:5: lv_keys_1_0= RULE_ID
            {
            lv_keys_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

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

            // InternalASTConversionSimple.g:1147:3: (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1148:4: otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapEntryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalASTConversionSimple.g:1152:4: ( (lv_keys_3_0= RULE_ID ) )
            	    // InternalASTConversionSimple.g:1153:5: (lv_keys_3_0= RULE_ID )
            	    {
            	    // InternalASTConversionSimple.g:1153:5: (lv_keys_3_0= RULE_ID )
            	    // InternalASTConversionSimple.g:1154:6: lv_keys_3_0= RULE_ID
            	    {
            	    lv_keys_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

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

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getMapEntryAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getMapEntryAccess().getColonKeyword_4());
            		
            // InternalASTConversionSimple.g:1179:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalASTConversionSimple.g:1180:4: (lv_value_6_0= RULE_INT )
            {
            // InternalASTConversionSimple.g:1180:4: (lv_value_6_0= RULE_INT )
            // InternalASTConversionSimple.g:1181:5: lv_value_6_0= RULE_INT
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
    // InternalASTConversionSimple.g:1201:1: entryRuleMapEntryCustom returns [EObject current=null] : iv_ruleMapEntryCustom= ruleMapEntryCustom EOF ;
    public final EObject entryRuleMapEntryCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryCustom = null;


        try {
            // InternalASTConversionSimple.g:1201:55: (iv_ruleMapEntryCustom= ruleMapEntryCustom EOF )
            // InternalASTConversionSimple.g:1202:2: iv_ruleMapEntryCustom= ruleMapEntryCustom EOF
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
    // InternalASTConversionSimple.g:1208:1: ruleMapEntryCustom returns [EObject current=null] : (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) ) ;
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
            // InternalASTConversionSimple.g:1214:2: ( (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) ) )
            // InternalASTConversionSimple.g:1215:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) )
            {
            // InternalASTConversionSimple.g:1215:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) )
            // InternalASTConversionSimple.g:1216:3: otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMapEntryCustomAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalASTConversionSimple.g:1220:3: ( (lv_keys_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1221:4: (lv_keys_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1221:4: (lv_keys_1_0= RULE_ID )
            // InternalASTConversionSimple.g:1222:5: lv_keys_1_0= RULE_ID
            {
            lv_keys_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

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

            // InternalASTConversionSimple.g:1238:3: (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1239:4: otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapEntryCustomAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalASTConversionSimple.g:1243:4: ( (lv_keys_3_0= RULE_ID ) )
            	    // InternalASTConversionSimple.g:1244:5: (lv_keys_3_0= RULE_ID )
            	    {
            	    // InternalASTConversionSimple.g:1244:5: (lv_keys_3_0= RULE_ID )
            	    // InternalASTConversionSimple.g:1245:6: lv_keys_3_0= RULE_ID
            	    {
            	    lv_keys_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

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

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getMapEntryCustomAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMapEntryCustomAccess().getColonKeyword_4());
            		
            // InternalASTConversionSimple.g:1270:3: ( (lv_value_6_0= ruleReference ) )
            // InternalASTConversionSimple.g:1271:4: (lv_value_6_0= ruleReference )
            {
            // InternalASTConversionSimple.g:1271:4: (lv_value_6_0= ruleReference )
            // InternalASTConversionSimple.g:1272:5: lv_value_6_0= ruleReference
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


    // $ANTLR start "ruleChangeKind"
    // InternalASTConversionSimple.g:1293:1: ruleChangeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) ;
    public final Enumerator ruleChangeKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:1299:2: ( ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) )
            // InternalASTConversionSimple.g:1300:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            {
            // InternalASTConversionSimple.g:1300:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalASTConversionSimple.g:1301:3: (enumLiteral_0= 'add' )
                    {
                    // InternalASTConversionSimple.g:1301:3: (enumLiteral_0= 'add' )
                    // InternalASTConversionSimple.g:1302:4: enumLiteral_0= 'add'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:1309:3: (enumLiteral_1= 'move' )
                    {
                    // InternalASTConversionSimple.g:1309:3: (enumLiteral_1= 'move' )
                    // InternalASTConversionSimple.g:1310:4: enumLiteral_1= 'move'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalASTConversionSimple.g:1317:3: (enumLiteral_2= 'remove' )
                    {
                    // InternalASTConversionSimple.g:1317:3: (enumLiteral_2= 'remove' )
                    // InternalASTConversionSimple.g:1318:4: enumLiteral_2= 'remove'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000810L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000070080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000070000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000070001000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001001000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    }


}