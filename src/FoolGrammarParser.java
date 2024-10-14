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
		COMMA=10, IDENTIFIER=11, NUMBER=12, ASSIGN=13, PLUS=14, TIMES=15, EQUALS=16, 
		LESS=17, GREATER=18, NOT=19, AND=20, OR=21, SEMICOLON=22, LPAREN=23, RPAREN=24, 
		LBRACE=25, RBRACE=26, WS=27, COMMENT=28, LINE_COMMENT=29;
	public static final int
		RULE_programa = 0, RULE_declaracaoClasse = 1, RULE_declaracaoAtributo = 2, 
		RULE_declaracaoMetodo = 3, RULE_argumentos = 4, RULE_tipo = 5, RULE_comandos = 6, 
		RULE_comando = 7, RULE_atribuicao = 8, RULE_condicional = 9, RULE_chamadaMetodo = 10, 
		RULE_expressao = 11, RULE_expressaoAritmetica = 12, RULE_termo = 13, RULE_expressaoBooleana = 14, 
		RULE_fatorBoole = 15, RULE_termoBoole = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracaoClasse", "declaracaoAtributo", "declaracaoMetodo", 
			"argumentos", "tipo", "comandos", "comando", "atribuicao", "condicional", 
			"chamadaMetodo", "expressao", "expressaoAritmetica", "termo", "expressaoBooleana", 
			"fatorBoole", "termoBoole"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'int'", "'bool'", "'void'", "'if'", "'else'", "'return'", 
			"'true'", "'false'", "','", null, null, "'='", "'+'", "'*'", "'=='", 
			"'<'", "'>'", "'!'", "'&&'", "'||'", "';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INT", "BOOL", "VOID", "IF", "ELSE", "RETURN", "TRUE", 
			"FALSE", "COMMA", "IDENTIFIER", "NUMBER", "ASSIGN", "PLUS", "TIMES", 
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
			setState(34);
			declaracaoClasse();
			setState(35);
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
			setState(37);
			match(CLASS);
			setState(38);
			match(IDENTIFIER);
			setState(39);
			match(LBRACE);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					declaracaoAtributo();
					}
					break;
				case 2:
					{
					setState(41);
					declaracaoMetodo();
					}
					break;
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
			setState(49);
			tipo();
			setState(50);
			match(IDENTIFIER);
			setState(51);
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			tipo();
			setState(54);
			match(IDENTIFIER);
			setState(55);
			match(LPAREN);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				setState(56);
				argumentos();
				}
			}

			setState(59);
			match(RPAREN);
			setState(60);
			match(LBRACE);
			setState(61);
			comandos();
			setState(62);
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
		enterRule(_localctx, 8, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			tipo();
			setState(65);
			match(IDENTIFIER);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(66);
				match(COMMA);
				setState(67);
				tipo();
				setState(68);
				match(IDENTIFIER);
				}
				}
				setState(74);
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
		public TerminalNode VOID() { return getToken(FoolGrammarParser.VOID, 0); }
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
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2208L) != 0)) {
				{
				{
				setState(77);
				comando();
				setState(78);
				match(SEMICOLON);
				}
				}
				setState(84);
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
		enterRule(_localctx, 14, RULE_comando);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				chamadaMetodo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(RETURN);
				setState(89);
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
		enterRule(_localctx, 16, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(ASSIGN);
			setState(94);
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
		enterRule(_localctx, 18, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IF);
			setState(97);
			match(LPAREN);
			setState(98);
			expressaoBooleana();
			setState(99);
			match(RPAREN);
			setState(100);
			comando();
			setState(101);
			match(SEMICOLON);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(102);
				match(ELSE);
				setState(103);
				comando();
				setState(104);
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
		enterRule(_localctx, 20, RULE_chamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(LPAREN);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8919808L) != 0)) {
				{
				setState(110);
				expressao();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					expressao();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
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
		enterRule(_localctx, 22, RULE_expressao);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
		enterRule(_localctx, 24, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			termo();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==TIMES) {
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				termo();
				}
				}
				setState(133);
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
		enterRule(_localctx, 26, RULE_termo);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
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
		enterRule(_localctx, 28, RULE_expressaoBooleana);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			fatorBoole();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(140);
				match(OR);
				setState(141);
				fatorBoole();
				}
				}
				setState(146);
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
		enterRule(_localctx, 30, RULE_fatorBoole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			termoBoole();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1507328L) != 0)) {
				{
				{
				setState(148);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1507328L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				termoBoole();
				}
				}
				setState(154);
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
		enterRule(_localctx, 32, RULE_termoBoole);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(FALSE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(LPAREN);
				setState(159);
				expressaoBooleana();
				setState(160);
				match(RPAREN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(NOT);
				setState(163);
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
		"\u0004\u0001\u001d\u00a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001+\b"+
		"\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003:\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006Q\b"+
		"\u0006\n\u0006\f\u0006T\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007[\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tk\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\nr\b\n\n\n\f\nu\t\n\u0003\nw\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0003\u000b}\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0082\b\f\n\f\f"+
		"\f\u0085\t\f\u0001\r\u0001\r\u0001\r\u0003\r\u008a\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u008f\b\u000e\n\u000e\f\u000e\u0092\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0097\b\u000f\n\u000f"+
		"\f\u000f\u009a\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00a5\b\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0003"+
		"\u0001\u0000\u0002\u0004\u0001\u0000\u000e\u000f\u0002\u0000\u0010\u0012"+
		"\u0014\u0014\u00aa\u0000\"\u0001\u0000\u0000\u0000\u0002%\u0001\u0000"+
		"\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000"+
		"\b@\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fR\u0001\u0000"+
		"\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000"+
		"\u0000\u0012`\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016"+
		"|\u0001\u0000\u0000\u0000\u0018~\u0001\u0000\u0000\u0000\u001a\u0089\u0001"+
		"\u0000\u0000\u0000\u001c\u008b\u0001\u0000\u0000\u0000\u001e\u0093\u0001"+
		"\u0000\u0000\u0000 \u00a4\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001"+
		"\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%&\u0005"+
		"\u0001\u0000\u0000&\'\u0005\u000b\u0000\u0000\',\u0005\u0019\u0000\u0000"+
		"(+\u0003\u0004\u0002\u0000)+\u0003\u0006\u0003\u0000*(\u0001\u0000\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000/0\u0005\u001a\u0000\u00000\u0003\u0001\u0000\u0000"+
		"\u000012\u0003\n\u0005\u000023\u0005\u000b\u0000\u000034\u0005\u0016\u0000"+
		"\u00004\u0005\u0001\u0000\u0000\u000056\u0003\n\u0005\u000067\u0005\u000b"+
		"\u0000\u000079\u0005\u0017\u0000\u00008:\u0003\b\u0004\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005"+
		"\u0018\u0000\u0000<=\u0005\u0019\u0000\u0000=>\u0003\f\u0006\u0000>?\u0005"+
		"\u001a\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0003\n\u0005\u0000"+
		"AH\u0005\u000b\u0000\u0000BC\u0005\n\u0000\u0000CD\u0003\n\u0005\u0000"+
		"DE\u0005\u000b\u0000\u0000EG\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000"+
		"\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000I\t\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0007"+
		"\u0000\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0003\u000e\u0007"+
		"\u0000NO\u0005\u0016\u0000\u0000OQ\u0001\u0000\u0000\u0000PM\u0001\u0000"+
		"\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000S\r\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"U[\u0003\u0010\b\u0000V[\u0003\u0012\t\u0000W[\u0003\u0014\n\u0000XY\u0005"+
		"\u0007\u0000\u0000Y[\u0003\u0016\u000b\u0000ZU\u0001\u0000\u0000\u0000"+
		"ZV\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005\u000b\u0000\u0000]^\u0005"+
		"\r\u0000\u0000^_\u0003\u0016\u000b\u0000_\u0011\u0001\u0000\u0000\u0000"+
		"`a\u0005\u0005\u0000\u0000ab\u0005\u0017\u0000\u0000bc\u0003\u001c\u000e"+
		"\u0000cd\u0005\u0018\u0000\u0000de\u0003\u000e\u0007\u0000ej\u0005\u0016"+
		"\u0000\u0000fg\u0005\u0006\u0000\u0000gh\u0003\u000e\u0007\u0000hi\u0005"+
		"\u0016\u0000\u0000ik\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lm\u0005\u000b"+
		"\u0000\u0000mv\u0005\u0017\u0000\u0000ns\u0003\u0016\u000b\u0000op\u0005"+
		"\n\u0000\u0000pr\u0003\u0016\u000b\u0000qo\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0018"+
		"\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z}\u0003\u0018\f\u0000{}\u0003"+
		"\u001c\u000e\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}\u0017\u0001\u0000\u0000\u0000~\u0083\u0003\u001a\r\u0000\u007f\u0080"+
		"\u0007\u0001\u0000\u0000\u0080\u0082\u0003\u001a\r\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0019\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u008a\u0005"+
		"\f\u0000\u0000\u0087\u008a\u0005\u000b\u0000\u0000\u0088\u008a\u0003\u0014"+
		"\n\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u001b\u0001\u0000\u0000"+
		"\u0000\u008b\u0090\u0003\u001e\u000f\u0000\u008c\u008d\u0005\u0015\u0000"+
		"\u0000\u008d\u008f\u0003\u001e\u000f\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u001d\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0098\u0003 \u0010\u0000"+
		"\u0094\u0095\u0007\u0002\u0000\u0000\u0095\u0097\u0003 \u0010\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u001f\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u00a5\u0005\b\u0000\u0000\u009c\u00a5\u0005\t\u0000\u0000\u009d\u00a5"+
		"\u0005\u000b\u0000\u0000\u009e\u009f\u0005\u0017\u0000\u0000\u009f\u00a0"+
		"\u0003\u001c\u000e\u0000\u00a0\u00a1\u0005\u0018\u0000\u0000\u00a1\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0013\u0000\u0000\u00a3\u00a5"+
		"\u0003 \u0010\u0000\u00a4\u009b\u0001\u0000\u0000\u0000\u00a4\u009c\u0001"+
		"\u0000\u0000\u0000\u00a4\u009d\u0001\u0000\u0000\u0000\u00a4\u009e\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5!\u0001\u0000"+
		"\u0000\u0000\u000f*,9HRZjsv|\u0083\u0089\u0090\u0098\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}