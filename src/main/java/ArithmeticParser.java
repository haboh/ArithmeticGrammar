// Generated from /Users/maksim/work/grammar3/src/main/Arithmetic.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMBER=7, VAR=8;
	public static final int
		RULE_s = 0, RULE_a = 1, RULE_e = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "a", "e"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'+'", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUMBER", "VAR"
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
	public String getGrammarFileName() { return "Arithmetic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		_errHandler = new BailErrorStrategy();
	}

	public static class SContext extends ParserRuleContext {
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }

		public SContext() { }
		public void copyFrom(SContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EquationContext extends SContext {
		public AContext eq;
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public EquationContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends SContext {
		public EContext expr;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExpContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new EquationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				((EquationContext)_localctx).eq = a();
				setState(7);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				((ExpContext)_localctx).expr = e(0);
				setState(10);
				match(T__0);
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

	public static class AContext extends ParserRuleContext {
		public Token var;
		public EContext expr;
		public TerminalNode VAR() { return getToken(ArithmeticParser.VAR, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((AContext)_localctx).var = match(VAR);
			setState(15);
			match(T__1);
			setState(16);
			((AContext)_localctx).expr = e(0);
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

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }

		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpExprContext extends EContext {
		public EContext left;
		public Token op;
		public EContext right;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public OpExprContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends EContext {
		public Token atom;
		public TerminalNode NUMBER() { return getToken(ArithmeticParser.NUMBER, 0); }
		public AtomExprContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends EContext {
		public EContext value;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ParenExprContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarEquationContext extends EContext {
		public Token variable;
		public TerminalNode VAR() { return getToken(ArithmeticParser.VAR, 0); }
		public VarEquationContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterVarEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitVarEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitVarEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(T__4);
				setState(20);
				((ParenExprContext)_localctx).value = e(0);
				setState(21);
				match(T__5);
				}
				break;
			case VAR:
				{
				_localctx = new VarEquationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				((VarEquationContext)_localctx).variable = match(VAR);
				}
				break;
			case NUMBER:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				((AtomExprContext)_localctx).atom = match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpExprContext(new EContext(_parentctx, _parentState));
					((OpExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_e);
					setState(27);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(28);
					((OpExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
						((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(29);
					((OpExprContext)_localctx).right = e(5);
					}
					}
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b$\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001a\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002"+
		"\u0001\u0002\u0000\u0001\u0004\u0003\u0000\u0002\u0004\u0000\u0001\u0001"+
		"\u0000\u0003\u0004$\u0000\f\u0001\u0000\u0000\u0000\u0002\u000e\u0001"+
		"\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006\u0007\u0003"+
		"\u0002\u0001\u0000\u0007\b\u0005\u0001\u0000\u0000\b\r\u0001\u0000\u0000"+
		"\u0000\t\n\u0003\u0004\u0002\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b"+
		"\r\u0001\u0000\u0000\u0000\f\u0006\u0001\u0000\u0000\u0000\f\t\u0001\u0000"+
		"\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0005\b\u0000"+
		"\u0000\u000f\u0010\u0005\u0002\u0000\u0000\u0010\u0011\u0003\u0004\u0002"+
		"\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012\u0013\u0006\u0002\uffff"+
		"\uffff\u0000\u0013\u0014\u0005\u0005\u0000\u0000\u0014\u0015\u0003\u0004"+
		"\u0002\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u001a\u0001\u0000"+
		"\u0000\u0000\u0017\u001a\u0005\b\u0000\u0000\u0018\u001a\u0005\u0007\u0000"+
		"\u0000\u0019\u0012\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a \u0001\u0000\u0000\u0000"+
		"\u001b\u001c\n\u0004\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d"+
		"\u001f\u0003\u0004\u0002\u0005\u001e\u001b\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\u0003\f\u0019 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}