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
		TEMPLATE=10, START_BLOCK_2=11, ELSE_BLOCK_2=12, END_BLOCK_2=13, L_OPERATOR_2=14, 
		R_OPERATOR_2=15, L_OPERATOR_3=16, R_OPERATOR_3=17, T_EXPRESSION=18, STRING=19, 
		NUMBER=20, WS=21;
	public static final int
		RULE_json = 0, RULE_obj = 1, RULE_operatorOrPair = 2, RULE_pair = 3, RULE_operatorPair = 4, 
		RULE_operatorIncompleteObj = 5, RULE_pairValue = 6, RULE_arr = 7, RULE_operatorValue = 8, 
		RULE_value = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "obj", "operatorOrPair", "pair", "operatorPair", "operatorIncompleteObj", 
			"pairValue", "arr", "operatorValue", "value"
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
			null, null, null, null, null, null, null, null, null, null, "TEMPLATE", 
			"START_BLOCK_2", "ELSE_BLOCK_2", "END_BLOCK_2", "L_OPERATOR_2", "R_OPERATOR_2", 
			"L_OPERATOR_3", "R_OPERATOR_3", "T_EXPRESSION", "STRING", "NUMBER", "WS"
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
			setState(20);
			value();
			setState(21);
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
		public List<OperatorOrPairContext> operatorOrPair() {
			return getRuleContexts(OperatorOrPairContext.class);
		}
		public OperatorOrPairContext operatorOrPair(int i) {
			return getRuleContext(OperatorOrPairContext.class,i);
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(T__0);
				setState(24);
				pair();
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(25);
					match(T__1);
					setState(26);
					pair();
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__0);
				setState(35);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__0);
				setState(37);
				operatorOrPair();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(38);
					match(T__1);
					setState(39);
					operatorOrPair();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45);
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
	public static class OperatorOrPairContext extends ParserRuleContext {
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public OperatorPairContext operatorPair() {
			return getRuleContext(OperatorPairContext.class,0);
		}
		public OperatorOrPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOrPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterOperatorOrPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitOperatorOrPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitOperatorOrPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOrPairContext operatorOrPair() throws RecognitionException {
		OperatorOrPairContext _localctx = new OperatorOrPairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operatorOrPair);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				pair();
				}
				break;
			case START_BLOCK_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				operatorPair();
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
			setState(53);
			match(STRING);
			setState(54);
			match(T__3);
			setState(55);
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
	public static class OperatorPairContext extends ParserRuleContext {
		public TerminalNode START_BLOCK_2() { return getToken(JSONParser.START_BLOCK_2, 0); }
		public List<OperatorIncompleteObjContext> operatorIncompleteObj() {
			return getRuleContexts(OperatorIncompleteObjContext.class);
		}
		public OperatorIncompleteObjContext operatorIncompleteObj(int i) {
			return getRuleContext(OperatorIncompleteObjContext.class,i);
		}
		public TerminalNode ELSE_BLOCK_2() { return getToken(JSONParser.ELSE_BLOCK_2, 0); }
		public TerminalNode END_BLOCK_2() { return getToken(JSONParser.END_BLOCK_2, 0); }
		public OperatorPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterOperatorPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitOperatorPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitOperatorPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorPairContext operatorPair() throws RecognitionException {
		OperatorPairContext _localctx = new OperatorPairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operatorPair);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(START_BLOCK_2);
				setState(58);
				operatorIncompleteObj();
				setState(59);
				match(ELSE_BLOCK_2);
				setState(60);
				operatorIncompleteObj();
				setState(61);
				match(END_BLOCK_2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(START_BLOCK_2);
				setState(64);
				operatorIncompleteObj();
				setState(65);
				match(END_BLOCK_2);
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
	public static class OperatorIncompleteObjContext extends ParserRuleContext {
		public List<OperatorOrPairContext> operatorOrPair() {
			return getRuleContexts(OperatorOrPairContext.class);
		}
		public OperatorOrPairContext operatorOrPair(int i) {
			return getRuleContext(OperatorOrPairContext.class,i);
		}
		public OperatorIncompleteObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorIncompleteObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterOperatorIncompleteObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitOperatorIncompleteObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitOperatorIncompleteObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorIncompleteObjContext operatorIncompleteObj() throws RecognitionException {
		OperatorIncompleteObjContext _localctx = new OperatorIncompleteObjContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operatorIncompleteObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			operatorOrPair();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(70);
				match(T__1);
				setState(71);
				operatorOrPair();
				}
				}
				setState(76);
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
		public OperatorValueContext operatorValue() {
			return getRuleContext(OperatorValueContext.class,0);
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
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_BLOCK_2:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				operatorValue();
				}
				break;
			case T__0:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case TEMPLATE:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public OperatorValueContext operatorValue() {
			return getRuleContext(OperatorValueContext.class,0);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__4);
				setState(82);
				value();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(83);
					match(T__1);
					setState(84);
					value();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__4);
				setState(93);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(T__4);
				setState(95);
				operatorValue();
				setState(96);
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
	public static class OperatorValueContext extends ParserRuleContext {
		public TerminalNode START_BLOCK_2() { return getToken(JSONParser.START_BLOCK_2, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode ELSE_BLOCK_2() { return getToken(JSONParser.ELSE_BLOCK_2, 0); }
		public TerminalNode END_BLOCK_2() { return getToken(JSONParser.END_BLOCK_2, 0); }
		public OperatorValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterOperatorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitOperatorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitOperatorValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorValueContext operatorValue() throws RecognitionException {
		OperatorValueContext _localctx = new OperatorValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operatorValue);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(START_BLOCK_2);
				setState(101);
				value();
				setState(102);
				match(ELSE_BLOCK_2);
				setState(103);
				value();
				setState(104);
				match(END_BLOCK_2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(START_BLOCK_2);
				setState(107);
				value();
				setState(108);
				match(END_BLOCK_2);
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
		public TerminalNode TEMPLATE() { return getToken(JSONParser.TEMPLATE, 0); }
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
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				obj();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				arr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				match(T__8);
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(TEMPLATE);
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
		"\u0004\u0001\u0015{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001\n\u0001"+
		"\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001"+
		"\n\u0001\f\u0001,\t\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004D\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"I\b\u0005\n\u0005\f\u0005L\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"P\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"V\b\u0007\n\u0007\f\u0007Y\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"c\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bo\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\ty\b\t\u0001\t\u0000\u0000\n\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000\u0083\u0000\u0014\u0001"+
		"\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000"+
		"\u0000\u00065\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nE\u0001"+
		"\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000"+
		"\u0000\u0010n\u0001\u0000\u0000\u0000\u0012x\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0003\u0012\t\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000\u0018\u001d"+
		"\u0003\u0006\u0003\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a\u001c"+
		"\u0003\u0006\u0003\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001f"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0003\u0000\u0000!0\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0001\u0000\u0000#0\u0005\u0003\u0000\u0000$%\u0005\u0001\u0000"+
		"\u0000%*\u0003\u0004\u0002\u0000&\'\u0005\u0002\u0000\u0000\')\u0003\u0004"+
		"\u0002\u0000(&\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000-.\u0005\u0003\u0000\u0000.0\u0001\u0000\u0000"+
		"\u0000/\u0017\u0001\u0000\u0000\u0000/\"\u0001\u0000\u0000\u0000/$\u0001"+
		"\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u000014\u0003\u0006\u0003"+
		"\u000024\u0003\b\u0004\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000"+
		"\u00004\u0005\u0001\u0000\u0000\u000056\u0005\u0013\u0000\u000067\u0005"+
		"\u0004\u0000\u000078\u0003\f\u0006\u00008\u0007\u0001\u0000\u0000\u0000"+
		"9:\u0005\u000b\u0000\u0000:;\u0003\n\u0005\u0000;<\u0005\f\u0000\u0000"+
		"<=\u0003\n\u0005\u0000=>\u0005\r\u0000\u0000>D\u0001\u0000\u0000\u0000"+
		"?@\u0005\u000b\u0000\u0000@A\u0003\n\u0005\u0000AB\u0005\r\u0000\u0000"+
		"BD\u0001\u0000\u0000\u0000C9\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000"+
		"\u0000D\t\u0001\u0000\u0000\u0000EJ\u0003\u0004\u0002\u0000FG\u0005\u0002"+
		"\u0000\u0000GI\u0003\u0004\u0002\u0000HF\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\u000b\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MP\u0003\u0010"+
		"\b\u0000NP\u0003\u0012\t\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000P\r\u0001\u0000\u0000\u0000QR\u0005\u0005\u0000\u0000RW\u0003"+
		"\u0012\t\u0000ST\u0005\u0002\u0000\u0000TV\u0003\u0012\t\u0000US\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0006\u0000\u0000[c\u0001\u0000\u0000\u0000\\]\u0005\u0005"+
		"\u0000\u0000]c\u0005\u0006\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0003"+
		"\u0010\b\u0000`a\u0005\u0006\u0000\u0000ac\u0001\u0000\u0000\u0000bQ\u0001"+
		"\u0000\u0000\u0000b\\\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000"+
		"c\u000f\u0001\u0000\u0000\u0000de\u0005\u000b\u0000\u0000ef\u0003\u0012"+
		"\t\u0000fg\u0005\f\u0000\u0000gh\u0003\u0012\t\u0000hi\u0005\r\u0000\u0000"+
		"io\u0001\u0000\u0000\u0000jk\u0005\u000b\u0000\u0000kl\u0003\u0012\t\u0000"+
		"lm\u0005\r\u0000\u0000mo\u0001\u0000\u0000\u0000nd\u0001\u0000\u0000\u0000"+
		"nj\u0001\u0000\u0000\u0000o\u0011\u0001\u0000\u0000\u0000py\u0005\u0013"+
		"\u0000\u0000qy\u0005\u0014\u0000\u0000ry\u0003\u0002\u0001\u0000sy\u0003"+
		"\u000e\u0007\u0000ty\u0005\u0007\u0000\u0000uy\u0005\b\u0000\u0000vy\u0005"+
		"\t\u0000\u0000wy\u0005\n\u0000\u0000xp\u0001\u0000\u0000\u0000xq\u0001"+
		"\u0000\u0000\u0000xr\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000"+
		"xt\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000y\u0013\u0001\u0000\u0000\u0000\u000b"+
		"\u001d*/3CJOWbnx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}