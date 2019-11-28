// Generated from C:/MyData/_WorkingDir/Repositories/git/merchantconverter2/antlr\merchantshell.g4 by ANTLR 4.7.2
package biz.brioschi.merchantconverter.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class merchantshellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MEANS=1, EVAL=2, UNITSOF=3, COMPARE=4, CREDITS=5, TRADE=6, QST=7, ROMANCHAR=8, 
		INT=9, STRING=10, CMDSEP=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MEANS", "EVAL", "UNITSOF", "COMPARE", "CREDITS", "TRADE", "QST", "ROMANCHAR", 
			"INT", "STRING", "CMDSEP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'means'", "'how much is'", "'units of'", "'are worth'", "'Credits'", 
			"'how many Credits is'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MEANS", "EVAL", "UNITSOF", "COMPARE", "CREDITS", "TRADE", "QST", 
			"ROMANCHAR", "INT", "STRING", "CMDSEP", "WS"
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


	public merchantshellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "merchantshell.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\6\nb\n\n\r\n\16\nc\3\13\6\13g\n\13\r\13\16\13h\3"+
		"\f\6\fl\n\f\r\f\16\fm\3\r\6\rq\n\r\r\r\16\rr\3\r\3\r\2\2\16\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\6\7\2EFKKNOXXZZ\4"+
		"\2C\\c|\4\2\f\f\17\17\4\2\13\13\"\"\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5!\3\2"+
		"\2\2\7-\3\2\2\2\t\66\3\2\2\2\13@\3\2\2\2\rH\3\2\2\2\17\\\3\2\2\2\21^\3"+
		"\2\2\2\23a\3\2\2\2\25f\3\2\2\2\27k\3\2\2\2\31p\3\2\2\2\33\34\7o\2\2\34"+
		"\35\7g\2\2\35\36\7c\2\2\36\37\7p\2\2\37 \7u\2\2 \4\3\2\2\2!\"\7j\2\2\""+
		"#\7q\2\2#$\7y\2\2$%\7\"\2\2%&\7o\2\2&\'\7w\2\2\'(\7e\2\2()\7j\2\2)*\7"+
		"\"\2\2*+\7k\2\2+,\7u\2\2,\6\3\2\2\2-.\7w\2\2./\7p\2\2/\60\7k\2\2\60\61"+
		"\7v\2\2\61\62\7u\2\2\62\63\7\"\2\2\63\64\7q\2\2\64\65\7h\2\2\65\b\3\2"+
		"\2\2\66\67\7c\2\2\678\7t\2\289\7g\2\29:\7\"\2\2:;\7y\2\2;<\7q\2\2<=\7"+
		"t\2\2=>\7v\2\2>?\7j\2\2?\n\3\2\2\2@A\7E\2\2AB\7t\2\2BC\7g\2\2CD\7f\2\2"+
		"DE\7k\2\2EF\7v\2\2FG\7u\2\2G\f\3\2\2\2HI\7j\2\2IJ\7q\2\2JK\7y\2\2KL\7"+
		"\"\2\2LM\7o\2\2MN\7c\2\2NO\7p\2\2OP\7{\2\2PQ\7\"\2\2QR\7E\2\2RS\7t\2\2"+
		"ST\7g\2\2TU\7f\2\2UV\7k\2\2VW\7v\2\2WX\7u\2\2XY\7\"\2\2YZ\7k\2\2Z[\7u"+
		"\2\2[\16\3\2\2\2\\]\7A\2\2]\20\3\2\2\2^_\t\2\2\2_\22\3\2\2\2`b\4\62;\2"+
		"a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\24\3\2\2\2eg\t\3\2\2fe\3\2\2"+
		"\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\26\3\2\2\2jl\t\4\2\2kj\3\2\2\2lm\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2n\30\3\2\2\2oq\t\5\2\2po\3\2\2\2qr\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\r\2\2u\32\3\2\2\2\7\2chmr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}