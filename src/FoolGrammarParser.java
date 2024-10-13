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
		RULE_declaracaoAtributo = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaracaoAtributo"
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
	public static class DeclaracaoAtributoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FoolGrammarParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FoolGrammarParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(FoolGrammarParser.SEMICOLON, 0); }
		public TerminalNode BOOL() { return getToken(FoolGrammarParser.BOOL, 0); }
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
		enterRule(_localctx, 0, RULE_declaracaoAtributo);
		try {
			setState(8);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(INT);
				setState(3);
				match(IDENTIFIER);
				setState(4);
				match(SEMICOLON);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				match(BOOL);
				setState(6);
				match(IDENTIFIER);
				setState(7);
				match(SEMICOLON);
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
		"\u0004\u0001!\u000b\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\t\b\u0000\u0001"+
		"\u0000\u0000\u0000\u0001\u0000\u0000\u0000\n\u0000\b\u0001\u0000\u0000"+
		"\u0000\u0002\u0003\u0005\u0002\u0000\u0000\u0003\u0004\u0005\f\u0000\u0000"+
		"\u0004\t\u0005\u0017\u0000\u0000\u0005\u0006\u0005\u0003\u0000\u0000\u0006"+
		"\u0007\u0005\f\u0000\u0000\u0007\t\u0005\u0017\u0000\u0000\b\u0002\u0001"+
		"\u0000\u0000\u0000\b\u0005\u0001\u0000\u0000\u0000\t\u0001\u0001\u0000"+
		"\u0000\u0000\u0001\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}