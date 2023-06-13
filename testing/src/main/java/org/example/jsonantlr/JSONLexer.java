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
		TEMPLATE=10, START_BLOCK_2=11, ELSE_BLOCK_2=12, END_BLOCK_2=13, L_OPERATOR_2=14, 
		R_OPERATOR_2=15, L_OPERATOR_3=16, R_OPERATOR_3=17, T_EXPRESSION=18, STRING=19, 
		NUMBER=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"TEMPLATE", "START_BLOCK_2", "ELSE_BLOCK_2", "END_BLOCK_2", "L_OPERATOR_2", 
			"R_OPERATOR_2", "L_OPERATOR_3", "R_OPERATOR_3", "T_EXPRESSION", "STRING", 
			"ESC", "UNICODE", "HEX", "SAFECODEPOINT", "NUMBER", "INT", "EXP", "WS"
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
		"\u0004\u0000\u0015\u00ed\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t`\b\t\n\t\f"+
		"\tc\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\nj\b\n\u000b\n\f"+
		"\nk\u0001\n\u0005\no\b\n\n\n\f\nr\t\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u0081\b\f\u000b\f\f\f\u0082\u0001"+
		"\f\u0005\f\u0086\b\f\n\f\f\f\u0089\t\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u009d\b\u0011\n\u0011\f\u0011\u00a0\t\u0011"+
		"\u0001\u0011\u0004\u0011\u00a3\b\u0011\u000b\u0011\f\u0011\u00a4\u0001"+
		"\u0011\u0005\u0011\u00a8\b\u0011\n\u0011\f\u0011\u00ab\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00b2\b\u0012"+
		"\n\u0012\f\u0012\u00b5\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00bc\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0003\u0017\u00c9\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u00ce\b\u0017\u000b\u0017\f\u0017\u00cf"+
		"\u0003\u0017\u00d2\b\u0017\u0001\u0017\u0003\u0017\u00d5\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00da\b\u0018\n\u0018\f\u0018"+
		"\u00dd\t\u0018\u0003\u0018\u00df\b\u0018\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u00e3\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u00e8"+
		"\b\u001a\u000b\u001a\f\u001a\u00e9\u0001\u001a\u0001\u001a\u0000\u0000"+
		"\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0000)\u0000+\u0000-\u0000"+
		"/\u00141\u00003\u00005\u0015\u0001\u0000\t\u0002\u0000SSWW\b\u0000\"\""+
		"//\\\\bbffnnrrtt\u0003\u000009AFaf\u0003\u0000\u0000\u001f\"\"\\\\\u0001"+
		"\u000009\u0001\u000019\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n"+
		"\r\r  \u00fa\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000"+
		"\u0005;\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001"+
		"\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000"+
		"\u0000\u000fH\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000\u0000\u0013"+
		"S\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017u\u0001"+
		"\u0000\u0000\u0000\u0019}\u0001\u0000\u0000\u0000\u001b\u008c\u0001\u0000"+
		"\u0000\u0000\u001d\u008f\u0001\u0000\u0000\u0000\u001f\u0092\u0001\u0000"+
		"\u0000\u0000!\u0096\u0001\u0000\u0000\u0000#\u009a\u0001\u0000\u0000\u0000"+
		"%\u00ae\u0001\u0000\u0000\u0000\'\u00b8\u0001\u0000\u0000\u0000)\u00bd"+
		"\u0001\u0000\u0000\u0000+\u00c3\u0001\u0000\u0000\u0000-\u00c5\u0001\u0000"+
		"\u0000\u0000/\u00c8\u0001\u0000\u0000\u00001\u00de\u0001\u0000\u0000\u0000"+
		"3\u00e0\u0001\u0000\u0000\u00005\u00e7\u0001\u0000\u0000\u000078\u0005"+
		"{\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005,\u0000\u0000:\u0004"+
		"\u0001\u0000\u0000\u0000;<\u0005}\u0000\u0000<\u0006\u0001\u0000\u0000"+
		"\u0000=>\u0005:\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005[\u0000"+
		"\u0000@\n\u0001\u0000\u0000\u0000AB\u0005]\u0000\u0000B\f\u0001\u0000"+
		"\u0000\u0000CD\u0005t\u0000\u0000DE\u0005r\u0000\u0000EF\u0005u\u0000"+
		"\u0000FG\u0005e\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005f\u0000"+
		"\u0000IJ\u0005a\u0000\u0000JK\u0005l\u0000\u0000KL\u0005s\u0000\u0000"+
		"LM\u0005e\u0000\u0000M\u0010\u0001\u0000\u0000\u0000NO\u0005n\u0000\u0000"+
		"OP\u0005u\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005l\u0000\u0000R\u0012"+
		"\u0001\u0000\u0000\u0000ST\u0003\u001f\u000f\u0000TU\u0005t\u0000\u0000"+
		"UV\u0005e\u0000\u0000VW\u0005m\u0000\u0000WX\u0005p\u0000\u0000XY\u0005"+
		"l\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005t\u0000\u0000[\\\u0005e\u0000"+
		"\u0000\\a\u0001\u0000\u0000\u0000]`\u0003-\u0016\u0000^`\u00035\u001a"+
		"\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0003!\u0010\u0000e\u0014"+
		"\u0001\u0000\u0000\u0000fg\u0003\u001b\r\u0000gi\u0005#\u0000\u0000hj"+
		"\u0003-\u0016\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lp\u0001\u0000\u0000"+
		"\u0000mo\u0007\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0003\u001d\u000e\u0000"+
		"t\u0016\u0001\u0000\u0000\u0000uv\u0003\u001b\r\u0000vw\u0005e\u0000\u0000"+
		"wx\u0005l\u0000\u0000xy\u0005s\u0000\u0000yz\u0005e\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0003\u001d\u000e\u0000|\u0018\u0001\u0000\u0000"+
		"\u0000}~\u0003\u001b\r\u0000~\u0080\u0005/\u0000\u0000\u007f\u0081\u0003"+
		"-\u0016\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0087\u0001\u0000\u0000\u0000\u0084\u0086\u0007\u0000"+
		"\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0003\u001d\u000e\u0000\u008b\u001a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005{\u0000\u0000\u008d\u008e\u0005{\u0000\u0000"+
		"\u008e\u001c\u0001\u0000\u0000\u0000\u008f\u0090\u0005}\u0000\u0000\u0090"+
		"\u0091\u0005}\u0000\u0000\u0091\u001e\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005{\u0000\u0000\u0093\u0094\u0005{\u0000\u0000\u0094\u0095\u0005{"+
		"\u0000\u0000\u0095 \u0001\u0000\u0000\u0000\u0096\u0097\u0005}\u0000\u0000"+
		"\u0097\u0098\u0005}\u0000\u0000\u0098\u0099\u0005}\u0000\u0000\u0099\""+
		"\u0001\u0000\u0000\u0000\u009a\u009e\u0003\u001b\r\u0000\u009b\u009d\u0007"+
		"\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0003-\u0016\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0007\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u001d"+
		"\u000e\u0000\u00ad$\u0001\u0000\u0000\u0000\u00ae\u00b3\u0005\"\u0000"+
		"\u0000\u00af\u00b2\u0003\'\u0013\u0000\u00b0\u00b2\u0003-\u0016\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\"\u0000\u0000\u00b7"+
		"&\u0001\u0000\u0000\u0000\u00b8\u00bb\u0005\\\u0000\u0000\u00b9\u00bc"+
		"\u0007\u0001\u0000\u0000\u00ba\u00bc\u0003)\u0014\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc(\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005u\u0000\u0000\u00be\u00bf\u0003+\u0015\u0000"+
		"\u00bf\u00c0\u0003+\u0015\u0000\u00c0\u00c1\u0003+\u0015\u0000\u00c1\u00c2"+
		"\u0003+\u0015\u0000\u00c2*\u0001\u0000\u0000\u0000\u00c3\u00c4\u0007\u0002"+
		"\u0000\u0000\u00c4,\u0001\u0000\u0000\u0000\u00c5\u00c6\b\u0003\u0000"+
		"\u0000\u00c6.\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005-\u0000\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00d1\u00031\u0018\u0000\u00cb\u00cd"+
		"\u0005.\u0000\u0000\u00cc\u00ce\u0007\u0004\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003"+
		"3\u0019\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d50\u0001\u0000\u0000\u0000\u00d6\u00df\u00050\u0000\u0000"+
		"\u00d7\u00db\u0007\u0005\u0000\u0000\u00d8\u00da\u0007\u0004\u0000\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00de\u00d6\u0001\u0000\u0000\u0000\u00de\u00d7\u0001\u0000\u0000\u0000"+
		"\u00df2\u0001\u0000\u0000\u0000\u00e0\u00e2\u0007\u0006\u0000\u0000\u00e1"+
		"\u00e3\u0007\u0007\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u00031\u0018\u0000\u00e54\u0001\u0000\u0000\u0000\u00e6\u00e8\u0007"+
		"\b\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006\u001a"+
		"\u0000\u0000\u00ec6\u0001\u0000\u0000\u0000\u0015\u0000_akp\u0082\u0087"+
		"\u009e\u00a4\u00a9\u00b1\u00b3\u00bb\u00c8\u00cf\u00d1\u00d4\u00db\u00de"+
		"\u00e2\u00e9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}