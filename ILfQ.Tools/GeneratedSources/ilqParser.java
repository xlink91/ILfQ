// $ANTLR null C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g 2019-12-06 15:09:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ilqParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "CLOSED_BRACKET", "CLOSED_PAR", 
		"COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", 
		"OPEN_BRACKET", "OPEN_PAR", "STRING", "UNICODE_ESC", "WS", "'$and'", "'$eq'", 
		"'$gt'", "'$gte'", "'$in'", "'$lt'", "'$lte'", "'$ne'", "'$nin'", "'$nor'", 
		"'$not'", "'$options'", "'$or'", "'$regex'", "'('", "')'", "','", "':'", 
		"'false'", "'null'", "'true'"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int CHAR=4;
	public static final int CLOSED_BRACKET=5;
	public static final int CLOSED_PAR=6;
	public static final int COMMENT=7;
	public static final int ESC_SEQ=8;
	public static final int EXPONENT=9;
	public static final int FLOAT=10;
	public static final int HEX_DIGIT=11;
	public static final int ID=12;
	public static final int INT=13;
	public static final int OCTAL_ESC=14;
	public static final int OPEN_BRACKET=15;
	public static final int OPEN_PAR=16;
	public static final int STRING=17;
	public static final int UNICODE_ESC=18;
	public static final int WS=19;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "aux_operator", "logical_operator", "comma_exp", "exp", 
		"start_rule", "logical_exp", "bracket_exp", "comparison_exp", "evaluation_exp", 
		"evaluation_operator", "exp_term", "constant_values", "property_exp", 
		"comparison_operator"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ilqParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ilqParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public ilqParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return ilqParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g"; }


	public static class constant_values_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant_values"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:74:1: constant_values : ( STRING | INT | FLOAT | 'null' | 'false' | 'true' | ID ^ '(' ! constant_values ')' !);
	public final ilqParser.constant_values_return constant_values() throws RecognitionException {
		ilqParser.constant_values_return retval = new ilqParser.constant_values_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING1=null;
		Token INT2=null;
		Token FLOAT3=null;
		Token string_literal4=null;
		Token string_literal5=null;
		Token string_literal6=null;
		Token ID7=null;
		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope constant_values9 =null;

		Object STRING1_tree=null;
		Object INT2_tree=null;
		Object FLOAT3_tree=null;
		Object string_literal4_tree=null;
		Object string_literal5_tree=null;
		Object string_literal6_tree=null;
		Object ID7_tree=null;
		Object char_literal8_tree=null;
		Object char_literal10_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "constant_values");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:75:2: ( STRING | INT | FLOAT | 'null' | 'false' | 'true' | ID ^ '(' ! constant_values ')' !)
			int alt1=7;
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			switch ( input.LA(1) ) {
			case STRING:
				{
				alt1=1;
				}
				break;
			case INT:
				{
				alt1=2;
				}
				break;
			case FLOAT:
				{
				alt1=3;
				}
				break;
			case 39:
				{
				alt1=4;
				}
				break;
			case 38:
				{
				alt1=5;
				}
				break;
			case 40:
				{
				alt1=6;
				}
				break;
			case ID:
				{
				alt1=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:75:5: STRING
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,5);
					STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_constant_values611); 
					STRING1_tree = (Object)adaptor.create(STRING1);
					adaptor.addChild(root_0, STRING1_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:75:14: INT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,14);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_constant_values615); 
					INT2_tree = (Object)adaptor.create(INT2);
					adaptor.addChild(root_0, INT2_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:75:20: FLOAT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,20);
					FLOAT3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant_values619); 
					FLOAT3_tree = (Object)adaptor.create(FLOAT3);
					adaptor.addChild(root_0, FLOAT3_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:75:28: 'null'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,28);
					string_literal4=(Token)match(input,39,FOLLOW_39_in_constant_values623); 
					string_literal4_tree = (Object)adaptor.create(string_literal4);
					adaptor.addChild(root_0, string_literal4_tree);

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:75:37: 'false'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,37);
					string_literal5=(Token)match(input,38,FOLLOW_38_in_constant_values627); 
					string_literal5_tree = (Object)adaptor.create(string_literal5);
					adaptor.addChild(root_0, string_literal5_tree);

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:75:47: 'true'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,47);
					string_literal6=(Token)match(input,40,FOLLOW_40_in_constant_values631); 
					string_literal6_tree = (Object)adaptor.create(string_literal6);
					adaptor.addChild(root_0, string_literal6_tree);

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:75:56: ID ^ '(' ! constant_values ')' !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,58);
					ID7=(Token)match(input,ID,FOLLOW_ID_in_constant_values635); 
					ID7_tree = (Object)adaptor.create(ID7);
					root_0 = (Object)adaptor.becomeRoot(ID7_tree, root_0);
					dbg.location(75,63);
					char_literal8=(Token)match(input,34,FOLLOW_34_in_constant_values638); dbg.location(75,65);
					pushFollow(FOLLOW_constant_values_in_constant_values641);
					constant_values9=constant_values();
					state._fsp--;

					adaptor.addChild(root_0, constant_values9.getTree());
					dbg.location(75,84);
					char_literal10=(Token)match(input,35,FOLLOW_35_in_constant_values643); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant_values");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "constant_values"


	public static class comparison_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison_operator"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:78:1: comparison_operator : ( '$eq' | '$gt' | '$gte' | '$in' | '$lt' | '$lte' | '$ne' | '$nin' );
	public final ilqParser.comparison_operator_return comparison_operator() throws RecognitionException {
		ilqParser.comparison_operator_return retval = new ilqParser.comparison_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set11=null;

		Object set11_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "comparison_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:79:2: ( '$eq' | '$gt' | '$gte' | '$in' | '$lt' | '$lte' | '$ne' | '$nin' )
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(79,2);
			set11=input.LT(1);
			if ( (input.LA(1) >= 21 && input.LA(1) <= 28) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set11));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(80, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comparison_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "comparison_operator"


	public static class aux_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "aux_operator"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:82:1: aux_operator : '$options' ;
	public final ilqParser.aux_operator_return aux_operator() throws RecognitionException {
		ilqParser.aux_operator_return retval = new ilqParser.aux_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal12=null;

		Object string_literal12_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "aux_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:83:2: ( '$options' )
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:83:4: '$options'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(83,4);
			string_literal12=(Token)match(input,31,FOLLOW_31_in_aux_operator694); 
			string_literal12_tree = (Object)adaptor.create(string_literal12);
			adaptor.addChild(root_0, string_literal12_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "aux_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "aux_operator"


	public static class logical_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logical_operator"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:86:1: logical_operator : ( '$and' | '$not' | '$nor' | '$or' );
	public final ilqParser.logical_operator_return logical_operator() throws RecognitionException {
		ilqParser.logical_operator_return retval = new ilqParser.logical_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set13=null;

		Object set13_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "logical_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:87:2: ( '$and' | '$not' | '$nor' | '$or' )
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(87,2);
			set13=input.LT(1);
			if ( input.LA(1)==20||(input.LA(1) >= 29 && input.LA(1) <= 30)||input.LA(1)==32 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set13));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(88, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "logical_operator"


	public static class evaluation_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "evaluation_operator"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:90:1: evaluation_operator : '$regex' ;
	public final ilqParser.evaluation_operator_return evaluation_operator() throws RecognitionException {
		ilqParser.evaluation_operator_return retval = new ilqParser.evaluation_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal14=null;

		Object string_literal14_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "evaluation_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:91:2: ( '$regex' )
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:91:4: '$regex'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(91,4);
			string_literal14=(Token)match(input,33,FOLLOW_33_in_evaluation_operator730); 
			string_literal14_tree = (Object)adaptor.create(string_literal14);
			adaptor.addChild(root_0, string_literal14_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(92, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "evaluation_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "evaluation_operator"


	public static class comparison_exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison_exp"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:94:1: comparison_exp : OPEN_PAR ! comparison_operator ^ ':' ! ( constant_values | bracket_exp ) CLOSED_PAR !;
	public final ilqParser.comparison_exp_return comparison_exp() throws RecognitionException {
		ilqParser.comparison_exp_return retval = new ilqParser.comparison_exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OPEN_PAR15=null;
		Token char_literal17=null;
		Token CLOSED_PAR20=null;
		ParserRuleReturnScope comparison_operator16 =null;
		ParserRuleReturnScope constant_values18 =null;
		ParserRuleReturnScope bracket_exp19 =null;

		Object OPEN_PAR15_tree=null;
		Object char_literal17_tree=null;
		Object CLOSED_PAR20_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "comparison_exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:95:2: ( OPEN_PAR ! comparison_operator ^ ':' ! ( constant_values | bracket_exp ) CLOSED_PAR !)
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:95:4: OPEN_PAR ! comparison_operator ^ ':' ! ( constant_values | bracket_exp ) CLOSED_PAR !
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(95,12);
			OPEN_PAR15=(Token)match(input,OPEN_PAR,FOLLOW_OPEN_PAR_in_comparison_exp741); dbg.location(95,33);
			pushFollow(FOLLOW_comparison_operator_in_comparison_exp744);
			comparison_operator16=comparison_operator();
			state._fsp--;

			root_0 = (Object)adaptor.becomeRoot(comparison_operator16.getTree(), root_0);dbg.location(95,38);
			char_literal17=(Token)match(input,37,FOLLOW_37_in_comparison_exp747); dbg.location(95,40);
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:95:40: ( constant_values | bracket_exp )
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==FLOAT||(LA2_0 >= ID && LA2_0 <= INT)||LA2_0==STRING||(LA2_0 >= 38 && LA2_0 <= 40)) ) {
				alt2=1;
			}
			else if ( (LA2_0==OPEN_BRACKET) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:95:41: constant_values
					{
					dbg.location(95,41);
					pushFollow(FOLLOW_constant_values_in_comparison_exp751);
					constant_values18=constant_values();
					state._fsp--;

					adaptor.addChild(root_0, constant_values18.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:95:59: bracket_exp
					{
					dbg.location(95,59);
					pushFollow(FOLLOW_bracket_exp_in_comparison_exp755);
					bracket_exp19=bracket_exp();
					state._fsp--;

					adaptor.addChild(root_0, bracket_exp19.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(95,82);
			CLOSED_PAR20=(Token)match(input,CLOSED_PAR,FOLLOW_CLOSED_PAR_in_comparison_exp758); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(96, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comparison_exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "comparison_exp"


	public static class logical_exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logical_exp"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:98:1: logical_exp : OPEN_PAR ! logical_operator ^ ':' ! bracket_exp CLOSED_PAR !;
	public final ilqParser.logical_exp_return logical_exp() throws RecognitionException {
		ilqParser.logical_exp_return retval = new ilqParser.logical_exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OPEN_PAR21=null;
		Token char_literal23=null;
		Token CLOSED_PAR25=null;
		ParserRuleReturnScope logical_operator22 =null;
		ParserRuleReturnScope bracket_exp24 =null;

		Object OPEN_PAR21_tree=null;
		Object char_literal23_tree=null;
		Object CLOSED_PAR25_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "logical_exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:99:2: ( OPEN_PAR ! logical_operator ^ ':' ! bracket_exp CLOSED_PAR !)
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:99:4: OPEN_PAR ! logical_operator ^ ':' ! bracket_exp CLOSED_PAR !
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(99,12);
			OPEN_PAR21=(Token)match(input,OPEN_PAR,FOLLOW_OPEN_PAR_in_logical_exp771); dbg.location(99,30);
			pushFollow(FOLLOW_logical_operator_in_logical_exp774);
			logical_operator22=logical_operator();
			state._fsp--;

			root_0 = (Object)adaptor.becomeRoot(logical_operator22.getTree(), root_0);dbg.location(99,35);
			char_literal23=(Token)match(input,37,FOLLOW_37_in_logical_exp777); dbg.location(99,37);
			pushFollow(FOLLOW_bracket_exp_in_logical_exp780);
			bracket_exp24=bracket_exp();
			state._fsp--;

			adaptor.addChild(root_0, bracket_exp24.getTree());
			dbg.location(99,59);
			CLOSED_PAR25=(Token)match(input,CLOSED_PAR,FOLLOW_CLOSED_PAR_in_logical_exp782); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(100, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical_exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "logical_exp"


	public static class evaluation_exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "evaluation_exp"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:102:1: evaluation_exp : OPEN_PAR ! evaluation_operator ^ ':' ! STRING CLOSED_PAR !;
	public final ilqParser.evaluation_exp_return evaluation_exp() throws RecognitionException {
		ilqParser.evaluation_exp_return retval = new ilqParser.evaluation_exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OPEN_PAR26=null;
		Token char_literal28=null;
		Token STRING29=null;
		Token CLOSED_PAR30=null;
		ParserRuleReturnScope evaluation_operator27 =null;

		Object OPEN_PAR26_tree=null;
		Object char_literal28_tree=null;
		Object STRING29_tree=null;
		Object CLOSED_PAR30_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "evaluation_exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:103:2: ( OPEN_PAR ! evaluation_operator ^ ':' ! STRING CLOSED_PAR !)
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:103:4: OPEN_PAR ! evaluation_operator ^ ':' ! STRING CLOSED_PAR !
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(103,12);
			OPEN_PAR26=(Token)match(input,OPEN_PAR,FOLLOW_OPEN_PAR_in_evaluation_exp794); dbg.location(103,33);
			pushFollow(FOLLOW_evaluation_operator_in_evaluation_exp797);
			evaluation_operator27=evaluation_operator();
			state._fsp--;

			root_0 = (Object)adaptor.becomeRoot(evaluation_operator27.getTree(), root_0);dbg.location(103,38);
			char_literal28=(Token)match(input,37,FOLLOW_37_in_evaluation_exp800); dbg.location(103,40);
			STRING29=(Token)match(input,STRING,FOLLOW_STRING_in_evaluation_exp803); 
			STRING29_tree = (Object)adaptor.create(STRING29);
			adaptor.addChild(root_0, STRING29_tree);
			dbg.location(103,57);
			CLOSED_PAR30=(Token)match(input,CLOSED_PAR,FOLLOW_CLOSED_PAR_in_evaluation_exp805); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(104, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "evaluation_exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "evaluation_exp"


	public static class property_exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "property_exp"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:106:1: property_exp : OPEN_PAR ! ( ID | STRING ) ^ ':' ! exp_term CLOSED_PAR !;
	public final ilqParser.property_exp_return property_exp() throws RecognitionException {
		ilqParser.property_exp_return retval = new ilqParser.property_exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OPEN_PAR31=null;
		Token set32=null;
		Token char_literal33=null;
		Token CLOSED_PAR35=null;
		ParserRuleReturnScope exp_term34 =null;

		Object OPEN_PAR31_tree=null;
		Object set32_tree=null;
		Object char_literal33_tree=null;
		Object CLOSED_PAR35_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "property_exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:107:2: ( OPEN_PAR ! ( ID | STRING ) ^ ':' ! exp_term CLOSED_PAR !)
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:107:4: OPEN_PAR ! ( ID | STRING ) ^ ':' ! exp_term CLOSED_PAR !
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(107,12);
			OPEN_PAR31=(Token)match(input,OPEN_PAR,FOLLOW_OPEN_PAR_in_property_exp817); dbg.location(107,27);
			set32=input.LT(1);
			set32=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==STRING ) {
				input.consume();
				root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set32), root_0);
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(107,32);
			char_literal33=(Token)match(input,37,FOLLOW_37_in_property_exp829); dbg.location(107,35);
			pushFollow(FOLLOW_exp_term_in_property_exp833);
			exp_term34=exp_term();
			state._fsp--;

			adaptor.addChild(root_0, exp_term34.getTree());
			dbg.location(107,54);
			CLOSED_PAR35=(Token)match(input,CLOSED_PAR,FOLLOW_CLOSED_PAR_in_property_exp835); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(108, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "property_exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "property_exp"


	public static class bracket_exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bracket_exp"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:110:1: bracket_exp : OPEN_BRACKET ! exp_term ( ',' ! exp_term )* CLOSED_BRACKET !;
	public final ilqParser.bracket_exp_return bracket_exp() throws RecognitionException {
		ilqParser.bracket_exp_return retval = new ilqParser.bracket_exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OPEN_BRACKET36=null;
		Token char_literal38=null;
		Token CLOSED_BRACKET40=null;
		ParserRuleReturnScope exp_term37 =null;
		ParserRuleReturnScope exp_term39 =null;

		Object OPEN_BRACKET36_tree=null;
		Object char_literal38_tree=null;
		Object CLOSED_BRACKET40_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "bracket_exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(110, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:111:2: ( OPEN_BRACKET ! exp_term ( ',' ! exp_term )* CLOSED_BRACKET !)
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:111:4: OPEN_BRACKET ! exp_term ( ',' ! exp_term )* CLOSED_BRACKET !
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(111,16);
			OPEN_BRACKET36=(Token)match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_bracket_exp847); dbg.location(111,18);
			pushFollow(FOLLOW_exp_term_in_bracket_exp850);
			exp_term37=exp_term();
			state._fsp--;

			adaptor.addChild(root_0, exp_term37.getTree());
			dbg.location(111,27);
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:111:27: ( ',' ! exp_term )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==36) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:111:28: ',' ! exp_term
					{
					dbg.location(111,31);
					char_literal38=(Token)match(input,36,FOLLOW_36_in_bracket_exp853); dbg.location(111,33);
					pushFollow(FOLLOW_exp_term_in_bracket_exp856);
					exp_term39=exp_term();
					state._fsp--;

					adaptor.addChild(root_0, exp_term39.getTree());

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(111,58);
			CLOSED_BRACKET40=(Token)match(input,CLOSED_BRACKET,FOLLOW_CLOSED_BRACKET_in_bracket_exp860); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(112, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bracket_exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bracket_exp"


	public static class comma_exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comma_exp"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:114:1: comma_exp :;
	public final ilqParser.comma_exp_return comma_exp() throws RecognitionException {
		ilqParser.comma_exp_return retval = new ilqParser.comma_exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		try { dbg.enterRule(getGrammarFileName(), "comma_exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(114, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:115:2: ()
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:116:2: 
			{
			root_0 = (Object)adaptor.nil();


			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		finally {
			// do for sure before leaving
		}
		dbg.location(116, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comma_exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "comma_exp"


	public static class exp_term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp_term"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:118:1: exp_term : ( property_exp | comparison_exp | logical_exp | evaluation_exp | STRING | ID | FLOAT | INT | bracket_exp );
	public final ilqParser.exp_term_return exp_term() throws RecognitionException {
		ilqParser.exp_term_return retval = new ilqParser.exp_term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING45=null;
		Token ID46=null;
		Token FLOAT47=null;
		Token INT48=null;
		ParserRuleReturnScope property_exp41 =null;
		ParserRuleReturnScope comparison_exp42 =null;
		ParserRuleReturnScope logical_exp43 =null;
		ParserRuleReturnScope evaluation_exp44 =null;
		ParserRuleReturnScope bracket_exp49 =null;

		Object STRING45_tree=null;
		Object ID46_tree=null;
		Object FLOAT47_tree=null;
		Object INT48_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exp_term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(118, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:119:2: ( property_exp | comparison_exp | logical_exp | evaluation_exp | STRING | ID | FLOAT | INT | bracket_exp )
			int alt4=9;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			switch ( input.LA(1) ) {
			case OPEN_PAR:
				{
				switch ( input.LA(2) ) {
				case ID:
				case STRING:
					{
					alt4=1;
					}
					break;
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 28:
					{
					alt4=2;
					}
					break;
				case 20:
				case 29:
				case 30:
				case 32:
					{
					alt4=3;
					}
					break;
				case 33:
					{
					alt4=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case STRING:
				{
				alt4=5;
				}
				break;
			case ID:
				{
				alt4=6;
				}
				break;
			case FLOAT:
				{
				alt4=7;
				}
				break;
			case INT:
				{
				alt4=8;
				}
				break;
			case OPEN_BRACKET:
				{
				alt4=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:119:4: property_exp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(119,4);
					pushFollow(FOLLOW_property_exp_in_exp_term883);
					property_exp41=property_exp();
					state._fsp--;

					adaptor.addChild(root_0, property_exp41.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:120:4: comparison_exp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(120,4);
					pushFollow(FOLLOW_comparison_exp_in_exp_term888);
					comparison_exp42=comparison_exp();
					state._fsp--;

					adaptor.addChild(root_0, comparison_exp42.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:121:4: logical_exp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(121,4);
					pushFollow(FOLLOW_logical_exp_in_exp_term893);
					logical_exp43=logical_exp();
					state._fsp--;

					adaptor.addChild(root_0, logical_exp43.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:122:4: evaluation_exp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(122,4);
					pushFollow(FOLLOW_evaluation_exp_in_exp_term898);
					evaluation_exp44=evaluation_exp();
					state._fsp--;

					adaptor.addChild(root_0, evaluation_exp44.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:123:4: STRING
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(123,4);
					STRING45=(Token)match(input,STRING,FOLLOW_STRING_in_exp_term903); 
					STRING45_tree = (Object)adaptor.create(STRING45);
					adaptor.addChild(root_0, STRING45_tree);

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:123:13: ID
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(123,13);
					ID46=(Token)match(input,ID,FOLLOW_ID_in_exp_term907); 
					ID46_tree = (Object)adaptor.create(ID46);
					adaptor.addChild(root_0, ID46_tree);

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:123:18: FLOAT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(123,18);
					FLOAT47=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_exp_term911); 
					FLOAT47_tree = (Object)adaptor.create(FLOAT47);
					adaptor.addChild(root_0, FLOAT47_tree);

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:123:26: INT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(123,26);
					INT48=(Token)match(input,INT,FOLLOW_INT_in_exp_term915); 
					INT48_tree = (Object)adaptor.create(INT48);
					adaptor.addChild(root_0, INT48_tree);

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:123:32: bracket_exp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(123,32);
					pushFollow(FOLLOW_bracket_exp_in_exp_term919);
					bracket_exp49=bracket_exp();
					state._fsp--;

					adaptor.addChild(root_0, bracket_exp49.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(124, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp_term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp_term"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:126:1: exp : (| property_exp | logical_exp );
	public final ilqParser.exp_return exp() throws RecognitionException {
		ilqParser.exp_return retval = new ilqParser.exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope property_exp50 =null;
		ParserRuleReturnScope logical_exp51 =null;


		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:127:2: (| property_exp | logical_exp )
			int alt5=3;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==EOF) ) {
				alt5=1;
			}
			else if ( (LA5_0==OPEN_PAR) ) {
				int LA5_2 = input.LA(2);
				if ( (LA5_2==ID||LA5_2==STRING) ) {
					alt5=2;
				}
				else if ( (LA5_2==20||(LA5_2 >= 29 && LA5_2 <= 30)||LA5_2==32) ) {
					alt5=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:128:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:128:4: property_exp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(128,4);
					pushFollow(FOLLOW_property_exp_in_exp934);
					property_exp50=property_exp();
					state._fsp--;

					adaptor.addChild(root_0, property_exp50.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:129:4: logical_exp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(129,4);
					pushFollow(FOLLOW_logical_exp_in_exp939);
					logical_exp51=logical_exp();
					state._fsp--;

					adaptor.addChild(root_0, logical_exp51.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(130, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp"


	public static class start_rule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "start_rule"
	// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:132:1: start_rule : exp ;
	public final ilqParser.start_rule_return start_rule() throws RecognitionException {
		ilqParser.start_rule_return retval = new ilqParser.start_rule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exp52 =null;


		try { dbg.enterRule(getGrammarFileName(), "start_rule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(132, 0);

		try {
			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:133:2: ( exp )
			dbg.enterAlt(1);

			// C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\ilq.g:133:4: exp
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(133,4);
			pushFollow(FOLLOW_exp_in_start_rule950);
			exp52=exp();
			state._fsp--;

			adaptor.addChild(root_0, exp52.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(133, 6);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start_rule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "start_rule"

	// Delegated rules



	public static final BitSet FOLLOW_STRING_in_constant_values611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant_values615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant_values619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_constant_values623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_constant_values627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_constant_values631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_constant_values635 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_constant_values638 = new BitSet(new long[]{0x000001C000023400L});
	public static final BitSet FOLLOW_constant_values_in_constant_values641 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_constant_values643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_aux_operator694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_evaluation_operator730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAR_in_comparison_exp741 = new BitSet(new long[]{0x000000001FE00000L});
	public static final BitSet FOLLOW_comparison_operator_in_comparison_exp744 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_comparison_exp747 = new BitSet(new long[]{0x000001C00002B400L});
	public static final BitSet FOLLOW_constant_values_in_comparison_exp751 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_bracket_exp_in_comparison_exp755 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSED_PAR_in_comparison_exp758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAR_in_logical_exp771 = new BitSet(new long[]{0x0000000160100000L});
	public static final BitSet FOLLOW_logical_operator_in_logical_exp774 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_logical_exp777 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_bracket_exp_in_logical_exp780 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSED_PAR_in_logical_exp782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAR_in_evaluation_exp794 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_evaluation_operator_in_evaluation_exp797 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_evaluation_exp800 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_evaluation_exp803 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSED_PAR_in_evaluation_exp805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAR_in_property_exp817 = new BitSet(new long[]{0x0000000000021000L});
	public static final BitSet FOLLOW_set_in_property_exp820 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_property_exp829 = new BitSet(new long[]{0x000000000003B400L});
	public static final BitSet FOLLOW_exp_term_in_property_exp833 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSED_PAR_in_property_exp835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACKET_in_bracket_exp847 = new BitSet(new long[]{0x000000000003B400L});
	public static final BitSet FOLLOW_exp_term_in_bracket_exp850 = new BitSet(new long[]{0x0000001000000020L});
	public static final BitSet FOLLOW_36_in_bracket_exp853 = new BitSet(new long[]{0x000000000003B400L});
	public static final BitSet FOLLOW_exp_term_in_bracket_exp856 = new BitSet(new long[]{0x0000001000000020L});
	public static final BitSet FOLLOW_CLOSED_BRACKET_in_bracket_exp860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_exp_in_exp_term883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_exp_in_exp_term888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_exp_in_exp_term893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_evaluation_exp_in_exp_term898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_exp_term903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp_term907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_exp_term911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_exp_term915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bracket_exp_in_exp_term919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_exp_in_exp934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_exp_in_exp939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_start_rule950 = new BitSet(new long[]{0x0000000000000002L});
}
