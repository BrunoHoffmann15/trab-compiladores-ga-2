// Generated from FoolGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FoolGrammarParser}.
 */
public interface FoolGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(FoolGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(FoolGrammarParser.ProgramaContext ctx);
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
	 * Enter a parse tree produced by {@link FoolGrammarParser#tipoMetodos}.
	 * @param ctx the parse tree
	 */
	void enterTipoMetodos(FoolGrammarParser.TipoMetodosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#tipoMetodos}.
	 * @param ctx the parse tree
	 */
	void exitTipoMetodos(FoolGrammarParser.TipoMetodosContext ctx);
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
	 * Enter a parse tree produced by {@link FoolGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(FoolGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(FoolGrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(FoolGrammarParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(FoolGrammarParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(FoolGrammarParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(FoolGrammarParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void enterChamadaMetodo(FoolGrammarParser.ChamadaMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void exitChamadaMetodo(FoolGrammarParser.ChamadaMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(FoolGrammarParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(FoolGrammarParser.ExpressaoContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(FoolGrammarParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(FoolGrammarParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoBooleana(FoolGrammarParser.ExpressaoBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoBooleana(FoolGrammarParser.ExpressaoBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#fatorBoole}.
	 * @param ctx the parse tree
	 */
	void enterFatorBoole(FoolGrammarParser.FatorBooleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#fatorBoole}.
	 * @param ctx the parse tree
	 */
	void exitFatorBoole(FoolGrammarParser.FatorBooleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolGrammarParser#termoBoole}.
	 * @param ctx the parse tree
	 */
	void enterTermoBoole(FoolGrammarParser.TermoBooleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolGrammarParser#termoBoole}.
	 * @param ctx the parse tree
	 */
	void exitTermoBoole(FoolGrammarParser.TermoBooleContext ctx);
}