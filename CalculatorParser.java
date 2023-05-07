// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			INT=1, FLOAT=2, PLUS=3, MINUS=4, MULT=5, DIV=6, POWER=7, SQRT=8, LPAREN=9,
			RPAREN=10, WS=11;
	public static final int
			RULE_expression = 0, RULE_addExpression = 1, RULE_multiplyExpression = 2,
			RULE_powerExpression = 3, RULE_sqrtExpression = 4, RULE_atom = 5;
	private static String[] makeRuleNames() {
		return new String[] {
				"expression", "addExpression", "multiplyExpression", "powerExpression",
				"sqrtExpression", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'", "'\\u221A'", "'('",
				"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "INT", "FLOAT", "PLUS", "MINUS", "MULT", "DIV", "POWER", "SQRT",
				"LPAREN", "RPAREN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(12);
				addExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ParserRuleContext {
		public List<MultiplyExpressionContext> multiplyExpression() {
			return getRuleContexts(MultiplyExpressionContext.class);
		}
		public MultiplyExpressionContext multiplyExpression(int i) {
			return getRuleContext(MultiplyExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CalculatorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CalculatorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CalculatorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CalculatorParser.MINUS, i);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAddExpression(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_addExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(14);
				multiplyExpression();
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
						{
							setState(15);
							_la = _input.LA(1);
							if ( !(_la==PLUS || _la==MINUS) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(16);
							multiplyExpression();
						}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExpressionContext extends ParserRuleContext {
		public List<PowerExpressionContext> powerExpression() {
			return getRuleContexts(PowerExpressionContext.class);
		}
		public PowerExpressionContext powerExpression(int i) {
			return getRuleContext(PowerExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CalculatorParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CalculatorParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CalculatorParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CalculatorParser.DIV, i);
		}
		public MultiplyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMultiplyExpression(this);
		}
	}

	public final MultiplyExpressionContext multiplyExpression() throws RecognitionException {
		MultiplyExpressionContext _localctx = new MultiplyExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(22);
				powerExpression();
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIV) {
					{
						{
							setState(23);
							_la = _input.LA(1);
							if ( !(_la==MULT || _la==DIV) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(24);
							powerExpression();
						}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends ParserRuleContext {
		public List<SqrtExpressionContext> sqrtExpression() {
			return getRuleContexts(SqrtExpressionContext.class);
		}
		public SqrtExpressionContext sqrtExpression(int i) {
			return getRuleContext(SqrtExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(CalculatorParser.POWER, 0); }

		//public TerminalNode POWER() { return getToken(CalculatorParser.POWER, 0); }
		public List<TerminalNode> POW() { return getTokens(CalculatorParser.POWER); }

		public PowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPowerExpression(this);
		}
	}

	public final PowerExpressionContext powerExpression() throws RecognitionException {
		PowerExpressionContext _localctx = new PowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(30);
				sqrtExpression();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POWER) {
					{
						setState(31);
						match(POWER);
						setState(32);
						sqrtExpression();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqrtExpressionContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode SQRT() { return getToken(CalculatorParser.SQRT, 0); }
		//public List<TerminalNode> SQRT() { return getTokens(CalculatorParser.SQRT); }
		public SqrtExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrtExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSqrtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSqrtExpression(this);
		}
	}

	public final SqrtExpressionContext sqrtExpression() throws RecognitionException {
		SqrtExpressionContext _localctx = new SqrtExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sqrtExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(35);
				atom();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQRT) {
					{
						setState(36);
						match(SQRT);
						setState(37);
						atom();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	/*public static class SqrtExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(CalculatorParser.SQRT, 0); }
		public SqrtExpressionContext sqrtExpression() {
			return getRuleContext(SqrtExpressionContext.class,0);
		}
		public SqrtExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrtExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSqrtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSqrtExpression(this);
		}
	}

	public final SqrtExpressionContext sqrtExpression() throws RecognitionException {
		SqrtExpressionContext _localctx = new SqrtExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sqrtExpression);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(40);
					atom();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(41);
					match(SQRT);
					setState(42);
					atom();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(43);
					atom();
					setState(44);
					match(SQRT);
					setState(45);
					sqrtExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}*/


	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CalculatorParser.FLOAT, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public List<TerminalNode> SQRT() { return getTokens(CalculatorParser.SQRT); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAtom(this);
		}

	}
	public class CustomAtomContext extends AtomContext {
		public CustomAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public double sqrt() {
			return Math.sqrt(Double.parseDouble(this.getText()));
		}
	}
	public class MyListener extends CalculatorBaseListener {
		@Override
		public void enterAtom(AtomContext ctx) {
			if (ctx.SQRT() != null) {
				CustomAtomContext customCtx = new CustomAtomContext(ctx.getParent(), ctx.invokingState);
				customCtx.copyFrom(ctx);
				ctx = customCtx;
			}
		}
	}




	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case INT:
					enterOuterAlt(_localctx, 1);
				{
					setState(40);
					match(INT);
				}
				break;
				case FLOAT:
					enterOuterAlt(_localctx, 2);
				{
					setState(41);
					match(FLOAT);
				}
				break;
				case LPAREN:
					enterOuterAlt(_localctx, 3);
				{
					setState(42);
					match(LPAREN);
					setState(43);
					expression();
					setState(44);
					match(RPAREN);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;

	}

	public static final String _serializedATN =
			"\u0004\u0001\u000b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
					"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0002"+
					"\u0001\u0002\u0001\u0002\u0005\u0002\u001a\b\u0002\n\u0002\f\u0002\u001d"+
					"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\"\b\u0003\u0001"+
					"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\'\b\u0004\u0001\u0005\u0001"+
					"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005/\b"+
					"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
					"\u0002\u0001\u0000\u0003\u0004\u0001\u0000\u0005\u00060\u0000\f\u0001"+
					"\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0016\u0001"+
					"\u0000\u0000\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b#\u0001\u0000"+
					"\u0000\u0000\n.\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r"+
					"\u0001\u0001\u0000\u0000\u0000\u000e\u0013\u0003\u0004\u0002\u0000\u000f"+
					"\u0010\u0007\u0000\u0000\u0000\u0010\u0012\u0003\u0004\u0002\u0000\u0011"+
					"\u000f\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013"+
					"\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
					"\u0003\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016"+
					"\u001b\u0003\u0006\u0003\u0000\u0017\u0018\u0007\u0001\u0000\u0000\u0018"+
					"\u001a\u0003\u0006\u0003\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a"+
					"\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
					"\u001c\u0001\u0000\u0000\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d"+
					"\u001b\u0001\u0000\u0000\u0000\u001e!\u0003\b\u0004\u0000\u001f \u0005"+
					"\u0007\u0000\u0000 \"\u0003\b\u0004\u0000!\u001f\u0001\u0000\u0000\u0000"+
					"!\"\u0001\u0000\u0000\u0000\"\u0007\u0001\u0000\u0000\u0000#&\u0003\n"+
					"\u0005\u0000$%\u0005\b\u0000\u0000%\'\u0003\n\u0005\u0000&$\u0001\u0000"+
					"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\t\u0001\u0000\u0000\u0000(/"+
					"\u0005\u0001\u0000\u0000)/\u0005\u0002\u0000\u0000*+\u0005\t\u0000\u0000"+
					"+,\u0003\u0000\u0000\u0000,-\u0005\n\u0000\u0000-/\u0001\u0000\u0000\u0000"+
					".(\u0001\u0000\u0000\u0000.)\u0001\u0000\u0000\u0000.*\u0001\u0000\u0000"+
					"\u0000/\u000b\u0001\u0000\u0000\u0000\u0005\u0013\u001b!&.";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}