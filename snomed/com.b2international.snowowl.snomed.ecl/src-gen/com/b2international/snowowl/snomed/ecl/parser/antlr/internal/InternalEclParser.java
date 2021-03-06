package com.b2international.snowowl.snomed.ecl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.b2international.snowowl.snomed.ecl.services.EclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OR", "RULE_MINUS", "RULE_COLON", "RULE_DOT", "RULE_LT_EM", "RULE_LT", "RULE_DBL_LT", "RULE_GT_EM", "RULE_GT", "RULE_DBL_GT", "RULE_CARET", "RULE_PIPE", "RULE_WILDCARD", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_REVERSED", "RULE_SQUARE_OPEN", "RULE_TO", "RULE_SQUARE_CLOSE", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_STRING", "RULE_HASH", "RULE_GTE", "RULE_LTE", "RULE_DIGIT_NONZERO", "RULE_ZERO", "RULE_WS", "RULE_AND", "RULE_NOT", "RULE_LETTER", "RULE_PLUS", "RULE_COMMA", "RULE_DASH", "RULE_OTHER_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT"
    };
    public static final int RULE_LTE=30;
    public static final int RULE_CURLY_OPEN=19;
    public static final int RULE_DIGIT_NONZERO=31;
    public static final int RULE_DBL_GT=13;
    public static final int RULE_ROUND_CLOSE=18;
    public static final int RULE_TO=23;
    public static final int RULE_GT=12;
    public static final int RULE_STRING=27;
    public static final int RULE_NOT=35;
    public static final int RULE_REVERSED=21;
    public static final int RULE_AND=34;
    public static final int RULE_GTE=29;
    public static final int RULE_SL_COMMENT=42;
    public static final int RULE_HASH=28;
    public static final int RULE_ROUND_OPEN=17;
    public static final int RULE_DASH=39;
    public static final int RULE_OTHER_CHARACTER=40;
    public static final int RULE_DBL_LT=10;
    public static final int RULE_PLUS=37;
    public static final int RULE_NOT_EQUAL=26;
    public static final int RULE_OR=4;
    public static final int RULE_DOT=7;
    public static final int EOF=-1;
    public static final int RULE_SQUARE_CLOSE=24;
    public static final int RULE_SQUARE_OPEN=22;
    public static final int RULE_EQUAL=25;
    public static final int RULE_LT_EM=8;
    public static final int RULE_GT_EM=11;
    public static final int RULE_WS=33;
    public static final int RULE_COMMA=38;
    public static final int RULE_CURLY_CLOSE=20;
    public static final int RULE_ZERO=32;
    public static final int RULE_COLON=6;
    public static final int RULE_MINUS=5;
    public static final int RULE_LETTER=36;
    public static final int RULE_LT=9;
    public static final int RULE_CARET=14;
    public static final int RULE_PIPE=15;
    public static final int RULE_ML_COMMENT=41;
    public static final int RULE_WILDCARD=16;

    // delegates
    // delegators


        public InternalEclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEclParser.tokenNames; }
    public String getGrammarFileName() { return "../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g"; }



     	private EclGrammarAccess grammarAccess;
     	
        public InternalEclParser(TokenStream input, EclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ExpressionConstraint";	
       	}
       	
       	@Override
       	protected EclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:67:1: entryRuleExpressionConstraint returns [EObject current=null] : iv_ruleExpressionConstraint= ruleExpressionConstraint EOF ;
    public final EObject entryRuleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstraint = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:68:2: (iv_ruleExpressionConstraint= ruleExpressionConstraint EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:69:2: iv_ruleExpressionConstraint= ruleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionConstraint_in_entryRuleExpressionConstraint75);
            iv_ruleExpressionConstraint=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionConstraint85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionConstraint"


    // $ANTLR start "ruleExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:76:1: ruleExpressionConstraint returns [EObject current=null] : this_OrExpressionConstraint_0= ruleOrExpressionConstraint ;
    public final EObject ruleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpressionConstraint_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:79:28: (this_OrExpressionConstraint_0= ruleOrExpressionConstraint )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:81:5: this_OrExpressionConstraint_0= ruleOrExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpressionConstraint_in_ruleExpressionConstraint131);
            this_OrExpressionConstraint_0=ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpressionConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionConstraint"


    // $ANTLR start "entryRuleOrExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:97:1: entryRuleOrExpressionConstraint returns [EObject current=null] : iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF ;
    public final EObject entryRuleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionConstraint = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:98:2: (iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:99:2: iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpressionConstraint_in_entryRuleOrExpressionConstraint165);
            iv_ruleOrExpressionConstraint=ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpressionConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpressionConstraint175); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpressionConstraint"


    // $ANTLR start "ruleOrExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:106:1: ruleOrExpressionConstraint returns [EObject current=null] : (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) ;
    public final EObject ruleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_OR_2=null;
        EObject this_AndExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:109:28: ( (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:110:1: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:110:1: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:111:5: this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpressionConstraint_in_ruleOrExpressionConstraint222);
            this_AndExpressionConstraint_0=ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpressionConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:119:1: ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_OR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:119:2: () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:119:2: ()
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:120:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_OR_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrExpressionConstraint242); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OR_2, grammarAccess.getOrExpressionConstraintAccess().getORTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:129:1: ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:130:1: (lv_right_3_0= ruleAndExpressionConstraint )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:130:1: (lv_right_3_0= ruleAndExpressionConstraint )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:131:3: lv_right_3_0= ruleAndExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpressionConstraint_in_ruleOrExpressionConstraint262);
            	    lv_right_3_0=ruleAndExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionConstraintRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndExpressionConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrExpressionConstraint"


    // $ANTLR start "entryRuleAndExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:155:1: entryRuleAndExpressionConstraint returns [EObject current=null] : iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF ;
    public final EObject entryRuleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionConstraint = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:156:2: (iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:157:2: iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpressionConstraint_in_entryRuleAndExpressionConstraint300);
            iv_ruleAndExpressionConstraint=ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpressionConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpressionConstraint310); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpressionConstraint"


    // $ANTLR start "ruleAndExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:164:1: ruleAndExpressionConstraint returns [EObject current=null] : (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ruleAndOperator ( (lv_right_3_0= ruleExclusionExpressionConstraint ) ) )* ) ;
    public final EObject ruleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ExclusionExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:167:28: ( (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ruleAndOperator ( (lv_right_3_0= ruleExclusionExpressionConstraint ) ) )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:168:1: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ruleAndOperator ( (lv_right_3_0= ruleExclusionExpressionConstraint ) ) )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:168:1: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ruleAndOperator ( (lv_right_3_0= ruleExclusionExpressionConstraint ) ) )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:169:5: this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ruleAndOperator ( (lv_right_3_0= ruleExclusionExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExclusionExpressionConstraint_in_ruleAndExpressionConstraint357);
            this_ExclusionExpressionConstraint_0=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExclusionExpressionConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:177:1: ( () ruleAndOperator ( (lv_right_3_0= ruleExclusionExpressionConstraint ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_AND||LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:177:2: () ruleAndOperator ( (lv_right_3_0= ruleExclusionExpressionConstraint ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:177:2: ()
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:178:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getAndOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleAndExpressionConstraint382);
            	    ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:191:1: ( (lv_right_3_0= ruleExclusionExpressionConstraint ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:192:1: (lv_right_3_0= ruleExclusionExpressionConstraint )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:192:1: (lv_right_3_0= ruleExclusionExpressionConstraint )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:193:3: lv_right_3_0= ruleExclusionExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExclusionExpressionConstraint_in_ruleAndExpressionConstraint402);
            	    lv_right_3_0=ruleExclusionExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionConstraintRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExclusionExpressionConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndExpressionConstraint"


    // $ANTLR start "entryRuleExclusionExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:217:1: entryRuleExclusionExpressionConstraint returns [EObject current=null] : iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF ;
    public final EObject entryRuleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusionExpressionConstraint = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:218:2: (iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:219:2: iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleExclusionExpressionConstraint_in_entryRuleExclusionExpressionConstraint440);
            iv_ruleExclusionExpressionConstraint=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclusionExpressionConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExclusionExpressionConstraint450); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExclusionExpressionConstraint"


    // $ANTLR start "ruleExclusionExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:226:1: ruleExclusionExpressionConstraint returns [EObject current=null] : (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_MINUS_2= RULE_MINUS ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) ;
    public final EObject ruleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_MINUS_2=null;
        EObject this_RefinedExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:229:28: ( (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_MINUS_2= RULE_MINUS ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:230:1: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_MINUS_2= RULE_MINUS ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:230:1: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_MINUS_2= RULE_MINUS ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:231:5: this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_MINUS_2= RULE_MINUS ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRefinedExpressionConstraint_in_ruleExclusionExpressionConstraint497);
            this_RefinedExpressionConstraint_0=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RefinedExpressionConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:239:1: ( () this_MINUS_2= RULE_MINUS ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_MINUS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:239:2: () this_MINUS_2= RULE_MINUS ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:239:2: ()
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:240:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_MINUS_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleExclusionExpressionConstraint517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_2, grammarAccess.getExclusionExpressionConstraintAccess().getMINUSTerminalRuleCall_1_1()); 
                          
                    }
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:249:1: ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:250:1: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:250:1: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:251:3: lv_right_3_0= ruleRefinedExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRefinedExpressionConstraint_in_ruleExclusionExpressionConstraint537);
                    lv_right_3_0=ruleRefinedExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExclusionExpressionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"RefinedExpressionConstraint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExclusionExpressionConstraint"


    // $ANTLR start "entryRuleRefinedExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:275:1: entryRuleRefinedExpressionConstraint returns [EObject current=null] : iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF ;
    public final EObject entryRuleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinedExpressionConstraint = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:276:2: (iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:277:2: iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleRefinedExpressionConstraint_in_entryRuleRefinedExpressionConstraint575);
            iv_ruleRefinedExpressionConstraint=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinedExpressionConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinedExpressionConstraint585); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefinedExpressionConstraint"


    // $ANTLR start "ruleRefinedExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:284:1: ruleRefinedExpressionConstraint returns [EObject current=null] : (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleRefinement ) ) )? ) ;
    public final EObject ruleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        EObject this_DottedExpressionConstraint_0 = null;

        EObject lv_refinement_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:287:28: ( (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleRefinement ) ) )? ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:288:1: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleRefinement ) ) )? )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:288:1: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleRefinement ) ) )? )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:289:5: this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleRefinement ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDottedExpressionConstraint_in_ruleRefinedExpressionConstraint632);
            this_DottedExpressionConstraint_0=ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DottedExpressionConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:297:1: ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleRefinement ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_COLON) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:297:2: () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleRefinement ) )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:297:2: ()
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:298:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleRefinedExpressionConstraint652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_2, grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:307:1: ( (lv_refinement_3_0= ruleRefinement ) )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:308:1: (lv_refinement_3_0= ruleRefinement )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:308:1: (lv_refinement_3_0= ruleRefinement )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:309:3: lv_refinement_3_0= ruleRefinement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementRefinementParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRefinement_in_ruleRefinedExpressionConstraint672);
                    lv_refinement_3_0=ruleRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRefinedExpressionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"refinement",
                              		lv_refinement_3_0, 
                              		"Refinement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRefinedExpressionConstraint"


    // $ANTLR start "entryRuleDottedExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:333:1: entryRuleDottedExpressionConstraint returns [EObject current=null] : iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF ;
    public final EObject entryRuleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDottedExpressionConstraint = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:334:2: (iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:335:2: iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDottedExpressionConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleDottedExpressionConstraint_in_entryRuleDottedExpressionConstraint710);
            iv_ruleDottedExpressionConstraint=ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDottedExpressionConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDottedExpressionConstraint720); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDottedExpressionConstraint"


    // $ANTLR start "ruleDottedExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:342:1: ruleDottedExpressionConstraint returns [EObject current=null] : (this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOT_2=null;
        EObject this_SimpleExpressionConstraint_0 = null;

        EObject lv_attribute_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:345:28: ( (this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleAttribute ) ) )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:346:1: (this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleAttribute ) ) )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:346:1: (this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleAttribute ) ) )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:347:5: this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleAttribute ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getSimpleExpressionConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleExpressionConstraint_in_ruleDottedExpressionConstraint767);
            this_SimpleExpressionConstraint_0=ruleSimpleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SimpleExpressionConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:355:1: ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleAttribute ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:355:2: () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleAttribute ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:355:2: ()
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:356:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_DOT_2=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleDottedExpressionConstraint787); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DOT_2, grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:365:1: ( (lv_attribute_3_0= ruleAttribute ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:366:1: (lv_attribute_3_0= ruleAttribute )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:366:1: (lv_attribute_3_0= ruleAttribute )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:367:3: lv_attribute_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAttributeParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleDottedExpressionConstraint807);
            	    lv_attribute_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDottedExpressionConstraintRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"attribute",
            	              		lv_attribute_3_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDottedExpressionConstraint"


    // $ANTLR start "entryRuleSimpleExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:391:1: entryRuleSimpleExpressionConstraint returns [EObject current=null] : iv_ruleSimpleExpressionConstraint= ruleSimpleExpressionConstraint EOF ;
    public final EObject entryRuleSimpleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpressionConstraint = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:392:2: (iv_ruleSimpleExpressionConstraint= ruleSimpleExpressionConstraint EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:393:2: iv_ruleSimpleExpressionConstraint= ruleSimpleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpressionConstraint_in_entryRuleSimpleExpressionConstraint845);
            iv_ruleSimpleExpressionConstraint=ruleSimpleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpressionConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpressionConstraint855); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleExpressionConstraint"


    // $ANTLR start "ruleSimpleExpressionConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:400:1: ruleSimpleExpressionConstraint returns [EObject current=null] : (this_ChildOf_0= ruleChildOf | this_DescendantOf_1= ruleDescendantOf | this_DescendantOrSelfOf_2= ruleDescendantOrSelfOf | this_ParentOf_3= ruleParentOf | this_AncestorOf_4= ruleAncestorOf | this_AncestorOrSelfOf_5= ruleAncestorOrSelfOf | this_FocusConcept_6= ruleFocusConcept ) ;
    public final EObject ruleSimpleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ChildOf_0 = null;

        EObject this_DescendantOf_1 = null;

        EObject this_DescendantOrSelfOf_2 = null;

        EObject this_ParentOf_3 = null;

        EObject this_AncestorOf_4 = null;

        EObject this_AncestorOrSelfOf_5 = null;

        EObject this_FocusConcept_6 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:403:28: ( (this_ChildOf_0= ruleChildOf | this_DescendantOf_1= ruleDescendantOf | this_DescendantOrSelfOf_2= ruleDescendantOrSelfOf | this_ParentOf_3= ruleParentOf | this_AncestorOf_4= ruleAncestorOf | this_AncestorOrSelfOf_5= ruleAncestorOrSelfOf | this_FocusConcept_6= ruleFocusConcept ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:404:1: (this_ChildOf_0= ruleChildOf | this_DescendantOf_1= ruleDescendantOf | this_DescendantOrSelfOf_2= ruleDescendantOrSelfOf | this_ParentOf_3= ruleParentOf | this_AncestorOf_4= ruleAncestorOf | this_AncestorOrSelfOf_5= ruleAncestorOrSelfOf | this_FocusConcept_6= ruleFocusConcept )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:404:1: (this_ChildOf_0= ruleChildOf | this_DescendantOf_1= ruleDescendantOf | this_DescendantOrSelfOf_2= ruleDescendantOrSelfOf | this_ParentOf_3= ruleParentOf | this_AncestorOf_4= ruleAncestorOf | this_AncestorOrSelfOf_5= ruleAncestorOrSelfOf | this_FocusConcept_6= ruleFocusConcept )
            int alt6=7;
            switch ( input.LA(1) ) {
            case RULE_LT_EM:
                {
                alt6=1;
                }
                break;
            case RULE_LT:
                {
                alt6=2;
                }
                break;
            case RULE_DBL_LT:
                {
                alt6=3;
                }
                break;
            case RULE_GT_EM:
                {
                alt6=4;
                }
                break;
            case RULE_GT:
                {
                alt6=5;
                }
                break;
            case RULE_DBL_GT:
                {
                alt6=6;
                }
                break;
            case RULE_CARET:
            case RULE_WILDCARD:
            case RULE_ROUND_OPEN:
            case RULE_DIGIT_NONZERO:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:405:5: this_ChildOf_0= ruleChildOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getChildOfParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleChildOf_in_ruleSimpleExpressionConstraint902);
                    this_ChildOf_0=ruleChildOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ChildOf_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:415:5: this_DescendantOf_1= ruleDescendantOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getDescendantOfParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDescendantOf_in_ruleSimpleExpressionConstraint929);
                    this_DescendantOf_1=ruleDescendantOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DescendantOf_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:425:5: this_DescendantOrSelfOf_2= ruleDescendantOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDescendantOrSelfOf_in_ruleSimpleExpressionConstraint956);
                    this_DescendantOrSelfOf_2=ruleDescendantOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DescendantOrSelfOf_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:435:5: this_ParentOf_3= ruleParentOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getParentOfParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParentOf_in_ruleSimpleExpressionConstraint983);
                    this_ParentOf_3=ruleParentOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParentOf_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:445:5: this_AncestorOf_4= ruleAncestorOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getAncestorOfParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAncestorOf_in_ruleSimpleExpressionConstraint1010);
                    this_AncestorOf_4=ruleAncestorOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AncestorOf_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:455:5: this_AncestorOrSelfOf_5= ruleAncestorOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAncestorOrSelfOf_in_ruleSimpleExpressionConstraint1037);
                    this_AncestorOrSelfOf_5=ruleAncestorOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AncestorOrSelfOf_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:465:5: this_FocusConcept_6= ruleFocusConcept
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getFocusConceptParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFocusConcept_in_ruleSimpleExpressionConstraint1064);
                    this_FocusConcept_6=ruleFocusConcept();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FocusConcept_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleExpressionConstraint"


    // $ANTLR start "entryRuleFocusConcept"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:481:1: entryRuleFocusConcept returns [EObject current=null] : iv_ruleFocusConcept= ruleFocusConcept EOF ;
    public final EObject entryRuleFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFocusConcept = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:482:2: (iv_ruleFocusConcept= ruleFocusConcept EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:483:2: iv_ruleFocusConcept= ruleFocusConcept EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFocusConceptRule()); 
            }
            pushFollow(FOLLOW_ruleFocusConcept_in_entryRuleFocusConcept1099);
            iv_ruleFocusConcept=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFocusConcept; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFocusConcept1109); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFocusConcept"


    // $ANTLR start "ruleFocusConcept"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:490:1: ruleFocusConcept returns [EObject current=null] : (this_MemberOf_0= ruleMemberOf | this_ConceptReference_1= ruleConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) ;
    public final EObject ruleFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject this_MemberOf_0 = null;

        EObject this_ConceptReference_1 = null;

        EObject this_Any_2 = null;

        EObject this_NestedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:493:28: ( (this_MemberOf_0= ruleMemberOf | this_ConceptReference_1= ruleConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:494:1: (this_MemberOf_0= ruleMemberOf | this_ConceptReference_1= ruleConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:494:1: (this_MemberOf_0= ruleMemberOf | this_ConceptReference_1= ruleConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_CARET:
                {
                alt7=1;
                }
                break;
            case RULE_DIGIT_NONZERO:
                {
                alt7=2;
                }
                break;
            case RULE_WILDCARD:
                {
                alt7=3;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:495:5: this_MemberOf_0= ruleMemberOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFocusConceptAccess().getMemberOfParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberOf_in_ruleFocusConcept1156);
                    this_MemberOf_0=ruleMemberOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MemberOf_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:505:5: this_ConceptReference_1= ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFocusConceptAccess().getConceptReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConceptReference_in_ruleFocusConcept1183);
                    this_ConceptReference_1=ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConceptReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:515:5: this_Any_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFocusConceptAccess().getAnyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAny_in_ruleFocusConcept1210);
                    this_Any_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Any_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:525:5: this_NestedExpression_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFocusConceptAccess().getNestedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNestedExpression_in_ruleFocusConcept1237);
                    this_NestedExpression_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NestedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFocusConcept"


    // $ANTLR start "entryRuleChildOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:541:1: entryRuleChildOf returns [EObject current=null] : iv_ruleChildOf= ruleChildOf EOF ;
    public final EObject entryRuleChildOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:542:2: (iv_ruleChildOf= ruleChildOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:543:2: iv_ruleChildOf= ruleChildOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildOfRule()); 
            }
            pushFollow(FOLLOW_ruleChildOf_in_entryRuleChildOf1272);
            iv_ruleChildOf=ruleChildOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChildOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildOf1282); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChildOf"


    // $ANTLR start "ruleChildOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:550:1: ruleChildOf returns [EObject current=null] : (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleFocusConcept ) ) ) ;
    public final EObject ruleChildOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:553:28: ( (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleFocusConcept ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:554:1: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:554:1: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:554:2: this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleFocusConcept ) )
            {
            this_LT_EM_0=(Token)match(input,RULE_LT_EM,FOLLOW_RULE_LT_EM_in_ruleChildOf1318); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:558:1: ( (lv_constraint_1_0= ruleFocusConcept ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:559:1: (lv_constraint_1_0= ruleFocusConcept )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:559:1: (lv_constraint_1_0= ruleFocusConcept )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:560:3: lv_constraint_1_0= ruleFocusConcept
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChildOfAccess().getConstraintFocusConceptParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFocusConcept_in_ruleChildOf1338);
            lv_constraint_1_0=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getChildOfRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"FocusConcept");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleChildOf"


    // $ANTLR start "entryRuleDescendantOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:584:1: entryRuleDescendantOf returns [EObject current=null] : iv_ruleDescendantOf= ruleDescendantOf EOF ;
    public final EObject entryRuleDescendantOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:585:2: (iv_ruleDescendantOf= ruleDescendantOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:586:2: iv_ruleDescendantOf= ruleDescendantOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescendantOfRule()); 
            }
            pushFollow(FOLLOW_ruleDescendantOf_in_entryRuleDescendantOf1374);
            iv_ruleDescendantOf=ruleDescendantOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescendantOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescendantOf1384); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDescendantOf"


    // $ANTLR start "ruleDescendantOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:593:1: ruleDescendantOf returns [EObject current=null] : (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleFocusConcept ) ) ) ;
    public final EObject ruleDescendantOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:596:28: ( (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleFocusConcept ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:597:1: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:597:1: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:597:2: this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleFocusConcept ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleDescendantOf1420); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:601:1: ( (lv_constraint_1_0= ruleFocusConcept ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:602:1: (lv_constraint_1_0= ruleFocusConcept )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:602:1: (lv_constraint_1_0= ruleFocusConcept )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:603:3: lv_constraint_1_0= ruleFocusConcept
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDescendantOfAccess().getConstraintFocusConceptParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFocusConcept_in_ruleDescendantOf1440);
            lv_constraint_1_0=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDescendantOfRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"FocusConcept");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDescendantOf"


    // $ANTLR start "entryRuleDescendantOrSelfOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:627:1: entryRuleDescendantOrSelfOf returns [EObject current=null] : iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF ;
    public final EObject entryRuleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOrSelfOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:628:2: (iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:629:2: iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescendantOrSelfOfRule()); 
            }
            pushFollow(FOLLOW_ruleDescendantOrSelfOf_in_entryRuleDescendantOrSelfOf1476);
            iv_ruleDescendantOrSelfOf=ruleDescendantOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescendantOrSelfOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescendantOrSelfOf1486); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDescendantOrSelfOf"


    // $ANTLR start "ruleDescendantOrSelfOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:636:1: ruleDescendantOrSelfOf returns [EObject current=null] : (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleFocusConcept ) ) ) ;
    public final EObject ruleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:639:28: ( (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleFocusConcept ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:640:1: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:640:1: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:640:2: this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleFocusConcept ) )
            {
            this_DBL_LT_0=(Token)match(input,RULE_DBL_LT,FOLLOW_RULE_DBL_LT_in_ruleDescendantOrSelfOf1522); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:644:1: ( (lv_constraint_1_0= ruleFocusConcept ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:645:1: (lv_constraint_1_0= ruleFocusConcept )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:645:1: (lv_constraint_1_0= ruleFocusConcept )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:646:3: lv_constraint_1_0= ruleFocusConcept
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDescendantOrSelfOfAccess().getConstraintFocusConceptParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFocusConcept_in_ruleDescendantOrSelfOf1542);
            lv_constraint_1_0=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDescendantOrSelfOfRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"FocusConcept");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDescendantOrSelfOf"


    // $ANTLR start "entryRuleParentOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:670:1: entryRuleParentOf returns [EObject current=null] : iv_ruleParentOf= ruleParentOf EOF ;
    public final EObject entryRuleParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:671:2: (iv_ruleParentOf= ruleParentOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:672:2: iv_ruleParentOf= ruleParentOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentOfRule()); 
            }
            pushFollow(FOLLOW_ruleParentOf_in_entryRuleParentOf1578);
            iv_ruleParentOf=ruleParentOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentOf1588); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParentOf"


    // $ANTLR start "ruleParentOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:679:1: ruleParentOf returns [EObject current=null] : (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleFocusConcept ) ) ) ;
    public final EObject ruleParentOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:682:28: ( (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleFocusConcept ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:683:1: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:683:1: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:683:2: this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleFocusConcept ) )
            {
            this_GT_EM_0=(Token)match(input,RULE_GT_EM,FOLLOW_RULE_GT_EM_in_ruleParentOf1624); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:687:1: ( (lv_constraint_1_0= ruleFocusConcept ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:688:1: (lv_constraint_1_0= ruleFocusConcept )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:688:1: (lv_constraint_1_0= ruleFocusConcept )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:689:3: lv_constraint_1_0= ruleFocusConcept
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParentOfAccess().getConstraintFocusConceptParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFocusConcept_in_ruleParentOf1644);
            lv_constraint_1_0=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParentOfRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"FocusConcept");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParentOf"


    // $ANTLR start "entryRuleAncestorOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:713:1: entryRuleAncestorOf returns [EObject current=null] : iv_ruleAncestorOf= ruleAncestorOf EOF ;
    public final EObject entryRuleAncestorOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:714:2: (iv_ruleAncestorOf= ruleAncestorOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:715:2: iv_ruleAncestorOf= ruleAncestorOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAncestorOfRule()); 
            }
            pushFollow(FOLLOW_ruleAncestorOf_in_entryRuleAncestorOf1680);
            iv_ruleAncestorOf=ruleAncestorOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAncestorOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncestorOf1690); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAncestorOf"


    // $ANTLR start "ruleAncestorOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:722:1: ruleAncestorOf returns [EObject current=null] : (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleFocusConcept ) ) ) ;
    public final EObject ruleAncestorOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:725:28: ( (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleFocusConcept ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:726:1: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:726:1: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:726:2: this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleFocusConcept ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleAncestorOf1726); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:730:1: ( (lv_constraint_1_0= ruleFocusConcept ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:731:1: (lv_constraint_1_0= ruleFocusConcept )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:731:1: (lv_constraint_1_0= ruleFocusConcept )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:732:3: lv_constraint_1_0= ruleFocusConcept
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAncestorOfAccess().getConstraintFocusConceptParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFocusConcept_in_ruleAncestorOf1746);
            lv_constraint_1_0=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAncestorOfRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"FocusConcept");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAncestorOf"


    // $ANTLR start "entryRuleAncestorOrSelfOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:756:1: entryRuleAncestorOrSelfOf returns [EObject current=null] : iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF ;
    public final EObject entryRuleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOrSelfOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:757:2: (iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:758:2: iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAncestorOrSelfOfRule()); 
            }
            pushFollow(FOLLOW_ruleAncestorOrSelfOf_in_entryRuleAncestorOrSelfOf1782);
            iv_ruleAncestorOrSelfOf=ruleAncestorOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAncestorOrSelfOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncestorOrSelfOf1792); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAncestorOrSelfOf"


    // $ANTLR start "ruleAncestorOrSelfOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:765:1: ruleAncestorOrSelfOf returns [EObject current=null] : (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleFocusConcept ) ) ) ;
    public final EObject ruleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:768:28: ( (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleFocusConcept ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:769:1: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:769:1: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleFocusConcept ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:769:2: this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleFocusConcept ) )
            {
            this_DBL_GT_0=(Token)match(input,RULE_DBL_GT,FOLLOW_RULE_DBL_GT_in_ruleAncestorOrSelfOf1828); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:773:1: ( (lv_constraint_1_0= ruleFocusConcept ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:774:1: (lv_constraint_1_0= ruleFocusConcept )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:774:1: (lv_constraint_1_0= ruleFocusConcept )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:775:3: lv_constraint_1_0= ruleFocusConcept
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAncestorOrSelfOfAccess().getConstraintFocusConceptParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFocusConcept_in_ruleAncestorOrSelfOf1848);
            lv_constraint_1_0=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAncestorOrSelfOfRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"FocusConcept");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAncestorOrSelfOf"


    // $ANTLR start "entryRuleMemberOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:799:1: entryRuleMemberOf returns [EObject current=null] : iv_ruleMemberOf= ruleMemberOf EOF ;
    public final EObject entryRuleMemberOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:800:2: (iv_ruleMemberOf= ruleMemberOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:801:2: iv_ruleMemberOf= ruleMemberOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberOfRule()); 
            }
            pushFollow(FOLLOW_ruleMemberOf_in_entryRuleMemberOf1884);
            iv_ruleMemberOf=ruleMemberOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberOf1894); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMemberOf"


    // $ANTLR start "ruleMemberOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:808:1: ruleMemberOf returns [EObject current=null] : (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) ) ;
    public final EObject ruleMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:811:28: ( (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:812:1: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:812:1: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:812:2: this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleMemberOf1930); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:816:1: ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:817:1: ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:817:1: ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:818:1: (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:818:1: (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DIGIT_NONZERO) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_WILDCARD) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:819:3: lv_constraint_1_1= ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintConceptReferenceParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConceptReference_in_ruleMemberOf1952);
                    lv_constraint_1_1=ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_1_1, 
                              		"ConceptReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:834:8: lv_constraint_1_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAny_in_ruleMemberOf1971);
                    lv_constraint_1_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_1_2, 
                              		"Any");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMemberOf"


    // $ANTLR start "entryRuleConceptReference"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:860:1: entryRuleConceptReference returns [EObject current=null] : iv_ruleConceptReference= ruleConceptReference EOF ;
    public final EObject entryRuleConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptReference = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:861:2: (iv_ruleConceptReference= ruleConceptReference EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:862:2: iv_ruleConceptReference= ruleConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConceptReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleConceptReference_in_entryRuleConceptReference2010);
            iv_ruleConceptReference=ruleConceptReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConceptReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptReference2020); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConceptReference"


    // $ANTLR start "ruleConceptReference"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:869:1: ruleConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) (this_PIPE_1= RULE_PIPE ( (lv_term_2_0= ruleTerm ) ) this_PIPE_3= RULE_PIPE )? ) ;
    public final EObject ruleConceptReference() throws RecognitionException {
        EObject current = null;

        Token this_PIPE_1=null;
        Token this_PIPE_3=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_term_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:872:28: ( ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) (this_PIPE_1= RULE_PIPE ( (lv_term_2_0= ruleTerm ) ) this_PIPE_3= RULE_PIPE )? ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:873:1: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) (this_PIPE_1= RULE_PIPE ( (lv_term_2_0= ruleTerm ) ) this_PIPE_3= RULE_PIPE )? )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:873:1: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) (this_PIPE_1= RULE_PIPE ( (lv_term_2_0= ruleTerm ) ) this_PIPE_3= RULE_PIPE )? )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:873:2: ( (lv_id_0_0= ruleSnomedIdentifier ) ) (this_PIPE_1= RULE_PIPE ( (lv_term_2_0= ruleTerm ) ) this_PIPE_3= RULE_PIPE )?
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:873:2: ( (lv_id_0_0= ruleSnomedIdentifier ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:874:1: (lv_id_0_0= ruleSnomedIdentifier )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:874:1: (lv_id_0_0= ruleSnomedIdentifier )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:875:3: lv_id_0_0= ruleSnomedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSnomedIdentifier_in_ruleConceptReference2066);
            lv_id_0_0=ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConceptReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"SnomedIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:891:2: (this_PIPE_1= RULE_PIPE ( (lv_term_2_0= ruleTerm ) ) this_PIPE_3= RULE_PIPE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_PIPE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:891:3: this_PIPE_1= RULE_PIPE ( (lv_term_2_0= ruleTerm ) ) this_PIPE_3= RULE_PIPE
                    {
                    this_PIPE_1=(Token)match(input,RULE_PIPE,FOLLOW_RULE_PIPE_in_ruleConceptReference2078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PIPE_1, grammarAccess.getConceptReferenceAccess().getPIPETerminalRuleCall_1_0()); 
                          
                    }
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:895:1: ( (lv_term_2_0= ruleTerm ) )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:896:1: (lv_term_2_0= ruleTerm )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:896:1: (lv_term_2_0= ruleTerm )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:897:3: lv_term_2_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConceptReferenceAccess().getTermTermParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTerm_in_ruleConceptReference2098);
                    lv_term_2_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConceptReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_2_0, 
                              		"Term");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_PIPE_3=(Token)match(input,RULE_PIPE,FOLLOW_RULE_PIPE_in_ruleConceptReference2109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PIPE_3, grammarAccess.getConceptReferenceAccess().getPIPETerminalRuleCall_1_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConceptReference"


    // $ANTLR start "entryRuleAny"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:925:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:926:2: (iv_ruleAny= ruleAny EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:927:2: iv_ruleAny= ruleAny EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyRule()); 
            }
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny2146);
            iv_ruleAny=ruleAny();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAny; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny2156); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:934:1: ruleAny returns [EObject current=null] : (this_WILDCARD_0= RULE_WILDCARD () ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token this_WILDCARD_0=null;

         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:937:28: ( (this_WILDCARD_0= RULE_WILDCARD () ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:938:1: (this_WILDCARD_0= RULE_WILDCARD () )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:938:1: (this_WILDCARD_0= RULE_WILDCARD () )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:938:2: this_WILDCARD_0= RULE_WILDCARD ()
            {
            this_WILDCARD_0=(Token)match(input,RULE_WILDCARD,FOLLOW_RULE_WILDCARD_in_ruleAny2192); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:942:1: ()
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:943:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAnyAccess().getAnyAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:956:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:957:2: (iv_ruleRefinement= ruleRefinement EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:958:2: iv_ruleRefinement= ruleRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinementRule()); 
            }
            pushFollow(FOLLOW_ruleRefinement_in_entryRuleRefinement2236);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefinement2246); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:965:1: ruleRefinement returns [EObject current=null] : this_OrRefinement_0= ruleOrRefinement ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_OrRefinement_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:968:28: (this_OrRefinement_0= ruleOrRefinement )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:970:5: this_OrRefinement_0= ruleOrRefinement
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRefinementAccess().getOrRefinementParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrRefinement_in_ruleRefinement2292);
            this_OrRefinement_0=ruleOrRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrRefinement_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleOrRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:986:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:987:2: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:988:2: iv_ruleOrRefinement= ruleOrRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRefinementRule()); 
            }
            pushFollow(FOLLOW_ruleOrRefinement_in_entryRuleOrRefinement2326);
            iv_ruleOrRefinement=ruleOrRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrRefinement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrRefinement2336); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrRefinement"


    // $ANTLR start "ruleOrRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:995:1: ruleOrRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement ( ( RULE_OR )=> ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        Token this_OR_2=null;
        EObject this_AndRefinement_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:998:28: ( (this_AndRefinement_0= ruleAndRefinement ( ( RULE_OR )=> ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:999:1: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_OR )=> ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:999:1: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_OR )=> ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1000:5: this_AndRefinement_0= ruleAndRefinement ( ( RULE_OR )=> ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndRefinement_in_ruleOrRefinement2383);
            this_AndRefinement_0=ruleAndRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndRefinement_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1008:1: ( ( RULE_OR )=> ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_OR) ) {
                    int LA10_4 = input.LA(2);

                    if ( (synpred1_InternalEcl()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1008:2: ( RULE_OR )=> ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1008:14: ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1008:15: () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndRefinement ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1008:15: ()
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1009:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_OR_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrRefinement2409); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OR_2, grammarAccess.getOrRefinementAccess().getORTerminalRuleCall_1_0_1()); 
            	          
            	    }
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1018:1: ( (lv_right_3_0= ruleAndRefinement ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1019:1: (lv_right_3_0= ruleAndRefinement )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1019:1: (lv_right_3_0= ruleAndRefinement )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1020:3: lv_right_3_0= ruleAndRefinement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndRefinement_in_ruleOrRefinement2429);
            	    lv_right_3_0=ruleAndRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrRefinementRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndRefinement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrRefinement"


    // $ANTLR start "entryRuleAndRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1044:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1045:2: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1046:2: iv_ruleAndRefinement= ruleAndRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRefinementRule()); 
            }
            pushFollow(FOLLOW_ruleAndRefinement_in_entryRuleAndRefinement2468);
            iv_ruleAndRefinement=ruleAndRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndRefinement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndRefinement2478); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndRefinement"


    // $ANTLR start "ruleAndRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1053:1: ruleAndRefinement returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( RULE_AND | RULE_COMMA )=> ( () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) ) ) )* ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_SubRefinement_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1056:28: ( (this_SubRefinement_0= ruleSubRefinement ( ( RULE_AND | RULE_COMMA )=> ( () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) ) ) )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1057:1: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_AND | RULE_COMMA )=> ( () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) ) ) )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1057:1: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_AND | RULE_COMMA )=> ( () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) ) ) )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1058:5: this_SubRefinement_0= ruleSubRefinement ( ( RULE_AND | RULE_COMMA )=> ( () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubRefinement_in_ruleAndRefinement2525);
            this_SubRefinement_0=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubRefinement_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1066:1: ( ( RULE_AND | RULE_COMMA )=> ( () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_AND) ) {
                    int LA11_3 = input.LA(2);

                    if ( (synpred2_InternalEcl()) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==RULE_COMMA) ) {
                    int LA11_4 = input.LA(2);

                    if ( (synpred2_InternalEcl()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1066:2: ( RULE_AND | RULE_COMMA )=> ( () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1066:29: ( () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1066:30: () ruleAndOperator ( (lv_right_3_0= ruleSubRefinement ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1066:30: ()
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1067:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getAndRefinementAccess().getAndOperatorParserRuleCall_1_0_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleAndRefinement2561);
            	    ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1080:1: ( (lv_right_3_0= ruleSubRefinement ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1081:1: (lv_right_3_0= ruleSubRefinement )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1081:1: (lv_right_3_0= ruleSubRefinement )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1082:3: lv_right_3_0= ruleSubRefinement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubRefinement_in_ruleAndRefinement2581);
            	    lv_right_3_0=ruleSubRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndRefinementRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SubRefinement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndRefinement"


    // $ANTLR start "entryRuleSubRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1106:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1107:2: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1108:2: iv_ruleSubRefinement= ruleSubRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubRefinementRule()); 
            }
            pushFollow(FOLLOW_ruleSubRefinement_in_entryRuleSubRefinement2620);
            iv_ruleSubRefinement=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubRefinement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubRefinement2630); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubRefinement"


    // $ANTLR start "ruleSubRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1115:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_AttributeGroup_1= ruleAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_AttributeGroup_1 = null;

        EObject this_NestedRefinement_2 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1118:28: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_AttributeGroup_1= ruleAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1119:1: (this_AttributeConstraint_0= ruleAttributeConstraint | this_AttributeGroup_1= ruleAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1119:1: (this_AttributeConstraint_0= ruleAttributeConstraint | this_AttributeGroup_1= ruleAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1120:5: this_AttributeConstraint_0= ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeConstraint_in_ruleSubRefinement2677);
                    this_AttributeConstraint_0=ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1130:5: this_AttributeGroup_1= ruleAttributeGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeGroup_in_ruleSubRefinement2704);
                    this_AttributeGroup_1=ruleAttributeGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeGroup_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1140:5: this_NestedRefinement_2= ruleNestedRefinement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNestedRefinement_in_ruleSubRefinement2731);
                    this_NestedRefinement_2=ruleNestedRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NestedRefinement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSubRefinement"


    // $ANTLR start "entryRuleNestedRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1156:1: entryRuleNestedRefinement returns [EObject current=null] : iv_ruleNestedRefinement= ruleNestedRefinement EOF ;
    public final EObject entryRuleNestedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRefinement = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1157:2: (iv_ruleNestedRefinement= ruleNestedRefinement EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1158:2: iv_ruleNestedRefinement= ruleNestedRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedRefinementRule()); 
            }
            pushFollow(FOLLOW_ruleNestedRefinement_in_entryRuleNestedRefinement2766);
            iv_ruleNestedRefinement=ruleNestedRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedRefinement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedRefinement2776); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedRefinement"


    // $ANTLR start "ruleNestedRefinement"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1165:1: ruleNestedRefinement returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedRefinement() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1168:28: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1169:1: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1169:1: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1169:2: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FOLLOW_RULE_ROUND_OPEN_in_ruleNestedRefinement2812); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1173:1: ( (lv_nested_1_0= ruleRefinement ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1174:1: (lv_nested_1_0= ruleRefinement )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1174:1: (lv_nested_1_0= ruleRefinement )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1175:3: lv_nested_1_0= ruleRefinement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedRefinementAccess().getNestedRefinementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRefinement_in_ruleNestedRefinement2832);
            lv_nested_1_0=ruleRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedRefinementRule());
              	        }
                     		set(
                     			current, 
                     			"nested",
                      		lv_nested_1_0, 
                      		"Refinement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FOLLOW_RULE_ROUND_CLOSE_in_ruleNestedRefinement2843); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNestedRefinement"


    // $ANTLR start "entryRuleAttributeGroup"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1203:1: entryRuleAttributeGroup returns [EObject current=null] : iv_ruleAttributeGroup= ruleAttributeGroup EOF ;
    public final EObject entryRuleAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeGroup = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1204:2: (iv_ruleAttributeGroup= ruleAttributeGroup EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1205:2: iv_ruleAttributeGroup= ruleAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeGroupRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeGroup_in_entryRuleAttributeGroup2878);
            iv_ruleAttributeGroup=ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeGroup2888); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeGroup"


    // $ANTLR start "ruleAttributeGroup"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1212:1: ruleAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) ;
    public final EObject ruleAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_CURLY_CLOSE_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_refinement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1215:28: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1216:1: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1216:1: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1216:2: ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1216:2: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_SQUARE_OPEN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1217:1: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1217:1: (lv_cardinality_0_0= ruleCardinality )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1218:3: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCardinality_in_ruleAttributeGroup2934);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
                      	        }
                             		set(
                             			current, 
                             			"cardinality",
                              		lv_cardinality_0_0, 
                              		"Cardinality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_CURLY_OPEN_1=(Token)match(input,RULE_CURLY_OPEN,FOLLOW_RULE_CURLY_OPEN_in_ruleAttributeGroup2946); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CURLY_OPEN_1, grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1238:1: ( (lv_refinement_2_0= ruleAttributeSet ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1239:1: (lv_refinement_2_0= ruleAttributeSet )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1239:1: (lv_refinement_2_0= ruleAttributeSet )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1240:3: lv_refinement_2_0= ruleAttributeSet
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeGroupAccess().getRefinementAttributeSetParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttributeSet_in_ruleAttributeGroup2966);
            lv_refinement_2_0=ruleAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
              	        }
                     		set(
                     			current, 
                     			"refinement",
                      		lv_refinement_2_0, 
                      		"AttributeSet");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_CURLY_CLOSE_3=(Token)match(input,RULE_CURLY_CLOSE,FOLLOW_RULE_CURLY_CLOSE_in_ruleAttributeGroup2977); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CURLY_CLOSE_3, grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeGroup"


    // $ANTLR start "entryRuleAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1268:1: entryRuleAttributeSet returns [EObject current=null] : iv_ruleAttributeSet= ruleAttributeSet EOF ;
    public final EObject entryRuleAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSet = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1269:2: (iv_ruleAttributeSet= ruleAttributeSet EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1270:2: iv_ruleAttributeSet= ruleAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeSetRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeSet_in_entryRuleAttributeSet3012);
            iv_ruleAttributeSet=ruleAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSet3022); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeSet"


    // $ANTLR start "ruleAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1277:1: ruleAttributeSet returns [EObject current=null] : this_OrAttributeSet_0= ruleOrAttributeSet ;
    public final EObject ruleAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_OrAttributeSet_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1280:28: (this_OrAttributeSet_0= ruleOrAttributeSet )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1282:5: this_OrAttributeSet_0= ruleOrAttributeSet
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAttributeSetAccess().getOrAttributeSetParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrAttributeSet_in_ruleAttributeSet3068);
            this_OrAttributeSet_0=ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrAttributeSet_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeSet"


    // $ANTLR start "entryRuleOrAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1298:1: entryRuleOrAttributeSet returns [EObject current=null] : iv_ruleOrAttributeSet= ruleOrAttributeSet EOF ;
    public final EObject entryRuleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAttributeSet = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1299:2: (iv_ruleOrAttributeSet= ruleOrAttributeSet EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1300:2: iv_ruleOrAttributeSet= ruleOrAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAttributeSetRule()); 
            }
            pushFollow(FOLLOW_ruleOrAttributeSet_in_entryRuleOrAttributeSet3102);
            iv_ruleOrAttributeSet=ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAttributeSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrAttributeSet3112); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrAttributeSet"


    // $ANTLR start "ruleOrAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1307:1: ruleOrAttributeSet returns [EObject current=null] : (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) ;
    public final EObject ruleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_OR_2=null;
        EObject this_AndAttributeSet_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1310:28: ( (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1311:1: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1311:1: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1312:5: this_AndAttributeSet_0= ruleAndAttributeSet ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndAttributeSet_in_ruleOrAttributeSet3159);
            this_AndAttributeSet_0=ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndAttributeSet_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1320:1: ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_OR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1320:2: () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1320:2: ()
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1321:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_OR_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrAttributeSet3179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OR_2, grammarAccess.getOrAttributeSetAccess().getORTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1330:1: ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1331:1: (lv_right_3_0= ruleAndAttributeSet )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1331:1: (lv_right_3_0= ruleAndAttributeSet )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1332:3: lv_right_3_0= ruleAndAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndAttributeSet_in_ruleOrAttributeSet3199);
            	    lv_right_3_0=ruleAndAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrAttributeSetRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndAttributeSet");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrAttributeSet"


    // $ANTLR start "entryRuleAndAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1356:1: entryRuleAndAttributeSet returns [EObject current=null] : iv_ruleAndAttributeSet= ruleAndAttributeSet EOF ;
    public final EObject entryRuleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttributeSet = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1357:2: (iv_ruleAndAttributeSet= ruleAndAttributeSet EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1358:2: iv_ruleAndAttributeSet= ruleAndAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndAttributeSetRule()); 
            }
            pushFollow(FOLLOW_ruleAndAttributeSet_in_entryRuleAndAttributeSet3237);
            iv_ruleAndAttributeSet=ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndAttributeSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndAttributeSet3247); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndAttributeSet"


    // $ANTLR start "ruleAndAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1365:1: ruleAndAttributeSet returns [EObject current=null] : (this_SubAttributeSet_0= ruleSubAttributeSet ( () ruleAndOperator ( (lv_right_3_0= ruleSubAttributeSet ) ) )* ) ;
    public final EObject ruleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_SubAttributeSet_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1368:28: ( (this_SubAttributeSet_0= ruleSubAttributeSet ( () ruleAndOperator ( (lv_right_3_0= ruleSubAttributeSet ) ) )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1369:1: (this_SubAttributeSet_0= ruleSubAttributeSet ( () ruleAndOperator ( (lv_right_3_0= ruleSubAttributeSet ) ) )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1369:1: (this_SubAttributeSet_0= ruleSubAttributeSet ( () ruleAndOperator ( (lv_right_3_0= ruleSubAttributeSet ) ) )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1370:5: this_SubAttributeSet_0= ruleSubAttributeSet ( () ruleAndOperator ( (lv_right_3_0= ruleSubAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubAttributeSet_in_ruleAndAttributeSet3294);
            this_SubAttributeSet_0=ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubAttributeSet_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1378:1: ( () ruleAndOperator ( (lv_right_3_0= ruleSubAttributeSet ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_AND||LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1378:2: () ruleAndOperator ( (lv_right_3_0= ruleSubAttributeSet ) )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1378:2: ()
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1379:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getAndAttributeSetAccess().getAndOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleAndAttributeSet3319);
            	    ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1392:1: ( (lv_right_3_0= ruleSubAttributeSet ) )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1393:1: (lv_right_3_0= ruleSubAttributeSet )
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1393:1: (lv_right_3_0= ruleSubAttributeSet )
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1394:3: lv_right_3_0= ruleSubAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubAttributeSet_in_ruleAndAttributeSet3339);
            	    lv_right_3_0=ruleSubAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndAttributeSetRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SubAttributeSet");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndAttributeSet"


    // $ANTLR start "entryRuleSubAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1418:1: entryRuleSubAttributeSet returns [EObject current=null] : iv_ruleSubAttributeSet= ruleSubAttributeSet EOF ;
    public final EObject entryRuleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAttributeSet = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1419:2: (iv_ruleSubAttributeSet= ruleSubAttributeSet EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1420:2: iv_ruleSubAttributeSet= ruleSubAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubAttributeSetRule()); 
            }
            pushFollow(FOLLOW_ruleSubAttributeSet_in_entryRuleSubAttributeSet3377);
            iv_ruleSubAttributeSet=ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubAttributeSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubAttributeSet3387); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubAttributeSet"


    // $ANTLR start "ruleSubAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1427:1: ruleSubAttributeSet returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) ;
    public final EObject ruleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_NestedAttributeSet_1 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1430:28: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1431:1: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1431:1: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_LT && LA16_0<=RULE_DBL_LT)||LA16_0==RULE_WILDCARD||(LA16_0>=RULE_REVERSED && LA16_0<=RULE_SQUARE_OPEN)||LA16_0==RULE_DIGIT_NONZERO) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ROUND_OPEN) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1432:5: this_AttributeConstraint_0= ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeConstraint_in_ruleSubAttributeSet3434);
                    this_AttributeConstraint_0=ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1442:5: this_NestedAttributeSet_1= ruleNestedAttributeSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNestedAttributeSet_in_ruleSubAttributeSet3461);
                    this_NestedAttributeSet_1=ruleNestedAttributeSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NestedAttributeSet_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSubAttributeSet"


    // $ANTLR start "entryRuleNestedAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1458:1: entryRuleNestedAttributeSet returns [EObject current=null] : iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF ;
    public final EObject entryRuleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedAttributeSet = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1459:2: (iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1460:2: iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedAttributeSetRule()); 
            }
            pushFollow(FOLLOW_ruleNestedAttributeSet_in_entryRuleNestedAttributeSet3496);
            iv_ruleNestedAttributeSet=ruleNestedAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedAttributeSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedAttributeSet3506); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedAttributeSet"


    // $ANTLR start "ruleNestedAttributeSet"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1467:1: ruleNestedAttributeSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1470:28: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1471:1: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1471:1: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1471:2: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FOLLOW_RULE_ROUND_OPEN_in_ruleNestedAttributeSet3542); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1475:1: ( (lv_nested_1_0= ruleAttributeSet ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1476:1: (lv_nested_1_0= ruleAttributeSet )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1476:1: (lv_nested_1_0= ruleAttributeSet )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1477:3: lv_nested_1_0= ruleAttributeSet
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedAttributeSetAccess().getNestedAttributeSetParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttributeSet_in_ruleNestedAttributeSet3562);
            lv_nested_1_0=ruleAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedAttributeSetRule());
              	        }
                     		set(
                     			current, 
                     			"nested",
                      		lv_nested_1_0, 
                      		"AttributeSet");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FOLLOW_RULE_ROUND_CLOSE_in_ruleNestedAttributeSet3573); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNestedAttributeSet"


    // $ANTLR start "entryRuleAttributeConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1505:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1506:2: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1507:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeConstraint_in_entryRuleAttributeConstraint3608);
            iv_ruleAttributeConstraint=ruleAttributeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeConstraint3618); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeConstraint"


    // $ANTLR start "ruleAttributeConstraint"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1514:1: ruleAttributeConstraint returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleAttribute ) ) ( (lv_comparison_3_0= ruleComparison ) ) ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_comparison_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1517:28: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleAttribute ) ) ( (lv_comparison_3_0= ruleComparison ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1518:1: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleAttribute ) ) ( (lv_comparison_3_0= ruleComparison ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1518:1: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleAttribute ) ) ( (lv_comparison_3_0= ruleComparison ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1518:2: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleAttribute ) ) ( (lv_comparison_3_0= ruleComparison ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1518:2: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_SQUARE_OPEN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1519:1: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1519:1: (lv_cardinality_0_0= ruleCardinality )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1520:3: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCardinality_in_ruleAttributeConstraint3664);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"cardinality",
                              		lv_cardinality_0_0, 
                              		"Cardinality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1536:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_REVERSED) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1537:1: (lv_reversed_1_0= RULE_REVERSED )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1537:1: (lv_reversed_1_0= RULE_REVERSED )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1538:3: lv_reversed_1_0= RULE_REVERSED
                    {
                    lv_reversed_1_0=(Token)match(input,RULE_REVERSED,FOLLOW_RULE_REVERSED_in_ruleAttributeConstraint3682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_reversed_1_0, grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"reversed",
                              		true, 
                              		"REVERSED");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1554:3: ( (lv_attribute_2_0= ruleAttribute ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1555:1: (lv_attribute_2_0= ruleAttribute )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1555:1: (lv_attribute_2_0= ruleAttribute )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1556:3: lv_attribute_2_0= ruleAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeAttributeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeConstraint3709);
            lv_attribute_2_0=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"attribute",
                      		lv_attribute_2_0, 
                      		"Attribute");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1572:2: ( (lv_comparison_3_0= ruleComparison ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1573:1: (lv_comparison_3_0= ruleComparison )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1573:1: (lv_comparison_3_0= ruleComparison )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1574:3: lv_comparison_3_0= ruleComparison
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleAttributeConstraint3730);
            lv_comparison_3_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"comparison",
                      		lv_comparison_3_0, 
                      		"Comparison");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeConstraint"


    // $ANTLR start "entryRuleAttribute"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1598:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1599:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1600:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3766);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3776); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1607:1: ruleAttribute returns [EObject current=null] : (this_AttributeDescendantOf_0= ruleAttributeDescendantOf | this_AttributeDescendantOrSelfOf_1= ruleAttributeDescendantOrSelfOf | this_ConceptReference_2= ruleConceptReference | this_Any_3= ruleAny ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeDescendantOf_0 = null;

        EObject this_AttributeDescendantOrSelfOf_1 = null;

        EObject this_ConceptReference_2 = null;

        EObject this_Any_3 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1610:28: ( (this_AttributeDescendantOf_0= ruleAttributeDescendantOf | this_AttributeDescendantOrSelfOf_1= ruleAttributeDescendantOrSelfOf | this_ConceptReference_2= ruleConceptReference | this_Any_3= ruleAny ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1611:1: (this_AttributeDescendantOf_0= ruleAttributeDescendantOf | this_AttributeDescendantOrSelfOf_1= ruleAttributeDescendantOrSelfOf | this_ConceptReference_2= ruleConceptReference | this_Any_3= ruleAny )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1611:1: (this_AttributeDescendantOf_0= ruleAttributeDescendantOf | this_AttributeDescendantOrSelfOf_1= ruleAttributeDescendantOrSelfOf | this_ConceptReference_2= ruleConceptReference | this_Any_3= ruleAny )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_LT:
                {
                alt19=1;
                }
                break;
            case RULE_DBL_LT:
                {
                alt19=2;
                }
                break;
            case RULE_DIGIT_NONZERO:
                {
                alt19=3;
                }
                break;
            case RULE_WILDCARD:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1612:5: this_AttributeDescendantOf_0= ruleAttributeDescendantOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getAttributeDescendantOfParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDescendantOf_in_ruleAttribute3823);
                    this_AttributeDescendantOf_0=ruleAttributeDescendantOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeDescendantOf_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1622:5: this_AttributeDescendantOrSelfOf_1= ruleAttributeDescendantOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getAttributeDescendantOrSelfOfParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDescendantOrSelfOf_in_ruleAttribute3850);
                    this_AttributeDescendantOrSelfOf_1=ruleAttributeDescendantOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeDescendantOrSelfOf_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1632:5: this_ConceptReference_2= ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getConceptReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConceptReference_in_ruleAttribute3877);
                    this_ConceptReference_2=ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConceptReference_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1642:5: this_Any_3= ruleAny
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getAnyParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAny_in_ruleAttribute3904);
                    this_Any_3=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Any_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeDescendantOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1658:1: entryRuleAttributeDescendantOf returns [EObject current=null] : iv_ruleAttributeDescendantOf= ruleAttributeDescendantOf EOF ;
    public final EObject entryRuleAttributeDescendantOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDescendantOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1659:2: (iv_ruleAttributeDescendantOf= ruleAttributeDescendantOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1660:2: iv_ruleAttributeDescendantOf= ruleAttributeDescendantOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDescendantOfRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDescendantOf_in_entryRuleAttributeDescendantOf3939);
            iv_ruleAttributeDescendantOf=ruleAttributeDescendantOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDescendantOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDescendantOf3949); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeDescendantOf"


    // $ANTLR start "ruleAttributeDescendantOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1667:1: ruleAttributeDescendantOf returns [EObject current=null] : (this_LT_0= RULE_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) ) ;
    public final EObject ruleAttributeDescendantOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1670:28: ( (this_LT_0= RULE_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1671:1: (this_LT_0= RULE_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1671:1: (this_LT_0= RULE_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1671:2: this_LT_0= RULE_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleAttributeDescendantOf3985); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LT_0, grammarAccess.getAttributeDescendantOfAccess().getLTTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1675:1: ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1676:1: ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1676:1: ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1677:1: (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1677:1: (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DIGIT_NONZERO) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_WILDCARD) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1678:3: lv_constraint_1_1= ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDescendantOfAccess().getConstraintConceptReferenceParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConceptReference_in_ruleAttributeDescendantOf4007);
                    lv_constraint_1_1=ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDescendantOfRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_1_1, 
                              		"ConceptReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1693:8: lv_constraint_1_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDescendantOfAccess().getConstraintAnyParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAny_in_ruleAttributeDescendantOf4026);
                    lv_constraint_1_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDescendantOfRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_1_2, 
                              		"Any");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeDescendantOf"


    // $ANTLR start "entryRuleAttributeDescendantOrSelfOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1719:1: entryRuleAttributeDescendantOrSelfOf returns [EObject current=null] : iv_ruleAttributeDescendantOrSelfOf= ruleAttributeDescendantOrSelfOf EOF ;
    public final EObject entryRuleAttributeDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDescendantOrSelfOf = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1720:2: (iv_ruleAttributeDescendantOrSelfOf= ruleAttributeDescendantOrSelfOf EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1721:2: iv_ruleAttributeDescendantOrSelfOf= ruleAttributeDescendantOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDescendantOrSelfOfRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDescendantOrSelfOf_in_entryRuleAttributeDescendantOrSelfOf4065);
            iv_ruleAttributeDescendantOrSelfOf=ruleAttributeDescendantOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDescendantOrSelfOf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDescendantOrSelfOf4075); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeDescendantOrSelfOf"


    // $ANTLR start "ruleAttributeDescendantOrSelfOf"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1728:1: ruleAttributeDescendantOrSelfOf returns [EObject current=null] : (this_DBL_LT_0= RULE_DBL_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) ) ;
    public final EObject ruleAttributeDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1731:28: ( (this_DBL_LT_0= RULE_DBL_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1732:1: (this_DBL_LT_0= RULE_DBL_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1732:1: (this_DBL_LT_0= RULE_DBL_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1732:2: this_DBL_LT_0= RULE_DBL_LT ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) )
            {
            this_DBL_LT_0=(Token)match(input,RULE_DBL_LT,FOLLOW_RULE_DBL_LT_in_ruleAttributeDescendantOrSelfOf4111); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DBL_LT_0, grammarAccess.getAttributeDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1736:1: ( ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1737:1: ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1737:1: ( (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1738:1: (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1738:1: (lv_constraint_1_1= ruleConceptReference | lv_constraint_1_2= ruleAny )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DIGIT_NONZERO) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_WILDCARD) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1739:3: lv_constraint_1_1= ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDescendantOrSelfOfAccess().getConstraintConceptReferenceParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConceptReference_in_ruleAttributeDescendantOrSelfOf4133);
                    lv_constraint_1_1=ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDescendantOrSelfOfRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_1_1, 
                              		"ConceptReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1754:8: lv_constraint_1_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDescendantOrSelfOfAccess().getConstraintAnyParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAny_in_ruleAttributeDescendantOrSelfOf4152);
                    lv_constraint_1_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDescendantOrSelfOfRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_1_2, 
                              		"Any");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeDescendantOrSelfOf"


    // $ANTLR start "entryRuleCardinality"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1780:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1781:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1782:2: iv_ruleCardinality= ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality4191);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinality; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality4201); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1789:1: ruleCardinality returns [EObject current=null] : (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_SQUARE_OPEN_0=null;
        Token this_TO_2=null;
        Token this_SQUARE_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1792:28: ( (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1793:1: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1793:1: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1793:2: this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE
            {
            this_SQUARE_OPEN_0=(Token)match(input,RULE_SQUARE_OPEN,FOLLOW_RULE_SQUARE_OPEN_in_ruleCardinality4237); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1797:1: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1798:1: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1798:1: (lv_min_1_0= ruleNonNegativeInteger )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1799:3: lv_min_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonNegativeInteger_in_ruleCardinality4257);
            lv_min_1_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityRule());
              	        }
                     		set(
                     			current, 
                     			"min",
                      		lv_min_1_0, 
                      		"NonNegativeInteger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_TO_2=(Token)match(input,RULE_TO,FOLLOW_RULE_TO_in_ruleCardinality4268); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1819:1: ( (lv_max_3_0= ruleMaxValue ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1820:1: (lv_max_3_0= ruleMaxValue )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1820:1: (lv_max_3_0= ruleMaxValue )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1821:3: lv_max_3_0= ruleMaxValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxValue_in_ruleCardinality4288);
            lv_max_3_0=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCardinalityRule());
              	        }
                     		set(
                     			current, 
                     			"max",
                      		lv_max_3_0, 
                      		"MaxValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SQUARE_CLOSE_4=(Token)match(input,RULE_SQUARE_CLOSE,FOLLOW_RULE_SQUARE_CLOSE_in_ruleCardinality4299); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SQUARE_CLOSE_4, grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleComparison"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1849:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1850:2: (iv_ruleComparison= ruleComparison EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1851:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison4334);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison4344); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1858:1: ruleComparison returns [EObject current=null] : (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeComparison_0 = null;

        EObject this_DataTypeComparison_1 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1861:28: ( (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1862:1: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1862:1: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            int alt22=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=RULE_STRING && LA22_1<=RULE_HASH)) ) {
                    alt22=2;
                }
                else if ( ((LA22_1>=RULE_LT_EM && LA22_1<=RULE_CARET)||(LA22_1>=RULE_WILDCARD && LA22_1<=RULE_ROUND_OPEN)||LA22_1==RULE_DIGIT_NONZERO) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOT_EQUAL:
                {
                int LA22_2 = input.LA(2);

                if ( ((LA22_2>=RULE_LT_EM && LA22_2<=RULE_CARET)||(LA22_2>=RULE_WILDCARD && LA22_2<=RULE_ROUND_OPEN)||LA22_2==RULE_DIGIT_NONZERO) ) {
                    alt22=1;
                }
                else if ( ((LA22_2>=RULE_STRING && LA22_2<=RULE_HASH)) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LT:
            case RULE_GT:
            case RULE_GTE:
            case RULE_LTE:
                {
                alt22=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1863:5: this_AttributeComparison_0= ruleAttributeComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeComparison_in_ruleComparison4391);
                    this_AttributeComparison_0=ruleAttributeComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeComparison_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1873:5: this_DataTypeComparison_1= ruleDataTypeComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataTypeComparison_in_ruleComparison4418);
                    this_DataTypeComparison_1=ruleDataTypeComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataTypeComparison_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAttributeComparison"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1889:1: entryRuleAttributeComparison returns [EObject current=null] : iv_ruleAttributeComparison= ruleAttributeComparison EOF ;
    public final EObject entryRuleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeComparison = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1890:2: (iv_ruleAttributeComparison= ruleAttributeComparison EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1891:2: iv_ruleAttributeComparison= ruleAttributeComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeComparison_in_entryRuleAttributeComparison4453);
            iv_ruleAttributeComparison=ruleAttributeComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeComparison4463); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeComparison"


    // $ANTLR start "ruleAttributeComparison"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1898:1: ruleAttributeComparison returns [EObject current=null] : (this_AttributeValueEquals_0= ruleAttributeValueEquals | this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals ) ;
    public final EObject ruleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeValueEquals_0 = null;

        EObject this_AttributeValueNotEquals_1 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1901:28: ( (this_AttributeValueEquals_0= ruleAttributeValueEquals | this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1902:1: (this_AttributeValueEquals_0= ruleAttributeValueEquals | this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1902:1: (this_AttributeValueEquals_0= ruleAttributeValueEquals | this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_EQUAL) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_NOT_EQUAL) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1903:5: this_AttributeValueEquals_0= ruleAttributeValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeComparisonAccess().getAttributeValueEqualsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeValueEquals_in_ruleAttributeComparison4510);
                    this_AttributeValueEquals_0=ruleAttributeValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeValueEquals_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1913:5: this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeComparisonAccess().getAttributeValueNotEqualsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeValueNotEquals_in_ruleAttributeComparison4537);
                    this_AttributeValueNotEquals_1=ruleAttributeValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeValueNotEquals_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeComparison"


    // $ANTLR start "entryRuleDataTypeComparison"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1929:1: entryRuleDataTypeComparison returns [EObject current=null] : iv_ruleDataTypeComparison= ruleDataTypeComparison EOF ;
    public final EObject entryRuleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeComparison = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1930:2: (iv_ruleDataTypeComparison= ruleDataTypeComparison EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1931:2: iv_ruleDataTypeComparison= ruleDataTypeComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeComparison_in_entryRuleDataTypeComparison4572);
            iv_ruleDataTypeComparison=ruleDataTypeComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeComparison4582); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeComparison"


    // $ANTLR start "ruleDataTypeComparison"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1938:1: ruleDataTypeComparison returns [EObject current=null] : (this_StringValueEquals_0= ruleStringValueEquals | this_StringValueNotEquals_1= ruleStringValueNotEquals | this_IntegerValueEquals_2= ruleIntegerValueEquals | this_IntegerValueNotEquals_3= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_4= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_5= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_6= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_7= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_8= ruleDecimalValueEquals | this_DecimalValueNotEquals_9= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_10= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_11= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_12= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_13= ruleDecimalValueLessThanEquals ) ;
    public final EObject ruleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_StringValueEquals_0 = null;

        EObject this_StringValueNotEquals_1 = null;

        EObject this_IntegerValueEquals_2 = null;

        EObject this_IntegerValueNotEquals_3 = null;

        EObject this_IntegerValueGreaterThan_4 = null;

        EObject this_IntegerValueGreaterThanEquals_5 = null;

        EObject this_IntegerValueLessThan_6 = null;

        EObject this_IntegerValueLessThanEquals_7 = null;

        EObject this_DecimalValueEquals_8 = null;

        EObject this_DecimalValueNotEquals_9 = null;

        EObject this_DecimalValueGreaterThan_10 = null;

        EObject this_DecimalValueGreaterThanEquals_11 = null;

        EObject this_DecimalValueLessThan_12 = null;

        EObject this_DecimalValueLessThanEquals_13 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1941:28: ( (this_StringValueEquals_0= ruleStringValueEquals | this_StringValueNotEquals_1= ruleStringValueNotEquals | this_IntegerValueEquals_2= ruleIntegerValueEquals | this_IntegerValueNotEquals_3= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_4= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_5= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_6= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_7= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_8= ruleDecimalValueEquals | this_DecimalValueNotEquals_9= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_10= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_11= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_12= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_13= ruleDecimalValueLessThanEquals ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1942:1: (this_StringValueEquals_0= ruleStringValueEquals | this_StringValueNotEquals_1= ruleStringValueNotEquals | this_IntegerValueEquals_2= ruleIntegerValueEquals | this_IntegerValueNotEquals_3= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_4= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_5= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_6= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_7= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_8= ruleDecimalValueEquals | this_DecimalValueNotEquals_9= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_10= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_11= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_12= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_13= ruleDecimalValueLessThanEquals )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1942:1: (this_StringValueEquals_0= ruleStringValueEquals | this_StringValueNotEquals_1= ruleStringValueNotEquals | this_IntegerValueEquals_2= ruleIntegerValueEquals | this_IntegerValueNotEquals_3= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_4= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_5= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_6= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_7= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_8= ruleDecimalValueEquals | this_DecimalValueNotEquals_9= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_10= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_11= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_12= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_13= ruleDecimalValueLessThanEquals )
            int alt24=14;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1943:5: this_StringValueEquals_0= ruleStringValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getStringValueEqualsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValueEquals_in_ruleDataTypeComparison4629);
                    this_StringValueEquals_0=ruleStringValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValueEquals_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1953:5: this_StringValueNotEquals_1= ruleStringValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getStringValueNotEqualsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValueNotEquals_in_ruleDataTypeComparison4656);
                    this_StringValueNotEquals_1=ruleStringValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValueNotEquals_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1963:5: this_IntegerValueEquals_2= ruleIntegerValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueEqualsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValueEquals_in_ruleDataTypeComparison4683);
                    this_IntegerValueEquals_2=ruleIntegerValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerValueEquals_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1973:5: this_IntegerValueNotEquals_3= ruleIntegerValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueNotEqualsParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValueNotEquals_in_ruleDataTypeComparison4710);
                    this_IntegerValueNotEquals_3=ruleIntegerValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerValueNotEquals_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1983:5: this_IntegerValueGreaterThan_4= ruleIntegerValueGreaterThan
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValueGreaterThan_in_ruleDataTypeComparison4737);
                    this_IntegerValueGreaterThan_4=ruleIntegerValueGreaterThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerValueGreaterThan_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1993:5: this_IntegerValueGreaterThanEquals_5= ruleIntegerValueGreaterThanEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanEqualsParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValueGreaterThanEquals_in_ruleDataTypeComparison4764);
                    this_IntegerValueGreaterThanEquals_5=ruleIntegerValueGreaterThanEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerValueGreaterThanEquals_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2003:5: this_IntegerValueLessThan_6= ruleIntegerValueLessThan
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValueLessThan_in_ruleDataTypeComparison4791);
                    this_IntegerValueLessThan_6=ruleIntegerValueLessThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerValueLessThan_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2013:5: this_IntegerValueLessThanEquals_7= ruleIntegerValueLessThanEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanEqualsParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValueLessThanEquals_in_ruleDataTypeComparison4818);
                    this_IntegerValueLessThanEquals_7=ruleIntegerValueLessThanEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerValueLessThanEquals_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2023:5: this_DecimalValueEquals_8= ruleDecimalValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueEqualsParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDecimalValueEquals_in_ruleDataTypeComparison4845);
                    this_DecimalValueEquals_8=ruleDecimalValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DecimalValueEquals_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2033:5: this_DecimalValueNotEquals_9= ruleDecimalValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueNotEqualsParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDecimalValueNotEquals_in_ruleDataTypeComparison4872);
                    this_DecimalValueNotEquals_9=ruleDecimalValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DecimalValueNotEquals_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2043:5: this_DecimalValueGreaterThan_10= ruleDecimalValueGreaterThan
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDecimalValueGreaterThan_in_ruleDataTypeComparison4899);
                    this_DecimalValueGreaterThan_10=ruleDecimalValueGreaterThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DecimalValueGreaterThan_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2053:5: this_DecimalValueGreaterThanEquals_11= ruleDecimalValueGreaterThanEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanEqualsParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDecimalValueGreaterThanEquals_in_ruleDataTypeComparison4926);
                    this_DecimalValueGreaterThanEquals_11=ruleDecimalValueGreaterThanEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DecimalValueGreaterThanEquals_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2063:5: this_DecimalValueLessThan_12= ruleDecimalValueLessThan
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDecimalValueLessThan_in_ruleDataTypeComparison4953);
                    this_DecimalValueLessThan_12=ruleDecimalValueLessThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DecimalValueLessThan_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2073:5: this_DecimalValueLessThanEquals_13= ruleDecimalValueLessThanEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanEqualsParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDecimalValueLessThanEquals_in_ruleDataTypeComparison4980);
                    this_DecimalValueLessThanEquals_13=ruleDecimalValueLessThanEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DecimalValueLessThanEquals_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataTypeComparison"


    // $ANTLR start "entryRuleAttributeValueEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2089:1: entryRuleAttributeValueEquals returns [EObject current=null] : iv_ruleAttributeValueEquals= ruleAttributeValueEquals EOF ;
    public final EObject entryRuleAttributeValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2090:2: (iv_ruleAttributeValueEquals= ruleAttributeValueEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2091:2: iv_ruleAttributeValueEquals= ruleAttributeValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeValueEquals_in_entryRuleAttributeValueEquals5015);
            iv_ruleAttributeValueEquals=ruleAttributeValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValueEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueEquals5025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeValueEquals"


    // $ANTLR start "ruleAttributeValueEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2098:1: ruleAttributeValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2101:28: ( (this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2102:1: (this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2102:1: (this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2102:2: this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleAttributeValueEquals5061); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUAL_0, grammarAccess.getAttributeValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2106:1: ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2107:1: (lv_constraint_1_0= ruleSimpleExpressionConstraint )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2107:1: (lv_constraint_1_0= ruleSimpleExpressionConstraint )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2108:3: lv_constraint_1_0= ruleSimpleExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeValueEqualsAccess().getConstraintSimpleExpressionConstraintParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleExpressionConstraint_in_ruleAttributeValueEquals5081);
            lv_constraint_1_0=ruleSimpleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeValueEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"SimpleExpressionConstraint");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeValueEquals"


    // $ANTLR start "entryRuleAttributeValueNotEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2132:1: entryRuleAttributeValueNotEquals returns [EObject current=null] : iv_ruleAttributeValueNotEquals= ruleAttributeValueNotEquals EOF ;
    public final EObject entryRuleAttributeValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueNotEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2133:2: (iv_ruleAttributeValueNotEquals= ruleAttributeValueNotEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2134:2: iv_ruleAttributeValueNotEquals= ruleAttributeValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueNotEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeValueNotEquals_in_entryRuleAttributeValueNotEquals5117);
            iv_ruleAttributeValueNotEquals=ruleAttributeValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValueNotEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueNotEquals5127); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeValueNotEquals"


    // $ANTLR start "ruleAttributeValueNotEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2141:1: ruleAttributeValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2144:28: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2145:1: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2145:1: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2145:2: this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleAttributeValueNotEquals5163); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NOT_EQUAL_0, grammarAccess.getAttributeValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2149:1: ( (lv_constraint_1_0= ruleSimpleExpressionConstraint ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2150:1: (lv_constraint_1_0= ruleSimpleExpressionConstraint )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2150:1: (lv_constraint_1_0= ruleSimpleExpressionConstraint )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2151:3: lv_constraint_1_0= ruleSimpleExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintSimpleExpressionConstraintParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleExpressionConstraint_in_ruleAttributeValueNotEquals5183);
            lv_constraint_1_0=ruleSimpleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeValueNotEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"SimpleExpressionConstraint");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeValueNotEquals"


    // $ANTLR start "entryRuleStringValueEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2175:1: entryRuleStringValueEquals returns [EObject current=null] : iv_ruleStringValueEquals= ruleStringValueEquals EOF ;
    public final EObject entryRuleStringValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2176:2: (iv_ruleStringValueEquals= ruleStringValueEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2177:2: iv_ruleStringValueEquals= ruleStringValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleStringValueEquals_in_entryRuleStringValueEquals5219);
            iv_ruleStringValueEquals=ruleStringValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValueEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValueEquals5229); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValueEquals"


    // $ANTLR start "ruleStringValueEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2184:1: ruleStringValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2187:28: ( (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2188:1: (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2188:1: (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2188:2: this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleStringValueEquals5265); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUAL_0, grammarAccess.getStringValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2192:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2193:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2193:1: (lv_value_1_0= RULE_STRING )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2194:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValueEquals5281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringValueEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueEqualsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringValueEquals"


    // $ANTLR start "entryRuleStringValueNotEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2218:1: entryRuleStringValueNotEquals returns [EObject current=null] : iv_ruleStringValueNotEquals= ruleStringValueNotEquals EOF ;
    public final EObject entryRuleStringValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueNotEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2219:2: (iv_ruleStringValueNotEquals= ruleStringValueNotEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2220:2: iv_ruleStringValueNotEquals= ruleStringValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueNotEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleStringValueNotEquals_in_entryRuleStringValueNotEquals5322);
            iv_ruleStringValueNotEquals=ruleStringValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValueNotEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValueNotEquals5332); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValueNotEquals"


    // $ANTLR start "ruleStringValueNotEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2227:1: ruleStringValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2230:28: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2231:1: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2231:1: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2231:2: this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleStringValueNotEquals5368); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NOT_EQUAL_0, grammarAccess.getStringValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2235:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2236:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2236:1: (lv_value_1_0= RULE_STRING )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2237:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValueNotEquals5384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringValueNotEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueNotEqualsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringValueNotEquals"


    // $ANTLR start "entryRuleIntegerValueEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2261:1: entryRuleIntegerValueEquals returns [EObject current=null] : iv_ruleIntegerValueEquals= ruleIntegerValueEquals EOF ;
    public final EObject entryRuleIntegerValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2262:2: (iv_ruleIntegerValueEquals= ruleIntegerValueEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2263:2: iv_ruleIntegerValueEquals= ruleIntegerValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValueEquals_in_entryRuleIntegerValueEquals5425);
            iv_ruleIntegerValueEquals=ruleIntegerValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValueEquals5435); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueEquals"


    // $ANTLR start "ruleIntegerValueEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2270:1: ruleIntegerValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2273:28: ( (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2274:1: (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2274:1: (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2274:2: this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleIntegerValueEquals5471); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUAL_0, grammarAccess.getIntegerValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIntegerValueEquals5481); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getIntegerValueEqualsAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2282:1: ( (lv_value_2_0= ruleInteger ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2283:1: (lv_value_2_0= ruleInteger )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2283:1: (lv_value_2_0= ruleInteger )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2284:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValueEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleIntegerValueEquals5501);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValueEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerValueEquals"


    // $ANTLR start "entryRuleIntegerValueNotEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2308:1: entryRuleIntegerValueNotEquals returns [EObject current=null] : iv_ruleIntegerValueNotEquals= ruleIntegerValueNotEquals EOF ;
    public final EObject entryRuleIntegerValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueNotEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2309:2: (iv_ruleIntegerValueNotEquals= ruleIntegerValueNotEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2310:2: iv_ruleIntegerValueNotEquals= ruleIntegerValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueNotEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValueNotEquals_in_entryRuleIntegerValueNotEquals5537);
            iv_ruleIntegerValueNotEquals=ruleIntegerValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueNotEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValueNotEquals5547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueNotEquals"


    // $ANTLR start "ruleIntegerValueNotEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2317:1: ruleIntegerValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2320:28: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2321:1: (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2321:1: (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2321:2: this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleIntegerValueNotEquals5583); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NOT_EQUAL_0, grammarAccess.getIntegerValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIntegerValueNotEquals5593); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getIntegerValueNotEqualsAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2329:1: ( (lv_value_2_0= ruleInteger ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2330:1: (lv_value_2_0= ruleInteger )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2330:1: (lv_value_2_0= ruleInteger )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2331:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValueNotEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleIntegerValueNotEquals5613);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValueNotEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerValueNotEquals"


    // $ANTLR start "entryRuleIntegerValueGreaterThan"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2355:1: entryRuleIntegerValueGreaterThan returns [EObject current=null] : iv_ruleIntegerValueGreaterThan= ruleIntegerValueGreaterThan EOF ;
    public final EObject entryRuleIntegerValueGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueGreaterThan = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2356:2: (iv_ruleIntegerValueGreaterThan= ruleIntegerValueGreaterThan EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2357:2: iv_ruleIntegerValueGreaterThan= ruleIntegerValueGreaterThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueGreaterThanRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValueGreaterThan_in_entryRuleIntegerValueGreaterThan5649);
            iv_ruleIntegerValueGreaterThan=ruleIntegerValueGreaterThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueGreaterThan; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValueGreaterThan5659); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueGreaterThan"


    // $ANTLR start "ruleIntegerValueGreaterThan"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2364:1: ruleIntegerValueGreaterThan returns [EObject current=null] : (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueGreaterThan() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2367:28: ( (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2368:1: (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2368:1: (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2368:2: this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleIntegerValueGreaterThan5695); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_GT_0, grammarAccess.getIntegerValueGreaterThanAccess().getGTTerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIntegerValueGreaterThan5705); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getIntegerValueGreaterThanAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2376:1: ( (lv_value_2_0= ruleInteger ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2377:1: (lv_value_2_0= ruleInteger )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2377:1: (lv_value_2_0= ruleInteger )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2378:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValueGreaterThanAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleIntegerValueGreaterThan5725);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValueGreaterThanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerValueGreaterThan"


    // $ANTLR start "entryRuleIntegerValueLessThan"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2402:1: entryRuleIntegerValueLessThan returns [EObject current=null] : iv_ruleIntegerValueLessThan= ruleIntegerValueLessThan EOF ;
    public final EObject entryRuleIntegerValueLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueLessThan = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2403:2: (iv_ruleIntegerValueLessThan= ruleIntegerValueLessThan EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2404:2: iv_ruleIntegerValueLessThan= ruleIntegerValueLessThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueLessThanRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValueLessThan_in_entryRuleIntegerValueLessThan5761);
            iv_ruleIntegerValueLessThan=ruleIntegerValueLessThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueLessThan; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValueLessThan5771); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueLessThan"


    // $ANTLR start "ruleIntegerValueLessThan"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2411:1: ruleIntegerValueLessThan returns [EObject current=null] : (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueLessThan() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2414:28: ( (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2415:1: (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2415:1: (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2415:2: this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleIntegerValueLessThan5807); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LT_0, grammarAccess.getIntegerValueLessThanAccess().getLTTerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIntegerValueLessThan5817); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getIntegerValueLessThanAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2423:1: ( (lv_value_2_0= ruleInteger ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2424:1: (lv_value_2_0= ruleInteger )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2424:1: (lv_value_2_0= ruleInteger )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2425:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValueLessThanAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleIntegerValueLessThan5837);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValueLessThanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerValueLessThan"


    // $ANTLR start "entryRuleIntegerValueGreaterThanEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2449:1: entryRuleIntegerValueGreaterThanEquals returns [EObject current=null] : iv_ruleIntegerValueGreaterThanEquals= ruleIntegerValueGreaterThanEquals EOF ;
    public final EObject entryRuleIntegerValueGreaterThanEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueGreaterThanEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2450:2: (iv_ruleIntegerValueGreaterThanEquals= ruleIntegerValueGreaterThanEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2451:2: iv_ruleIntegerValueGreaterThanEquals= ruleIntegerValueGreaterThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueGreaterThanEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValueGreaterThanEquals_in_entryRuleIntegerValueGreaterThanEquals5873);
            iv_ruleIntegerValueGreaterThanEquals=ruleIntegerValueGreaterThanEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueGreaterThanEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValueGreaterThanEquals5883); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueGreaterThanEquals"


    // $ANTLR start "ruleIntegerValueGreaterThanEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2458:1: ruleIntegerValueGreaterThanEquals returns [EObject current=null] : (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueGreaterThanEquals() throws RecognitionException {
        EObject current = null;

        Token this_GTE_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2461:28: ( (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2462:1: (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2462:1: (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2462:2: this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_GTE_0=(Token)match(input,RULE_GTE,FOLLOW_RULE_GTE_in_ruleIntegerValueGreaterThanEquals5919); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_GTE_0, grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIntegerValueGreaterThanEquals5929); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getIntegerValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2470:1: ( (lv_value_2_0= ruleInteger ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2471:1: (lv_value_2_0= ruleInteger )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2471:1: (lv_value_2_0= ruleInteger )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2472:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleIntegerValueGreaterThanEquals5949);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValueGreaterThanEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerValueGreaterThanEquals"


    // $ANTLR start "entryRuleIntegerValueLessThanEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2496:1: entryRuleIntegerValueLessThanEquals returns [EObject current=null] : iv_ruleIntegerValueLessThanEquals= ruleIntegerValueLessThanEquals EOF ;
    public final EObject entryRuleIntegerValueLessThanEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueLessThanEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2497:2: (iv_ruleIntegerValueLessThanEquals= ruleIntegerValueLessThanEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2498:2: iv_ruleIntegerValueLessThanEquals= ruleIntegerValueLessThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueLessThanEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValueLessThanEquals_in_entryRuleIntegerValueLessThanEquals5985);
            iv_ruleIntegerValueLessThanEquals=ruleIntegerValueLessThanEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueLessThanEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValueLessThanEquals5995); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueLessThanEquals"


    // $ANTLR start "ruleIntegerValueLessThanEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2505:1: ruleIntegerValueLessThanEquals returns [EObject current=null] : (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueLessThanEquals() throws RecognitionException {
        EObject current = null;

        Token this_LTE_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2508:28: ( (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2509:1: (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2509:1: (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2509:2: this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_LTE_0=(Token)match(input,RULE_LTE,FOLLOW_RULE_LTE_in_ruleIntegerValueLessThanEquals6031); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LTE_0, grammarAccess.getIntegerValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIntegerValueLessThanEquals6041); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getIntegerValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2517:1: ( (lv_value_2_0= ruleInteger ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2518:1: (lv_value_2_0= ruleInteger )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2518:1: (lv_value_2_0= ruleInteger )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2519:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleIntegerValueLessThanEquals6061);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValueLessThanEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerValueLessThanEquals"


    // $ANTLR start "entryRuleDecimalValueEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2543:1: entryRuleDecimalValueEquals returns [EObject current=null] : iv_ruleDecimalValueEquals= ruleDecimalValueEquals EOF ;
    public final EObject entryRuleDecimalValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2544:2: (iv_ruleDecimalValueEquals= ruleDecimalValueEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2545:2: iv_ruleDecimalValueEquals= ruleDecimalValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleDecimalValueEquals_in_entryRuleDecimalValueEquals6097);
            iv_ruleDecimalValueEquals=ruleDecimalValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalValueEquals6107); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueEquals"


    // $ANTLR start "ruleDecimalValueEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2552:1: ruleDecimalValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2555:28: ( (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2556:1: (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2556:1: (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2556:2: this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleDecimalValueEquals6143); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUAL_0, grammarAccess.getDecimalValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDecimalValueEquals6153); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getDecimalValueEqualsAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2564:1: ( (lv_value_2_0= ruleDecimal ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2565:1: (lv_value_2_0= ruleDecimal )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2565:1: (lv_value_2_0= ruleDecimal )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2566:3: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDecimalValueEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDecimal_in_ruleDecimalValueEquals6173);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDecimalValueEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Decimal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDecimalValueEquals"


    // $ANTLR start "entryRuleDecimalValueNotEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2590:1: entryRuleDecimalValueNotEquals returns [EObject current=null] : iv_ruleDecimalValueNotEquals= ruleDecimalValueNotEquals EOF ;
    public final EObject entryRuleDecimalValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueNotEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2591:2: (iv_ruleDecimalValueNotEquals= ruleDecimalValueNotEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2592:2: iv_ruleDecimalValueNotEquals= ruleDecimalValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueNotEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleDecimalValueNotEquals_in_entryRuleDecimalValueNotEquals6209);
            iv_ruleDecimalValueNotEquals=ruleDecimalValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueNotEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalValueNotEquals6219); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueNotEquals"


    // $ANTLR start "ruleDecimalValueNotEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2599:1: ruleDecimalValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2602:28: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2603:1: (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2603:1: (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2603:2: this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleDecimalValueNotEquals6255); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NOT_EQUAL_0, grammarAccess.getDecimalValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDecimalValueNotEquals6265); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getDecimalValueNotEqualsAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2611:1: ( (lv_value_2_0= ruleDecimal ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2612:1: (lv_value_2_0= ruleDecimal )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2612:1: (lv_value_2_0= ruleDecimal )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2613:3: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDecimalValueNotEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDecimal_in_ruleDecimalValueNotEquals6285);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDecimalValueNotEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Decimal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDecimalValueNotEquals"


    // $ANTLR start "entryRuleDecimalValueGreaterThan"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2637:1: entryRuleDecimalValueGreaterThan returns [EObject current=null] : iv_ruleDecimalValueGreaterThan= ruleDecimalValueGreaterThan EOF ;
    public final EObject entryRuleDecimalValueGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueGreaterThan = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2638:2: (iv_ruleDecimalValueGreaterThan= ruleDecimalValueGreaterThan EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2639:2: iv_ruleDecimalValueGreaterThan= ruleDecimalValueGreaterThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueGreaterThanRule()); 
            }
            pushFollow(FOLLOW_ruleDecimalValueGreaterThan_in_entryRuleDecimalValueGreaterThan6321);
            iv_ruleDecimalValueGreaterThan=ruleDecimalValueGreaterThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueGreaterThan; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalValueGreaterThan6331); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueGreaterThan"


    // $ANTLR start "ruleDecimalValueGreaterThan"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2646:1: ruleDecimalValueGreaterThan returns [EObject current=null] : (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueGreaterThan() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2649:28: ( (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2650:1: (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2650:1: (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2650:2: this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleDecimalValueGreaterThan6367); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_GT_0, grammarAccess.getDecimalValueGreaterThanAccess().getGTTerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDecimalValueGreaterThan6377); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getDecimalValueGreaterThanAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2658:1: ( (lv_value_2_0= ruleDecimal ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2659:1: (lv_value_2_0= ruleDecimal )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2659:1: (lv_value_2_0= ruleDecimal )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2660:3: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDecimalValueGreaterThanAccess().getValueDecimalParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDecimal_in_ruleDecimalValueGreaterThan6397);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDecimalValueGreaterThanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Decimal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDecimalValueGreaterThan"


    // $ANTLR start "entryRuleDecimalValueLessThan"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2684:1: entryRuleDecimalValueLessThan returns [EObject current=null] : iv_ruleDecimalValueLessThan= ruleDecimalValueLessThan EOF ;
    public final EObject entryRuleDecimalValueLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueLessThan = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2685:2: (iv_ruleDecimalValueLessThan= ruleDecimalValueLessThan EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2686:2: iv_ruleDecimalValueLessThan= ruleDecimalValueLessThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueLessThanRule()); 
            }
            pushFollow(FOLLOW_ruleDecimalValueLessThan_in_entryRuleDecimalValueLessThan6433);
            iv_ruleDecimalValueLessThan=ruleDecimalValueLessThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueLessThan; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalValueLessThan6443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueLessThan"


    // $ANTLR start "ruleDecimalValueLessThan"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2693:1: ruleDecimalValueLessThan returns [EObject current=null] : (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueLessThan() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2696:28: ( (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2697:1: (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2697:1: (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2697:2: this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleDecimalValueLessThan6479); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LT_0, grammarAccess.getDecimalValueLessThanAccess().getLTTerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDecimalValueLessThan6489); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getDecimalValueLessThanAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2705:1: ( (lv_value_2_0= ruleDecimal ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2706:1: (lv_value_2_0= ruleDecimal )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2706:1: (lv_value_2_0= ruleDecimal )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2707:3: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDecimalValueLessThanAccess().getValueDecimalParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDecimal_in_ruleDecimalValueLessThan6509);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDecimalValueLessThanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Decimal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDecimalValueLessThan"


    // $ANTLR start "entryRuleDecimalValueGreaterThanEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2731:1: entryRuleDecimalValueGreaterThanEquals returns [EObject current=null] : iv_ruleDecimalValueGreaterThanEquals= ruleDecimalValueGreaterThanEquals EOF ;
    public final EObject entryRuleDecimalValueGreaterThanEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueGreaterThanEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2732:2: (iv_ruleDecimalValueGreaterThanEquals= ruleDecimalValueGreaterThanEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2733:2: iv_ruleDecimalValueGreaterThanEquals= ruleDecimalValueGreaterThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueGreaterThanEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleDecimalValueGreaterThanEquals_in_entryRuleDecimalValueGreaterThanEquals6545);
            iv_ruleDecimalValueGreaterThanEquals=ruleDecimalValueGreaterThanEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueGreaterThanEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalValueGreaterThanEquals6555); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueGreaterThanEquals"


    // $ANTLR start "ruleDecimalValueGreaterThanEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2740:1: ruleDecimalValueGreaterThanEquals returns [EObject current=null] : (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueGreaterThanEquals() throws RecognitionException {
        EObject current = null;

        Token this_GTE_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2743:28: ( (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2744:1: (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2744:1: (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2744:2: this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_GTE_0=(Token)match(input,RULE_GTE,FOLLOW_RULE_GTE_in_ruleDecimalValueGreaterThanEquals6591); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_GTE_0, grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDecimalValueGreaterThanEquals6601); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getDecimalValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2752:1: ( (lv_value_2_0= ruleDecimal ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2753:1: (lv_value_2_0= ruleDecimal )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2753:1: (lv_value_2_0= ruleDecimal )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2754:3: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDecimal_in_ruleDecimalValueGreaterThanEquals6621);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDecimalValueGreaterThanEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Decimal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDecimalValueGreaterThanEquals"


    // $ANTLR start "entryRuleDecimalValueLessThanEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2778:1: entryRuleDecimalValueLessThanEquals returns [EObject current=null] : iv_ruleDecimalValueLessThanEquals= ruleDecimalValueLessThanEquals EOF ;
    public final EObject entryRuleDecimalValueLessThanEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueLessThanEquals = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2779:2: (iv_ruleDecimalValueLessThanEquals= ruleDecimalValueLessThanEquals EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2780:2: iv_ruleDecimalValueLessThanEquals= ruleDecimalValueLessThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueLessThanEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleDecimalValueLessThanEquals_in_entryRuleDecimalValueLessThanEquals6657);
            iv_ruleDecimalValueLessThanEquals=ruleDecimalValueLessThanEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueLessThanEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalValueLessThanEquals6667); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueLessThanEquals"


    // $ANTLR start "ruleDecimalValueLessThanEquals"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2787:1: ruleDecimalValueLessThanEquals returns [EObject current=null] : (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueLessThanEquals() throws RecognitionException {
        EObject current = null;

        Token this_LTE_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2790:28: ( (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2791:1: (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2791:1: (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2791:2: this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_LTE_0=(Token)match(input,RULE_LTE,FOLLOW_RULE_LTE_in_ruleDecimalValueLessThanEquals6703); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LTE_0, grammarAccess.getDecimalValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); 
                  
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDecimalValueLessThanEquals6713); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASH_1, grammarAccess.getDecimalValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2799:1: ( (lv_value_2_0= ruleDecimal ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2800:1: (lv_value_2_0= ruleDecimal )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2800:1: (lv_value_2_0= ruleDecimal )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2801:3: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDecimal_in_ruleDecimalValueLessThanEquals6733);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDecimalValueLessThanEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Decimal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDecimalValueLessThanEquals"


    // $ANTLR start "entryRuleNestedExpression"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2825:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2826:2: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2827:2: iv_ruleNestedExpression= ruleNestedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNestedExpression_in_entryRuleNestedExpression6769);
            iv_ruleNestedExpression=ruleNestedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedExpression6779); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpression"


    // $ANTLR start "ruleNestedExpression"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2834:1: ruleNestedExpression returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2837:28: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2838:1: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2838:1: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2838:2: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FOLLOW_RULE_ROUND_OPEN_in_ruleNestedExpression6815); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2842:1: ( (lv_nested_1_0= ruleExpressionConstraint ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2843:1: (lv_nested_1_0= ruleExpressionConstraint )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2843:1: (lv_nested_1_0= ruleExpressionConstraint )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2844:3: lv_nested_1_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionConstraint_in_ruleNestedExpression6835);
            lv_nested_1_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"nested",
                      		lv_nested_1_0, 
                      		"ExpressionConstraint");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FOLLOW_RULE_ROUND_CLOSE_in_ruleNestedExpression6846); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNestedExpression"


    // $ANTLR start "entryRuleSnomedIdentifier"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2872:1: entryRuleSnomedIdentifier returns [String current=null] : iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF ;
    public final String entryRuleSnomedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSnomedIdentifier = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2876:2: (iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2877:2: iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSnomedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleSnomedIdentifier_in_entryRuleSnomedIdentifier6888);
            iv_ruleSnomedIdentifier=ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSnomedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSnomedIdentifier6899); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSnomedIdentifier"


    // $ANTLR start "ruleSnomedIdentifier"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2887:1: ruleSnomedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ ) ;
    public final AntlrDatatypeRuleToken ruleSnomedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_NONZERO_1=null;
        Token this_ZERO_2=null;
        Token this_DIGIT_NONZERO_3=null;
        Token this_ZERO_4=null;
        Token this_DIGIT_NONZERO_5=null;
        Token this_ZERO_6=null;
        Token this_DIGIT_NONZERO_7=null;
        Token this_ZERO_8=null;
        Token this_DIGIT_NONZERO_9=null;
        Token this_ZERO_10=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2891:28: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2892:1: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2892:1: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2892:6: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+
            {
            this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier6943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DIGIT_NONZERO_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2899:1: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DIGIT_NONZERO) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ZERO) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2899:6: this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_1=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier6964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_NONZERO_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_NONZERO_1, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2907:10: this_ZERO_2= RULE_ZERO
                    {
                    this_ZERO_2=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier6990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ZERO_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ZERO_2, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2914:2: (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DIGIT_NONZERO) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ZERO) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2914:7: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier7012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_NONZERO_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_NONZERO_3, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2922:10: this_ZERO_4= RULE_ZERO
                    {
                    this_ZERO_4=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier7038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ZERO_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ZERO_4, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); 
                          
                    }

                    }
                    break;

            }

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2929:2: (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DIGIT_NONZERO) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ZERO) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2929:7: this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_5=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier7060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_NONZERO_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_NONZERO_5, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2937:10: this_ZERO_6= RULE_ZERO
                    {
                    this_ZERO_6=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier7086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ZERO_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ZERO_6, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); 
                          
                    }

                    }
                    break;

            }

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2944:2: (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DIGIT_NONZERO) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ZERO) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2944:7: this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_7=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier7108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_NONZERO_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_NONZERO_7, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2952:10: this_ZERO_8= RULE_ZERO
                    {
                    this_ZERO_8=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier7134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ZERO_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ZERO_8, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); 
                          
                    }

                    }
                    break;

            }

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2959:2: (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+
            int cnt29=0;
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_DIGIT_NONZERO) ) {
                    alt29=1;
                }
                else if ( (LA29_0==RULE_ZERO) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2959:7: this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_9=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier7156); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DIGIT_NONZERO_9);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DIGIT_NONZERO_9, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2967:10: this_ZERO_10= RULE_ZERO
            	    {
            	    this_ZERO_10=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier7182); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ZERO_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ZERO_10, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSnomedIdentifier"


    // $ANTLR start "entryRuleTerm"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2985:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2989:2: (iv_ruleTerm= ruleTerm EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:2990:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm7240);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm7251); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3000:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TermCharacter_0= ruleTermCharacter )+ ( (this_WS_1= RULE_WS )+ (this_TermCharacter_2= ruleTermCharacter )+ )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_1=null;
        AntlrDatatypeRuleToken this_TermCharacter_0 = null;

        AntlrDatatypeRuleToken this_TermCharacter_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3004:28: ( ( (this_TermCharacter_0= ruleTermCharacter )+ ( (this_WS_1= RULE_WS )+ (this_TermCharacter_2= ruleTermCharacter )+ )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3005:1: ( (this_TermCharacter_0= ruleTermCharacter )+ ( (this_WS_1= RULE_WS )+ (this_TermCharacter_2= ruleTermCharacter )+ )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3005:1: ( (this_TermCharacter_0= ruleTermCharacter )+ ( (this_WS_1= RULE_WS )+ (this_TermCharacter_2= ruleTermCharacter )+ )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3005:2: (this_TermCharacter_0= ruleTermCharacter )+ ( (this_WS_1= RULE_WS )+ (this_TermCharacter_2= ruleTermCharacter )+ )*
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3005:2: (this_TermCharacter_0= ruleTermCharacter )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_OR && LA30_0<=RULE_CARET)||(LA30_0>=RULE_WILDCARD && LA30_0<=RULE_NOT_EQUAL)||(LA30_0>=RULE_HASH && LA30_0<=RULE_ZERO)||(LA30_0>=RULE_AND && LA30_0<=RULE_OTHER_CHARACTER)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3006:5: this_TermCharacter_0= ruleTermCharacter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTermAccess().getTermCharacterParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTermCharacter_in_ruleTerm7303);
            	    this_TermCharacter_0=ruleTermCharacter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TermCharacter_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3016:3: ( (this_WS_1= RULE_WS )+ (this_TermCharacter_2= ruleTermCharacter )+ )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3016:4: (this_WS_1= RULE_WS )+ (this_TermCharacter_2= ruleTermCharacter )+
            	    {
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3016:4: (this_WS_1= RULE_WS )+
            	    int cnt31=0;
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==RULE_WS) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3016:9: this_WS_1= RULE_WS
            	    	    {
            	    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTerm7327); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_WS_1);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_1, grammarAccess.getTermAccess().getWSTerminalRuleCall_1_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt31 >= 1 ) break loop31;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(31, input);
            	                throw eee;
            	        }
            	        cnt31++;
            	    } while (true);

            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3023:3: (this_TermCharacter_2= ruleTermCharacter )+
            	    int cnt32=0;
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( ((LA32_0>=RULE_OR && LA32_0<=RULE_CARET)||(LA32_0>=RULE_WILDCARD && LA32_0<=RULE_NOT_EQUAL)||(LA32_0>=RULE_HASH && LA32_0<=RULE_ZERO)||(LA32_0>=RULE_AND && LA32_0<=RULE_OTHER_CHARACTER)) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3024:5: this_TermCharacter_2= ruleTermCharacter
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getTermAccess().getTermCharacterParserRuleCall_1_1()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleTermCharacter_in_ruleTerm7357);
            	    	    this_TermCharacter_2=ruleTermCharacter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_TermCharacter_2);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt32 >= 1 ) break loop32;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(32, input);
            	                throw eee;
            	        }
            	        cnt32++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleTermCharacter"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3045:1: entryRuleTermCharacter returns [String current=null] : iv_ruleTermCharacter= ruleTermCharacter EOF ;
    public final String entryRuleTermCharacter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTermCharacter = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3049:2: (iv_ruleTermCharacter= ruleTermCharacter EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3050:2: iv_ruleTermCharacter= ruleTermCharacter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleTermCharacter_in_entryRuleTermCharacter7417);
            iv_ruleTermCharacter=ruleTermCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermCharacter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermCharacter7428); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTermCharacter"


    // $ANTLR start "ruleTermCharacter"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3060:1: ruleTermCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LT_0= RULE_LT | this_GT_1= RULE_GT | this_DBL_LT_2= RULE_DBL_LT | this_DBL_GT_3= RULE_DBL_GT | this_LT_EM_4= RULE_LT_EM | this_GT_EM_5= RULE_GT_EM | this_GTE_6= RULE_GTE | this_LTE_7= RULE_LTE | this_AND_8= RULE_AND | this_OR_9= RULE_OR | this_NOT_10= RULE_NOT | this_MINUS_11= RULE_MINUS | this_ZERO_12= RULE_ZERO | this_DIGIT_NONZERO_13= RULE_DIGIT_NONZERO | this_LETTER_14= RULE_LETTER | this_CARET_15= RULE_CARET | this_EQUAL_16= RULE_EQUAL | this_NOT_EQUAL_17= RULE_NOT_EQUAL | this_PLUS_18= RULE_PLUS | this_CURLY_OPEN_19= RULE_CURLY_OPEN | this_CURLY_CLOSE_20= RULE_CURLY_CLOSE | this_ROUND_OPEN_21= RULE_ROUND_OPEN | this_ROUND_CLOSE_22= RULE_ROUND_CLOSE | this_SQUARE_OPEN_23= RULE_SQUARE_OPEN | this_SQUARE_CLOSE_24= RULE_SQUARE_CLOSE | this_DOT_25= RULE_DOT | this_COLON_26= RULE_COLON | this_COMMA_27= RULE_COMMA | this_REVERSED_28= RULE_REVERSED | this_TO_29= RULE_TO | this_WILDCARD_30= RULE_WILDCARD | this_HASH_31= RULE_HASH | this_DASH_32= RULE_DASH | this_OTHER_CHARACTER_33= RULE_OTHER_CHARACTER ) ;
    public final AntlrDatatypeRuleToken ruleTermCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LT_0=null;
        Token this_GT_1=null;
        Token this_DBL_LT_2=null;
        Token this_DBL_GT_3=null;
        Token this_LT_EM_4=null;
        Token this_GT_EM_5=null;
        Token this_GTE_6=null;
        Token this_LTE_7=null;
        Token this_AND_8=null;
        Token this_OR_9=null;
        Token this_NOT_10=null;
        Token this_MINUS_11=null;
        Token this_ZERO_12=null;
        Token this_DIGIT_NONZERO_13=null;
        Token this_LETTER_14=null;
        Token this_CARET_15=null;
        Token this_EQUAL_16=null;
        Token this_NOT_EQUAL_17=null;
        Token this_PLUS_18=null;
        Token this_CURLY_OPEN_19=null;
        Token this_CURLY_CLOSE_20=null;
        Token this_ROUND_OPEN_21=null;
        Token this_ROUND_CLOSE_22=null;
        Token this_SQUARE_OPEN_23=null;
        Token this_SQUARE_CLOSE_24=null;
        Token this_DOT_25=null;
        Token this_COLON_26=null;
        Token this_COMMA_27=null;
        Token this_REVERSED_28=null;
        Token this_TO_29=null;
        Token this_WILDCARD_30=null;
        Token this_HASH_31=null;
        Token this_DASH_32=null;
        Token this_OTHER_CHARACTER_33=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3064:28: ( (this_LT_0= RULE_LT | this_GT_1= RULE_GT | this_DBL_LT_2= RULE_DBL_LT | this_DBL_GT_3= RULE_DBL_GT | this_LT_EM_4= RULE_LT_EM | this_GT_EM_5= RULE_GT_EM | this_GTE_6= RULE_GTE | this_LTE_7= RULE_LTE | this_AND_8= RULE_AND | this_OR_9= RULE_OR | this_NOT_10= RULE_NOT | this_MINUS_11= RULE_MINUS | this_ZERO_12= RULE_ZERO | this_DIGIT_NONZERO_13= RULE_DIGIT_NONZERO | this_LETTER_14= RULE_LETTER | this_CARET_15= RULE_CARET | this_EQUAL_16= RULE_EQUAL | this_NOT_EQUAL_17= RULE_NOT_EQUAL | this_PLUS_18= RULE_PLUS | this_CURLY_OPEN_19= RULE_CURLY_OPEN | this_CURLY_CLOSE_20= RULE_CURLY_CLOSE | this_ROUND_OPEN_21= RULE_ROUND_OPEN | this_ROUND_CLOSE_22= RULE_ROUND_CLOSE | this_SQUARE_OPEN_23= RULE_SQUARE_OPEN | this_SQUARE_CLOSE_24= RULE_SQUARE_CLOSE | this_DOT_25= RULE_DOT | this_COLON_26= RULE_COLON | this_COMMA_27= RULE_COMMA | this_REVERSED_28= RULE_REVERSED | this_TO_29= RULE_TO | this_WILDCARD_30= RULE_WILDCARD | this_HASH_31= RULE_HASH | this_DASH_32= RULE_DASH | this_OTHER_CHARACTER_33= RULE_OTHER_CHARACTER ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3065:1: (this_LT_0= RULE_LT | this_GT_1= RULE_GT | this_DBL_LT_2= RULE_DBL_LT | this_DBL_GT_3= RULE_DBL_GT | this_LT_EM_4= RULE_LT_EM | this_GT_EM_5= RULE_GT_EM | this_GTE_6= RULE_GTE | this_LTE_7= RULE_LTE | this_AND_8= RULE_AND | this_OR_9= RULE_OR | this_NOT_10= RULE_NOT | this_MINUS_11= RULE_MINUS | this_ZERO_12= RULE_ZERO | this_DIGIT_NONZERO_13= RULE_DIGIT_NONZERO | this_LETTER_14= RULE_LETTER | this_CARET_15= RULE_CARET | this_EQUAL_16= RULE_EQUAL | this_NOT_EQUAL_17= RULE_NOT_EQUAL | this_PLUS_18= RULE_PLUS | this_CURLY_OPEN_19= RULE_CURLY_OPEN | this_CURLY_CLOSE_20= RULE_CURLY_CLOSE | this_ROUND_OPEN_21= RULE_ROUND_OPEN | this_ROUND_CLOSE_22= RULE_ROUND_CLOSE | this_SQUARE_OPEN_23= RULE_SQUARE_OPEN | this_SQUARE_CLOSE_24= RULE_SQUARE_CLOSE | this_DOT_25= RULE_DOT | this_COLON_26= RULE_COLON | this_COMMA_27= RULE_COMMA | this_REVERSED_28= RULE_REVERSED | this_TO_29= RULE_TO | this_WILDCARD_30= RULE_WILDCARD | this_HASH_31= RULE_HASH | this_DASH_32= RULE_DASH | this_OTHER_CHARACTER_33= RULE_OTHER_CHARACTER )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3065:1: (this_LT_0= RULE_LT | this_GT_1= RULE_GT | this_DBL_LT_2= RULE_DBL_LT | this_DBL_GT_3= RULE_DBL_GT | this_LT_EM_4= RULE_LT_EM | this_GT_EM_5= RULE_GT_EM | this_GTE_6= RULE_GTE | this_LTE_7= RULE_LTE | this_AND_8= RULE_AND | this_OR_9= RULE_OR | this_NOT_10= RULE_NOT | this_MINUS_11= RULE_MINUS | this_ZERO_12= RULE_ZERO | this_DIGIT_NONZERO_13= RULE_DIGIT_NONZERO | this_LETTER_14= RULE_LETTER | this_CARET_15= RULE_CARET | this_EQUAL_16= RULE_EQUAL | this_NOT_EQUAL_17= RULE_NOT_EQUAL | this_PLUS_18= RULE_PLUS | this_CURLY_OPEN_19= RULE_CURLY_OPEN | this_CURLY_CLOSE_20= RULE_CURLY_CLOSE | this_ROUND_OPEN_21= RULE_ROUND_OPEN | this_ROUND_CLOSE_22= RULE_ROUND_CLOSE | this_SQUARE_OPEN_23= RULE_SQUARE_OPEN | this_SQUARE_CLOSE_24= RULE_SQUARE_CLOSE | this_DOT_25= RULE_DOT | this_COLON_26= RULE_COLON | this_COMMA_27= RULE_COMMA | this_REVERSED_28= RULE_REVERSED | this_TO_29= RULE_TO | this_WILDCARD_30= RULE_WILDCARD | this_HASH_31= RULE_HASH | this_DASH_32= RULE_DASH | this_OTHER_CHARACTER_33= RULE_OTHER_CHARACTER )
            int alt34=34;
            switch ( input.LA(1) ) {
            case RULE_LT:
                {
                alt34=1;
                }
                break;
            case RULE_GT:
                {
                alt34=2;
                }
                break;
            case RULE_DBL_LT:
                {
                alt34=3;
                }
                break;
            case RULE_DBL_GT:
                {
                alt34=4;
                }
                break;
            case RULE_LT_EM:
                {
                alt34=5;
                }
                break;
            case RULE_GT_EM:
                {
                alt34=6;
                }
                break;
            case RULE_GTE:
                {
                alt34=7;
                }
                break;
            case RULE_LTE:
                {
                alt34=8;
                }
                break;
            case RULE_AND:
                {
                alt34=9;
                }
                break;
            case RULE_OR:
                {
                alt34=10;
                }
                break;
            case RULE_NOT:
                {
                alt34=11;
                }
                break;
            case RULE_MINUS:
                {
                alt34=12;
                }
                break;
            case RULE_ZERO:
                {
                alt34=13;
                }
                break;
            case RULE_DIGIT_NONZERO:
                {
                alt34=14;
                }
                break;
            case RULE_LETTER:
                {
                alt34=15;
                }
                break;
            case RULE_CARET:
                {
                alt34=16;
                }
                break;
            case RULE_EQUAL:
                {
                alt34=17;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt34=18;
                }
                break;
            case RULE_PLUS:
                {
                alt34=19;
                }
                break;
            case RULE_CURLY_OPEN:
                {
                alt34=20;
                }
                break;
            case RULE_CURLY_CLOSE:
                {
                alt34=21;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt34=22;
                }
                break;
            case RULE_ROUND_CLOSE:
                {
                alt34=23;
                }
                break;
            case RULE_SQUARE_OPEN:
                {
                alt34=24;
                }
                break;
            case RULE_SQUARE_CLOSE:
                {
                alt34=25;
                }
                break;
            case RULE_DOT:
                {
                alt34=26;
                }
                break;
            case RULE_COLON:
                {
                alt34=27;
                }
                break;
            case RULE_COMMA:
                {
                alt34=28;
                }
                break;
            case RULE_REVERSED:
                {
                alt34=29;
                }
                break;
            case RULE_TO:
                {
                alt34=30;
                }
                break;
            case RULE_WILDCARD:
                {
                alt34=31;
                }
                break;
            case RULE_HASH:
                {
                alt34=32;
                }
                break;
            case RULE_DASH:
                {
                alt34=33;
                }
                break;
            case RULE_OTHER_CHARACTER:
                {
                alt34=34;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3065:6: this_LT_0= RULE_LT
                    {
                    this_LT_0=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleTermCharacter7472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LT_0, grammarAccess.getTermCharacterAccess().getLTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3073:10: this_GT_1= RULE_GT
                    {
                    this_GT_1=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleTermCharacter7498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_GT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_GT_1, grammarAccess.getTermCharacterAccess().getGTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3081:10: this_DBL_LT_2= RULE_DBL_LT
                    {
                    this_DBL_LT_2=(Token)match(input,RULE_DBL_LT,FOLLOW_RULE_DBL_LT_in_ruleTermCharacter7524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DBL_LT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DBL_LT_2, grammarAccess.getTermCharacterAccess().getDBL_LTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3089:10: this_DBL_GT_3= RULE_DBL_GT
                    {
                    this_DBL_GT_3=(Token)match(input,RULE_DBL_GT,FOLLOW_RULE_DBL_GT_in_ruleTermCharacter7550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DBL_GT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DBL_GT_3, grammarAccess.getTermCharacterAccess().getDBL_GTTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3097:10: this_LT_EM_4= RULE_LT_EM
                    {
                    this_LT_EM_4=(Token)match(input,RULE_LT_EM,FOLLOW_RULE_LT_EM_in_ruleTermCharacter7576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LT_EM_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LT_EM_4, grammarAccess.getTermCharacterAccess().getLT_EMTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3105:10: this_GT_EM_5= RULE_GT_EM
                    {
                    this_GT_EM_5=(Token)match(input,RULE_GT_EM,FOLLOW_RULE_GT_EM_in_ruleTermCharacter7602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_GT_EM_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_GT_EM_5, grammarAccess.getTermCharacterAccess().getGT_EMTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3113:10: this_GTE_6= RULE_GTE
                    {
                    this_GTE_6=(Token)match(input,RULE_GTE,FOLLOW_RULE_GTE_in_ruleTermCharacter7628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_GTE_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_GTE_6, grammarAccess.getTermCharacterAccess().getGTETerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3121:10: this_LTE_7= RULE_LTE
                    {
                    this_LTE_7=(Token)match(input,RULE_LTE,FOLLOW_RULE_LTE_in_ruleTermCharacter7654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LTE_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LTE_7, grammarAccess.getTermCharacterAccess().getLTETerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3129:10: this_AND_8= RULE_AND
                    {
                    this_AND_8=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleTermCharacter7680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_8, grammarAccess.getTermCharacterAccess().getANDTerminalRuleCall_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3137:10: this_OR_9= RULE_OR
                    {
                    this_OR_9=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleTermCharacter7706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_9, grammarAccess.getTermCharacterAccess().getORTerminalRuleCall_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3145:10: this_NOT_10= RULE_NOT
                    {
                    this_NOT_10=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleTermCharacter7732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_10, grammarAccess.getTermCharacterAccess().getNOTTerminalRuleCall_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3153:10: this_MINUS_11= RULE_MINUS
                    {
                    this_MINUS_11=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleTermCharacter7758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_11, grammarAccess.getTermCharacterAccess().getMINUSTerminalRuleCall_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3161:10: this_ZERO_12= RULE_ZERO
                    {
                    this_ZERO_12=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleTermCharacter7784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ZERO_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ZERO_12, grammarAccess.getTermCharacterAccess().getZEROTerminalRuleCall_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3169:10: this_DIGIT_NONZERO_13= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_13=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleTermCharacter7810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_NONZERO_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_NONZERO_13, grammarAccess.getTermCharacterAccess().getDIGIT_NONZEROTerminalRuleCall_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3177:10: this_LETTER_14= RULE_LETTER
                    {
                    this_LETTER_14=(Token)match(input,RULE_LETTER,FOLLOW_RULE_LETTER_in_ruleTermCharacter7836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LETTER_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LETTER_14, grammarAccess.getTermCharacterAccess().getLETTERTerminalRuleCall_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3185:10: this_CARET_15= RULE_CARET
                    {
                    this_CARET_15=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleTermCharacter7862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_15, grammarAccess.getTermCharacterAccess().getCARETTerminalRuleCall_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3193:10: this_EQUAL_16= RULE_EQUAL
                    {
                    this_EQUAL_16=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleTermCharacter7888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUAL_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_16, grammarAccess.getTermCharacterAccess().getEQUALTerminalRuleCall_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3201:10: this_NOT_EQUAL_17= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_17=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleTermCharacter7914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_EQUAL_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_EQUAL_17, grammarAccess.getTermCharacterAccess().getNOT_EQUALTerminalRuleCall_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3209:10: this_PLUS_18= RULE_PLUS
                    {
                    this_PLUS_18=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleTermCharacter7940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_18, grammarAccess.getTermCharacterAccess().getPLUSTerminalRuleCall_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3217:10: this_CURLY_OPEN_19= RULE_CURLY_OPEN
                    {
                    this_CURLY_OPEN_19=(Token)match(input,RULE_CURLY_OPEN,FOLLOW_RULE_CURLY_OPEN_in_ruleTermCharacter7966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CURLY_OPEN_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CURLY_OPEN_19, grammarAccess.getTermCharacterAccess().getCURLY_OPENTerminalRuleCall_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3225:10: this_CURLY_CLOSE_20= RULE_CURLY_CLOSE
                    {
                    this_CURLY_CLOSE_20=(Token)match(input,RULE_CURLY_CLOSE,FOLLOW_RULE_CURLY_CLOSE_in_ruleTermCharacter7992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CURLY_CLOSE_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CURLY_CLOSE_20, grammarAccess.getTermCharacterAccess().getCURLY_CLOSETerminalRuleCall_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3233:10: this_ROUND_OPEN_21= RULE_ROUND_OPEN
                    {
                    this_ROUND_OPEN_21=(Token)match(input,RULE_ROUND_OPEN,FOLLOW_RULE_ROUND_OPEN_in_ruleTermCharacter8018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ROUND_OPEN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ROUND_OPEN_21, grammarAccess.getTermCharacterAccess().getROUND_OPENTerminalRuleCall_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3241:10: this_ROUND_CLOSE_22= RULE_ROUND_CLOSE
                    {
                    this_ROUND_CLOSE_22=(Token)match(input,RULE_ROUND_CLOSE,FOLLOW_RULE_ROUND_CLOSE_in_ruleTermCharacter8044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ROUND_CLOSE_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ROUND_CLOSE_22, grammarAccess.getTermCharacterAccess().getROUND_CLOSETerminalRuleCall_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3249:10: this_SQUARE_OPEN_23= RULE_SQUARE_OPEN
                    {
                    this_SQUARE_OPEN_23=(Token)match(input,RULE_SQUARE_OPEN,FOLLOW_RULE_SQUARE_OPEN_in_ruleTermCharacter8070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SQUARE_OPEN_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_OPEN_23, grammarAccess.getTermCharacterAccess().getSQUARE_OPENTerminalRuleCall_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3257:10: this_SQUARE_CLOSE_24= RULE_SQUARE_CLOSE
                    {
                    this_SQUARE_CLOSE_24=(Token)match(input,RULE_SQUARE_CLOSE,FOLLOW_RULE_SQUARE_CLOSE_in_ruleTermCharacter8096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SQUARE_CLOSE_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_CLOSE_24, grammarAccess.getTermCharacterAccess().getSQUARE_CLOSETerminalRuleCall_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3265:10: this_DOT_25= RULE_DOT
                    {
                    this_DOT_25=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleTermCharacter8122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_25);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_25, grammarAccess.getTermCharacterAccess().getDOTTerminalRuleCall_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3273:10: this_COLON_26= RULE_COLON
                    {
                    this_COLON_26=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleTermCharacter8148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_26);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_26, grammarAccess.getTermCharacterAccess().getCOLONTerminalRuleCall_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3281:10: this_COMMA_27= RULE_COMMA
                    {
                    this_COMMA_27=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleTermCharacter8174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_27);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_27, grammarAccess.getTermCharacterAccess().getCOMMATerminalRuleCall_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3289:10: this_REVERSED_28= RULE_REVERSED
                    {
                    this_REVERSED_28=(Token)match(input,RULE_REVERSED,FOLLOW_RULE_REVERSED_in_ruleTermCharacter8200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REVERSED_28);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REVERSED_28, grammarAccess.getTermCharacterAccess().getREVERSEDTerminalRuleCall_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3297:10: this_TO_29= RULE_TO
                    {
                    this_TO_29=(Token)match(input,RULE_TO,FOLLOW_RULE_TO_in_ruleTermCharacter8226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TO_29);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TO_29, grammarAccess.getTermCharacterAccess().getTOTerminalRuleCall_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3305:10: this_WILDCARD_30= RULE_WILDCARD
                    {
                    this_WILDCARD_30=(Token)match(input,RULE_WILDCARD,FOLLOW_RULE_WILDCARD_in_ruleTermCharacter8252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WILDCARD_30);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WILDCARD_30, grammarAccess.getTermCharacterAccess().getWILDCARDTerminalRuleCall_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3313:10: this_HASH_31= RULE_HASH
                    {
                    this_HASH_31=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleTermCharacter8278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_31);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_31, grammarAccess.getTermCharacterAccess().getHASHTerminalRuleCall_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3321:10: this_DASH_32= RULE_DASH
                    {
                    this_DASH_32=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleTermCharacter8304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_32);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_32, grammarAccess.getTermCharacterAccess().getDASHTerminalRuleCall_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3329:10: this_OTHER_CHARACTER_33= RULE_OTHER_CHARACTER
                    {
                    this_OTHER_CHARACTER_33=(Token)match(input,RULE_OTHER_CHARACTER,FOLLOW_RULE_OTHER_CHARACTER_in_ruleTermCharacter8330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OTHER_CHARACTER_33);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OTHER_CHARACTER_33, grammarAccess.getTermCharacterAccess().getOTHER_CHARACTERTerminalRuleCall_33()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTermCharacter"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3347:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3351:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3352:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonNegativeIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleNonNegativeInteger_in_entryRuleNonNegativeInteger8386);
            iv_ruleNonNegativeInteger=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonNegativeInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonNegativeInteger8397); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3362:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ZERO_0=null;
        Token this_DIGIT_NONZERO_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_ZERO_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3366:28: ( (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3367:1: (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3367:1: (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ZERO) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_DIGIT_NONZERO) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3367:6: this_ZERO_0= RULE_ZERO
                    {
                    this_ZERO_0=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleNonNegativeInteger8441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ZERO_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ZERO_0, grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3375:6: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
                    {
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3375:6: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3375:11: this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
                    {
                    this_DIGIT_NONZERO_1=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleNonNegativeInteger8468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_NONZERO_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_NONZERO_1, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
                          
                    }
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3382:1: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
                    loop35:
                    do {
                        int alt35=3;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_DIGIT_NONZERO) ) {
                            alt35=1;
                        }
                        else if ( (LA35_0==RULE_ZERO) ) {
                            alt35=2;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3382:6: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
                    	    {
                    	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleNonNegativeInteger8489); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_DIGIT_NONZERO_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3390:10: this_ZERO_3= RULE_ZERO
                    	    {
                    	    this_ZERO_3=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleNonNegativeInteger8515); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ZERO_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ZERO_3, grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleMaxValue"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3408:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3412:2: (iv_ruleMaxValue= ruleMaxValue EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3413:2: iv_ruleMaxValue= ruleMaxValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxValueRule()); 
            }
            pushFollow(FOLLOW_ruleMaxValue_in_entryRuleMaxValue8574);
            iv_ruleMaxValue=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxValue8585); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMaxValue"


    // $ANTLR start "ruleMaxValue"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3423:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WILDCARD_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3427:28: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3428:1: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3428:1: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_DIGIT_NONZERO && LA37_0<=RULE_ZERO)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_WILDCARD) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3429:5: this_NonNegativeInteger_0= ruleNonNegativeInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNonNegativeInteger_in_ruleMaxValue8636);
                    this_NonNegativeInteger_0=ruleNonNegativeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NonNegativeInteger_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3440:10: this_WILDCARD_1= RULE_WILDCARD
                    {
                    this_WILDCARD_1=(Token)match(input,RULE_WILDCARD,FOLLOW_RULE_WILDCARD_in_ruleMaxValue8662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WILDCARD_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WILDCARD_1, grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMaxValue"


    // $ANTLR start "entryRuleAndOperator"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3458:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3462:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3463:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator8718);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator8729); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3473:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AND_0= RULE_AND | this_COMMA_1= RULE_COMMA ) ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AND_0=null;
        Token this_COMMA_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3477:28: ( (this_AND_0= RULE_AND | this_COMMA_1= RULE_COMMA ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3478:1: (this_AND_0= RULE_AND | this_COMMA_1= RULE_COMMA )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3478:1: (this_AND_0= RULE_AND | this_COMMA_1= RULE_COMMA )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_AND) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_COMMA) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3478:6: this_AND_0= RULE_AND
                    {
                    this_AND_0=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleAndOperator8773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_0, grammarAccess.getAndOperatorAccess().getANDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3486:10: this_COMMA_1= RULE_COMMA
                    {
                    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleAndOperator8799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_1, grammarAccess.getAndOperatorAccess().getCOMMATerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleInteger"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3504:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3508:2: (iv_ruleInteger= ruleInteger EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3509:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger8855);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger8866); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3519:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3523:28: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3524:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3524:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3524:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3524:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_PLUS) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_DASH) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3524:7: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleInteger8911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3532:10: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleInteger8937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_1, grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleNonNegativeInteger_in_ruleInteger8966);
            this_NonNegativeInteger_2=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NonNegativeInteger_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDecimal"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3561:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3565:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3566:2: iv_ruleDecimal= ruleDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalRule()); 
            }
            pushFollow(FOLLOW_ruleDecimal_in_entryRuleDecimal9022);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimal9033); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3576:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeDecimal_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3580:28: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3581:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3581:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3581:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3581:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_PLUS) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_DASH) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3581:7: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleDecimal9078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3589:10: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleDecimal9104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_1, grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleNonNegativeDecimal_in_ruleDecimal9133);
            this_NonNegativeDecimal_2=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NonNegativeDecimal_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleNonNegativeDecimal"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3618:1: entryRuleNonNegativeDecimal returns [String current=null] : iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF ;
    public final String entryRuleNonNegativeDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeDecimal = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3622:2: (iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3623:2: iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonNegativeDecimalRule()); 
            }
            pushFollow(FOLLOW_ruleNonNegativeDecimal_in_entryRuleNonNegativeDecimal9189);
            iv_ruleNonNegativeDecimal=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonNegativeDecimal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonNegativeDecimal9200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeDecimal"


    // $ANTLR start "ruleNonNegativeDecimal"
    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3633:1: ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_ZERO_3=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3637:28: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3638:1: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
            {
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3638:1: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3639:5: this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNonNegativeInteger_in_ruleNonNegativeDecimal9251);
            this_NonNegativeInteger_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NonNegativeInteger_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleNonNegativeDecimal9271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DOT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); 
                  
            }
            // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3656:1: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_DIGIT_NONZERO) ) {
                    alt41=1;
                }
                else if ( (LA41_0==RULE_ZERO) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3656:6: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FOLLOW_RULE_DIGIT_NONZERO_in_ruleNonNegativeDecimal9292); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DIGIT_NONZERO_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:3664:10: this_ZERO_3= RULE_ZERO
            	    {
            	    this_ZERO_3=(Token)match(input,RULE_ZERO,FOLLOW_RULE_ZERO_in_ruleNonNegativeDecimal9318); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ZERO_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ZERO_3, grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeDecimal"

    // $ANTLR start synpred1_InternalEcl
    public final void synpred1_InternalEcl_fragment() throws RecognitionException {   
        // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1008:2: ( RULE_OR )
        // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1008:4: RULE_OR
        {
        match(input,RULE_OR,FOLLOW_RULE_OR_in_synpred1_InternalEcl2394); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEcl

    // $ANTLR start synpred2_InternalEcl
    public final void synpred2_InternalEcl_fragment() throws RecognitionException {   
        // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:1066:2: ( RULE_AND | RULE_COMMA )
        // ../com.b2international.snowowl.snomed.ecl/src-gen/com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.g:
        {
        if ( input.LA(1)==RULE_AND||input.LA(1)==RULE_COMMA ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred2_InternalEcl

    // Delegated rules

    public final boolean synpred2_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA12_eotS =
        "\20\uffff";
    static final String DFA12_eofS =
        "\20\uffff";
    static final String DFA12_minS =
        "\1\11\1\37\3\uffff\2\27\1\20\2\27\3\30\1\11\2\30";
    static final String DFA12_maxS =
        "\1\37\1\40\3\uffff\1\27\4\40\1\30\1\40\1\30\1\37\2\40";
    static final String DFA12_acceptS =
        "\2\uffff\1\1\1\2\1\3\13\uffff";
    static final String DFA12_specialS =
        "\20\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\2\5\uffff\1\2\1\4\1\uffff\1\3\1\uffff\1\2\1\1\10\uffff\1\2",
            "\1\6\1\5",
            "",
            "",
            "",
            "\1\7",
            "\1\7\7\uffff\1\10\1\11",
            "\1\14\16\uffff\1\13\1\12",
            "\1\7\7\uffff\1\10\1\11",
            "\1\7\7\uffff\1\10\1\11",
            "\1\15",
            "\1\15\6\uffff\1\16\1\17",
            "\1\15",
            "\2\2\5\uffff\1\2\2\uffff\1\3\1\uffff\1\2\11\uffff\1\2",
            "\1\15\6\uffff\1\16\1\17",
            "\1\15\6\uffff\1\16\1\17"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1119:1: (this_AttributeConstraint_0= ruleAttributeConstraint | this_AttributeGroup_1= ruleAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )";
        }
    }
    static final String DFA24_eotS =
        "\77\uffff";
    static final String DFA24_eofS =
        "\21\uffff\2\47\2\uffff\2\54\2\uffff\2\57\2\uffff\2\63\2\uffff\2\70\2\uffff\2\74\2\uffff\2\47\2\uffff\2\54\2\uffff\2\57\2\uffff\2\63\2\uffff\2\70\2\uffff\2\74";
    static final String DFA24_minS =
        "\1\11\2\33\4\34\1\37\2\uffff\7\37\2\4\2\37\2\4\2\37\2\4\2\37\2\4\2\37\2\4\2\37\2\4\2\uffff\2\4\2\uffff\2\4\2\uffff\2\4\2\uffff\2\4\2\uffff\2\4\2\uffff\2\4";
    static final String DFA24_maxS =
        "\1\36\6\34\1\47\2\uffff\5\47\2\40\2\46\2\40\2\46\2\40\2\46\2\40\2\46\2\40\2\46\2\40\2\46\2\uffff\2\46\2\uffff\2\46\2\uffff\2\46\2\uffff\2\46\2\uffff\2\46\2\uffff\2\46";
    static final String DFA24_acceptS =
        "\10\uffff\1\1\1\2\35\uffff\1\3\1\11\2\uffff\1\12\1\4\2\uffff\1\5\1\13\2\uffff\1\6\1\14\2\uffff\1\15\1\7\2\uffff\1\16\1\10\2\uffff";
    static final String DFA24_specialS =
        "\77\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\5\2\uffff\1\3\14\uffff\1\1\1\2\2\uffff\1\4\1\6",
            "\1\10\1\7",
            "\1\11\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\22\1\21\4\uffff\1\17\1\uffff\1\20",
            "",
            "",
            "\1\26\1\25\4\uffff\1\23\1\uffff\1\24",
            "\1\32\1\31\4\uffff\1\27\1\uffff\1\30",
            "\1\36\1\35\4\uffff\1\33\1\uffff\1\34",
            "\1\42\1\41\4\uffff\1\37\1\uffff\1\40",
            "\1\46\1\45\4\uffff\1\43\1\uffff\1\44",
            "\1\22\1\21",
            "\1\22\1\21",
            "\2\47\1\uffff\1\50\12\uffff\1\47\1\uffff\1\47\15\uffff\1\47\3\uffff\1\47",
            "\2\47\1\uffff\1\50\12\uffff\1\47\1\uffff\1\47\12\uffff\1\51\1\52\1\uffff\1\47\3\uffff\1\47",
            "\1\26\1\25",
            "\1\26\1\25",
            "\2\54\1\uffff\1\53\12\uffff\1\54\1\uffff\1\54\15\uffff\1\54\3\uffff\1\54",
            "\2\54\1\uffff\1\53\12\uffff\1\54\1\uffff\1\54\12\uffff\1\55\1\56\1\uffff\1\54\3\uffff\1\54",
            "\1\32\1\31",
            "\1\32\1\31",
            "\2\57\1\uffff\1\60\12\uffff\1\57\1\uffff\1\57\15\uffff\1\57\3\uffff\1\57",
            "\2\57\1\uffff\1\60\12\uffff\1\57\1\uffff\1\57\12\uffff\1\61\1\62\1\uffff\1\57\3\uffff\1\57",
            "\1\36\1\35",
            "\1\36\1\35",
            "\2\63\1\uffff\1\64\12\uffff\1\63\1\uffff\1\63\15\uffff\1\63\3\uffff\1\63",
            "\2\63\1\uffff\1\64\12\uffff\1\63\1\uffff\1\63\12\uffff\1\65\1\66\1\uffff\1\63\3\uffff\1\63",
            "\1\42\1\41",
            "\1\42\1\41",
            "\2\70\1\uffff\1\67\12\uffff\1\70\1\uffff\1\70\15\uffff\1\70\3\uffff\1\70",
            "\2\70\1\uffff\1\67\12\uffff\1\70\1\uffff\1\70\12\uffff\1\71\1\72\1\uffff\1\70\3\uffff\1\70",
            "\1\46\1\45",
            "\1\46\1\45",
            "\2\74\1\uffff\1\73\12\uffff\1\74\1\uffff\1\74\15\uffff\1\74\3\uffff\1\74",
            "\2\74\1\uffff\1\73\12\uffff\1\74\1\uffff\1\74\12\uffff\1\75\1\76\1\uffff\1\74\3\uffff\1\74",
            "",
            "",
            "\2\47\1\uffff\1\50\12\uffff\1\47\1\uffff\1\47\12\uffff\1\51\1\52\1\uffff\1\47\3\uffff\1\47",
            "\2\47\1\uffff\1\50\12\uffff\1\47\1\uffff\1\47\12\uffff\1\51\1\52\1\uffff\1\47\3\uffff\1\47",
            "",
            "",
            "\2\54\1\uffff\1\53\12\uffff\1\54\1\uffff\1\54\12\uffff\1\55\1\56\1\uffff\1\54\3\uffff\1\54",
            "\2\54\1\uffff\1\53\12\uffff\1\54\1\uffff\1\54\12\uffff\1\55\1\56\1\uffff\1\54\3\uffff\1\54",
            "",
            "",
            "\2\57\1\uffff\1\60\12\uffff\1\57\1\uffff\1\57\12\uffff\1\61\1\62\1\uffff\1\57\3\uffff\1\57",
            "\2\57\1\uffff\1\60\12\uffff\1\57\1\uffff\1\57\12\uffff\1\61\1\62\1\uffff\1\57\3\uffff\1\57",
            "",
            "",
            "\2\63\1\uffff\1\64\12\uffff\1\63\1\uffff\1\63\12\uffff\1\65\1\66\1\uffff\1\63\3\uffff\1\63",
            "\2\63\1\uffff\1\64\12\uffff\1\63\1\uffff\1\63\12\uffff\1\65\1\66\1\uffff\1\63\3\uffff\1\63",
            "",
            "",
            "\2\70\1\uffff\1\67\12\uffff\1\70\1\uffff\1\70\12\uffff\1\71\1\72\1\uffff\1\70\3\uffff\1\70",
            "\2\70\1\uffff\1\67\12\uffff\1\70\1\uffff\1\70\12\uffff\1\71\1\72\1\uffff\1\70\3\uffff\1\70",
            "",
            "",
            "\2\74\1\uffff\1\73\12\uffff\1\74\1\uffff\1\74\12\uffff\1\75\1\76\1\uffff\1\74\3\uffff\1\74",
            "\2\74\1\uffff\1\73\12\uffff\1\74\1\uffff\1\74\12\uffff\1\75\1\76\1\uffff\1\74\3\uffff\1\74"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1942:1: (this_StringValueEquals_0= ruleStringValueEquals | this_StringValueNotEquals_1= ruleStringValueNotEquals | this_IntegerValueEquals_2= ruleIntegerValueEquals | this_IntegerValueNotEquals_3= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_4= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_5= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_6= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_7= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_8= ruleDecimalValueEquals | this_DecimalValueNotEquals_9= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_10= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_11= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_12= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_13= ruleDecimalValueLessThanEquals )";
        }
    }
 

    public static final BitSet FOLLOW_ruleExpressionConstraint_in_entryRuleExpressionConstraint75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionConstraint85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpressionConstraint_in_ruleExpressionConstraint131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpressionConstraint_in_entryRuleOrExpressionConstraint165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpressionConstraint175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpressionConstraint_in_ruleOrExpressionConstraint222 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrExpressionConstraint242 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleAndExpressionConstraint_in_ruleOrExpressionConstraint262 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAndExpressionConstraint_in_entryRuleAndExpressionConstraint300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpressionConstraint310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExclusionExpressionConstraint_in_ruleAndExpressionConstraint357 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpressionConstraint382 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleExclusionExpressionConstraint_in_ruleAndExpressionConstraint402 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_ruleExclusionExpressionConstraint_in_entryRuleExclusionExpressionConstraint440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExclusionExpressionConstraint450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinedExpressionConstraint_in_ruleExclusionExpressionConstraint497 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleExclusionExpressionConstraint517 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleRefinedExpressionConstraint_in_ruleExclusionExpressionConstraint537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinedExpressionConstraint_in_entryRuleRefinedExpressionConstraint575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinedExpressionConstraint585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDottedExpressionConstraint_in_ruleRefinedExpressionConstraint632 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleRefinedExpressionConstraint652 = new BitSet(new long[]{0x00000000806B0600L});
    public static final BitSet FOLLOW_ruleRefinement_in_ruleRefinedExpressionConstraint672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDottedExpressionConstraint_in_entryRuleDottedExpressionConstraint710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDottedExpressionConstraint720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpressionConstraint_in_ruleDottedExpressionConstraint767 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleDottedExpressionConstraint787 = new BitSet(new long[]{0x0000000080610600L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDottedExpressionConstraint807 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleSimpleExpressionConstraint_in_entryRuleSimpleExpressionConstraint845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpressionConstraint855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildOf_in_ruleSimpleExpressionConstraint902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescendantOf_in_ruleSimpleExpressionConstraint929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescendantOrSelfOf_in_ruleSimpleExpressionConstraint956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentOf_in_ruleSimpleExpressionConstraint983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncestorOf_in_ruleSimpleExpressionConstraint1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncestorOrSelfOf_in_ruleSimpleExpressionConstraint1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFocusConcept_in_ruleSimpleExpressionConstraint1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFocusConcept_in_entryRuleFocusConcept1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFocusConcept1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberOf_in_ruleFocusConcept1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptReference_in_ruleFocusConcept1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_ruleFocusConcept1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedExpression_in_ruleFocusConcept1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildOf_in_entryRuleChildOf1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildOf1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_EM_in_ruleChildOf1318 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleFocusConcept_in_ruleChildOf1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescendantOf_in_entryRuleDescendantOf1374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescendantOf1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleDescendantOf1420 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleFocusConcept_in_ruleDescendantOf1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescendantOrSelfOf_in_entryRuleDescendantOrSelfOf1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescendantOrSelfOf1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DBL_LT_in_ruleDescendantOrSelfOf1522 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleFocusConcept_in_ruleDescendantOrSelfOf1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentOf_in_entryRuleParentOf1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentOf1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_EM_in_ruleParentOf1624 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleFocusConcept_in_ruleParentOf1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncestorOf_in_entryRuleAncestorOf1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncestorOf1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleAncestorOf1726 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleFocusConcept_in_ruleAncestorOf1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncestorOrSelfOf_in_entryRuleAncestorOrSelfOf1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncestorOrSelfOf1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DBL_GT_in_ruleAncestorOrSelfOf1828 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleFocusConcept_in_ruleAncestorOrSelfOf1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberOf_in_entryRuleMemberOf1884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberOf1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleMemberOf1930 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_ruleConceptReference_in_ruleMemberOf1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_ruleMemberOf1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptReference_in_entryRuleConceptReference2010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptReference2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSnomedIdentifier_in_ruleConceptReference2066 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_PIPE_in_ruleConceptReference2078 = new BitSet(new long[]{0x000001FDF7FF7FF0L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleConceptReference2098 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_PIPE_in_ruleConceptReference2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny2146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WILDCARD_in_ruleAny2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefinement_in_entryRuleRefinement2236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefinement2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrRefinement_in_ruleRefinement2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrRefinement_in_entryRuleOrRefinement2326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrRefinement2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndRefinement_in_ruleOrRefinement2383 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrRefinement2409 = new BitSet(new long[]{0x00000000806B0600L});
    public static final BitSet FOLLOW_ruleAndRefinement_in_ruleOrRefinement2429 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAndRefinement_in_entryRuleAndRefinement2468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndRefinement2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubRefinement_in_ruleAndRefinement2525 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndRefinement2561 = new BitSet(new long[]{0x00000000806B0600L});
    public static final BitSet FOLLOW_ruleSubRefinement_in_ruleAndRefinement2581 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_ruleSubRefinement_in_entryRuleSubRefinement2620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubRefinement2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstraint_in_ruleSubRefinement2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeGroup_in_ruleSubRefinement2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedRefinement_in_ruleSubRefinement2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedRefinement_in_entryRuleNestedRefinement2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedRefinement2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ROUND_OPEN_in_ruleNestedRefinement2812 = new BitSet(new long[]{0x00000000806B0600L});
    public static final BitSet FOLLOW_ruleRefinement_in_ruleNestedRefinement2832 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ROUND_CLOSE_in_ruleNestedRefinement2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeGroup_in_entryRuleAttributeGroup2878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeGroup2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleAttributeGroup2934 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_CURLY_OPEN_in_ruleAttributeGroup2946 = new BitSet(new long[]{0x0000000080630600L});
    public static final BitSet FOLLOW_ruleAttributeSet_in_ruleAttributeGroup2966 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_CURLY_CLOSE_in_ruleAttributeGroup2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSet_in_entryRuleAttributeSet3012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSet3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrAttributeSet_in_ruleAttributeSet3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrAttributeSet_in_entryRuleOrAttributeSet3102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrAttributeSet3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndAttributeSet_in_ruleOrAttributeSet3159 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrAttributeSet3179 = new BitSet(new long[]{0x0000000080630600L});
    public static final BitSet FOLLOW_ruleAndAttributeSet_in_ruleOrAttributeSet3199 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAndAttributeSet_in_entryRuleAndAttributeSet3237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndAttributeSet3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubAttributeSet_in_ruleAndAttributeSet3294 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndAttributeSet3319 = new BitSet(new long[]{0x0000000080630600L});
    public static final BitSet FOLLOW_ruleSubAttributeSet_in_ruleAndAttributeSet3339 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_ruleSubAttributeSet_in_entryRuleSubAttributeSet3377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubAttributeSet3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstraint_in_ruleSubAttributeSet3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedAttributeSet_in_ruleSubAttributeSet3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedAttributeSet_in_entryRuleNestedAttributeSet3496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedAttributeSet3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ROUND_OPEN_in_ruleNestedAttributeSet3542 = new BitSet(new long[]{0x0000000080630600L});
    public static final BitSet FOLLOW_ruleAttributeSet_in_ruleNestedAttributeSet3562 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ROUND_CLOSE_in_ruleNestedAttributeSet3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstraint_in_entryRuleAttributeConstraint3608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeConstraint3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleAttributeConstraint3664 = new BitSet(new long[]{0x0000000080610600L});
    public static final BitSet FOLLOW_RULE_REVERSED_in_ruleAttributeConstraint3682 = new BitSet(new long[]{0x0000000080610600L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeConstraint3709 = new BitSet(new long[]{0x0000000066001200L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAttributeConstraint3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDescendantOf_in_ruleAttribute3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDescendantOrSelfOf_in_ruleAttribute3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptReference_in_ruleAttribute3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_ruleAttribute3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDescendantOf_in_entryRuleAttributeDescendantOf3939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDescendantOf3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleAttributeDescendantOf3985 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_ruleConceptReference_in_ruleAttributeDescendantOf4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_ruleAttributeDescendantOf4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDescendantOrSelfOf_in_entryRuleAttributeDescendantOrSelfOf4065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDescendantOrSelfOf4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DBL_LT_in_ruleAttributeDescendantOrSelfOf4111 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_ruleConceptReference_in_ruleAttributeDescendantOrSelfOf4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_ruleAttributeDescendantOrSelfOf4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality4191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQUARE_OPEN_in_ruleCardinality4237 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleNonNegativeInteger_in_ruleCardinality4257 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_TO_in_ruleCardinality4268 = new BitSet(new long[]{0x0000000180010000L});
    public static final BitSet FOLLOW_ruleMaxValue_in_ruleCardinality4288 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_SQUARE_CLOSE_in_ruleCardinality4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison4334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeComparison_in_ruleComparison4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeComparison_in_ruleComparison4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeComparison_in_entryRuleAttributeComparison4453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeComparison4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueEquals_in_ruleAttributeComparison4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueNotEquals_in_ruleAttributeComparison4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeComparison_in_entryRuleDataTypeComparison4572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeComparison4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueEquals_in_ruleDataTypeComparison4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueNotEquals_in_ruleDataTypeComparison4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueEquals_in_ruleDataTypeComparison4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueNotEquals_in_ruleDataTypeComparison4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueGreaterThan_in_ruleDataTypeComparison4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueGreaterThanEquals_in_ruleDataTypeComparison4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueLessThan_in_ruleDataTypeComparison4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueLessThanEquals_in_ruleDataTypeComparison4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueEquals_in_ruleDataTypeComparison4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueNotEquals_in_ruleDataTypeComparison4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueGreaterThan_in_ruleDataTypeComparison4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueGreaterThanEquals_in_ruleDataTypeComparison4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueLessThan_in_ruleDataTypeComparison4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueLessThanEquals_in_ruleDataTypeComparison4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueEquals_in_entryRuleAttributeValueEquals5015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueEquals5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleAttributeValueEquals5061 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleSimpleExpressionConstraint_in_ruleAttributeValueEquals5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueNotEquals_in_entryRuleAttributeValueNotEquals5117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueNotEquals5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleAttributeValueNotEquals5163 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleSimpleExpressionConstraint_in_ruleAttributeValueNotEquals5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueEquals_in_entryRuleStringValueEquals5219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValueEquals5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleStringValueEquals5265 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValueEquals5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueNotEquals_in_entryRuleStringValueNotEquals5322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValueNotEquals5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleStringValueNotEquals5368 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValueNotEquals5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueEquals_in_entryRuleIntegerValueEquals5425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueEquals5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleIntegerValueEquals5471 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIntegerValueEquals5481 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleIntegerValueEquals5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueNotEquals_in_entryRuleIntegerValueNotEquals5537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueNotEquals5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleIntegerValueNotEquals5583 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIntegerValueNotEquals5593 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleIntegerValueNotEquals5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueGreaterThan_in_entryRuleIntegerValueGreaterThan5649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueGreaterThan5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleIntegerValueGreaterThan5695 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIntegerValueGreaterThan5705 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleIntegerValueGreaterThan5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueLessThan_in_entryRuleIntegerValueLessThan5761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueLessThan5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleIntegerValueLessThan5807 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIntegerValueLessThan5817 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleIntegerValueLessThan5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueGreaterThanEquals_in_entryRuleIntegerValueGreaterThanEquals5873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueGreaterThanEquals5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GTE_in_ruleIntegerValueGreaterThanEquals5919 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIntegerValueGreaterThanEquals5929 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleIntegerValueGreaterThanEquals5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueLessThanEquals_in_entryRuleIntegerValueLessThanEquals5985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueLessThanEquals5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LTE_in_ruleIntegerValueLessThanEquals6031 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIntegerValueLessThanEquals6041 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleIntegerValueLessThanEquals6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueEquals_in_entryRuleDecimalValueEquals6097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalValueEquals6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleDecimalValueEquals6143 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDecimalValueEquals6153 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleDecimalValueEquals6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueNotEquals_in_entryRuleDecimalValueNotEquals6209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalValueNotEquals6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleDecimalValueNotEquals6255 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDecimalValueNotEquals6265 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleDecimalValueNotEquals6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueGreaterThan_in_entryRuleDecimalValueGreaterThan6321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalValueGreaterThan6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleDecimalValueGreaterThan6367 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDecimalValueGreaterThan6377 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleDecimalValueGreaterThan6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueLessThan_in_entryRuleDecimalValueLessThan6433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalValueLessThan6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleDecimalValueLessThan6479 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDecimalValueLessThan6489 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleDecimalValueLessThan6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueGreaterThanEquals_in_entryRuleDecimalValueGreaterThanEquals6545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalValueGreaterThanEquals6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GTE_in_ruleDecimalValueGreaterThanEquals6591 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDecimalValueGreaterThanEquals6601 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleDecimalValueGreaterThanEquals6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValueLessThanEquals_in_entryRuleDecimalValueLessThanEquals6657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalValueLessThanEquals6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LTE_in_ruleDecimalValueLessThanEquals6703 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDecimalValueLessThanEquals6713 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleDecimalValueLessThanEquals6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedExpression_in_entryRuleNestedExpression6769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpression6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ROUND_OPEN_in_ruleNestedExpression6815 = new BitSet(new long[]{0x0000000080037F00L});
    public static final BitSet FOLLOW_ruleExpressionConstraint_in_ruleNestedExpression6835 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ROUND_CLOSE_in_ruleNestedExpression6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSnomedIdentifier_in_entryRuleSnomedIdentifier6888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSnomedIdentifier6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier6943 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier6964 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier6990 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier7012 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier7038 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier7060 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier7086 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier7108 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier7134 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleSnomedIdentifier7156 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleSnomedIdentifier7182 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm7240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermCharacter_in_ruleTerm7303 = new BitSet(new long[]{0x000001FFF7FF7FF2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTerm7327 = new BitSet(new long[]{0x000001FFF7FF7FF0L});
    public static final BitSet FOLLOW_ruleTermCharacter_in_ruleTerm7357 = new BitSet(new long[]{0x000001FFF7FF7FF2L});
    public static final BitSet FOLLOW_ruleTermCharacter_in_entryRuleTermCharacter7417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermCharacter7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleTermCharacter7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleTermCharacter7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DBL_LT_in_ruleTermCharacter7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DBL_GT_in_ruleTermCharacter7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_EM_in_ruleTermCharacter7576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_EM_in_ruleTermCharacter7602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GTE_in_ruleTermCharacter7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LTE_in_ruleTermCharacter7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleTermCharacter7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleTermCharacter7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleTermCharacter7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleTermCharacter7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleTermCharacter7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleTermCharacter7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LETTER_in_ruleTermCharacter7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleTermCharacter7862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleTermCharacter7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleTermCharacter7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleTermCharacter7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CURLY_OPEN_in_ruleTermCharacter7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CURLY_CLOSE_in_ruleTermCharacter7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ROUND_OPEN_in_ruleTermCharacter8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ROUND_CLOSE_in_ruleTermCharacter8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQUARE_OPEN_in_ruleTermCharacter8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQUARE_CLOSE_in_ruleTermCharacter8096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleTermCharacter8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleTermCharacter8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleTermCharacter8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REVERSED_in_ruleTermCharacter8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TO_in_ruleTermCharacter8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WILDCARD_in_ruleTermCharacter8252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleTermCharacter8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleTermCharacter8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OTHER_CHARACTER_in_ruleTermCharacter8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonNegativeInteger_in_entryRuleNonNegativeInteger8386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonNegativeInteger8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleNonNegativeInteger8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleNonNegativeInteger8468 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleNonNegativeInteger8489 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleNonNegativeInteger8515 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleMaxValue_in_entryRuleMaxValue8574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxValue8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonNegativeInteger_in_ruleMaxValue8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WILDCARD_in_ruleMaxValue8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator8718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleAndOperator8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleAndOperator8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger8855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger8866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleInteger8911 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleInteger8937 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleNonNegativeInteger_in_ruleInteger8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal9022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimal9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleDecimal9078 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleDecimal9104 = new BitSet(new long[]{0x000000A180000000L});
    public static final BitSet FOLLOW_ruleNonNegativeDecimal_in_ruleDecimal9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonNegativeDecimal_in_entryRuleNonNegativeDecimal9189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonNegativeDecimal9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonNegativeInteger_in_ruleNonNegativeDecimal9251 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleNonNegativeDecimal9271 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_NONZERO_in_ruleNonNegativeDecimal9292 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_RULE_ZERO_in_ruleNonNegativeDecimal9318 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_RULE_OR_in_synpred1_InternalEcl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_InternalEcl2534 = new BitSet(new long[]{0x0000000000000002L});

}