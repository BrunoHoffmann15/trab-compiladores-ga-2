// Generated from FoolGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FoolGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, INT=2, BOOL=3, VOID=4, IF=5, ELSE=6, RETURN=7, TRUE=8, FALSE=9, 
		COMMA=10, INVALIDIDENTIFIER=11, IDENTIFIER=12, NUMBER=13, ATRIB=14, PLUS=15, 
		TIMES=16, EQUALS=17, LESS=18, GREATER=19, NOT=20, AND=21, OR=22, SEMICOLON=23, 
		LPAREN=24, RPAREN=25, LBRACE=26, RBRACE=27, WS=28, PALAVRARESERVADA=29, 
		LITERAL=30, IDENTIFICADOR=31, OPERADOR=32, DELIMITADOR=33;
	public static final int
		RULE_declaracaoClasse = 0, RULE_comandos = 1, RULE_declaracaoAtributo = 2, 
		RULE_argumentos = 3, RULE_declaracaoMetodo = 4, RULE_tipo = 5, RULE_expressaoAritmetica = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaracaoClasse", "comandos", "declaracaoAtributo", "argumentos", "declaracaoMetodo", 
			"tipo", "expressaoAritmetica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'int'", "'bool'", "'void'", "'if'", "'else'", "'return'", 
			"'true'", "'false'", "','", null, null, null, "'='", "'+'", "'*'", "'=='", 
			"'<'", "'>'", "'!'", "'&&'", "'||'", "';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INT", "BOOL", "VOID", "IF", "ELSE", "RETURN", "TRUE", 
			"FALSE", "COMMA", "INVALIDIDENTIFIER", "IDENTIFIER", "NUMBER", "ATRIB", 
			"PLUS", "TIMES", "EQUALS", "LESS", "GREATER", "NOT", "AND", "OR", "SEMICOLON", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "WS", "PALAVRARESERVADA", "LITERAL", 
			"IDENTIFICADOR", "OPERADOR", "DELIMITADOR"
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
	public String getGrammarFileName() { return "FoolGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FoolGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoClasseContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FoolGrammarParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(FoolGrammarParser.LBRACE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FoolGrammarParser.RBRACE, 0); }
		public DeclaracaoClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoClasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterDeclaracaoClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitDeclaracaoClasse(this);
		}
	}

	public final DeclaracaoClasseContext declaracaoClasse() throws RecognitionException {
		DeclaracaoClasseContext _localctx = new DeclaracaoClasseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaracaoClasse);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(CLASS);
				setState(15);
				match(IDENTIFIER);
				setState(16);
				match(LBRACE);
				setState(17);
				comandos();
				setState(18);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(CLASS);
				setState(21);
				match(IDENTIFIER);
				setState(22);
				match(LBRACE);
				setState(23);
				match(RBRACE);
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
	public static class ComandosContext extends ParserRuleContext {
		public DeclaracaoAtributoContext declaracaoAtributo() {
			return getRuleContext(DeclaracaoAtributoContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comandos);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				declaracaoAtributo();
				}
				break;
			case RBRACE:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class DeclaracaoAtributoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(FoolGrammarParser.SEMICOLON, 0); }
		public DeclaracaoAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoAtributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterDeclaracaoAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitDeclaracaoAtributo(this);
		}
	}

	public final DeclaracaoAtributoContext declaracaoAtributo() throws RecognitionException {
		DeclaracaoAtributoContext _localctx = new DeclaracaoAtributoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoAtributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			tipo();
			setState(31);
			match(IDENTIFIER);
			setState(32);
			match(SEMICOLON);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(FoolGrammarParser.COMMA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentos);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				tipo();
				setState(35);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				tipo();
				setState(38);
				match(IDENTIFIER);
				setState(39);
				match(COMMA);
				setState(40);
				argumentos();
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
	public static class DeclaracaoMetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FoolGrammarParser.LPAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FoolGrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(FoolGrammarParser.LBRACE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FoolGrammarParser.RBRACE, 0); }
		public DeclaracaoMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterDeclaracaoMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitDeclaracaoMetodo(this);
		}
	}

	public final DeclaracaoMetodoContext declaracaoMetodo() throws RecognitionException {
		DeclaracaoMetodoContext _localctx = new DeclaracaoMetodoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoMetodo);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				tipo();
				setState(45);
				match(IDENTIFIER);
				setState(46);
				match(LPAREN);
				setState(47);
				argumentos();
				setState(48);
				match(RPAREN);
				setState(49);
				match(LBRACE);
				setState(50);
				comandos();
				setState(51);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				tipo();
				setState(54);
				match(IDENTIFIER);
				setState(55);
				match(LPAREN);
				setState(56);
				match(RPAREN);
				setState(57);
				match(LBRACE);
				setState(58);
				comandos();
				setState(59);
				match(RBRACE);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FoolGrammarParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(FoolGrammarParser.BOOL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FoolGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FoolGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode PLUS() { return getToken(FoolGrammarParser.PLUS, 0); }
		public TerminalNode TIMES() { return getToken(FoolGrammarParser.TIMES, 0); }
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressaoAritmetica);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(IDENTIFIER);
				setState(66);
				match(PLUS);
				setState(67);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(IDENTIFIER);
				setState(69);
				match(TIMES);
				setState(70);
				match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\u0004\u0001!J\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004>\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006H\b\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0001\u0001\u0000\u0002\u0003G\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000"+
		"\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000"+
		"\n?\u0001\u0000\u0000\u0000\fG\u0001\u0000\u0000\u0000\u000e\u000f\u0005"+
		"\u0001\u0000\u0000\u000f\u0010\u0005\f\u0000\u0000\u0010\u0011\u0005\u001a"+
		"\u0000\u0000\u0011\u0012\u0003\u0002\u0001\u0000\u0012\u0013\u0005\u001b"+
		"\u0000\u0000\u0013\u0019\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0001"+
		"\u0000\u0000\u0015\u0016\u0005\f\u0000\u0000\u0016\u0017\u0005\u001a\u0000"+
		"\u0000\u0017\u0019\u0005\u001b\u0000\u0000\u0018\u000e\u0001\u0000\u0000"+
		"\u0000\u0018\u0014\u0001\u0000\u0000\u0000\u0019\u0001\u0001\u0000\u0000"+
		"\u0000\u001a\u001d\u0003\u0004\u0002\u0000\u001b\u001d\u0001\u0000\u0000"+
		"\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001f\u0003\n\u0005\u0000"+
		"\u001f \u0005\f\u0000\u0000 !\u0005\u0017\u0000\u0000!\u0005\u0001\u0000"+
		"\u0000\u0000\"#\u0003\n\u0005\u0000#$\u0005\f\u0000\u0000$+\u0001\u0000"+
		"\u0000\u0000%&\u0003\n\u0005\u0000&\'\u0005\f\u0000\u0000\'(\u0005\n\u0000"+
		"\u0000()\u0003\u0006\u0003\u0000)+\u0001\u0000\u0000\u0000*\"\u0001\u0000"+
		"\u0000\u0000*%\u0001\u0000\u0000\u0000+\u0007\u0001\u0000\u0000\u0000"+
		",-\u0003\n\u0005\u0000-.\u0005\f\u0000\u0000./\u0005\u0018\u0000\u0000"+
		"/0\u0003\u0006\u0003\u000001\u0005\u0019\u0000\u000012\u0005\u001a\u0000"+
		"\u000023\u0003\u0002\u0001\u000034\u0005\u001b\u0000\u00004>\u0001\u0000"+
		"\u0000\u000056\u0003\n\u0005\u000067\u0005\f\u0000\u000078\u0005\u0018"+
		"\u0000\u000089\u0005\u0019\u0000\u00009:\u0005\u001a\u0000\u0000:;\u0003"+
		"\u0002\u0001\u0000;<\u0005\u001b\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=,\u0001\u0000\u0000\u0000=5\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000"+
		"\u0000?@\u0007\u0000\u0000\u0000@\u000b\u0001\u0000\u0000\u0000AB\u0005"+
		"\f\u0000\u0000BC\u0005\u000f\u0000\u0000CH\u0005\f\u0000\u0000DE\u0005"+
		"\f\u0000\u0000EF\u0005\u0010\u0000\u0000FH\u0005\f\u0000\u0000GA\u0001"+
		"\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000H\r\u0001\u0000\u0000\u0000"+
		"\u0005\u0018\u001c*=G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}