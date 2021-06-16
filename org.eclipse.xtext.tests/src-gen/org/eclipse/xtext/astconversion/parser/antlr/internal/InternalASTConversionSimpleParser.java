package org.eclipse.xtext.astconversion.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'auto'", "';'", "'auto-explicit'", "'manual'", "'custom'", "'custom-copy'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalASTConversionSimple.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalASTConversionSimple.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalASTConversionSimple.g:65:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalASTConversionSimple.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_entries_0_0= ruleEntry ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:77:2: ( ( (lv_entries_0_0= ruleEntry ) )+ )
            // InternalASTConversionSimple.g:78:2: ( (lv_entries_0_0= ruleEntry ) )+
            {
            // InternalASTConversionSimple.g:78:2: ( (lv_entries_0_0= ruleEntry ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalASTConversionSimple.g:79:3: (lv_entries_0_0= ruleEntry )
            	    {
            	    // InternalASTConversionSimple.g:79:3: (lv_entries_0_0= ruleEntry )
            	    // InternalASTConversionSimple.g:80:4: lv_entries_0_0= ruleEntry
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getEntriesEntryParserRuleCall_0());
            	    			
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
    // InternalASTConversionSimple.g:100:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalASTConversionSimple.g:100:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalASTConversionSimple.g:101:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalASTConversionSimple.g:107:1: ruleEntry returns [EObject current=null] : (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject this_AutoClass_0 = null;

        EObject this_AutoExplicitClass_1 = null;

        EObject this_ManualClass_2 = null;

        EObject this_CustomASTClass_3 = null;

        EObject this_CustomCopyASTClass_4 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:113:2: ( (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass ) )
            // InternalASTConversionSimple.g:114:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass )
            {
            // InternalASTConversionSimple.g:114:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalASTConversionSimple.g:115:3: this_AutoClass_0= ruleAutoClass
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
                    // InternalASTConversionSimple.g:124:3: this_AutoExplicitClass_1= ruleAutoExplicitClass
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
                    // InternalASTConversionSimple.g:133:3: this_ManualClass_2= ruleManualClass
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
                    // InternalASTConversionSimple.g:142:3: this_CustomASTClass_3= ruleCustomASTClass
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
                    // InternalASTConversionSimple.g:151:3: this_CustomCopyASTClass_4= ruleCustomCopyASTClass
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getCustomCopyASTClassParserRuleCall_4());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CustomCopyASTClass_4=ruleCustomCopyASTClass();

                    state._fsp--;


                    			current = this_CustomCopyASTClass_4;
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
    // InternalASTConversionSimple.g:163:1: entryRuleAutoClass returns [EObject current=null] : iv_ruleAutoClass= ruleAutoClass EOF ;
    public final EObject entryRuleAutoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoClass = null;


        try {
            // InternalASTConversionSimple.g:163:50: (iv_ruleAutoClass= ruleAutoClass EOF )
            // InternalASTConversionSimple.g:164:2: iv_ruleAutoClass= ruleAutoClass EOF
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
    // InternalASTConversionSimple.g:170:1: ruleAutoClass returns [EObject current=null] : (otherlv_0= 'auto' ( (lv_ref1_1_0= ruleReference ) ) ( (lv_name1_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name1_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref1_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:176:2: ( (otherlv_0= 'auto' ( (lv_ref1_1_0= ruleReference ) ) ( (lv_name1_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:177:2: (otherlv_0= 'auto' ( (lv_ref1_1_0= ruleReference ) ) ( (lv_name1_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:177:2: (otherlv_0= 'auto' ( (lv_ref1_1_0= ruleReference ) ) ( (lv_name1_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:178:3: otherlv_0= 'auto' ( (lv_ref1_1_0= ruleReference ) ) ( (lv_name1_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoClassAccess().getAutoKeyword_0());
            		
            // InternalASTConversionSimple.g:182:3: ( (lv_ref1_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:183:4: (lv_ref1_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:183:4: (lv_ref1_1_0= ruleReference )
            // InternalASTConversionSimple.g:184:5: lv_ref1_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoClassAccess().getRef1ReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ref1_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutoClassRule());
            					}
            					set(
            						current,
            						"ref1",
            						lv_ref1_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:201:3: ( (lv_name1_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:202:4: (lv_name1_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:202:4: (lv_name1_2_0= RULE_ID )
            // InternalASTConversionSimple.g:203:5: lv_name1_2_0= RULE_ID
            {
            lv_name1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_name1_2_0, grammarAccess.getAutoClassAccess().getName1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutoClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name1",
            						lv_name1_2_0,
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
    // InternalASTConversionSimple.g:227:1: entryRuleAutoExplicitClass returns [EObject current=null] : iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF ;
    public final EObject entryRuleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoExplicitClass = null;


        try {
            // InternalASTConversionSimple.g:227:58: (iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF )
            // InternalASTConversionSimple.g:228:2: iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF
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
    // InternalASTConversionSimple.g:234:1: ruleAutoExplicitClass returns [EObject current=null] : (otherlv_0= 'auto-explicit' ( (lv_ref2_1_0= ruleReference ) ) ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name2_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref2_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:240:2: ( (otherlv_0= 'auto-explicit' ( (lv_ref2_1_0= ruleReference ) ) ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:241:2: (otherlv_0= 'auto-explicit' ( (lv_ref2_1_0= ruleReference ) ) ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:241:2: (otherlv_0= 'auto-explicit' ( (lv_ref2_1_0= ruleReference ) ) ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:242:3: otherlv_0= 'auto-explicit' ( (lv_ref2_1_0= ruleReference ) ) ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoExplicitClassAccess().getAutoExplicitKeyword_0());
            		
            // InternalASTConversionSimple.g:246:3: ( (lv_ref2_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:247:4: (lv_ref2_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:247:4: (lv_ref2_1_0= ruleReference )
            // InternalASTConversionSimple.g:248:5: lv_ref2_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoExplicitClassAccess().getRef2ReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ref2_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutoExplicitClassRule());
            					}
            					set(
            						current,
            						"ref2",
            						lv_ref2_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:265:3: ( (lv_name2_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:266:4: (lv_name2_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:266:4: (lv_name2_2_0= RULE_ID )
            // InternalASTConversionSimple.g:267:5: lv_name2_2_0= RULE_ID
            {
            lv_name2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_name2_2_0, grammarAccess.getAutoExplicitClassAccess().getName2IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutoExplicitClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name2",
            						lv_name2_2_0,
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
    // InternalASTConversionSimple.g:291:1: entryRuleManualClass returns [EObject current=null] : iv_ruleManualClass= ruleManualClass EOF ;
    public final EObject entryRuleManualClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualClass = null;


        try {
            // InternalASTConversionSimple.g:291:52: (iv_ruleManualClass= ruleManualClass EOF )
            // InternalASTConversionSimple.g:292:2: iv_ruleManualClass= ruleManualClass EOF
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
    // InternalASTConversionSimple.g:298:1: ruleManualClass returns [EObject current=null] : (otherlv_0= 'manual' ( (lv_ref3_1_0= ruleReference ) ) ( (lv_name3_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleManualClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name3_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref3_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:304:2: ( (otherlv_0= 'manual' ( (lv_ref3_1_0= ruleReference ) ) ( (lv_name3_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:305:2: (otherlv_0= 'manual' ( (lv_ref3_1_0= ruleReference ) ) ( (lv_name3_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:305:2: (otherlv_0= 'manual' ( (lv_ref3_1_0= ruleReference ) ) ( (lv_name3_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:306:3: otherlv_0= 'manual' ( (lv_ref3_1_0= ruleReference ) ) ( (lv_name3_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManualClassAccess().getManualKeyword_0());
            		
            // InternalASTConversionSimple.g:310:3: ( (lv_ref3_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:311:4: (lv_ref3_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:311:4: (lv_ref3_1_0= ruleReference )
            // InternalASTConversionSimple.g:312:5: lv_ref3_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getManualClassAccess().getRef3ReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ref3_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManualClassRule());
            					}
            					set(
            						current,
            						"ref3",
            						lv_ref3_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:329:3: ( (lv_name3_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:330:4: (lv_name3_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:330:4: (lv_name3_2_0= RULE_ID )
            // InternalASTConversionSimple.g:331:5: lv_name3_2_0= RULE_ID
            {
            lv_name3_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_name3_2_0, grammarAccess.getManualClassAccess().getName3IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManualClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name3",
            						lv_name3_2_0,
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
    // InternalASTConversionSimple.g:355:1: entryRuleCustomASTClass returns [EObject current=null] : iv_ruleCustomASTClass= ruleCustomASTClass EOF ;
    public final EObject entryRuleCustomASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomASTClass = null;


        try {
            // InternalASTConversionSimple.g:355:55: (iv_ruleCustomASTClass= ruleCustomASTClass EOF )
            // InternalASTConversionSimple.g:356:2: iv_ruleCustomASTClass= ruleCustomASTClass EOF
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
    // InternalASTConversionSimple.g:362:1: ruleCustomASTClass returns [EObject current=null] : (otherlv_0= 'custom' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name4_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name4_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref4_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:368:2: ( (otherlv_0= 'custom' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name4_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:369:2: (otherlv_0= 'custom' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name4_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:369:2: (otherlv_0= 'custom' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name4_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:370:3: otherlv_0= 'custom' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name4_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomASTClassAccess().getCustomKeyword_0());
            		
            // InternalASTConversionSimple.g:374:3: ( (lv_ref4_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:375:4: (lv_ref4_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:375:4: (lv_ref4_1_0= ruleReference )
            // InternalASTConversionSimple.g:376:5: lv_ref4_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomASTClassAccess().getRef4ReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ref4_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomASTClassRule());
            					}
            					set(
            						current,
            						"ref4",
            						lv_ref4_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:393:3: ( (lv_name4_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:394:4: (lv_name4_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:394:4: (lv_name4_2_0= RULE_ID )
            // InternalASTConversionSimple.g:395:5: lv_name4_2_0= RULE_ID
            {
            lv_name4_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_name4_2_0, grammarAccess.getCustomASTClassAccess().getName4IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomASTClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name4",
            						lv_name4_2_0,
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
    // InternalASTConversionSimple.g:419:1: entryRuleCustomCopyASTClass returns [EObject current=null] : iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF ;
    public final EObject entryRuleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCopyASTClass = null;


        try {
            // InternalASTConversionSimple.g:419:59: (iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF )
            // InternalASTConversionSimple.g:420:2: iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF
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
    // InternalASTConversionSimple.g:426:1: ruleCustomCopyASTClass returns [EObject current=null] : (otherlv_0= 'custom-copy' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref4_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:432:2: ( (otherlv_0= 'custom-copy' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:433:2: (otherlv_0= 'custom-copy' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:433:2: (otherlv_0= 'custom-copy' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:434:3: otherlv_0= 'custom-copy' ( (lv_ref4_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCopyASTClassAccess().getCustomCopyKeyword_0());
            		
            // InternalASTConversionSimple.g:438:3: ( (lv_ref4_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:439:4: (lv_ref4_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:439:4: (lv_ref4_1_0= ruleReference )
            // InternalASTConversionSimple.g:440:5: lv_ref4_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomCopyASTClassAccess().getRef4ReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ref4_1_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomCopyASTClassRule());
            					}
            					set(
            						current,
            						"ref4",
            						lv_ref4_1_0,
            						"org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASTConversionSimple.g:457:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:458:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:458:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:459:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

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
    // InternalASTConversionSimple.g:483:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalASTConversionSimple.g:483:50: (iv_ruleReference= ruleReference EOF )
            // InternalASTConversionSimple.g:484:2: iv_ruleReference= ruleReference EOF
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
    // InternalASTConversionSimple.g:490:1: ruleReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:496:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:497:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:497:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:498:3: (lv_name_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:498:3: (lv_name_0_0= RULE_ID )
            // InternalASTConversionSimple.g:499:4: lv_name_0_0= RULE_ID
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001E802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    }


}