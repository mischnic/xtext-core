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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'auto'", "';'", "'auto-explicit'", "'manual'", "'custom'", "'custom-copy'", "'other'", "'element'", "'='", "'sequence'", "'+'", "'['", "','", "']'", "':'", "'add'", "'move'", "'remove'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    // InternalASTConversionSimple.g:72:1: ruleProgram returns [EObject current=null] : ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_list_2_0= ruleLists ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;

        EObject lv_sequence_1_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:78:2: ( ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_list_2_0= ruleLists ) ) ) )
            // InternalASTConversionSimple.g:79:2: ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_list_2_0= ruleLists ) ) )
            {
            // InternalASTConversionSimple.g:79:2: ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_list_2_0= ruleLists ) ) )
            // InternalASTConversionSimple.g:80:3: ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ( (lv_list_2_0= ruleLists ) )
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

            // InternalASTConversionSimple.g:118:3: ( (lv_list_2_0= ruleLists ) )
            // InternalASTConversionSimple.g:119:4: (lv_list_2_0= ruleLists )
            {
            // InternalASTConversionSimple.g:119:4: (lv_list_2_0= ruleLists )
            // InternalASTConversionSimple.g:120:5: lv_list_2_0= ruleLists
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getListListsParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_list_2_0=ruleLists();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_2_0,
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
    // InternalASTConversionSimple.g:141:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalASTConversionSimple.g:141:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalASTConversionSimple.g:142:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalASTConversionSimple.g:148:1: ruleEntry returns [EObject current=null] : (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) ;
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
            // InternalASTConversionSimple.g:154:2: ( (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) )
            // InternalASTConversionSimple.g:155:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
            {
            // InternalASTConversionSimple.g:155:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
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
                    // InternalASTConversionSimple.g:156:3: this_AutoClass_0= ruleAutoClass
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
                    // InternalASTConversionSimple.g:165:3: this_AutoExplicitClass_1= ruleAutoExplicitClass
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
                    // InternalASTConversionSimple.g:174:3: this_ManualClass_2= ruleManualClass
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
                    // InternalASTConversionSimple.g:183:3: this_CustomASTClass_3= ruleCustomASTClass
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
                    // InternalASTConversionSimple.g:192:3: this_CustomCopyASTClass_4= ruleCustomCopyASTClass
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
                    // InternalASTConversionSimple.g:201:3: this_Other_5= ruleOther
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
                    // InternalASTConversionSimple.g:210:3: this_Element_6= ruleElement
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
    // InternalASTConversionSimple.g:222:1: entryRuleAutoClass returns [EObject current=null] : iv_ruleAutoClass= ruleAutoClass EOF ;
    public final EObject entryRuleAutoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoClass = null;


        try {
            // InternalASTConversionSimple.g:222:50: (iv_ruleAutoClass= ruleAutoClass EOF )
            // InternalASTConversionSimple.g:223:2: iv_ruleAutoClass= ruleAutoClass EOF
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
    // InternalASTConversionSimple.g:229:1: ruleAutoClass returns [EObject current=null] : (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:235:2: ( (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:236:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:236:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:237:3: otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoClassAccess().getAutoKeyword_0());
            		
            // InternalASTConversionSimple.g:241:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:242:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:242:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:243:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
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

            // InternalASTConversionSimple.g:260:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:261:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:261:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:262:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

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
    // InternalASTConversionSimple.g:286:1: entryRuleAutoExplicitClass returns [EObject current=null] : iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF ;
    public final EObject entryRuleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoExplicitClass = null;


        try {
            // InternalASTConversionSimple.g:286:58: (iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF )
            // InternalASTConversionSimple.g:287:2: iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF
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
    // InternalASTConversionSimple.g:293:1: ruleAutoExplicitClass returns [EObject current=null] : (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:299:2: ( (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:300:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:300:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:301:3: otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoExplicitClassAccess().getAutoExplicitKeyword_0());
            		
            // InternalASTConversionSimple.g:305:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:306:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:306:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:307:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoExplicitClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
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

            // InternalASTConversionSimple.g:324:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:325:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:325:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:326:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

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
    // InternalASTConversionSimple.g:350:1: entryRuleManualClass returns [EObject current=null] : iv_ruleManualClass= ruleManualClass EOF ;
    public final EObject entryRuleManualClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualClass = null;


        try {
            // InternalASTConversionSimple.g:350:52: (iv_ruleManualClass= ruleManualClass EOF )
            // InternalASTConversionSimple.g:351:2: iv_ruleManualClass= ruleManualClass EOF
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
    // InternalASTConversionSimple.g:357:1: ruleManualClass returns [EObject current=null] : (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleManualClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:363:2: ( (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:364:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:364:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:365:3: otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getManualClassAccess().getManualKeyword_0());
            		
            // InternalASTConversionSimple.g:369:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:370:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:370:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:371:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getManualClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
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

            // InternalASTConversionSimple.g:388:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:389:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:389:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:390:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

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
    // InternalASTConversionSimple.g:414:1: entryRuleCustomASTClass returns [EObject current=null] : iv_ruleCustomASTClass= ruleCustomASTClass EOF ;
    public final EObject entryRuleCustomASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomASTClass = null;


        try {
            // InternalASTConversionSimple.g:414:55: (iv_ruleCustomASTClass= ruleCustomASTClass EOF )
            // InternalASTConversionSimple.g:415:2: iv_ruleCustomASTClass= ruleCustomASTClass EOF
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
    // InternalASTConversionSimple.g:421:1: ruleCustomASTClass returns [EObject current=null] : (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:427:2: ( (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:428:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:428:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:429:3: otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomASTClassAccess().getCustomKeyword_0());
            		
            // InternalASTConversionSimple.g:433:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:434:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:434:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:435:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomASTClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
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

            // InternalASTConversionSimple.g:452:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:453:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:453:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:454:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

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
    // InternalASTConversionSimple.g:478:1: entryRuleCustomCopyASTClass returns [EObject current=null] : iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF ;
    public final EObject entryRuleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCopyASTClass = null;


        try {
            // InternalASTConversionSimple.g:478:59: (iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF )
            // InternalASTConversionSimple.g:479:2: iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF
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
    // InternalASTConversionSimple.g:485:1: ruleCustomCopyASTClass returns [EObject current=null] : (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:491:2: ( (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:492:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:492:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:493:3: otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCopyASTClassAccess().getCustomCopyKeyword_0());
            		
            // InternalASTConversionSimple.g:497:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:498:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:498:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:499:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomCopyASTClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
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

            // InternalASTConversionSimple.g:516:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:517:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:517:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:518:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

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
    // InternalASTConversionSimple.g:542:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalASTConversionSimple.g:542:50: (iv_ruleReference= ruleReference EOF )
            // InternalASTConversionSimple.g:543:2: iv_ruleReference= ruleReference EOF
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
    // InternalASTConversionSimple.g:549:1: ruleReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:555:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:556:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:556:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:557:3: (lv_name_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:557:3: (lv_name_0_0= RULE_ID )
            // InternalASTConversionSimple.g:558:4: lv_name_0_0= RULE_ID
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
    // InternalASTConversionSimple.g:577:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // InternalASTConversionSimple.g:577:46: (iv_ruleOther= ruleOther EOF )
            // InternalASTConversionSimple.g:578:2: iv_ruleOther= ruleOther EOF
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
    // InternalASTConversionSimple.g:584:1: ruleOther returns [EObject current=null] : (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_content_2_1 = null;

        EObject lv_content_2_2 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:590:2: ( (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) )
            // InternalASTConversionSimple.g:591:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            {
            // InternalASTConversionSimple.g:591:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            // InternalASTConversionSimple.g:592:3: otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherAccess().getOtherKeyword_0());
            		
            // InternalASTConversionSimple.g:596:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:597:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:597:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:598:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

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

            // InternalASTConversionSimple.g:614:3: ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            // InternalASTConversionSimple.g:615:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            {
            // InternalASTConversionSimple.g:615:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            // InternalASTConversionSimple.g:616:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
            {
            // InternalASTConversionSimple.g:616:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
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
                    // InternalASTConversionSimple.g:617:6: lv_content_2_1= ruleReference
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
                    // InternalASTConversionSimple.g:633:6: lv_content_2_2= ruleAutoClass
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
    // InternalASTConversionSimple.g:655:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalASTConversionSimple.g:655:48: (iv_ruleElement= ruleElement EOF )
            // InternalASTConversionSimple.g:656:2: iv_ruleElement= ruleElement EOF
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
    // InternalASTConversionSimple.g:662:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) ;
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
            // InternalASTConversionSimple.g:668:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) )
            // InternalASTConversionSimple.g:669:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            {
            // InternalASTConversionSimple.g:669:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            // InternalASTConversionSimple.g:670:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalASTConversionSimple.g:674:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:675:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:675:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:676:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

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

            // InternalASTConversionSimple.g:692:3: ( (lv_type_2_0= ruleChangeKind ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=28)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalASTConversionSimple.g:693:4: (lv_type_2_0= ruleChangeKind )
                    {
                    // InternalASTConversionSimple.g:693:4: (lv_type_2_0= ruleChangeKind )
                    // InternalASTConversionSimple.g:694:5: lv_type_2_0= ruleChangeKind
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTypeChangeKindEnumRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_9);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getEqualsSignKeyword_3());
            		
            // InternalASTConversionSimple.g:715:3: ( (lv_value_4_0= ruleChangeKind ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=26 && LA6_0<=28)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalASTConversionSimple.g:716:4: (lv_value_4_0= ruleChangeKind )
            	    {
            	    // InternalASTConversionSimple.g:716:4: (lv_value_4_0= ruleChangeKind )
            	    // InternalASTConversionSimple.g:717:5: lv_value_4_0= ruleChangeKind
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getValueChangeKindEnumRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalASTConversionSimple.g:742:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalASTConversionSimple.g:742:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalASTConversionSimple.g:743:2: iv_ruleSequence= ruleSequence EOF
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
    // InternalASTConversionSimple.g:749:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Addition_1 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:755:2: ( (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' ) )
            // InternalASTConversionSimple.g:756:2: (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' )
            {
            // InternalASTConversionSimple.g:756:2: (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' )
            // InternalASTConversionSimple.g:757:3: otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSequenceAccess().getAdditionParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_12);
            this_Addition_1=ruleAddition();

            state._fsp--;


            			current = this_Addition_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalASTConversionSimple.g:769:3: ( () ( (lv_expressions_3_0= ruleAddition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalASTConversionSimple.g:770:4: () ( (lv_expressions_3_0= ruleAddition ) )
            	    {
            	    // InternalASTConversionSimple.g:770:4: ()
            	    // InternalASTConversionSimple.g:771:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getSequenceAccess().getSequenceExpressionsAction_2_0(),
            	    						current);
            	    				

            	    }

            	    // InternalASTConversionSimple.g:777:4: ( (lv_expressions_3_0= ruleAddition ) )
            	    // InternalASTConversionSimple.g:778:5: (lv_expressions_3_0= ruleAddition )
            	    {
            	    // InternalASTConversionSimple.g:778:5: (lv_expressions_3_0= ruleAddition )
            	    // InternalASTConversionSimple.g:779:6: lv_expressions_3_0= ruleAddition
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccess().getExpressionsAdditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalASTConversionSimple.g:805:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalASTConversionSimple.g:805:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalASTConversionSimple.g:806:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalASTConversionSimple.g:812:1: ruleAddition returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token lv_right_2_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:818:2: ( ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) ) )
            // InternalASTConversionSimple.g:819:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) )
            {
            // InternalASTConversionSimple.g:819:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:820:3: ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:820:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:821:4: (lv_left_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:821:4: (lv_left_0_0= RULE_ID )
            // InternalASTConversionSimple.g:822:5: lv_left_0_0= RULE_ID
            {
            lv_left_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

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

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionAccess().getPlusSignKeyword_1());
            		
            // InternalASTConversionSimple.g:842:3: ( (lv_right_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:843:4: (lv_right_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:843:4: (lv_right_2_0= RULE_ID )
            // InternalASTConversionSimple.g:844:5: lv_right_2_0= RULE_ID
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


    // $ANTLR start "entryRuleLists"
    // InternalASTConversionSimple.g:864:1: entryRuleLists returns [EObject current=null] : iv_ruleLists= ruleLists EOF ;
    public final EObject entryRuleLists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLists = null;


        try {
            // InternalASTConversionSimple.g:864:46: (iv_ruleLists= ruleLists EOF )
            // InternalASTConversionSimple.g:865:2: iv_ruleLists= ruleLists EOF
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
    // InternalASTConversionSimple.g:871:1: ruleLists returns [EObject current=null] : ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ) ;
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
            // InternalASTConversionSimple.g:877:2: ( ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' ) )
            // InternalASTConversionSimple.g:878:2: ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' )
            {
            // InternalASTConversionSimple.g:878:2: ( ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';' )
            // InternalASTConversionSimple.g:879:3: ( (lv_a_0_0= ruleMapEntry ) ) otherlv_1= ';' ( (lv_b_2_0= ruleMapEntryCustom ) ) otherlv_3= ';' ( (lv_c_4_0= ruleMapEntry ) )+ otherlv_5= ';' ( (lv_d_6_0= ruleMapEntryCustom ) )+ otherlv_7= ';'
            {
            // InternalASTConversionSimple.g:879:3: ( (lv_a_0_0= ruleMapEntry ) )
            // InternalASTConversionSimple.g:880:4: (lv_a_0_0= ruleMapEntry )
            {
            // InternalASTConversionSimple.g:880:4: (lv_a_0_0= ruleMapEntry )
            // InternalASTConversionSimple.g:881:5: lv_a_0_0= ruleMapEntry
            {

            					newCompositeNode(grammarAccess.getListsAccess().getAMapEntryParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getListsAccess().getSemicolonKeyword_1());
            		
            // InternalASTConversionSimple.g:902:3: ( (lv_b_2_0= ruleMapEntryCustom ) )
            // InternalASTConversionSimple.g:903:4: (lv_b_2_0= ruleMapEntryCustom )
            {
            // InternalASTConversionSimple.g:903:4: (lv_b_2_0= ruleMapEntryCustom )
            // InternalASTConversionSimple.g:904:5: lv_b_2_0= ruleMapEntryCustom
            {

            					newCompositeNode(grammarAccess.getListsAccess().getBMapEntryCustomParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getListsAccess().getSemicolonKeyword_3());
            		
            // InternalASTConversionSimple.g:925:3: ( (lv_c_4_0= ruleMapEntry ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalASTConversionSimple.g:926:4: (lv_c_4_0= ruleMapEntry )
            	    {
            	    // InternalASTConversionSimple.g:926:4: (lv_c_4_0= ruleMapEntry )
            	    // InternalASTConversionSimple.g:927:5: lv_c_4_0= ruleMapEntry
            	    {

            	    					newCompositeNode(grammarAccess.getListsAccess().getCMapEntryParserRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_15);
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

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getListsAccess().getSemicolonKeyword_5());
            		
            // InternalASTConversionSimple.g:948:3: ( (lv_d_6_0= ruleMapEntryCustom ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalASTConversionSimple.g:949:4: (lv_d_6_0= ruleMapEntryCustom )
            	    {
            	    // InternalASTConversionSimple.g:949:4: (lv_d_6_0= ruleMapEntryCustom )
            	    // InternalASTConversionSimple.g:950:5: lv_d_6_0= ruleMapEntryCustom
            	    {

            	    					newCompositeNode(grammarAccess.getListsAccess().getDMapEntryCustomParserRuleCall_6_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalASTConversionSimple.g:975:1: entryRuleMapEntry returns [EObject current=null] : iv_ruleMapEntry= ruleMapEntry EOF ;
    public final EObject entryRuleMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntry = null;


        try {
            // InternalASTConversionSimple.g:975:49: (iv_ruleMapEntry= ruleMapEntry EOF )
            // InternalASTConversionSimple.g:976:2: iv_ruleMapEntry= ruleMapEntry EOF
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
    // InternalASTConversionSimple.g:982:1: ruleMapEntry returns [EObject current=null] : (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) ) ;
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
            // InternalASTConversionSimple.g:988:2: ( (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) ) )
            // InternalASTConversionSimple.g:989:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) )
            {
            // InternalASTConversionSimple.g:989:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) ) )
            // InternalASTConversionSimple.g:990:3: otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMapEntryAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalASTConversionSimple.g:994:3: ( (lv_keys_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:995:4: (lv_keys_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:995:4: (lv_keys_1_0= RULE_ID )
            // InternalASTConversionSimple.g:996:5: lv_keys_1_0= RULE_ID
            {
            lv_keys_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); 

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

            // InternalASTConversionSimple.g:1012:3: (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1013:4: otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapEntryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalASTConversionSimple.g:1017:4: ( (lv_keys_3_0= RULE_ID ) )
            	    // InternalASTConversionSimple.g:1018:5: (lv_keys_3_0= RULE_ID )
            	    {
            	    // InternalASTConversionSimple.g:1018:5: (lv_keys_3_0= RULE_ID )
            	    // InternalASTConversionSimple.g:1019:6: lv_keys_3_0= RULE_ID
            	    {
            	    lv_keys_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); 

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

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMapEntryAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMapEntryAccess().getColonKeyword_4());
            		
            // InternalASTConversionSimple.g:1044:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalASTConversionSimple.g:1045:4: (lv_value_6_0= RULE_INT )
            {
            // InternalASTConversionSimple.g:1045:4: (lv_value_6_0= RULE_INT )
            // InternalASTConversionSimple.g:1046:5: lv_value_6_0= RULE_INT
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
    // InternalASTConversionSimple.g:1066:1: entryRuleMapEntryCustom returns [EObject current=null] : iv_ruleMapEntryCustom= ruleMapEntryCustom EOF ;
    public final EObject entryRuleMapEntryCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryCustom = null;


        try {
            // InternalASTConversionSimple.g:1066:55: (iv_ruleMapEntryCustom= ruleMapEntryCustom EOF )
            // InternalASTConversionSimple.g:1067:2: iv_ruleMapEntryCustom= ruleMapEntryCustom EOF
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
    // InternalASTConversionSimple.g:1073:1: ruleMapEntryCustom returns [EObject current=null] : (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) ) ;
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
            // InternalASTConversionSimple.g:1079:2: ( (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) ) )
            // InternalASTConversionSimple.g:1080:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) )
            {
            // InternalASTConversionSimple.g:1080:2: (otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) ) )
            // InternalASTConversionSimple.g:1081:3: otherlv_0= '[' ( (lv_keys_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )* otherlv_4= ']' otherlv_5= ':' ( (lv_value_6_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMapEntryCustomAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalASTConversionSimple.g:1085:3: ( (lv_keys_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:1086:4: (lv_keys_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:1086:4: (lv_keys_1_0= RULE_ID )
            // InternalASTConversionSimple.g:1087:5: lv_keys_1_0= RULE_ID
            {
            lv_keys_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); 

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

            // InternalASTConversionSimple.g:1103:3: (otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalASTConversionSimple.g:1104:4: otherlv_2= ',' ( (lv_keys_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapEntryCustomAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalASTConversionSimple.g:1108:4: ( (lv_keys_3_0= RULE_ID ) )
            	    // InternalASTConversionSimple.g:1109:5: (lv_keys_3_0= RULE_ID )
            	    {
            	    // InternalASTConversionSimple.g:1109:5: (lv_keys_3_0= RULE_ID )
            	    // InternalASTConversionSimple.g:1110:6: lv_keys_3_0= RULE_ID
            	    {
            	    lv_keys_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); 

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

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMapEntryCustomAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getMapEntryCustomAccess().getColonKeyword_4());
            		
            // InternalASTConversionSimple.g:1135:3: ( (lv_value_6_0= ruleReference ) )
            // InternalASTConversionSimple.g:1136:4: (lv_value_6_0= ruleReference )
            {
            // InternalASTConversionSimple.g:1136:4: (lv_value_6_0= ruleReference )
            // InternalASTConversionSimple.g:1137:5: lv_value_6_0= ruleReference
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
    // InternalASTConversionSimple.g:1158:1: ruleChangeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) ;
    public final Enumerator ruleChangeKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:1164:2: ( ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) )
            // InternalASTConversionSimple.g:1165:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            {
            // InternalASTConversionSimple.g:1165:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
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
                    // InternalASTConversionSimple.g:1166:3: (enumLiteral_0= 'add' )
                    {
                    // InternalASTConversionSimple.g:1166:3: (enumLiteral_0= 'add' )
                    // InternalASTConversionSimple.g:1167:4: enumLiteral_0= 'add'
                    {
                    enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:1174:3: (enumLiteral_1= 'move' )
                    {
                    // InternalASTConversionSimple.g:1174:3: (enumLiteral_1= 'move' )
                    // InternalASTConversionSimple.g:1175:4: enumLiteral_1= 'move'
                    {
                    enumLiteral_1=(Token)match(input,27,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalASTConversionSimple.g:1182:3: (enumLiteral_2= 'remove' )
                    {
                    // InternalASTConversionSimple.g:1182:3: (enumLiteral_2= 'remove' )
                    // InternalASTConversionSimple.g:1183:4: enumLiteral_2= 'remove'
                    {
                    enumLiteral_2=(Token)match(input,28,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000810L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001C080000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001C001000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000401000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    }


}