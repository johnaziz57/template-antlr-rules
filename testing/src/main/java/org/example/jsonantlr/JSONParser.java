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
		TEMPLATE_HELPER=10, ONE_CLAUSE_HELPER=11, START_HELPER_BLOCK_2=12, ELSE_BLOCK_2=13, 
		END_HELPER_BLOCK_2=14, L_CURLY_2=15, R_CURLY_2=16, L_CURLY_3=17, R_CURLY_3=18, 
		STRING=19, HELPER_NAME=20, NUMBER=21, WS=22;
	public static final int
		RULE_json = 0, RULE_obj = 1, RULE_helperOrPair = 2, RULE_pair = 3, RULE_helperPair = 4, 
		RULE_helperIncompleteObj = 5, RULE_pairValue = 6, RULE_arr = 7, RULE_helperOrValue = 8, 
		RULE_helper = 9, RULE_value = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "obj", "helperOrPair", "pair", "helperPair", "helperIncompleteObj", 
			"pairValue", "arr", "helperOrValue", "helper", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", 
			"'null'", null, null, null, null, null, "'{{'", "'}}'", "'{{{'", "'}}}'", 
			null, "'math'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "TEMPLATE_HELPER", 
			"ONE_CLAUSE_HELPER", "START_HELPER_BLOCK_2", "ELSE_BLOCK_2", "END_HELPER_BLOCK_2", 
			"L_CURLY_2", "R_CURLY_2", "L_CURLY_3", "R_CURLY_3", "STRING", "HELPER_NAME", 
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
		public List<HelperOrPairContext> helperOrPair() {
			return getRuleContexts(HelperOrPairContext.class);
		}
		public HelperOrPairContext helperOrPair(int i) {
			return getRuleContext(HelperOrPairContext.class,i);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__0);
				setState(26);
				helperOrPair();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528388L) != 0)) {
					{
					{
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(27);
						match(T__1);
						}
					}

					setState(30);
					helperOrPair();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__0);
				setState(39);
				pair();
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(40);
					match(T__1);
					setState(41);
					pair();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(T__0);
				setState(50);
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
	}

	public final HelperOrPairContext helperOrPair() throws RecognitionException {
		HelperOrPairContext _localctx = new HelperOrPairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_helperOrPair);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				pair();
				}
				break;
			case START_HELPER_BLOCK_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
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
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(STRING);
			setState(58);
			match(T__3);
			setState(59);
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
	}

	public final HelperPairContext helperPair() throws RecognitionException {
		HelperPairContext _localctx = new HelperPairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_helperPair);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(START_HELPER_BLOCK_2);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(62);
					match(T__1);
					}
				}

				setState(65);
				helperIncompleteObj();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(66);
					match(T__1);
					}
				}

				setState(69);
				match(ELSE_BLOCK_2);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(70);
					match(T__1);
					}
				}

				setState(73);
				helperIncompleteObj();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(74);
					match(T__1);
					}
				}

				setState(77);
				match(END_HELPER_BLOCK_2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(START_HELPER_BLOCK_2);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(80);
					match(T__1);
					}
				}

				setState(83);
				helperIncompleteObj();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(84);
					match(T__1);
					}
				}

				setState(87);
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
	}

	public final HelperIncompleteObjContext helperIncompleteObj() throws RecognitionException {
		HelperIncompleteObjContext _localctx = new HelperIncompleteObjContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_helperIncompleteObj);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			helperOrPair();
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(92);
						match(T__1);
						}
					}

					setState(95);
					helperOrPair();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public HelperContext helper() {
			return getRuleContext(HelperContext.class,0);
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
	}

	public final PairValueContext pairValue() throws RecognitionException {
		PairValueContext _localctx = new PairValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pairValue);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case TEMPLATE_HELPER:
			case ONE_CLAUSE_HELPER:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				value();
				}
				break;
			case START_HELPER_BLOCK_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				helper();
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
		public List<HelperOrValueContext> helperOrValue() {
			return getRuleContexts(HelperOrValueContext.class);
		}
		public HelperOrValueContext helperOrValue(int i) {
			return getRuleContext(HelperOrValueContext.class,i);
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
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arr);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__4);
				setState(106);
				helperOrValue();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2629542L) != 0)) {
					{
					{
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(107);
						match(T__1);
						}
					}

					setState(110);
					helperOrValue();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T__4);
				setState(119);
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
	public static class HelperOrValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public HelperContext helper() {
			return getRuleContext(HelperContext.class,0);
		}
		public HelperOrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperOrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterHelperOrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitHelperOrValue(this);
		}
	}

	public final HelperOrValueContext helperOrValue() throws RecognitionException {
		HelperOrValueContext _localctx = new HelperOrValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_helperOrValue);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case TEMPLATE_HELPER:
			case ONE_CLAUSE_HELPER:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				value();
				}
				break;
			case START_HELPER_BLOCK_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				helper();
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
	public static class HelperContext extends ParserRuleContext {
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
	}

	public final HelperContext helper() throws RecognitionException {
		HelperContext _localctx = new HelperContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_helper);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(START_HELPER_BLOCK_2);
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(127);
					match(T__1);
					}
					break;
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2629538L) != 0)) {
					{
					setState(132);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__4:
					case T__6:
					case T__7:
					case T__8:
					case TEMPLATE_HELPER:
					case ONE_CLAUSE_HELPER:
					case STRING:
					case NUMBER:
						{
						setState(130);
						value();
						}
						break;
					case START_HELPER_BLOCK_2:
						{
						setState(131);
						helper();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(137);
					match(T__1);
					}
				}

				setState(140);
				match(ELSE_BLOCK_2);
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(141);
					match(T__1);
					}
					break;
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2629538L) != 0)) {
					{
					setState(146);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__4:
					case T__6:
					case T__7:
					case T__8:
					case TEMPLATE_HELPER:
					case ONE_CLAUSE_HELPER:
					case STRING:
					case NUMBER:
						{
						setState(144);
						value();
						}
						break;
					case START_HELPER_BLOCK_2:
						{
						setState(145);
						helper();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(151);
					match(T__1);
					}
				}

				setState(154);
				match(END_HELPER_BLOCK_2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(START_HELPER_BLOCK_2);
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(156);
					match(T__1);
					}
					break;
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2629538L) != 0)) {
					{
					setState(161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__4:
					case T__6:
					case T__7:
					case T__8:
					case TEMPLATE_HELPER:
					case ONE_CLAUSE_HELPER:
					case STRING:
					case NUMBER:
						{
						setState(159);
						value();
						}
						break;
					case START_HELPER_BLOCK_2:
						{
						setState(160);
						helper();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(166);
					match(T__1);
					}
				}

				setState(169);
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
		public TerminalNode ONE_CLAUSE_HELPER() { return getToken(JSONParser.ONE_CLAUSE_HELPER, 0); }
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				obj();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				arr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				match(T__8);
				}
				break;
			case ONE_CLAUSE_HELPER:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				match(ONE_CLAUSE_HELPER);
				}
				break;
			case TEMPLATE_HELPER:
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
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
		"\u0004\u0001\u0016\u00b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d\b\u0001"+
		"\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"8\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004@\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"D\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004L\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004R\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005^\b\u0005\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005"+
		"d\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006h\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007m\b\u0007\u0001\u0007\u0005\u0007p\b\u0007"+
		"\n\u0007\f\u0007s\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007y\b\u0007\u0001\b\u0001\b\u0003\b}\b\b\u0001\t\u0001\t\u0003"+
		"\t\u0081\b\t\u0001\t\u0001\t\u0005\t\u0085\b\t\n\t\f\t\u0088\t\t\u0001"+
		"\t\u0003\t\u008b\b\t\u0001\t\u0001\t\u0003\t\u008f\b\t\u0001\t\u0001\t"+
		"\u0005\t\u0093\b\t\n\t\f\t\u0096\t\t\u0001\t\u0003\t\u0099\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u009e\b\t\u0001\t\u0001\t\u0005\t\u00a2\b\t\n"+
		"\t\f\t\u00a5\t\t\u0001\t\u0003\t\u00a8\b\t\u0001\t\u0003\t\u00ab\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00b6\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0000\u00d5\u0000\u0016\u0001\u0000\u0000\u0000"+
		"\u00023\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u00069"+
		"\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\fg\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010"+
		"|\u0001\u0000\u0000\u0000\u0012\u00aa\u0001\u0000\u0000\u0000\u0014\u00b5"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0014\n\u0000\u0017\u0018\u0005"+
		"\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"\u0001\u0000\u0000\u001a!\u0003\u0004\u0002\u0000\u001b\u001d\u0005\u0002"+
		"\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0003\u0004\u0002"+
		"\u0000\u001f\u001c\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0003\u0000\u0000%4\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\',\u0003\u0006\u0003\u0000"+
		"()\u0005\u0002\u0000\u0000)+\u0003\u0006\u0003\u0000*(\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0003\u0000\u000004\u0001\u0000\u0000\u000012\u0005\u0001\u0000\u0000"+
		"24\u0005\u0003\u0000\u00003\u0019\u0001\u0000\u0000\u00003&\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u0000"+
		"58\u0003\u0006\u0003\u000068\u0003\b\u0004\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0005\u0013"+
		"\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0003\f\u0006\u0000<\u0007\u0001"+
		"\u0000\u0000\u0000=?\u0005\f\u0000\u0000>@\u0005\u0002\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AC\u0003\n\u0005\u0000BD\u0005\u0002\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0005\r\u0000\u0000"+
		"FH\u0005\u0002\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IK\u0003\n\u0005\u0000JL\u0005\u0002\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0005\u000e\u0000\u0000NZ\u0001\u0000\u0000\u0000OQ\u0005"+
		"\f\u0000\u0000PR\u0005\u0002\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0003\n\u0005\u0000TV\u0005"+
		"\u0002\u0000\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0005\u000e\u0000\u0000XZ\u0001\u0000\u0000"+
		"\u0000Y=\u0001\u0000\u0000\u0000YO\u0001\u0000\u0000\u0000Z\t\u0001\u0000"+
		"\u0000\u0000[b\u0003\u0004\u0002\u0000\\^\u0005\u0002\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_a\u0003\u0004\u0002\u0000`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u000b\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eh\u0003\u0014\n\u0000fh\u0003"+
		"\u0012\t\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\r"+
		"\u0001\u0000\u0000\u0000ij\u0005\u0005\u0000\u0000jq\u0003\u0010\b\u0000"+
		"km\u0005\u0002\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000np\u0003\u0010\b\u0000ol\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0006\u0000\u0000uy\u0001\u0000\u0000\u0000vw\u0005\u0005\u0000\u0000"+
		"wy\u0005\u0006\u0000\u0000xi\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000y\u000f\u0001\u0000\u0000\u0000z}\u0003\u0014\n\u0000{}\u0003\u0012"+
		"\t\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0011\u0001"+
		"\u0000\u0000\u0000~\u0080\u0005\f\u0000\u0000\u007f\u0081\u0005\u0002"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0086\u0001\u0000\u0000\u0000\u0082\u0085\u0003\u0014"+
		"\n\u0000\u0083\u0085\u0003\u0012\t\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0005\u0002\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0005\r\u0000\u0000\u008d\u008f\u0005\u0002\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0094\u0001\u0000\u0000\u0000\u0090\u0093\u0003\u0014\n\u0000\u0091"+
		"\u0093\u0003\u0012\t\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0098"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0005\u0002\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00ab"+
		"\u0005\u000e\u0000\u0000\u009b\u009d\u0005\f\u0000\u0000\u009c\u009e\u0005"+
		"\u0002\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a3\u0001\u0000\u0000\u0000\u009f\u00a2\u0003"+
		"\u0014\n\u0000\u00a0\u00a2\u0003\u0012\t\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0005\u0002\u0000\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0005\u000e\u0000\u0000\u00aa~\u0001\u0000\u0000"+
		"\u0000\u00aa\u009b\u0001\u0000\u0000\u0000\u00ab\u0013\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b6\u0005\u0013\u0000\u0000\u00ad\u00b6\u0005\u0015\u0000"+
		"\u0000\u00ae\u00b6\u0003\u0002\u0001\u0000\u00af\u00b6\u0003\u000e\u0007"+
		"\u0000\u00b0\u00b6\u0005\u0007\u0000\u0000\u00b1\u00b6\u0005\b\u0000\u0000"+
		"\u00b2\u00b6\u0005\t\u0000\u0000\u00b3\u00b6\u0005\u000b\u0000\u0000\u00b4"+
		"\u00b6\u0005\n\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b5\u00af"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u0015"+
		"\u0001\u0000\u0000\u0000!\u001c!,37?CGKQUY]bglqx|\u0080\u0084\u0086\u008a"+
		"\u008e\u0092\u0094\u0098\u009d\u00a1\u00a3\u00a7\u00aa\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}