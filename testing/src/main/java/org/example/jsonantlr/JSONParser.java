// Generated from JSON.g4 by ANTLR 4.13.0
package org.example.jsonantlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TEMPLATE_HELPER=10, START_HELPER_BLOCK_2=11, ELSE_BLOCK_2=12, END_HELPER_BLOCK_2=13, 
		L_CURLY_2=14, R_CURLY_2=15, L_CURLY_3=16, R_CURLY_3=17, T_EXPRESSION=18, 
		STRING=19, NUMBER=20, WS=21;
	public static final int
		RULE_json = 0, RULE_obj = 1, RULE_helperOrPair = 2, RULE_pair = 3, RULE_helperPair = 4, 
		RULE_helperIncompleteObj = 5, RULE_pairValue = 6, RULE_arr = 7, RULE_helperArrayValue = 8, 
		RULE_helper = 9, RULE_value = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "obj", "helperOrPair", "pair", "helperPair", "helperIncompleteObj", 
			"pairValue", "arr", "helperArrayValue", "helper", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", 
			"'null'", null, null, null, null, "'{{'", "'}}'", "'{{{'", "'}}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "TEMPLATE_HELPER", 
			"START_HELPER_BLOCK_2", "ELSE_BLOCK_2", "END_HELPER_BLOCK_2", "L_CURLY_2", 
			"R_CURLY_2", "L_CURLY_3", "R_CURLY_3", "T_EXPRESSION", "STRING", "NUMBER", 
			"WS"
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JSONParser.EOF, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			value();
			setState(23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<HelperOrPairContext> helperOrPair() {
			return getRuleContexts(HelperOrPairContext.class);
		}
		public HelperOrPairContext helperOrPair(int i) {
			return getRuleContext(HelperOrPairContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__0);
				setState(26);
				pair();
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(27);
					match(T__1);
					setState(28);
					pair();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__0);
				setState(39);
				helperOrPair();
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(40);
					match(T__1);
					setState(41);
					helperOrPair();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HelperOrPairContext extends ParserRuleContext {
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public HelperPairContext helperPair() {
			return getRuleContext(HelperPairContext.class,0);
		}
		public HelperOrPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperOrPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterHelperOrPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitHelperOrPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitHelperOrPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperOrPairContext helperOrPair() throws RecognitionException {
		HelperOrPairContext _localctx = new HelperOrPairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_helperOrPair);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				pair();
				}
				break;
			case START_HELPER_BLOCK_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				helperPair();
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
	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public PairValueContext pairValue() {
			return getRuleContext(PairValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(STRING);
			setState(56);
			match(T__3);
			setState(57);
			pairValue();
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
	public static class HelperPairContext extends ParserRuleContext {
		public TerminalNode START_HELPER_BLOCK_2() { return getToken(JSONParser.START_HELPER_BLOCK_2, 0); }
		public List<HelperIncompleteObjContext> helperIncompleteObj() {
			return getRuleContexts(HelperIncompleteObjContext.class);
		}
		public HelperIncompleteObjContext helperIncompleteObj(int i) {
			return getRuleContext(HelperIncompleteObjContext.class,i);
		}
		public TerminalNode ELSE_BLOCK_2() { return getToken(JSONParser.ELSE_BLOCK_2, 0); }
		public TerminalNode END_HELPER_BLOCK_2() { return getToken(JSONParser.END_HELPER_BLOCK_2, 0); }
		public HelperPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterHelperPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitHelperPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitHelperPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperPairContext helperPair() throws RecognitionException {
		HelperPairContext _localctx = new HelperPairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_helperPair);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(START_HELPER_BLOCK_2);
				setState(60);
				helperIncompleteObj();
				setState(61);
				match(ELSE_BLOCK_2);
				setState(62);
				helperIncompleteObj();
				setState(63);
				match(END_HELPER_BLOCK_2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(START_HELPER_BLOCK_2);
				setState(66);
				helperIncompleteObj();
				setState(67);
				match(END_HELPER_BLOCK_2);
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
	public static class HelperIncompleteObjContext extends ParserRuleContext {
		public List<HelperOrPairContext> helperOrPair() {
			return getRuleContexts(HelperOrPairContext.class);
		}
		public HelperOrPairContext helperOrPair(int i) {
			return getRuleContext(HelperOrPairContext.class,i);
		}
		public HelperIncompleteObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperIncompleteObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterHelperIncompleteObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitHelperIncompleteObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitHelperIncompleteObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperIncompleteObjContext helperIncompleteObj() throws RecognitionException {
		HelperIncompleteObjContext _localctx = new HelperIncompleteObjContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_helperIncompleteObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			helperOrPair();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(72);
				match(T__1);
				setState(73);
				helperOrPair();
				}
				}
				setState(78);
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
	public static class PairValueContext extends ParserRuleContext {
		public HelperArrayValueContext helperArrayValue() {
			return getRuleContext(HelperArrayValueContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterPairValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitPairValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitPairValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairValueContext pairValue() throws RecognitionException {
		PairValueContext _localctx = new PairValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pairValue);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_HELPER_BLOCK_2:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				helperArrayValue();
				}
				break;
			case T__0:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case TEMPLATE_HELPER:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				value();
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
	public static class ArrContext extends ParserRuleContext {
		public List<HelperArrayValueContext> helperArrayValue() {
			return getRuleContexts(HelperArrayValueContext.class);
		}
		public HelperArrayValueContext helperArrayValue(int i) {
			return getRuleContext(HelperArrayValueContext.class,i);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arr);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__4);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					helperArrayValue();
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==START_HELPER_BLOCK_2 );
				setState(89);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__4);
				setState(92);
				value();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(93);
					match(T__1);
					setState(94);
					value();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(T__4);
				setState(103);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HelperArrayValueContext extends ParserRuleContext {
		public TerminalNode START_HELPER_BLOCK_2() { return getToken(JSONParser.START_HELPER_BLOCK_2, 0); }
		public TerminalNode ELSE_BLOCK_2() { return getToken(JSONParser.ELSE_BLOCK_2, 0); }
		public TerminalNode END_HELPER_BLOCK_2() { return getToken(JSONParser.END_HELPER_BLOCK_2, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<HelperContext> helper() {
			return getRuleContexts(HelperContext.class);
		}
		public HelperContext helper(int i) {
			return getRuleContext(HelperContext.class,i);
		}
		public HelperArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperArrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterHelperArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitHelperArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitHelperArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperArrayValueContext helperArrayValue() throws RecognitionException {
		HelperArrayValueContext _localctx = new HelperArrayValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_helperArrayValue);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(START_HELPER_BLOCK_2);
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(109);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__4:
					case T__6:
					case T__7:
					case T__8:
					case TEMPLATE_HELPER:
					case STRING:
					case NUMBER:
						{
						setState(107);
						value();
						}
						break;
					case START_HELPER_BLOCK_2:
						{
						setState(108);
						helper();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1576866L) != 0) );
				setState(113);
				match(ELSE_BLOCK_2);
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(116);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__4:
					case T__6:
					case T__7:
					case T__8:
					case TEMPLATE_HELPER:
					case STRING:
					case NUMBER:
						{
						setState(114);
						value();
						}
						break;
					case START_HELPER_BLOCK_2:
						{
						setState(115);
						helper();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1576866L) != 0) );
				setState(120);
				match(END_HELPER_BLOCK_2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(START_HELPER_BLOCK_2);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(125);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__4:
					case T__6:
					case T__7:
					case T__8:
					case TEMPLATE_HELPER:
					case STRING:
					case NUMBER:
						{
						setState(123);
						value();
						}
						break;
					case START_HELPER_BLOCK_2:
						{
						setState(124);
						helper();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1576866L) != 0) );
				setState(129);
				match(END_HELPER_BLOCK_2);
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
	public static class HelperContext extends ParserRuleContext {
		public TerminalNode START_HELPER_BLOCK_2() { return getToken(JSONParser.START_HELPER_BLOCK_2, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode ELSE_BLOCK_2() { return getToken(JSONParser.ELSE_BLOCK_2, 0); }
		public TerminalNode END_HELPER_BLOCK_2() { return getToken(JSONParser.END_HELPER_BLOCK_2, 0); }
		public HelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterHelper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitHelper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitHelper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperContext helper() throws RecognitionException {
		HelperContext _localctx = new HelperContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_helper);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(START_HELPER_BLOCK_2);
				setState(134);
				value();
				setState(135);
				match(ELSE_BLOCK_2);
				setState(136);
				value();
				setState(137);
				match(END_HELPER_BLOCK_2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(START_HELPER_BLOCK_2);
				setState(140);
				value();
				setState(141);
				match(END_HELPER_BLOCK_2);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JSONParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode TEMPLATE_HELPER() { return getToken(JSONParser.TEMPLATE_HELPER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				obj();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				arr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				match(T__8);
				}
				break;
			case TEMPLATE_HELPER:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				match(TEMPLATE_HELPER);
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
		"\u0004\u0001\u0015\u009c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00012\b\u0001\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004F\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005K\b\u0005\n\u0005\f\u0005N\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006R\b\u0006\u0001\u0007\u0001\u0007\u0004\u0007V\b\u0007\u000b"+
		"\u0007\f\u0007W\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007`\b\u0007\n\u0007\f\u0007c\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007i\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0004\bn\b\b\u000b\b\f\bo\u0001\b\u0001\b\u0001\b\u0004"+
		"\bu\b\b\u000b\b\f\bv\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b~"+
		"\b\b\u000b\b\f\b\u007f\u0001\b\u0001\b\u0003\b\u0084\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0090\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u009a\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u00ab\u0000\u0016\u0001\u0000"+
		"\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000"+
		"\u00067\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nG\u0001\u0000"+
		"\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000\u0000"+
		"\u0010\u0083\u0001\u0000\u0000\u0000\u0012\u008f\u0001\u0000\u0000\u0000"+
		"\u0014\u0099\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0014\n\u0000\u0017"+
		"\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0005\u0001\u0000\u0000\u001a\u001f\u0003\u0006\u0003\u0000\u001b"+
		"\u001c\u0005\u0002\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0003\u0000\u0000"+
		"#2\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%2\u0005\u0003\u0000"+
		"\u0000&\'\u0005\u0001\u0000\u0000\',\u0003\u0004\u0002\u0000()\u0005\u0002"+
		"\u0000\u0000)+\u0003\u0004\u0002\u0000*(\u0001\u0000\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0003\u0000"+
		"\u000002\u0001\u0000\u0000\u00001\u0019\u0001\u0000\u0000\u00001$\u0001"+
		"\u0000\u0000\u00001&\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000"+
		"\u000036\u0003\u0006\u0003\u000046\u0003\b\u0004\u000053\u0001\u0000\u0000"+
		"\u000054\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u000078\u0005"+
		"\u0013\u0000\u000089\u0005\u0004\u0000\u00009:\u0003\f\u0006\u0000:\u0007"+
		"\u0001\u0000\u0000\u0000;<\u0005\u000b\u0000\u0000<=\u0003\n\u0005\u0000"+
		"=>\u0005\f\u0000\u0000>?\u0003\n\u0005\u0000?@\u0005\r\u0000\u0000@F\u0001"+
		"\u0000\u0000\u0000AB\u0005\u000b\u0000\u0000BC\u0003\n\u0005\u0000CD\u0005"+
		"\r\u0000\u0000DF\u0001\u0000\u0000\u0000E;\u0001\u0000\u0000\u0000EA\u0001"+
		"\u0000\u0000\u0000F\t\u0001\u0000\u0000\u0000GL\u0003\u0004\u0002\u0000"+
		"HI\u0005\u0002\u0000\u0000IK\u0003\u0004\u0002\u0000JH\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OR\u0003\u0010\b\u0000PR\u0003\u0014\n\u0000QO\u0001\u0000\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000R\r\u0001\u0000\u0000\u0000SU\u0005\u0005\u0000"+
		"\u0000TV\u0003\u0010\b\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0005\u0006\u0000\u0000Zi\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u0005\u0000\u0000\\a\u0003\u0014\n\u0000]^\u0005\u0002\u0000\u0000^`"+
		"\u0003\u0014\n\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0006\u0000\u0000ei\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0005\u0000\u0000gi\u0005\u0006\u0000\u0000hS\u0001"+
		"\u0000\u0000\u0000h[\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"i\u000f\u0001\u0000\u0000\u0000jm\u0005\u000b\u0000\u0000kn\u0003\u0014"+
		"\n\u0000ln\u0003\u0012\t\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qt\u0005\f\u0000\u0000ru\u0003"+
		"\u0014\n\u0000su\u0003\u0012\t\u0000tr\u0001\u0000\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\r\u0000\u0000"+
		"y\u0084\u0001\u0000\u0000\u0000z}\u0005\u000b\u0000\u0000{~\u0003\u0014"+
		"\n\u0000|~\u0003\u0012\t\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\r\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083"+
		"j\u0001\u0000\u0000\u0000\u0083z\u0001\u0000\u0000\u0000\u0084\u0011\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u0087\u0003"+
		"\u0014\n\u0000\u0087\u0088\u0005\f\u0000\u0000\u0088\u0089\u0003\u0014"+
		"\n\u0000\u0089\u008a\u0005\r\u0000\u0000\u008a\u0090\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c\u008d\u0003\u0014\n\u0000"+
		"\u008d\u008e\u0005\r\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f"+
		"\u0085\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000\u0000\u0000\u0090"+
		"\u0013\u0001\u0000\u0000\u0000\u0091\u009a\u0005\u0013\u0000\u0000\u0092"+
		"\u009a\u0005\u0014\u0000\u0000\u0093\u009a\u0003\u0002\u0001\u0000\u0094"+
		"\u009a\u0003\u000e\u0007\u0000\u0095\u009a\u0005\u0007\u0000\u0000\u0096"+
		"\u009a\u0005\b\u0000\u0000\u0097\u009a\u0005\t\u0000\u0000\u0098\u009a"+
		"\u0005\n\u0000\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u0099\u0092\u0001"+
		"\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0094\u0001"+
		"\u0000\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u0015\u0001\u0000\u0000\u0000\u0013\u001f,15"+
		"ELQWahmotv}\u007f\u0083\u008f\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}