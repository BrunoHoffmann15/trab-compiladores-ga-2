// Generated from FoolGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FoolGrammarParser}.
 */
public interface FoolGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoClasse(FoolGrammarParser.DeclaracaoClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoClasse(FoolGrammarParser.DeclaracaoClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(FoolGrammarParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(FoolGrammarParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#declaracaoAtributo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoAtributo(FoolGrammarParser.DeclaracaoAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#declaracaoAtributo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoAtributo(FoolGrammarParser.DeclaracaoAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(FoolGrammarParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(FoolGrammarParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#declaracaoMetodo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoMetodo(FoolGrammarParser.DeclaracaoMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#declaracaoMetodo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoMetodo(FoolGrammarParser.DeclaracaoMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(FoolGrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(FoolGrammarParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(FoolGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(FoolGrammarParser.ExpressaoAritmeticaContext ctx);
}