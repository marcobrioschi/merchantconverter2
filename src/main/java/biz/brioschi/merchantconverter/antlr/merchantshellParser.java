// Generated from C:/MyData/_WorkingDir/Repositories/git/merchantconverter2/antlr\merchantshell.g4 by ANTLR 4.7.2
package biz.brioschi.merchantconverter.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class merchantshellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MEANS=1, EVAL=2, UNITSOF=3, COMPARE=4, CREDITS=5, TRADE=6, QST=7, ROMANCHAR=8, 
		INT=9, STRING=10, CMDSEP=11, WS=12;
	public static final int
		RULE_start = 0, RULE_commandline = 1, RULE_symboldeclaration = 2, RULE_symbolconversion = 3, 
		RULE_goodspricing = 4, RULE_goodstrading = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "commandline", "symboldeclaration", "symbolconversion", "goodspricing", 
			"goodstrading"
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

	@Override
	public String getGrammarFileName() { return "merchantshell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public merchantshellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CommandlineContext commandline() {
			return getRuleContext(CommandlineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(merchantshellParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof merchantshellVisitor ) return ((merchantshellVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			commandline();
			setState(13);
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

	public static class CommandlineContext extends ParserRuleContext {
		public SymboldeclarationContext symboldeclaration() {
			return getRuleContext(SymboldeclarationContext.class,0);
		}
		public SymbolconversionContext symbolconversion() {
			return getRuleContext(SymbolconversionContext.class,0);
		}
		public GoodspricingContext goodspricing() {
			return getRuleContext(GoodspricingContext.class,0);
		}
		public GoodstradingContext goodstrading() {
			return getRuleContext(GoodstradingContext.class,0);
		}
		public CommandlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof merchantshellVisitor ) return ((merchantshellVisitor<? extends T>)visitor).visitCommandline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandlineContext commandline() throws RecognitionException {
		CommandlineContext _localctx = new CommandlineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commandline);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				symboldeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				symbolconversion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(18);
				goodspricing();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(19);
				goodstrading();
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

	public static class SymboldeclarationContext extends ParserRuleContext {
		public Token symbol;
		public TerminalNode MEANS() { return getToken(merchantshellParser.MEANS, 0); }
		public TerminalNode ROMANCHAR() { return getToken(merchantshellParser.ROMANCHAR, 0); }
		public TerminalNode STRING() { return getToken(merchantshellParser.STRING, 0); }
		public SymboldeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symboldeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof merchantshellVisitor ) return ((merchantshellVisitor<? extends T>)visitor).visitSymboldeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymboldeclarationContext symboldeclaration() throws RecognitionException {
		SymboldeclarationContext _localctx = new SymboldeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_symboldeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((SymboldeclarationContext)_localctx).symbol = match(STRING);
			setState(23);
			match(MEANS);
			setState(24);
			match(ROMANCHAR);
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

	public static class SymbolconversionContext extends ParserRuleContext {
		public Token STRING;
		public List<Token> symbols = new ArrayList<Token>();
		public TerminalNode EVAL() { return getToken(merchantshellParser.EVAL, 0); }
		public TerminalNode QST() { return getToken(merchantshellParser.QST, 0); }
		public List<TerminalNode> STRING() { return getTokens(merchantshellParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(merchantshellParser.STRING, i);
		}
		public SymbolconversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolconversion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof merchantshellVisitor ) return ((merchantshellVisitor<? extends T>)visitor).visitSymbolconversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolconversionContext symbolconversion() throws RecognitionException {
		SymbolconversionContext _localctx = new SymbolconversionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_symbolconversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(EVAL);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				((SymbolconversionContext)_localctx).STRING = match(STRING);
				((SymbolconversionContext)_localctx).symbols.add(((SymbolconversionContext)_localctx).STRING);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(32);
			match(QST);
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

	public static class GoodspricingContext extends ParserRuleContext {
		public Token STRING;
		public List<Token> symbols = new ArrayList<Token>();
		public Token goods;
		public Token credits;
		public TerminalNode UNITSOF() { return getToken(merchantshellParser.UNITSOF, 0); }
		public TerminalNode COMPARE() { return getToken(merchantshellParser.COMPARE, 0); }
		public TerminalNode CREDITS() { return getToken(merchantshellParser.CREDITS, 0); }
		public List<TerminalNode> STRING() { return getTokens(merchantshellParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(merchantshellParser.STRING, i);
		}
		public TerminalNode INT() { return getToken(merchantshellParser.INT, 0); }
		public GoodspricingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goodspricing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof merchantshellVisitor ) return ((merchantshellVisitor<? extends T>)visitor).visitGoodspricing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoodspricingContext goodspricing() throws RecognitionException {
		GoodspricingContext _localctx = new GoodspricingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_goodspricing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				((GoodspricingContext)_localctx).STRING = match(STRING);
				((GoodspricingContext)_localctx).symbols.add(((GoodspricingContext)_localctx).STRING);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(39);
			match(UNITSOF);
			setState(40);
			((GoodspricingContext)_localctx).goods = match(STRING);
			setState(41);
			match(COMPARE);
			setState(42);
			((GoodspricingContext)_localctx).credits = match(INT);
			setState(43);
			match(CREDITS);
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

	public static class GoodstradingContext extends ParserRuleContext {
		public Token STRING;
		public List<Token> symbols = new ArrayList<Token>();
		public Token goods;
		public TerminalNode TRADE() { return getToken(merchantshellParser.TRADE, 0); }
		public TerminalNode QST() { return getToken(merchantshellParser.QST, 0); }
		public List<TerminalNode> STRING() { return getTokens(merchantshellParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(merchantshellParser.STRING, i);
		}
		public GoodstradingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goodstrading; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof merchantshellVisitor ) return ((merchantshellVisitor<? extends T>)visitor).visitGoodstrading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoodstradingContext goodstrading() throws RecognitionException {
		GoodstradingContext _localctx = new GoodstradingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_goodstrading);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(TRADE);
			setState(47); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(46);
					((GoodstradingContext)_localctx).STRING = match(STRING);
					((GoodstradingContext)_localctx).symbols.add(((GoodstradingContext)_localctx).STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(51);
			((GoodstradingContext)_localctx).goods = match(STRING);
			setState(52);
			match(QST);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\169\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\27\n\3\3\4\3\4\3\4\3\4\3\5\3\5\6\5\37\n\5\r\5\16\5 \3\5\3\5\3\6\6\6&"+
		"\n\6\r\6\16\6\'\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\6\7\62\n\7\r\7\16\7\63"+
		"\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\29\2\16\3\2\2\2\4\26\3\2\2\2\6"+
		"\30\3\2\2\2\b\34\3\2\2\2\n%\3\2\2\2\f/\3\2\2\2\16\17\5\4\3\2\17\20\7\2"+
		"\2\3\20\3\3\2\2\2\21\27\3\2\2\2\22\27\5\6\4\2\23\27\5\b\5\2\24\27\5\n"+
		"\6\2\25\27\5\f\7\2\26\21\3\2\2\2\26\22\3\2\2\2\26\23\3\2\2\2\26\24\3\2"+
		"\2\2\26\25\3\2\2\2\27\5\3\2\2\2\30\31\7\f\2\2\31\32\7\3\2\2\32\33\7\n"+
		"\2\2\33\7\3\2\2\2\34\36\7\4\2\2\35\37\7\f\2\2\36\35\3\2\2\2\37 \3\2\2"+
		"\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\t\2\2#\t\3\2\2\2$&\7\f\2\2%$"+
		"\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\5\2\2*+\7\f\2"+
		"\2+,\7\6\2\2,-\7\13\2\2-.\7\7\2\2.\13\3\2\2\2/\61\7\b\2\2\60\62\7\f\2"+
		"\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2"+
		"\2\65\66\7\f\2\2\66\67\7\t\2\2\67\r\3\2\2\2\6\26 \'\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}