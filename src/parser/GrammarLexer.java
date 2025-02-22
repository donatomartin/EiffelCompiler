// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT_LITERAL=3, LINE_COMMENT=4, REAL_CONSTANT=5, MULTILINE_COMMENT=6, 
		WHITESPACE=7, CHAR_CONSTANT=8, IDENT=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "INT_LITERAL", "LINE_COMMENT", "REAL_CONSTANT", "MULTILINE_COMMENT", 
			"WHITESPACE", "CHAR_CONSTANT", "IDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "INT_LITERAL", "LINE_COMMENT", "REAL_CONSTANT", "MULTILINE_COMMENT", 
			"WHITESPACE", "CHAR_CONSTANT", "IDENT"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000\t`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004"+
		"\u0002\u001d\b\u0002\u000b\u0002\f\u0002\u001e\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003%\b\u0003\n\u0003\f\u0003(\t\u0003"+
		"\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0004\u00040\b\u0004\u000b\u0004\f\u00041\u0001\u0004\u0001\u0004\u0004"+
		"\u00046\b\u0004\u000b\u0004\f\u00047\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005?\b\u0005\n\u0005\f\u0005B\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0004\u0006K\b\u0006\u000b\u0006\f\u0006L\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007X\b\u0007\u0001\b\u0001\b\u0005\b\\\b\b"+
		"\n\b\f\b_\t\b\u0002&@\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\u0006\u0001"+
		"\u000009\u0001\u0001\n\n\u0003\u0000\t\n\r\r  \u0002\u0000\t\n\r\r\u0002"+
		"\u0000AZaz\u0004\u000009AZ__azg\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001"+
		"\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005\u001c\u0001"+
		"\u0000\u0000\u0000\u0007 \u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000"+
		"\u0000\u000b9\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000\u000f"+
		"W\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"c\u0000\u0000\u0014\u0015\u0005l\u0000\u0000\u0015\u0016\u0005a\u0000"+
		"\u0000\u0016\u0017\u0005s\u0000\u0000\u0017\u0018\u0005s\u0000\u0000\u0018"+
		"\u0002\u0001\u0000\u0000\u0000\u0019\u001a\u0005;\u0000\u0000\u001a\u0004"+
		"\u0001\u0000\u0000\u0000\u001b\u001d\u0007\u0000\u0000\u0000\u001c\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u0006"+
		"\u0001\u0000\u0000\u0000 !\u0005/\u0000\u0000!\"\u0005*\u0000\u0000\""+
		"&\u0001\u0000\u0000\u0000#%\t\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%(\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)+\u0007\u0001"+
		"\u0000\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0006"+
		"\u0003\u0000\u0000-\b\u0001\u0000\u0000\u0000.0\u0007\u0000\u0000\u0000"+
		"/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0005.\u0000"+
		"\u000046\u0007\u0000\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\n\u0001"+
		"\u0000\u0000\u00009:\u0005/\u0000\u0000:;\u0005/\u0000\u0000;<\u0005*"+
		"\u0000\u0000<@\u0001\u0000\u0000\u0000=?\t\u0000\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?B\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"CD\u0005*\u0000\u0000DE\u0005/\u0000\u0000EF\u0005/\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0006\u0005\u0000\u0000H\f\u0001\u0000\u0000\u0000"+
		"IK\u0007\u0002\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0006\u0006\u0000\u0000O\u000e\u0001\u0000\u0000\u0000"+
		"PQ\u0005\'\u0000\u0000QR\b\u0003\u0000\u0000RX\u0005\'\u0000\u0000ST\u0005"+
		"\'\u0000\u0000TU\u0005\\\u0000\u0000UV\u0005n\u0000\u0000VX\u0005\'\u0000"+
		"\u0000WP\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000X\u0010\u0001"+
		"\u0000\u0000\u0000Y]\u0007\u0004\u0000\u0000Z\\\u0007\u0005\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\u0012\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000\n\u0000\u001e&*17@LW]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}