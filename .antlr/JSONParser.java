// Generated from /Users/john/projects/playground_others/antlr/JSON.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		START_BLOCK=10, END_BLOCK=11, L_OPERATOR_2=12, R_OPERATOR_2=13, T_EXPRESSION=14, 
		STRING=15, NUMBER=16, WS=17;
	public static final int
		RULE_json = 0, RULE_obj = 1, RULE_pair = 2, RULE_arr = 3, RULE_templateOperatorExpression = 4, 
		RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "obj", "pair", "arr", "templateOperatorExpression", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", 
			"'null'", null, null, "'{{'", "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "START_BLOCK", 
			"END_BLOCK", "L_OPERATOR_2", "R_OPERATOR_2", "T_EXPRESSION", "STRING", 
			"NUMBER", "WS"
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
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JSONParser.EOF, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			value();
			setState(13);
			match(EOF);
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

	public static class ObjContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(T__0);
				setState(16);
				pair();
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(17);
					match(T__1);
					setState(18);
					pair();
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(24);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__0);
				setState(27);
				match(T__2);
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(STRING);
			setState(31);
			match(T__3);
			setState(32);
			value();
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

	public static class ArrContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arr);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__4);
				setState(35);
				value();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(36);
					match(T__1);
					setState(37);
					value();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__4);
				setState(46);
				match(T__5);
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

	public static class TemplateOperatorExpressionContext extends ParserRuleContext {
		public TerminalNode START_BLOCK() { return getToken(JSONParser.START_BLOCK, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode END_BLOCK() { return getToken(JSONParser.END_BLOCK, 0); }
		public TemplateOperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateOperatorExpression; }
	}

	public final TemplateOperatorExpressionContext templateOperatorExpression() throws RecognitionException {
		TemplateOperatorExpressionContext _localctx = new TemplateOperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_templateOperatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(START_BLOCK);
			setState(50);
			value();
			setState(51);
			match(END_BLOCK);
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

	public static class ValueContext extends ParserRuleContext {
		public TemplateOperatorExpressionContext templateOperatorExpression() {
			return getRuleContext(TemplateOperatorExpressionContext.class,0);
		}
		public TerminalNode T_EXPRESSION() { return getToken(JSONParser.T_EXPRESSION, 0); }
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JSONParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				templateOperatorExpression();
				}
				break;
			case T_EXPRESSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T_EXPRESSION);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				obj();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				arr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				match(T__8);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\7\2\2\b\2\4\6"+
		"\b\n\f\2\2\2H\2\16\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b\61\3\2\2\2\n\63\3"+
		"\2\2\2\f@\3\2\2\2\16\17\5\f\7\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\7\3\2"+
		"\2\22\27\5\6\4\2\23\24\7\4\2\2\24\26\5\6\4\2\25\23\3\2\2\2\26\31\3\2\2"+
		"\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\5\2"+
		"\2\33\37\3\2\2\2\34\35\7\3\2\2\35\37\7\5\2\2\36\21\3\2\2\2\36\34\3\2\2"+
		"\2\37\5\3\2\2\2 !\7\21\2\2!\"\7\6\2\2\"#\5\f\7\2#\7\3\2\2\2$%\7\7\2\2"+
		"%*\5\f\7\2&\'\7\4\2\2\')\5\f\7\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2"+
		"\2+-\3\2\2\2,*\3\2\2\2-.\7\b\2\2.\62\3\2\2\2/\60\7\7\2\2\60\62\7\b\2\2"+
		"\61$\3\2\2\2\61/\3\2\2\2\62\t\3\2\2\2\63\64\7\f\2\2\64\65\5\f\7\2\65\66"+
		"\7\r\2\2\66\13\3\2\2\2\67A\5\n\6\28A\7\20\2\29A\7\21\2\2:A\7\22\2\2;A"+
		"\5\4\3\2<A\5\b\5\2=A\7\t\2\2>A\7\n\2\2?A\7\13\2\2@\67\3\2\2\2@8\3\2\2"+
		"\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2"+
		"\2A\r\3\2\2\2\7\27\36*\61@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}