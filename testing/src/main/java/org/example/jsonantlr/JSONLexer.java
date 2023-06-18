// Generated from JSON.g4 by ANTLR 4.13.0
package org.example.jsonantlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TEMPLATE_HELPER=10, ONE_CLAUSE_HELPER=11, START_HELPER_BLOCK_2=12, ELSE_BLOCK_2=13, 
		END_HELPER_BLOCK_2=14, L_CURLY_2=15, R_CURLY_2=16, L_CURLY_3=17, R_CURLY_3=18, 
		STRING=19, ONE_CLAUSE_HELPER_NAME=20, NUMBER=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"TEMPLATE_HELPER", "ONE_CLAUSE_HELPER", "START_HELPER_BLOCK_2", "ELSE_BLOCK_2", 
			"END_HELPER_BLOCK_2", "L_CURLY_2", "R_CURLY_2", "L_CURLY_3", "R_CURLY_3", 
			"STRING", "ESC", "UNICODE", "HEX", "SAFE_HELPER_CODE_POINT", "ONE_CLAUSE_HELPER_NAME", 
			"SAFE_CODE_POINT", "NUMBER", "INT", "EXP", "WS"
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
			"L_CURLY_2", "R_CURLY_2", "L_CURLY_3", "R_CURLY_3", "STRING", "ONE_CLAUSE_HELPER_NAME", 
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
		"\u0004\u0000\u0016\u00f0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\tc\b\t\n\t\f\tf\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0004\no\b\n\u000b\n\f\np\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000bx\b\u000b\u000b\u000b\f\u000b"+
		"y\u0001\u000b\u0005\u000b}\b\u000b\n\u000b\f\u000b\u0080\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0084\b\u000b\n\u000b\f\u000b\u0087\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0004\r\u0096\b\r\u000b\r\f"+
		"\r\u0097\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00ad\b\u0012\n\u0012\f\u0012\u00b0\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b7"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0003\u0016\u00c2\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0003\u0019\u00cc\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0004\u0019\u00d1\b\u0019\u000b\u0019\f\u0019\u00d2\u0003\u0019"+
		"\u00d5\b\u0019\u0001\u0019\u0003\u0019\u00d8\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u00dd\b\u001a\n\u001a\f\u001a\u00e0\t\u001a"+
		"\u0003\u001a\u00e2\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u00e6\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u00eb\b\u001c\u000b"+
		"\u001c\f\u001c\u00ec\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0000)\u0000+\u0000-\u0000/\u0014"+
		"1\u00003\u00155\u00007\u00009\u0016\u0001\u0000\t\b\u0000\"\"//\\\\bb"+
		"ffnnrrtt\u0003\u000009AFaf\n\u0000\"\"()++..09==@]__az||\u0003\u0000\u0000"+
		"\u001f\"\"\\\\\u0001\u000009\u0001\u000019\u0002\u0000EEee\u0002\u0000"+
		"++--\u0003\u0000\t\n\r\r  \u00fb\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;\u0001"+
		"\u0000\u0000\u0000\u0003=\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000"+
		"\u0000\u0007A\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000b"+
		"E\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fL\u0001\u0000"+
		"\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013W\u0001\u0000\u0000\u0000"+
		"\u0015i\u0001\u0000\u0000\u0000\u0017t\u0001\u0000\u0000\u0000\u0019\u008a"+
		"\u0001\u0000\u0000\u0000\u001b\u0092\u0001\u0000\u0000\u0000\u001d\u009b"+
		"\u0001\u0000\u0000\u0000\u001f\u009e\u0001\u0000\u0000\u0000!\u00a1\u0001"+
		"\u0000\u0000\u0000#\u00a5\u0001\u0000\u0000\u0000%\u00a9\u0001\u0000\u0000"+
		"\u0000\'\u00b3\u0001\u0000\u0000\u0000)\u00b8\u0001\u0000\u0000\u0000"+
		"+\u00be\u0001\u0000\u0000\u0000-\u00c1\u0001\u0000\u0000\u0000/\u00c3"+
		"\u0001\u0000\u0000\u00001\u00c8\u0001\u0000\u0000\u00003\u00cb\u0001\u0000"+
		"\u0000\u00005\u00e1\u0001\u0000\u0000\u00007\u00e3\u0001\u0000\u0000\u0000"+
		"9\u00ea\u0001\u0000\u0000\u0000;<\u0005{\u0000\u0000<\u0002\u0001\u0000"+
		"\u0000\u0000=>\u0005,\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005"+
		"}\u0000\u0000@\u0006\u0001\u0000\u0000\u0000AB\u0005:\u0000\u0000B\b\u0001"+
		"\u0000\u0000\u0000CD\u0005[\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005"+
		"]\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005t\u0000\u0000HI\u0005"+
		"r\u0000\u0000IJ\u0005u\u0000\u0000JK\u0005e\u0000\u0000K\u000e\u0001\u0000"+
		"\u0000\u0000LM\u0005f\u0000\u0000MN\u0005a\u0000\u0000NO\u0005l\u0000"+
		"\u0000OP\u0005s\u0000\u0000PQ\u0005e\u0000\u0000Q\u0010\u0001\u0000\u0000"+
		"\u0000RS\u0005n\u0000\u0000ST\u0005u\u0000\u0000TU\u0005l\u0000\u0000"+
		"UV\u0005l\u0000\u0000V\u0012\u0001\u0000\u0000\u0000WX\u0003!\u0010\u0000"+
		"XY\u0005t\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005m\u0000\u0000[\\\u0005"+
		"p\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005a\u0000\u0000^_\u0005t\u0000"+
		"\u0000_`\u0005e\u0000\u0000`d\u0001\u0000\u0000\u0000ac\u00031\u0018\u0000"+
		"ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gh\u0003#\u0011\u0000h\u0014\u0001\u0000\u0000\u0000ij\u0003"+
		"\u001d\u000e\u0000jk\u0003/\u0017\u0000kn\u00039\u001c\u0000lo\u0003-"+
		"\u0016\u0000mo\u00039\u001c\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0003\u001f\u000f\u0000"+
		"s\u0016\u0001\u0000\u0000\u0000tu\u0003\u001d\u000e\u0000uw\u0005#\u0000"+
		"\u0000vx\u0003-\u0016\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z~\u0001\u0000"+
		"\u0000\u0000{}\u00039\u001c\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0085\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0003-\u0016\u0000\u0082\u0084\u00039\u001c\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u001f\u000f\u0000\u0089\u0018"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u001d\u000e\u0000\u008b\u008c"+
		"\u0005e\u0000\u0000\u008c\u008d\u0005l\u0000\u0000\u008d\u008e\u0005s"+
		"\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0003\u001f\u000f\u0000\u0091\u001a\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0003\u001d\u000e\u0000\u0093\u0095\u0005/\u0000\u0000"+
		"\u0094\u0096\u0003-\u0016\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0003\u001f\u000f\u0000\u009a\u001c\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005{\u0000\u0000\u009c\u009d\u0005{\u0000\u0000\u009d\u001e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005}\u0000\u0000\u009f\u00a0\u0005}\u0000"+
		"\u0000\u00a0 \u0001\u0000\u0000\u0000\u00a1\u00a2\u0005{\u0000\u0000\u00a2"+
		"\u00a3\u0005{\u0000\u0000\u00a3\u00a4\u0005{\u0000\u0000\u00a4\"\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005}\u0000\u0000\u00a6\u00a7\u0005}\u0000"+
		"\u0000\u00a7\u00a8\u0005}\u0000\u0000\u00a8$\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ae\u0005\"\u0000\u0000\u00aa\u00ad\u0003\'\u0013\u0000\u00ab\u00ad"+
		"\u00031\u0018\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\"\u0000\u0000\u00b2&\u0001\u0000\u0000\u0000\u00b3\u00b6\u0005\\\u0000"+
		"\u0000\u00b4\u00b7\u0007\u0000\u0000\u0000\u00b5\u00b7\u0003)\u0014\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7(\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005u\u0000\u0000\u00b9\u00ba"+
		"\u0003+\u0015\u0000\u00ba\u00bb\u0003+\u0015\u0000\u00bb\u00bc\u0003+"+
		"\u0015\u0000\u00bc\u00bd\u0003+\u0015\u0000\u00bd*\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0007\u0001\u0000\u0000\u00bf,\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0007\u0002\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		".\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005m\u0000\u0000\u00c4\u00c5\u0005"+
		"a\u0000\u0000\u00c5\u00c6\u0005t\u0000\u0000\u00c6\u00c7\u0005h\u0000"+
		"\u0000\u00c70\u0001\u0000\u0000\u0000\u00c8\u00c9\b\u0003\u0000\u0000"+
		"\u00c92\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005-\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d4\u00035\u001a\u0000\u00ce\u00d0\u0005"+
		".\u0000\u0000\u00cf\u00d1\u0007\u0004\u0000\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d8\u00037\u001b"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d84\u0001\u0000\u0000\u0000\u00d9\u00e2\u00050\u0000\u0000\u00da"+
		"\u00de\u0007\u0005\u0000\u0000\u00db\u00dd\u0007\u0004\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1"+
		"\u00d9\u0001\u0000\u0000\u0000\u00e1\u00da\u0001\u0000\u0000\u0000\u00e2"+
		"6\u0001\u0000\u0000\u0000\u00e3\u00e5\u0007\u0006\u0000\u0000\u00e4\u00e6"+
		"\u0007\u0007\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u00035\u001a\u0000\u00e88\u0001\u0000\u0000\u0000\u00e9\u00eb\u0007\b"+
		"\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0006\u001c"+
		"\u0000\u0000\u00ef:\u0001\u0000\u0000\u0000\u0015\u0000dnpy~\u0083\u0085"+
		"\u0097\u00ac\u00ae\u00b6\u00c1\u00cb\u00d2\u00d4\u00d7\u00de\u00e1\u00e5"+
		"\u00ec\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}