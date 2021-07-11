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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'auto'", "';'", "'auto-explicit'", "'manual'", "'custom'", "'custom-copy'", "'other'", "'element'", "'='", "'sequence'", "'+'", "'add'", "'move'", "'remove'"
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalASTConversionSimple.g:72:1: ruleProgram returns [EObject current=null] : ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;

        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:78:2: ( ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ ) )
            // InternalASTConversionSimple.g:79:2: ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ )
            {
            // InternalASTConversionSimple.g:79:2: ( ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+ )
            // InternalASTConversionSimple.g:80:3: ( (lv_entries_0_0= ruleEntry ) )+ ( (lv_sequence_1_0= ruleSequence ) )+
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
    // InternalASTConversionSimple.g:122:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalASTConversionSimple.g:122:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalASTConversionSimple.g:123:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalASTConversionSimple.g:129:1: ruleEntry returns [EObject current=null] : (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) ;
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
            // InternalASTConversionSimple.g:135:2: ( (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) )
            // InternalASTConversionSimple.g:136:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
            {
            // InternalASTConversionSimple.g:136:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
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
                    // InternalASTConversionSimple.g:137:3: this_AutoClass_0= ruleAutoClass
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
                    // InternalASTConversionSimple.g:146:3: this_AutoExplicitClass_1= ruleAutoExplicitClass
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
                    // InternalASTConversionSimple.g:155:3: this_ManualClass_2= ruleManualClass
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
                    // InternalASTConversionSimple.g:164:3: this_CustomASTClass_3= ruleCustomASTClass
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
                    // InternalASTConversionSimple.g:173:3: this_CustomCopyASTClass_4= ruleCustomCopyASTClass
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
                    // InternalASTConversionSimple.g:182:3: this_Other_5= ruleOther
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
                    // InternalASTConversionSimple.g:191:3: this_Element_6= ruleElement
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
    // InternalASTConversionSimple.g:203:1: entryRuleAutoClass returns [EObject current=null] : iv_ruleAutoClass= ruleAutoClass EOF ;
    public final EObject entryRuleAutoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoClass = null;


        try {
            // InternalASTConversionSimple.g:203:50: (iv_ruleAutoClass= ruleAutoClass EOF )
            // InternalASTConversionSimple.g:204:2: iv_ruleAutoClass= ruleAutoClass EOF
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
    // InternalASTConversionSimple.g:210:1: ruleAutoClass returns [EObject current=null] : (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:216:2: ( (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:217:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:217:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:218:3: otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoClassAccess().getAutoKeyword_0());
            		
            // InternalASTConversionSimple.g:222:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:223:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:223:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:224:5: lv_ref_1_0= ruleReference
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

            // InternalASTConversionSimple.g:241:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:242:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:242:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:243:5: lv_name_2_0= RULE_ID
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
    // InternalASTConversionSimple.g:267:1: entryRuleAutoExplicitClass returns [EObject current=null] : iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF ;
    public final EObject entryRuleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoExplicitClass = null;


        try {
            // InternalASTConversionSimple.g:267:58: (iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF )
            // InternalASTConversionSimple.g:268:2: iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF
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
    // InternalASTConversionSimple.g:274:1: ruleAutoExplicitClass returns [EObject current=null] : (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:280:2: ( (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:281:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:281:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:282:3: otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoExplicitClassAccess().getAutoExplicitKeyword_0());
            		
            // InternalASTConversionSimple.g:286:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:287:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:287:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:288:5: lv_ref_1_0= ruleReference
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

            // InternalASTConversionSimple.g:305:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:306:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:306:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:307:5: lv_name_2_0= RULE_ID
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
    // InternalASTConversionSimple.g:331:1: entryRuleManualClass returns [EObject current=null] : iv_ruleManualClass= ruleManualClass EOF ;
    public final EObject entryRuleManualClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualClass = null;


        try {
            // InternalASTConversionSimple.g:331:52: (iv_ruleManualClass= ruleManualClass EOF )
            // InternalASTConversionSimple.g:332:2: iv_ruleManualClass= ruleManualClass EOF
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
    // InternalASTConversionSimple.g:338:1: ruleManualClass returns [EObject current=null] : (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleManualClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:344:2: ( (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:345:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:345:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:346:3: otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getManualClassAccess().getManualKeyword_0());
            		
            // InternalASTConversionSimple.g:350:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:351:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:351:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:352:5: lv_ref_1_0= ruleReference
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

            // InternalASTConversionSimple.g:369:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:370:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:370:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:371:5: lv_name_2_0= RULE_ID
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
    // InternalASTConversionSimple.g:395:1: entryRuleCustomASTClass returns [EObject current=null] : iv_ruleCustomASTClass= ruleCustomASTClass EOF ;
    public final EObject entryRuleCustomASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomASTClass = null;


        try {
            // InternalASTConversionSimple.g:395:55: (iv_ruleCustomASTClass= ruleCustomASTClass EOF )
            // InternalASTConversionSimple.g:396:2: iv_ruleCustomASTClass= ruleCustomASTClass EOF
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
    // InternalASTConversionSimple.g:402:1: ruleCustomASTClass returns [EObject current=null] : (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:408:2: ( (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:409:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:409:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:410:3: otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomASTClassAccess().getCustomKeyword_0());
            		
            // InternalASTConversionSimple.g:414:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:415:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:415:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:416:5: lv_ref_1_0= ruleReference
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

            // InternalASTConversionSimple.g:433:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:434:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:434:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:435:5: lv_name_2_0= RULE_ID
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
    // InternalASTConversionSimple.g:459:1: entryRuleCustomCopyASTClass returns [EObject current=null] : iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF ;
    public final EObject entryRuleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCopyASTClass = null;


        try {
            // InternalASTConversionSimple.g:459:59: (iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF )
            // InternalASTConversionSimple.g:460:2: iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF
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
    // InternalASTConversionSimple.g:466:1: ruleCustomCopyASTClass returns [EObject current=null] : (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:472:2: ( (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:473:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:473:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:474:3: otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCopyASTClassAccess().getCustomCopyKeyword_0());
            		
            // InternalASTConversionSimple.g:478:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:479:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:479:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:480:5: lv_ref_1_0= ruleReference
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

            // InternalASTConversionSimple.g:497:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:498:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:498:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:499:5: lv_name_2_0= RULE_ID
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
    // InternalASTConversionSimple.g:523:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalASTConversionSimple.g:523:50: (iv_ruleReference= ruleReference EOF )
            // InternalASTConversionSimple.g:524:2: iv_ruleReference= ruleReference EOF
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
    // InternalASTConversionSimple.g:530:1: ruleReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:536:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:537:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:537:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:538:3: (lv_name_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:538:3: (lv_name_0_0= RULE_ID )
            // InternalASTConversionSimple.g:539:4: lv_name_0_0= RULE_ID
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
    // InternalASTConversionSimple.g:558:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // InternalASTConversionSimple.g:558:46: (iv_ruleOther= ruleOther EOF )
            // InternalASTConversionSimple.g:559:2: iv_ruleOther= ruleOther EOF
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
    // InternalASTConversionSimple.g:565:1: ruleOther returns [EObject current=null] : (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_content_2_1 = null;

        EObject lv_content_2_2 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:571:2: ( (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) )
            // InternalASTConversionSimple.g:572:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            {
            // InternalASTConversionSimple.g:572:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            // InternalASTConversionSimple.g:573:3: otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherAccess().getOtherKeyword_0());
            		
            // InternalASTConversionSimple.g:577:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:578:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:578:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:579:5: lv_name_1_0= RULE_ID
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

            // InternalASTConversionSimple.g:595:3: ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            // InternalASTConversionSimple.g:596:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            {
            // InternalASTConversionSimple.g:596:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            // InternalASTConversionSimple.g:597:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
            {
            // InternalASTConversionSimple.g:597:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
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
                    // InternalASTConversionSimple.g:598:6: lv_content_2_1= ruleReference
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
                    // InternalASTConversionSimple.g:614:6: lv_content_2_2= ruleAutoClass
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
    // InternalASTConversionSimple.g:636:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalASTConversionSimple.g:636:48: (iv_ruleElement= ruleElement EOF )
            // InternalASTConversionSimple.g:637:2: iv_ruleElement= ruleElement EOF
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
    // InternalASTConversionSimple.g:643:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) ;
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
            // InternalASTConversionSimple.g:649:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) )
            // InternalASTConversionSimple.g:650:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            {
            // InternalASTConversionSimple.g:650:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            // InternalASTConversionSimple.g:651:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalASTConversionSimple.g:655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:656:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:657:5: lv_name_1_0= RULE_ID
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

            // InternalASTConversionSimple.g:673:3: ( (lv_type_2_0= ruleChangeKind ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=22 && LA5_0<=24)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalASTConversionSimple.g:674:4: (lv_type_2_0= ruleChangeKind )
                    {
                    // InternalASTConversionSimple.g:674:4: (lv_type_2_0= ruleChangeKind )
                    // InternalASTConversionSimple.g:675:5: lv_type_2_0= ruleChangeKind
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
            		
            // InternalASTConversionSimple.g:696:3: ( (lv_value_4_0= ruleChangeKind ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=22 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalASTConversionSimple.g:697:4: (lv_value_4_0= ruleChangeKind )
            	    {
            	    // InternalASTConversionSimple.g:697:4: (lv_value_4_0= ruleChangeKind )
            	    // InternalASTConversionSimple.g:698:5: lv_value_4_0= ruleChangeKind
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
    // InternalASTConversionSimple.g:723:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalASTConversionSimple.g:723:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalASTConversionSimple.g:724:2: iv_ruleSequence= ruleSequence EOF
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
    // InternalASTConversionSimple.g:730:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Addition_1 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:736:2: ( (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' ) )
            // InternalASTConversionSimple.g:737:2: (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' )
            {
            // InternalASTConversionSimple.g:737:2: (otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';' )
            // InternalASTConversionSimple.g:738:3: otherlv_0= 'sequence' this_Addition_1= ruleAddition ( () ( (lv_expressions_3_0= ruleAddition ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSequenceAccess().getAdditionParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_12);
            this_Addition_1=ruleAddition();

            state._fsp--;


            			current = this_Addition_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalASTConversionSimple.g:750:3: ( () ( (lv_expressions_3_0= ruleAddition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalASTConversionSimple.g:751:4: () ( (lv_expressions_3_0= ruleAddition ) )
            	    {
            	    // InternalASTConversionSimple.g:751:4: ()
            	    // InternalASTConversionSimple.g:752:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getSequenceAccess().getSequenceExpressionsAction_2_0(),
            	    						current);
            	    				

            	    }

            	    // InternalASTConversionSimple.g:758:4: ( (lv_expressions_3_0= ruleAddition ) )
            	    // InternalASTConversionSimple.g:759:5: (lv_expressions_3_0= ruleAddition )
            	    {
            	    // InternalASTConversionSimple.g:759:5: (lv_expressions_3_0= ruleAddition )
            	    // InternalASTConversionSimple.g:760:6: lv_expressions_3_0= ruleAddition
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
    // InternalASTConversionSimple.g:786:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalASTConversionSimple.g:786:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalASTConversionSimple.g:787:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalASTConversionSimple.g:793:1: ruleAddition returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token lv_right_2_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:799:2: ( ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) ) )
            // InternalASTConversionSimple.g:800:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) )
            {
            // InternalASTConversionSimple.g:800:2: ( ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:801:3: ( (lv_left_0_0= RULE_ID ) ) otherlv_1= '+' ( (lv_right_2_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:801:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:802:4: (lv_left_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:802:4: (lv_left_0_0= RULE_ID )
            // InternalASTConversionSimple.g:803:5: lv_left_0_0= RULE_ID
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
            		
            // InternalASTConversionSimple.g:823:3: ( (lv_right_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:824:4: (lv_right_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:824:4: (lv_right_2_0= RULE_ID )
            // InternalASTConversionSimple.g:825:5: lv_right_2_0= RULE_ID
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


    // $ANTLR start "ruleChangeKind"
    // InternalASTConversionSimple.g:845:1: ruleChangeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) ;
    public final Enumerator ruleChangeKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:851:2: ( ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) )
            // InternalASTConversionSimple.g:852:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            {
            // InternalASTConversionSimple.g:852:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalASTConversionSimple.g:853:3: (enumLiteral_0= 'add' )
                    {
                    // InternalASTConversionSimple.g:853:3: (enumLiteral_0= 'add' )
                    // InternalASTConversionSimple.g:854:4: enumLiteral_0= 'add'
                    {
                    enumLiteral_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:861:3: (enumLiteral_1= 'move' )
                    {
                    // InternalASTConversionSimple.g:861:3: (enumLiteral_1= 'move' )
                    // InternalASTConversionSimple.g:862:4: enumLiteral_1= 'move'
                    {
                    enumLiteral_1=(Token)match(input,23,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalASTConversionSimple.g:869:3: (enumLiteral_2= 'remove' )
                    {
                    // InternalASTConversionSimple.g:869:3: (enumLiteral_2= 'remove' )
                    // InternalASTConversionSimple.g:870:4: enumLiteral_2= 'remove'
                    {
                    enumLiteral_2=(Token)match(input,24,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000810L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001C80000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C01000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    }


}