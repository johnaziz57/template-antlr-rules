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
		LT2OPERATOR=10, RT2OPERATOR=11, TEXPRESSION=12, STRING=13, NUMBER=14, 
		WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"LT2OPERATOR", "RT2OPERATOR", "TEXPRESSION", "STRING", "ESC", "UNICODE", 
			"HEX", "SAFECODEPOINT", "NUMBER", "INT", "EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", 
			"'null'", "'{{'", "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "LT2OPERATOR", 
			"RT2OPERATOR", "TEXPRESSION", "STRING", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\7\rR\n\r\f\r\16"+
		"\rU\13\r\3\r\6\rX\n\r\r\r\16\rY\3\r\7\r]\n\r\f\r\16\r`\13\r\3\r\3\r\3"+
		"\16\3\16\3\16\7\16g\n\16\f\16\16\16j\13\16\3\16\3\16\3\17\3\17\3\17\5"+
		"\17q\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23"+
		"~\n\23\3\23\3\23\3\23\6\23\u0083\n\23\r\23\16\23\u0084\5\23\u0087\n\23"+
		"\3\23\5\23\u008a\n\23\3\24\3\24\3\24\7\24\u008f\n\24\f\24\16\24\u0092"+
		"\13\24\5\24\u0094\n\24\3\25\3\25\5\25\u0098\n\25\3\25\3\25\3\26\6\26\u009d"+
		"\n\26\r\26\16\26\u009e\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\2#\2%\20\'\2)\2+\21\3\2\13"+
		"\4\2UUYY\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\3\2\62;\3\2\63"+
		";\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2%\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2"+
		"\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21>\3\2\2\2\23D\3\2\2\2\25I\3"+
		"\2\2\2\27L\3\2\2\2\31O\3\2\2\2\33c\3\2\2\2\35m\3\2\2\2\37r\3\2\2\2!x\3"+
		"\2\2\2#z\3\2\2\2%}\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u009c\3\2\2"+
		"\2-.\7}\2\2.\4\3\2\2\2/\60\7.\2\2\60\6\3\2\2\2\61\62\7\177\2\2\62\b\3"+
		"\2\2\2\63\64\7<\2\2\64\n\3\2\2\2\65\66\7]\2\2\66\f\3\2\2\2\678\7_\2\2"+
		"8\16\3\2\2\29:\7v\2\2:;\7t\2\2;<\7w\2\2<=\7g\2\2=\20\3\2\2\2>?\7h\2\2"+
		"?@\7c\2\2@A\7n\2\2AB\7u\2\2BC\7g\2\2C\22\3\2\2\2DE\7p\2\2EF\7w\2\2FG\7"+
		"n\2\2GH\7n\2\2H\24\3\2\2\2IJ\7}\2\2JK\7}\2\2K\26\3\2\2\2LM\7\177\2\2M"+
		"N\7\177\2\2N\30\3\2\2\2OS\5\25\13\2PR\t\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VX\5#\22\2WV\3\2\2\2XY\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z^\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^"+
		"_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\5\27\f\2b\32\3\2\2\2ch\7$\2\2dg\5\35\17"+
		"\2eg\5#\22\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2"+
		"\2jh\3\2\2\2kl\7$\2\2l\34\3\2\2\2mp\7^\2\2nq\t\3\2\2oq\5\37\20\2pn\3\2"+
		"\2\2po\3\2\2\2q\36\3\2\2\2rs\7w\2\2st\5!\21\2tu\5!\21\2uv\5!\21\2vw\5"+
		"!\21\2w \3\2\2\2xy\t\4\2\2y\"\3\2\2\2z{\n\5\2\2{$\3\2\2\2|~\7/\2\2}|\3"+
		"\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0086\5\'\24\2\u0080\u0082\7\60\2\2"+
		"\u0081\u0083\t\6\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0080\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\5)\25\2\u0089\u0088\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a&\3\2\2\2\u008b\u0094\7\62\2\2\u008c\u0090"+
		"\t\7\2\2\u008d\u008f\t\6\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0094(\3\2\2\2\u0095\u0097"+
		"\t\b\2\2\u0096\u0098\t\t\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\5\'\24\2\u009a*\3\2\2\2\u009b\u009d\t\n\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\26\2\2\u00a1,\3\2\2\2\21\2"+
		"SY^fhp}\u0084\u0086\u0089\u0090\u0093\u0097\u009e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}