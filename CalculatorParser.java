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
			T__0=1, T__1=2, SQRT=3, NUMBER=4, PLUS=5, MINUS=6, MULT=7, DIVIDE=8, POWER=9,
			WS=10;
	public static final int
			RULE_expression = 0, RULE_multiplyExpression = 1, RULE_powerExpression = 2,
			RULE_sqrtExpression = 3, RULE_atom = 4;
	private static String[] makeRuleNames() {
		return new String[] {
				"expression", "multiplyExpression", "powerExpression", "sqrtExpression",
				"atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'('", "')'", "'sqrt'", null, "'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, "SQRT", "NUMBER", "PLUS", "MINUS", "MULT", "DIVIDE",
				"POWER", "WS"
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		int _la;
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(10);
					match(T__0);
					setState(11);
					expression();
					setState(12);
					match(T__1);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
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
		public List<TerminalNode> DIVIDE() { return getTokens(CalculatorParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CalculatorParser.DIVIDE, i);
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
		enterRule(_localctx, 2, RULE_multiplyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(24);
				powerExpression();
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIVIDE) {
					{
						{
							setState(25);
							_la = _input.LA(1);
							if ( !(_la==MULT || _la==DIVIDE) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(26);
							powerExpression();
						}
					}
					setState(31);
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
		public SqrtExpressionContext sqrtExpression() {
			return getRuleContext(SqrtExpressionContext.class,0);
		}
		public TerminalNode POWER() { return getToken(CalculatorParser.POWER, 0); }
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(32);
				sqrtExpression();
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POWER) {
					{
						setState(33);
						match(POWER);
						setState(34);
						powerExpression();
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
		enterRule(_localctx, 6, RULE_sqrtExpression);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__0:
				case NUMBER:
				case MINUS:
					enterOuterAlt(_localctx, 1);
				{
					setState(37);
					atom();
				}
				break;
				case SQRT:
					enterOuterAlt(_localctx, 2);
				{
					setState(38);
					match(SQRT);
					setState(39);
					sqrtExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CalculatorParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case NUMBER:
					enterOuterAlt(_localctx, 1);
				{
					setState(42);
					match(NUMBER);
				}
				break;
				case MINUS:
					enterOuterAlt(_localctx, 2);
				{
					setState(43);
					match(MINUS);
					setState(44);
					atom();
				}
				break;
				case T__0:
					enterOuterAlt(_localctx, 3);
				{
					setState(45);
					match(T__0);
					setState(46);
					expression();
					setState(47);
					match(T__1);
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
			"\u0004\u0001\n4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
					"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
					"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0003\u0000"+
					"\u0017\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b"+
					"\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
					"\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
					")\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
					"\u0001\u0004\u0001\u0004\u0003\u00042\b\u0004\u0001\u0004\u0000\u0000"+
					"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\u0005\u0006\u0001"+
					"\u0000\u0007\b5\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u0018\u0001"+
					"\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000"+
					"\u0000\b1\u0001\u0000\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b"+
					"\f\u0003\u0000\u0000\u0000\f\r\u0005\u0002\u0000\u0000\r\u0017\u0001\u0000"+
					"\u0000\u0000\u000e\u0013\u0003\u0002\u0001\u0000\u000f\u0010\u0007\u0000"+
					"\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u000f\u0001\u0000"+
					"\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
					"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000"+
					"\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\n\u0001\u0000\u0000"+
					"\u0000\u0016\u000e\u0001\u0000\u0000\u0000\u0017\u0001\u0001\u0000\u0000"+
					"\u0000\u0018\u001d\u0003\u0004\u0002\u0000\u0019\u001a\u0007\u0001\u0000"+
					"\u0000\u001a\u001c\u0003\u0004\u0002\u0000\u001b\u0019\u0001\u0000\u0000"+
					"\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
					"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000"+
					"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 #\u0003\u0006\u0003\u0000!"+
					"\"\u0005\t\u0000\u0000\"$\u0003\u0004\u0002\u0000#!\u0001\u0000\u0000"+
					"\u0000#$\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000%)\u0003"+
					"\b\u0004\u0000&\'\u0005\u0003\u0000\u0000\')\u0003\u0006\u0003\u0000("+
					"%\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)\u0007\u0001\u0000"+
					"\u0000\u0000*2\u0005\u0004\u0000\u0000+,\u0005\u0006\u0000\u0000,2\u0003"+
					"\b\u0004\u0000-.\u0005\u0001\u0000\u0000./\u0003\u0000\u0000\u0000/0\u0005"+
					"\u0002\u0000\u000002\u0001\u0000\u0000\u00001*\u0001\u0000\u0000\u0000"+
					"1+\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u00002\t\u0001\u0000\u0000"+
					"\u0000\u0006\u0013\u0016\u001d#(1";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}