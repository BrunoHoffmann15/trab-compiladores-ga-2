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
		T__0=1, CLASS=2, INT=3, BOOL=4, VOID=5, IF=6, ELSE=7, WHILE=8, RETURN=9, 
		TRUE=10, FALSE=11, COMMA=12, IDENTIFIER=13, NUMBER=14, ASSIGN=15, PLUS=16, 
		TIMES=17, EQUALS=18, LESS=19, GREATER=20, NOT=21, AND=22, OR=23, SEMICOLON=24, 
		LPAREN=25, RPAREN=26, LBRACE=27, RBRACE=28, WS=29, COMMENT=30, LINE_COMMENT=31;
	public static final int
		RULE_programa = 0, RULE_declaracaoClasse = 1, RULE_declaracaoAtributo = 2, 
		RULE_declaracaoMetodo = 3, RULE_metodoMain = 4, RULE_metodoNormal = 5, 
		RULE_argumentos = 6, RULE_tipo = 7, RULE_tipoMetodos = 8, RULE_comandos = 9, 
		RULE_comando = 10, RULE_atribuicao = 11, RULE_condicional = 12, RULE_repeticao = 13, 
		RULE_chamadaMetodo = 14, RULE_expressao = 15, RULE_expressaoAritmetica = 16, 
		RULE_termo = 17, RULE_expressaoBooleana = 18, RULE_fatorBoole = 19, RULE_termoBoole = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracaoClasse", "declaracaoAtributo", "declaracaoMetodo", 
			"metodoMain", "metodoNormal", "argumentos", "tipo", "tipoMetodos", "comandos", 
			"comando", "atribuicao", "condicional", "repeticao", "chamadaMetodo", 
			"expressao", "expressaoAritmetica", "termo", "expressaoBooleana", "fatorBoole", 
			"termoBoole"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'class'", "'int'", "'bool'", "'void'", "'if'", "'else'", 
			"'while'", "'return'", "'true'", "'false'", "','", null, null, "'='", 
			"'+'", "'*'", "'=='", "'<'", "'>'", "'!'", "'&&'", "'||'", "';'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CLASS", "INT", "BOOL", "VOID", "IF", "ELSE", "WHILE", "RETURN", 
			"TRUE", "FALSE", "COMMA", "IDENTIFIER", "NUMBER", "ASSIGN", "PLUS", "TIMES", 
			"EQUALS", "LESS", "GREATER", "NOT", "AND", "OR", "SEMICOLON", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "WS", "COMMENT", "LINE_COMMENT"
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
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracaoClasseContext declaracaoClasse() {
			return getRuleContext(DeclaracaoClasseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FoolGrammarParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			declaracaoClasse();
			setState(43);
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
	public static class DeclaracaoClasseContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FoolGrammarParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(FoolGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FoolGrammarParser.RBRACE, 0); }
		public List<DeclaracaoAtributoContext> declaracaoAtributo() {
			return getRuleContexts(DeclaracaoAtributoContext.class);
		}
		public DeclaracaoAtributoContext declaracaoAtributo(int i) {
			return getRuleContext(DeclaracaoAtributoContext.class,i);
		}
		public List<DeclaracaoMetodoContext> declaracaoMetodo() {
			return getRuleContexts(DeclaracaoMetodoContext.class);
		}
		public DeclaracaoMetodoContext declaracaoMetodo(int i) {
			return getRuleContext(DeclaracaoMetodoContext.class,i);
		}
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
		enterRule(_localctx, 2, RULE_declaracaoClasse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(CLASS);
			setState(46);
			match(IDENTIFIER);
			setState(47);
			match(LBRACE);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(48);
					declaracaoAtributo();
					}
					break;
				case 2:
					{
					setState(49);
					declaracaoMetodo();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(RBRACE);
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
			setState(57);
			tipo();
			setState(58);
			match(IDENTIFIER);
			setState(59);
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
	public static class DeclaracaoMetodoContext extends ParserRuleContext {
		public MetodoMainContext metodoMain() {
			return getRuleContext(MetodoMainContext.class,0);
		}
		public MetodoNormalContext metodoNormal() {
			return getRuleContext(MetodoNormalContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_declaracaoMetodo);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				metodoMain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				metodoNormal();
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
	public static class MetodoMainContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(FoolGrammarParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(FoolGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FoolGrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(FoolGrammarParser.LBRACE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FoolGrammarParser.RBRACE, 0); }
		public MetodoMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoMain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterMetodoMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitMetodoMain(this);
		}
	}

	public final MetodoMainContext metodoMain() throws RecognitionException {
		MetodoMainContext _localctx = new MetodoMainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metodoMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(VOID);
			setState(66);
			match(T__0);
			setState(67);
			match(LPAREN);
			setState(68);
			match(RPAREN);
			setState(69);
			match(LBRACE);
			setState(70);
			comandos();
			setState(71);
			match(RBRACE);
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
	public static class MetodoNormalContext extends ParserRuleContext {
		public TipoMetodosContext tipoMetodos() {
			return getRuleContext(TipoMetodosContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FoolGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FoolGrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(FoolGrammarParser.LBRACE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FoolGrammarParser.RBRACE, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public MetodoNormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoNormal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterMetodoNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitMetodoNormal(this);
		}
	}

	public final MetodoNormalContext metodoNormal() throws RecognitionException {
		MetodoNormalContext _localctx = new MetodoNormalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_metodoNormal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			tipoMetodos();
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(LPAREN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==BOOL) {
				{
				setState(76);
				argumentos();
				}
			}

			setState(79);
			match(RPAREN);
			setState(80);
			match(LBRACE);
			setState(81);
			comandos();
			setState(82);
			match(RBRACE);
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
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FoolGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FoolGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FoolGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FoolGrammarParser.COMMA, i);
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
		enterRule(_localctx, 12, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			tipo();
			setState(85);
			match(IDENTIFIER);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(86);
				match(COMMA);
				setState(87);
				tipo();
				setState(88);
				match(IDENTIFIER);
				}
				}
				setState(94);
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
		enterRule(_localctx, 14, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
	public static class TipoMetodosContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VOID() { return getToken(FoolGrammarParser.VOID, 0); }
		public TipoMetodosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoMetodos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterTipoMetodos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitTipoMetodos(this);
		}
	}

	public final TipoMetodosContext tipoMetodos() throws RecognitionException {
		TipoMetodosContext _localctx = new TipoMetodosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipoMetodos);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				tipo();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(VOID);
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
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FoolGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FoolGrammarParser.SEMICOLON, i);
		}
		public List<DeclaracaoAtributoContext> declaracaoAtributo() {
			return getRuleContexts(DeclaracaoAtributoContext.class);
		}
		public DeclaracaoAtributoContext declaracaoAtributo(int i) {
			return getRuleContext(DeclaracaoAtributoContext.class,i);
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
		enterRule(_localctx, 18, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9048L) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case WHILE:
				case RETURN:
				case IDENTIFIER:
					{
					setState(101);
					comando();
					setState(102);
					match(SEMICOLON);
					}
					break;
				case INT:
				case BOOL:
					{
					setState(104);
					declaracaoAtributo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
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
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(FoolGrammarParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comando);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				repeticao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				chamadaMetodo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(RETURN);
				setState(115);
				expressao();
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(FoolGrammarParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENTIFIER);
			setState(119);
			match(ASSIGN);
			setState(120);
			expressao();
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FoolGrammarParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(FoolGrammarParser.LPAREN, 0); }
		public ExpressaoBooleanaContext expressaoBooleana() {
			return getRuleContext(ExpressaoBooleanaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FoolGrammarParser.RPAREN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FoolGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FoolGrammarParser.SEMICOLON, i);
		}
		public TerminalNode ELSE() { return getToken(FoolGrammarParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IF);
			setState(123);
			match(LPAREN);
			setState(124);
			expressaoBooleana();
			setState(125);
			match(RPAREN);
			setState(126);
			comando();
			setState(127);
			match(SEMICOLON);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(128);
				match(ELSE);
				setState(129);
				comando();
				setState(130);
				match(SEMICOLON);
				}
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
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FoolGrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(FoolGrammarParser.LPAREN, 0); }
		public ExpressaoBooleanaContext expressaoBooleana() {
			return getRuleContext(ExpressaoBooleanaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FoolGrammarParser.RPAREN, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(WHILE);
			setState(135);
			match(LPAREN);
			setState(136);
			expressaoBooleana();
			setState(137);
			match(RPAREN);
			setState(138);
			comando();
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
	public static class ChamadaMetodoContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FoolGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FoolGrammarParser.RPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FoolGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FoolGrammarParser.COMMA, i);
		}
		public ChamadaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterChamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitChamadaMetodo(this);
		}
	}

	public final ChamadaMetodoContext chamadaMetodo() throws RecognitionException {
		ChamadaMetodoContext _localctx = new ChamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IDENTIFIER);
			setState(141);
			match(LPAREN);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35679232L) != 0)) {
				{
				setState(142);
				expressao();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(143);
					match(COMMA);
					setState(144);
					expressao();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(152);
			match(RPAREN);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ExpressaoBooleanaContext expressaoBooleana() {
			return getRuleContext(ExpressaoBooleanaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				expressaoBooleana();
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
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(FoolGrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(FoolGrammarParser.PLUS, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(FoolGrammarParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(FoolGrammarParser.TIMES, i);
		}
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
		enterRule(_localctx, 32, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			termo();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==TIMES) {
				{
				{
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				termo();
				}
				}
				setState(165);
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
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FoolGrammarParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termo);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				chamadaMetodo();
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
	public static class ExpressaoBooleanaContext extends ParserRuleContext {
		public List<FatorBooleContext> fatorBoole() {
			return getRuleContexts(FatorBooleContext.class);
		}
		public FatorBooleContext fatorBoole(int i) {
			return getRuleContext(FatorBooleContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(FoolGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FoolGrammarParser.OR, i);
		}
		public ExpressaoBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoBooleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterExpressaoBooleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitExpressaoBooleana(this);
		}
	}

	public final ExpressaoBooleanaContext expressaoBooleana() throws RecognitionException {
		ExpressaoBooleanaContext _localctx = new ExpressaoBooleanaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoBooleana);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			fatorBoole();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(172);
				match(OR);
				setState(173);
				fatorBoole();
				}
				}
				setState(178);
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
	public static class FatorBooleContext extends ParserRuleContext {
		public List<TermoBooleContext> termoBoole() {
			return getRuleContexts(TermoBooleContext.class);
		}
		public TermoBooleContext termoBoole(int i) {
			return getRuleContext(TermoBooleContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FoolGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FoolGrammarParser.AND, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(FoolGrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(FoolGrammarParser.EQUALS, i);
		}
		public List<TerminalNode> LESS() { return getTokens(FoolGrammarParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(FoolGrammarParser.LESS, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(FoolGrammarParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(FoolGrammarParser.GREATER, i);
		}
		public FatorBooleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorBoole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterFatorBoole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitFatorBoole(this);
		}
	}

	public final FatorBooleContext fatorBoole() throws RecognitionException {
		FatorBooleContext _localctx = new FatorBooleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fatorBoole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			termoBoole();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6029312L) != 0)) {
				{
				{
				setState(180);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6029312L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				termoBoole();
				}
				}
				setState(186);
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
	public static class TermoBooleContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FoolGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FoolGrammarParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FoolGrammarParser.LPAREN, 0); }
		public ExpressaoBooleanaContext expressaoBooleana() {
			return getRuleContext(ExpressaoBooleanaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FoolGrammarParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(FoolGrammarParser.NOT, 0); }
		public TermoBooleContext termoBoole() {
			return getRuleContext(TermoBooleContext.class,0);
		}
		public TermoBooleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoBoole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).enterTermoBoole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoolGrammarListener ) ((FoolGrammarListener)listener).exitTermoBoole(this);
		}
	}

	public final TermoBooleContext termoBoole() throws RecognitionException {
		TermoBooleContext _localctx = new TermoBooleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termoBoole);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(FALSE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(LPAREN);
				setState(191);
				expressaoBooleana();
				setState(192);
				match(RPAREN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(NOT);
				setState(195);
				termoBoole();
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
		"\u0004\u0001\u001f\u00c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006[\b\u0006\n\u0006"+
		"\f\u0006^\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\bd\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tj\b\t\n\t\f\tm\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nu\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0085\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0092\b\u000e\n\u000e\f\u000e\u0095\t\u000e\u0003"+
		"\u000e\u0097\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u009d\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00a2"+
		"\b\u0010\n\u0010\f\u0010\u00a5\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00aa\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00af\b\u0012\n\u0012\f\u0012\u00b2\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00b7\b\u0013\n\u0013\f\u0013\u00ba\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00c5\b\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(\u0000\u0003\u0001\u0000\u0003\u0004\u0001\u0000"+
		"\u0010\u0011\u0002\u0000\u0012\u0014\u0016\u0016\u00ca\u0000*\u0001\u0000"+
		"\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000"+
		"\u0006?\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nI\u0001\u0000"+
		"\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000"+
		"\u0010c\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014t"+
		"\u0001\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018z\u0001\u0000"+
		"\u0000\u0000\u001a\u0086\u0001\u0000\u0000\u0000\u001c\u008c\u0001\u0000"+
		"\u0000\u0000\u001e\u009c\u0001\u0000\u0000\u0000 \u009e\u0001\u0000\u0000"+
		"\u0000\"\u00a9\u0001\u0000\u0000\u0000$\u00ab\u0001\u0000\u0000\u0000"+
		"&\u00b3\u0001\u0000\u0000\u0000(\u00c4\u0001\u0000\u0000\u0000*+\u0003"+
		"\u0002\u0001\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0002\u0000\u0000./\u0005\r\u0000\u0000/4\u0005\u001b\u0000"+
		"\u000003\u0003\u0004\u0002\u000013\u0003\u0006\u0003\u000020\u0001\u0000"+
		"\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000078\u0005\u001c\u0000\u00008\u0003\u0001\u0000"+
		"\u0000\u00009:\u0003\u000e\u0007\u0000:;\u0005\r\u0000\u0000;<\u0005\u0018"+
		"\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=@\u0003\b\u0004\u0000>@\u0003"+
		"\n\u0005\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0007"+
		"\u0001\u0000\u0000\u0000AB\u0005\u0005\u0000\u0000BC\u0005\u0001\u0000"+
		"\u0000CD\u0005\u0019\u0000\u0000DE\u0005\u001a\u0000\u0000EF\u0005\u001b"+
		"\u0000\u0000FG\u0003\u0012\t\u0000GH\u0005\u001c\u0000\u0000H\t\u0001"+
		"\u0000\u0000\u0000IJ\u0003\u0010\b\u0000JK\u0005\r\u0000\u0000KM\u0005"+
		"\u0019\u0000\u0000LN\u0003\f\u0006\u0000ML\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u001a\u0000\u0000"+
		"PQ\u0005\u001b\u0000\u0000QR\u0003\u0012\t\u0000RS\u0005\u001c\u0000\u0000"+
		"S\u000b\u0001\u0000\u0000\u0000TU\u0003\u000e\u0007\u0000U\\\u0005\r\u0000"+
		"\u0000VW\u0005\f\u0000\u0000WX\u0003\u000e\u0007\u0000XY\u0005\r\u0000"+
		"\u0000Y[\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000[^\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\r"+
		"\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0007\u0000\u0000"+
		"\u0000`\u000f\u0001\u0000\u0000\u0000ad\u0003\u000e\u0007\u0000bd\u0005"+
		"\u0005\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"d\u0011\u0001\u0000\u0000\u0000ef\u0003\u0014\n\u0000fg\u0005\u0018\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hj\u0003\u0004\u0002\u0000ie\u0001\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0013\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000nu\u0003\u0016\u000b\u0000ou\u0003\u0018"+
		"\f\u0000pu\u0003\u001a\r\u0000qu\u0003\u001c\u000e\u0000rs\u0005\t\u0000"+
		"\u0000su\u0003\u001e\u000f\u0000tn\u0001\u0000\u0000\u0000to\u0001\u0000"+
		"\u0000\u0000tp\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000u\u0015\u0001\u0000\u0000\u0000vw\u0005\r\u0000\u0000"+
		"wx\u0005\u000f\u0000\u0000xy\u0003\u001e\u000f\u0000y\u0017\u0001\u0000"+
		"\u0000\u0000z{\u0005\u0006\u0000\u0000{|\u0005\u0019\u0000\u0000|}\u0003"+
		"$\u0012\u0000}~\u0005\u001a\u0000\u0000~\u007f\u0003\u0014\n\u0000\u007f"+
		"\u0084\u0005\u0018\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081"+
		"\u0082\u0003\u0014\n\u0000\u0082\u0083\u0005\u0018\u0000\u0000\u0083\u0085"+
		"\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0019\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005\b\u0000\u0000\u0087\u0088\u0005\u0019\u0000\u0000\u0088\u0089\u0003"+
		"$\u0012\u0000\u0089\u008a\u0005\u001a\u0000\u0000\u008a\u008b\u0003\u0014"+
		"\n\u0000\u008b\u001b\u0001\u0000\u0000\u0000\u008c\u008d\u0005\r\u0000"+
		"\u0000\u008d\u0096\u0005\u0019\u0000\u0000\u008e\u0093\u0003\u001e\u000f"+
		"\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0092\u0003\u001e\u000f\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u008e\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u001a\u0000\u0000"+
		"\u0099\u001d\u0001\u0000\u0000\u0000\u009a\u009d\u0003 \u0010\u0000\u009b"+
		"\u009d\u0003$\u0012\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u001f\u0001\u0000\u0000\u0000\u009e\u00a3"+
		"\u0003\"\u0011\u0000\u009f\u00a0\u0007\u0001\u0000\u0000\u00a0\u00a2\u0003"+
		"\"\u0011\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4!\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00aa\u0005\u000e\u0000\u0000\u00a7\u00aa\u0005\r\u0000\u0000"+
		"\u00a8\u00aa\u0003\u001c\u000e\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa#\u0001\u0000\u0000\u0000\u00ab\u00b0\u0003&\u0013\u0000\u00ac\u00ad"+
		"\u0005\u0017\u0000\u0000\u00ad\u00af\u0003&\u0013\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1%\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b8\u0003(\u0014"+
		"\u0000\u00b4\u00b5\u0007\u0002\u0000\u0000\u00b5\u00b7\u0003(\u0014\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\'\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00c5\u0005\n\u0000\u0000\u00bc\u00c5\u0005\u000b\u0000\u0000\u00bd\u00c5"+
		"\u0005\r\u0000\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf\u00c0\u0003"+
		"$\u0012\u0000\u00c0\u00c1\u0005\u001a\u0000\u0000\u00c1\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\u0015\u0000\u0000\u00c3\u00c5\u0003(\u0014"+
		"\u0000\u00c4\u00bb\u0001\u0000\u0000\u0000\u00c4\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c4\u00bd\u0001\u0000\u0000\u0000\u00c4\u00be\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5)\u0001\u0000\u0000\u0000"+
		"\u001224?M\\cikt\u0084\u0093\u0096\u009c\u00a3\u00a9\u00b0\u00b8\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}