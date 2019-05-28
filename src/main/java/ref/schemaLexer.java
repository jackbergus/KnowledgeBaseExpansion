// Generated from ref/schema.g4 by ANTLR 4.7.1
package ref;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class schemaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BIND=8, TRANSFER=9, 
		TRYEXPAND=10, RELATION=11, FUTURECHECK=12, EVENT=13, UNIQUE=14, ENTITY=15, 
		FD=16, RULE=17, FOR=18, DECLARE=19, SET=20, WITH=21, BEGIN=22, END=23, 
		EXIST=24, EXCEPT=25, MACRO=26, MARROW=27, IMPLIES=28, LPAR=29, RPAR=30, 
		LT=31, GT=32, LEQ=33, GEQ=34, COMMA=35, TYPE=36, NEG=37, BOT=38, VALUE=39, 
		STRING=40, WS=41, COMMENT=42, LINE_COMMENT=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "BIND", "TRANSFER", 
		"TRYEXPAND", "RELATION", "FUTURECHECK", "EVENT", "UNIQUE", "ENTITY", "FD", 
		"RULE", "FOR", "DECLARE", "SET", "WITH", "BEGIN", "END", "EXIST", "EXCEPT", 
		"MACRO", "MARROW", "IMPLIES", "LPAR", "RPAR", "LT", "GT", "LEQ", "GEQ", 
		"COMMA", "TYPE", "NEG", "BOT", "VALUE", "STRING", "CHAR_NO_NL", "WS", 
		"COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'in time'", "'and space'", "'\\forall'", "'\\exists'", 
		"'notnull'", "'bind'", "'transfer'", "'try-expand'", "'relation'", "'future-check'", 
		"'event'", "'unique'", "'entity'", "'MVD'", "'rule'", "'for'", "'as'", 
		"'set'", "'with'", "'begin'", "'end'", "'exist'", "'except'", "'macro'", 
		"'->>'", "'=>'", "'('", "')'", "'<'", "'>'", "'<='", "'>='", "','", "':'", 
		"'~'", "'False'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "BIND", "TRANSFER", "TRYEXPAND", 
		"RELATION", "FUTURECHECK", "EVENT", "UNIQUE", "ENTITY", "FD", "RULE", 
		"FOR", "DECLARE", "SET", "WITH", "BEGIN", "END", "EXIST", "EXCEPT", "MACRO", 
		"MARROW", "IMPLIES", "LPAR", "RPAR", "LT", "GT", "LEQ", "GEQ", "COMMA", 
		"TYPE", "NEG", "BOT", "VALUE", "STRING", "WS", "COMMENT", "LINE_COMMENT"
	};
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


	public schemaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "schema.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u014c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		")\6)\u0129\n)\r)\16)\u012a\3*\3*\3+\6+\u0130\n+\r+\16+\u0131\3+\3+\3,"+
		"\3,\3,\3,\7,\u013a\n,\f,\16,\u013d\13,\3,\3,\3,\3,\3,\3-\3-\7-\u0146\n"+
		"-\f-\16-\u0149\13-\3-\3-\3\u013b\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U+W,Y-"+
		"\3\2\5\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u014e\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\tg\3\2\2\2\13q\3\2\2\2\ry\3\2"+
		"\2\2\17\u0081\3\2\2\2\21\u0089\3\2\2\2\23\u008e\3\2\2\2\25\u0097\3\2\2"+
		"\2\27\u00a2\3\2\2\2\31\u00ab\3\2\2\2\33\u00b8\3\2\2\2\35\u00be\3\2\2\2"+
		"\37\u00c5\3\2\2\2!\u00cc\3\2\2\2#\u00d0\3\2\2\2%\u00d5\3\2\2\2\'\u00d9"+
		"\3\2\2\2)\u00dc\3\2\2\2+\u00e0\3\2\2\2-\u00e5\3\2\2\2/\u00eb\3\2\2\2\61"+
		"\u00ef\3\2\2\2\63\u00f5\3\2\2\2\65\u00fc\3\2\2\2\67\u0102\3\2\2\29\u0106"+
		"\3\2\2\2;\u0109\3\2\2\2=\u010b\3\2\2\2?\u010d\3\2\2\2A\u010f\3\2\2\2C"+
		"\u0111\3\2\2\2E\u0114\3\2\2\2G\u0117\3\2\2\2I\u0119\3\2\2\2K\u011b\3\2"+
		"\2\2M\u011d\3\2\2\2O\u0123\3\2\2\2Q\u0128\3\2\2\2S\u012c\3\2\2\2U\u012f"+
		"\3\2\2\2W\u0135\3\2\2\2Y\u0143\3\2\2\2[\\\7=\2\2\\\4\3\2\2\2]^\7\60\2"+
		"\2^\6\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7\"\2\2bc\7v\2\2cd\7k\2\2de\7o\2\2e"+
		"f\7g\2\2f\b\3\2\2\2gh\7c\2\2hi\7p\2\2ij\7f\2\2jk\7\"\2\2kl\7u\2\2lm\7"+
		"r\2\2mn\7c\2\2no\7e\2\2op\7g\2\2p\n\3\2\2\2qr\7^\2\2rs\7h\2\2st\7q\2\2"+
		"tu\7t\2\2uv\7c\2\2vw\7n\2\2wx\7n\2\2x\f\3\2\2\2yz\7^\2\2z{\7g\2\2{|\7"+
		"z\2\2|}\7k\2\2}~\7u\2\2~\177\7v\2\2\177\u0080\7u\2\2\u0080\16\3\2\2\2"+
		"\u0081\u0082\7p\2\2\u0082\u0083\7q\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u0086\7w\2\2\u0086\u0087\7n\2\2\u0087\u0088\7n\2\2\u0088"+
		"\20\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c"+
		"\u008d\7f\2\2\u008d\22\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7p\2\2\u0092\u0093\7u\2\2\u0093\u0094\7h\2\2"+
		"\u0094\u0095\7g\2\2\u0095\u0096\7t\2\2\u0096\24\3\2\2\2\u0097\u0098\7"+
		"v\2\2\u0098\u0099\7t\2\2\u0099\u009a\7{\2\2\u009a\u009b\7/\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7z\2\2\u009d\u009e\7r\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0\u00a1\7f\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7k\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7p\2\2\u00aa\30\3\2"+
		"\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af"+
		"\7w\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7/\2\2\u00b2"+
		"\u00b3\7e\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7e\2\2"+
		"\u00b6\u00b7\7m\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7"+
		"x\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\34"+
		"\3\2\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7s\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7g\2\2\u00c4\36\3\2\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00ca\7v\2\2\u00ca\u00cb\7{\2\2\u00cb \3\2\2\2\u00cc\u00cd\7O\2"+
		"\2\u00cd\u00ce\7X\2\2\u00ce\u00cf\7F\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7"+
		"t\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4$"+
		"\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8"+
		"&\3\2\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7u\2\2\u00db(\3\2\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7v\2\2\u00df*\3\2\2\2\u00e0\u00e1"+
		"\7y\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7j\2\2\u00e4"+
		",\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7i\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7f\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7z\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7v\2\2"+
		"\u00f4\62\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7z\2\2\u00f7\u00f8\7"+
		"e\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7v\2\2\u00fb\64"+
		"\3\2\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7e\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7q\2\2\u0101\66\3\2\2\2\u0102\u0103\7/\2\2\u0103"+
		"\u0104\7@\2\2\u0104\u0105\7@\2\2\u01058\3\2\2\2\u0106\u0107\7?\2\2\u0107"+
		"\u0108\7@\2\2\u0108:\3\2\2\2\u0109\u010a\7*\2\2\u010a<\3\2\2\2\u010b\u010c"+
		"\7+\2\2\u010c>\3\2\2\2\u010d\u010e\7>\2\2\u010e@\3\2\2\2\u010f\u0110\7"+
		"@\2\2\u0110B\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113\7?\2\2\u0113D\3\2"+
		"\2\2\u0114\u0115\7@\2\2\u0115\u0116\7?\2\2\u0116F\3\2\2\2\u0117\u0118"+
		"\7.\2\2\u0118H\3\2\2\2\u0119\u011a\7<\2\2\u011aJ\3\2\2\2\u011b\u011c\7"+
		"\u0080\2\2\u011cL\3\2\2\2\u011d\u011e\7H\2\2\u011e\u011f\7c\2\2\u011f"+
		"\u0120\7n\2\2\u0120\u0121\7u\2\2\u0121\u0122\7g\2\2\u0122N\3\2\2\2\u0123"+
		"\u0124\7$\2\2\u0124\u0125\5Q)\2\u0125\u0126\7$\2\2\u0126P\3\2\2\2\u0127"+
		"\u0129\5S*\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012bR\3\2\2\2\u012c\u012d\t\2\2\2\u012dT\3\2\2"+
		"\2\u012e\u0130\t\3\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b+\2\2\u0134"+
		"V\3\2\2\2\u0135\u0136\7\61\2\2\u0136\u0137\7,\2\2\u0137\u013b\3\2\2\2"+
		"\u0138\u013a\13\2\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\7,\2\2\u013f\u0140\7\61\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b,"+
		"\3\2\u0142X\3\2\2\2\u0143\u0147\7%\2\2\u0144\u0146\n\4\2\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\b-\3\2\u014bZ\3\2\2\2\7"+
		"\2\u012a\u0131\u013b\u0147\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}