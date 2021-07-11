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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'auto'", "';'", "'auto-explicit'", "'manual'", "'custom'", "'custom-copy'", "'other'", "'element'", "'='", "'add'", "'move'", "'remove'"
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
    // InternalASTConversionSimple.g:72:1: ruleProgram returns [EObject current=null] : ( (lv_entries_0_0= ruleEntry ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:78:2: ( ( (lv_entries_0_0= ruleEntry ) )+ )
            // InternalASTConversionSimple.g:79:2: ( (lv_entries_0_0= ruleEntry ) )+
            {
            // InternalASTConversionSimple.g:79:2: ( (lv_entries_0_0= ruleEntry ) )+
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
            	    // InternalASTConversionSimple.g:80:3: (lv_entries_0_0= ruleEntry )
            	    {
            	    // InternalASTConversionSimple.g:80:3: (lv_entries_0_0= ruleEntry )
            	    // InternalASTConversionSimple.g:81:4: lv_entries_0_0= ruleEntry
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
    // InternalASTConversionSimple.g:101:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalASTConversionSimple.g:101:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalASTConversionSimple.g:102:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalASTConversionSimple.g:108:1: ruleEntry returns [EObject current=null] : (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) ;
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
            // InternalASTConversionSimple.g:114:2: ( (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement ) )
            // InternalASTConversionSimple.g:115:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
            {
            // InternalASTConversionSimple.g:115:2: (this_AutoClass_0= ruleAutoClass | this_AutoExplicitClass_1= ruleAutoExplicitClass | this_ManualClass_2= ruleManualClass | this_CustomASTClass_3= ruleCustomASTClass | this_CustomCopyASTClass_4= ruleCustomCopyASTClass | this_Other_5= ruleOther | this_Element_6= ruleElement )
            int alt2=7;
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
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalASTConversionSimple.g:116:3: this_AutoClass_0= ruleAutoClass
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
                    // InternalASTConversionSimple.g:125:3: this_AutoExplicitClass_1= ruleAutoExplicitClass
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
                    // InternalASTConversionSimple.g:134:3: this_ManualClass_2= ruleManualClass
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
                    // InternalASTConversionSimple.g:143:3: this_CustomASTClass_3= ruleCustomASTClass
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
                    // InternalASTConversionSimple.g:152:3: this_CustomCopyASTClass_4= ruleCustomCopyASTClass
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
                    // InternalASTConversionSimple.g:161:3: this_Other_5= ruleOther
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
                    // InternalASTConversionSimple.g:170:3: this_Element_6= ruleElement
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
    // InternalASTConversionSimple.g:182:1: entryRuleAutoClass returns [EObject current=null] : iv_ruleAutoClass= ruleAutoClass EOF ;
    public final EObject entryRuleAutoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoClass = null;


        try {
            // InternalASTConversionSimple.g:182:50: (iv_ruleAutoClass= ruleAutoClass EOF )
            // InternalASTConversionSimple.g:183:2: iv_ruleAutoClass= ruleAutoClass EOF
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
    // InternalASTConversionSimple.g:189:1: ruleAutoClass returns [EObject current=null] : (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:195:2: ( (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:196:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:196:2: (otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:197:3: otherlv_0= 'auto' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoClassAccess().getAutoKeyword_0());
            		
            // InternalASTConversionSimple.g:201:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:202:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:202:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:203:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
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

            // InternalASTConversionSimple.g:220:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:221:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:221:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:222:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

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
    // InternalASTConversionSimple.g:246:1: entryRuleAutoExplicitClass returns [EObject current=null] : iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF ;
    public final EObject entryRuleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoExplicitClass = null;


        try {
            // InternalASTConversionSimple.g:246:58: (iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF )
            // InternalASTConversionSimple.g:247:2: iv_ruleAutoExplicitClass= ruleAutoExplicitClass EOF
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
    // InternalASTConversionSimple.g:253:1: ruleAutoExplicitClass returns [EObject current=null] : (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAutoExplicitClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:259:2: ( (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:260:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:260:2: (otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:261:3: otherlv_0= 'auto-explicit' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoExplicitClassAccess().getAutoExplicitKeyword_0());
            		
            // InternalASTConversionSimple.g:265:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:266:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:266:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:267:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getAutoExplicitClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
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

            // InternalASTConversionSimple.g:284:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:285:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:285:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:286:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

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
    // InternalASTConversionSimple.g:310:1: entryRuleManualClass returns [EObject current=null] : iv_ruleManualClass= ruleManualClass EOF ;
    public final EObject entryRuleManualClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualClass = null;


        try {
            // InternalASTConversionSimple.g:310:52: (iv_ruleManualClass= ruleManualClass EOF )
            // InternalASTConversionSimple.g:311:2: iv_ruleManualClass= ruleManualClass EOF
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
    // InternalASTConversionSimple.g:317:1: ruleManualClass returns [EObject current=null] : (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleManualClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:323:2: ( (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:324:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:324:2: (otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:325:3: otherlv_0= 'manual' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManualClassAccess().getManualKeyword_0());
            		
            // InternalASTConversionSimple.g:329:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:330:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:330:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:331:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getManualClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
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

            // InternalASTConversionSimple.g:348:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:349:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:349:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:350:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

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
    // InternalASTConversionSimple.g:374:1: entryRuleCustomASTClass returns [EObject current=null] : iv_ruleCustomASTClass= ruleCustomASTClass EOF ;
    public final EObject entryRuleCustomASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomASTClass = null;


        try {
            // InternalASTConversionSimple.g:374:55: (iv_ruleCustomASTClass= ruleCustomASTClass EOF )
            // InternalASTConversionSimple.g:375:2: iv_ruleCustomASTClass= ruleCustomASTClass EOF
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
    // InternalASTConversionSimple.g:381:1: ruleCustomASTClass returns [EObject current=null] : (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:387:2: ( (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:388:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:388:2: (otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:389:3: otherlv_0= 'custom' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomASTClassAccess().getCustomKeyword_0());
            		
            // InternalASTConversionSimple.g:393:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:394:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:394:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:395:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomASTClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
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

            // InternalASTConversionSimple.g:412:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:413:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:413:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:414:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

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
    // InternalASTConversionSimple.g:438:1: entryRuleCustomCopyASTClass returns [EObject current=null] : iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF ;
    public final EObject entryRuleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCopyASTClass = null;


        try {
            // InternalASTConversionSimple.g:438:59: (iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF )
            // InternalASTConversionSimple.g:439:2: iv_ruleCustomCopyASTClass= ruleCustomCopyASTClass EOF
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
    // InternalASTConversionSimple.g:445:1: ruleCustomCopyASTClass returns [EObject current=null] : (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomCopyASTClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:451:2: ( (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalASTConversionSimple.g:452:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalASTConversionSimple.g:452:2: (otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalASTConversionSimple.g:453:3: otherlv_0= 'custom-copy' ( (lv_ref_1_0= ruleReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomCopyASTClassAccess().getCustomCopyKeyword_0());
            		
            // InternalASTConversionSimple.g:457:3: ( (lv_ref_1_0= ruleReference ) )
            // InternalASTConversionSimple.g:458:4: (lv_ref_1_0= ruleReference )
            {
            // InternalASTConversionSimple.g:458:4: (lv_ref_1_0= ruleReference )
            // InternalASTConversionSimple.g:459:5: lv_ref_1_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCustomCopyASTClassAccess().getRefReferenceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
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

            // InternalASTConversionSimple.g:476:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASTConversionSimple.g:477:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:477:4: (lv_name_2_0= RULE_ID )
            // InternalASTConversionSimple.g:478:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleOther"
    // InternalASTConversionSimple.g:502:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // InternalASTConversionSimple.g:502:46: (iv_ruleOther= ruleOther EOF )
            // InternalASTConversionSimple.g:503:2: iv_ruleOther= ruleOther EOF
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
    // InternalASTConversionSimple.g:509:1: ruleOther returns [EObject current=null] : (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_content_2_1 = null;

        EObject lv_content_2_2 = null;



        	enterRule();

        try {
            // InternalASTConversionSimple.g:515:2: ( (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) ) )
            // InternalASTConversionSimple.g:516:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            {
            // InternalASTConversionSimple.g:516:2: (otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) ) )
            // InternalASTConversionSimple.g:517:3: otherlv_0= 'other' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherAccess().getOtherKeyword_0());
            		
            // InternalASTConversionSimple.g:521:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:522:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:522:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:523:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

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

            // InternalASTConversionSimple.g:539:3: ( ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) ) )
            // InternalASTConversionSimple.g:540:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            {
            // InternalASTConversionSimple.g:540:4: ( (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass ) )
            // InternalASTConversionSimple.g:541:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
            {
            // InternalASTConversionSimple.g:541:5: (lv_content_2_1= ruleReference | lv_content_2_2= ruleAutoClass )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalASTConversionSimple.g:542:6: lv_content_2_1= ruleReference
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
                    // InternalASTConversionSimple.g:558:6: lv_content_2_2= ruleAutoClass
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
    // InternalASTConversionSimple.g:580:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalASTConversionSimple.g:580:48: (iv_ruleElement= ruleElement EOF )
            // InternalASTConversionSimple.g:581:2: iv_ruleElement= ruleElement EOF
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
    // InternalASTConversionSimple.g:587:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) ;
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
            // InternalASTConversionSimple.g:593:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' ) )
            // InternalASTConversionSimple.g:594:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            {
            // InternalASTConversionSimple.g:594:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';' )
            // InternalASTConversionSimple.g:595:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleChangeKind ) )? otherlv_3= '=' ( (lv_value_4_0= ruleChangeKind ) )+ otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalASTConversionSimple.g:599:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASTConversionSimple.g:600:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:600:4: (lv_name_1_0= RULE_ID )
            // InternalASTConversionSimple.g:601:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

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

            // InternalASTConversionSimple.g:617:3: ( (lv_type_2_0= ruleChangeKind ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=20 && LA4_0<=22)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalASTConversionSimple.g:618:4: (lv_type_2_0= ruleChangeKind )
                    {
                    // InternalASTConversionSimple.g:618:4: (lv_type_2_0= ruleChangeKind )
                    // InternalASTConversionSimple.g:619:5: lv_type_2_0= ruleChangeKind
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTypeChangeKindEnumRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_8);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getEqualsSignKeyword_3());
            		
            // InternalASTConversionSimple.g:640:3: ( (lv_value_4_0= ruleChangeKind ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=20 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalASTConversionSimple.g:641:4: (lv_value_4_0= ruleChangeKind )
            	    {
            	    // InternalASTConversionSimple.g:641:4: (lv_value_4_0= ruleChangeKind )
            	    // InternalASTConversionSimple.g:642:5: lv_value_4_0= ruleChangeKind
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getValueChangeKindEnumRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_10);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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


    // $ANTLR start "entryRuleReference"
    // InternalASTConversionSimple.g:667:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalASTConversionSimple.g:667:50: (iv_ruleReference= ruleReference EOF )
            // InternalASTConversionSimple.g:668:2: iv_ruleReference= ruleReference EOF
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
    // InternalASTConversionSimple.g:674:1: ruleReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:680:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalASTConversionSimple.g:681:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalASTConversionSimple.g:681:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalASTConversionSimple.g:682:3: (lv_name_0_0= RULE_ID )
            {
            // InternalASTConversionSimple.g:682:3: (lv_name_0_0= RULE_ID )
            // InternalASTConversionSimple.g:683:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "ruleChangeKind"
    // InternalASTConversionSimple.g:702:1: ruleChangeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) ;
    public final Enumerator ruleChangeKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalASTConversionSimple.g:708:2: ( ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) ) )
            // InternalASTConversionSimple.g:709:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            {
            // InternalASTConversionSimple.g:709:2: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'move' ) | (enumLiteral_2= 'remove' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalASTConversionSimple.g:710:3: (enumLiteral_0= 'add' )
                    {
                    // InternalASTConversionSimple.g:710:3: (enumLiteral_0= 'add' )
                    // InternalASTConversionSimple.g:711:4: enumLiteral_0= 'add'
                    {
                    enumLiteral_0=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChangeKindAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalASTConversionSimple.g:718:3: (enumLiteral_1= 'move' )
                    {
                    // InternalASTConversionSimple.g:718:3: (enumLiteral_1= 'move' )
                    // InternalASTConversionSimple.g:719:4: enumLiteral_1= 'move'
                    {
                    enumLiteral_1=(Token)match(input,21,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChangeKindAccess().getMOVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalASTConversionSimple.g:726:3: (enumLiteral_2= 'remove' )
                    {
                    // InternalASTConversionSimple.g:726:3: (enumLiteral_2= 'remove' )
                    // InternalASTConversionSimple.g:727:4: enumLiteral_2= 'remove'
                    {
                    enumLiteral_2=(Token)match(input,22,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007E802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000810L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000700000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000701000L});
    }


}