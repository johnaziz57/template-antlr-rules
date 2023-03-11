// Generated from /Users/john/projects/playground_others/antlr/JSON.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		START_BLOCK=10, END_BLOCK=11, L_OPERATOR_2=12, R_OPERATOR_2=13, T_EXPRESSION=14, 
		STRING=15, NUMBER=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"START_BLOCK", "END_BLOCK", "L_OPERATOR_2", "R_OPERATOR_2", "T_EXPRESSION", 
			"STRING", "ESC", "UNICODE", "HEX", "SAFECODEPOINT", "NUMBER", "INT", 
			"EXP", "WS"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13Q\n\13\r\13"+
		"\16\13R\3\13\7\13V\n\13\f\13\16\13Y\13\13\3\13\3\13\3\f\3\f\3\f\6\f`\n"+
		"\f\r\f\16\fa\3\f\7\fe\n\f\f\f\16\fh\13\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\7\17t\n\17\f\17\16\17w\13\17\3\17\6\17z\n\17\r\17\16\17"+
		"{\3\17\7\17\177\n\17\f\17\16\17\u0082\13\17\3\17\3\17\3\20\3\20\3\20\7"+
		"\20\u0089\n\20\f\20\16\20\u008c\13\20\3\20\3\20\3\21\3\21\3\21\5\21\u0093"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25\u00a0"+
		"\n\25\3\25\3\25\3\25\6\25\u00a5\n\25\r\25\16\25\u00a6\5\25\u00a9\n\25"+
		"\3\25\5\25\u00ac\n\25\3\26\3\26\3\26\7\26\u00b1\n\26\f\26\16\26\u00b4"+
		"\13\26\5\26\u00b6\n\26\3\27\3\27\5\27\u00ba\n\27\3\27\3\27\3\30\6\30\u00bf"+
		"\n\30\r\30\16\30\u00c0\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\'\2)\22+\2-\2/"+
		"\23\3\2\13\4\2UUYY\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\3\2"+
		"\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\2\u00cf\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2)\3\2\2\2\2/\3\2\2\2\3\61\3\2\2"+
		"\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3"+
		"\2\2\2\21B\3\2\2\2\23H\3\2\2\2\25M\3\2\2\2\27\\\3\2\2\2\31k\3\2\2\2\33"+
		"n\3\2\2\2\35q\3\2\2\2\37\u0085\3\2\2\2!\u008f\3\2\2\2#\u0094\3\2\2\2%"+
		"\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009f\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3"+
		"\2\2\2/\u00be\3\2\2\2\61\62\7}\2\2\62\4\3\2\2\2\63\64\7.\2\2\64\6\3\2"+
		"\2\2\65\66\7\177\2\2\66\b\3\2\2\2\678\7<\2\28\n\3\2\2\29:\7]\2\2:\f\3"+
		"\2\2\2;<\7_\2\2<\16\3\2\2\2=>\7v\2\2>?\7t\2\2?@\7w\2\2@A\7g\2\2A\20\3"+
		"\2\2\2BC\7h\2\2CD\7c\2\2DE\7n\2\2EF\7u\2\2FG\7g\2\2G\22\3\2\2\2HI\7p\2"+
		"\2IJ\7w\2\2JK\7n\2\2KL\7n\2\2L\24\3\2\2\2MN\5\31\r\2NP\7%\2\2OQ\5\'\24"+
		"\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SW\3\2\2\2TV\t\2\2\2UT\3\2\2"+
		"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5\33\16\2[\26\3"+
		"\2\2\2\\]\5\31\r\2]_\7\61\2\2^`\5\'\24\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2bf\3\2\2\2ce\t\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gi\3\2\2\2hf\3\2\2\2ij\5\33\16\2j\30\3\2\2\2kl\7}\2\2lm\7}\2\2m\32\3\2"+
		"\2\2no\7\177\2\2op\7\177\2\2p\34\3\2\2\2qu\5\31\r\2rt\t\2\2\2sr\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xz\5\'\24\2yx\3\2"+
		"\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2}\177\t\2\2\2~}\3\2\2"+
		"\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\5\33\16\2\u0084\36\3\2\2\2\u0085"+
		"\u008a\7$\2\2\u0086\u0089\5!\21\2\u0087\u0089\5\'\24\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7$"+
		"\2\2\u008e \3\2\2\2\u008f\u0092\7^\2\2\u0090\u0093\t\3\2\2\u0091\u0093"+
		"\5#\22\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\"\3\2\2\2\u0094"+
		"\u0095\7w\2\2\u0095\u0096\5%\23\2\u0096\u0097\5%\23\2\u0097\u0098\5%\23"+
		"\2\u0098\u0099\5%\23\2\u0099$\3\2\2\2\u009a\u009b\t\4\2\2\u009b&\3\2\2"+
		"\2\u009c\u009d\n\5\2\2\u009d(\3\2\2\2\u009e\u00a0\7/\2\2\u009f\u009e\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a8\5+\26\2\u00a2"+
		"\u00a4\7\60\2\2\u00a3\u00a5\t\6\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a2\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5-"+
		"\27\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac*\3\2\2\2\u00ad\u00b6"+
		"\7\62\2\2\u00ae\u00b2\t\7\2\2\u00af\u00b1\t\6\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b6"+
		",\3\2\2\2\u00b7\u00b9\t\b\2\2\u00b8\u00ba\t\t\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5+\26\2\u00bc.\3"+
		"\2\2\2\u00bd\u00bf\t\n\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\30"+
		"\2\2\u00c3\60\3\2\2\2\25\2RWafu{\u0080\u0088\u008a\u0092\u009f\u00a6\u00a8"+
		"\u00ab\u00b2\u00b5\u00b9\u00c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}