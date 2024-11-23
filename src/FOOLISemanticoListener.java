import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FOOLISemanticoListener extends FoolGrammarBaseListener {
  private final Map<String, String> symbolTable = new HashMap<>();
  private final StringBuilder tacBuilder = new StringBuilder();
  private final AtomicInteger labelCounter = new AtomicInteger(0);
  private final AtomicInteger tempCounter = new AtomicInteger(0);

  // Gera um novo rótulo único
  private String newLabel() {
    return "L" + labelCounter.getAndIncrement();
  }

  private String newTempVar() {
    return "t" + tempCounter.getAndIncrement();
  }

  // Ações semânticas para declarações
  @Override
  public void exitDeclaracaoAtributo(FoolGrammarParser.DeclaracaoAtributoContext ctx) {
    String tipo = ctx.tipo().getText();
    String nome = ctx.IDENTIFIER().getText();

    if (symbolTable.containsKey(nome)) {
      throw new RuntimeException("Erro semântico: variável " + nome + " já declarada.");
    }

    symbolTable.put(nome, tipo);
    super.exitDeclaracaoAtributo(ctx);
  }

  @Override
  public void exitArgumentos(FoolGrammarParser.ArgumentosContext ctx) {
    for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
      String nome = ctx.IDENTIFIER(i).getText();
      String tipo = ctx.tipo(i).getText();
      if (symbolTable.containsKey(nome)) {
        throw new RuntimeException("Erro semântico: argumento " + nome + " já declarado.");
      }
      symbolTable.put(nome, tipo);
    }
    super.exitArgumentos(ctx);
  }

  @Override
  public void enterMetodoMain(FoolGrammarParser.MetodoMainContext ctx) {
    tacBuilder.append("main").append(":").append("\n");
    ;
    processComandos(ctx.comandos());
    tacBuilder.append("\n");
    super.enterMetodoMain(ctx);
  }

  @Override
  public void enterMetodoNormal(FoolGrammarParser.MetodoNormalContext ctx) {
    tacBuilder.append(ctx.IDENTIFIER()).append(":").append("\n");
    ;
    processComandos(ctx.comandos());
    tacBuilder.append("\n");
    super.enterMetodoNormal(ctx);
  }

  private void processComandos(FoolGrammarParser.ComandosContext ctx) {
    for (var comando : ctx.comando()) {
      processComando(comando);
    }
  }

  private void processComando(FoolGrammarParser.ComandoContext ctx) {
    if (ctx.atribuicao() != null) {
      processAtribuicao(ctx.atribuicao());
    } else if (ctx.condicional() != null) {
      processCondicional(ctx.condicional());
    } else if (ctx.repeticao() != null) {
      processRepeticao(ctx.repeticao());
    } else if (ctx.chamadaMetodo() != null) {
      processChamadaMetodo(ctx.chamadaMetodo());
    } else if (ctx.expressao() != null) {
      String left = processExpressao(ctx.expressao());
      tacBuilder.append("return ").append(left).append("\n");
    }
  }

  private void processCondicional(FoolGrammarParser.CondicionalContext ctx) {
    String labelElse = newLabel();
    String labelEnd = newLabel();

    // Gerar TAC para condição
    String expressao = processExpressaoBooleana(ctx.expressaoBooleana());
    tacBuilder.append("if not(").append(expressao).append(") goto ").append(labelElse).append("\n");

    // Comando "then"
    processComando(ctx.comando(0));
    tacBuilder.append("goto ").append(labelEnd).append("\n");

    // Comando "else" (se existir)
    tacBuilder.append(labelElse).append(":\n");

    if (ctx.comando(1) != null) {
      processComando(ctx.comando(1));
    }

    // Fim do if
    tacBuilder.append(labelEnd).append(":\n");
  }

  private void processRepeticao(FoolGrammarParser.RepeticaoContext ctx) {
    String labelStart = newLabel();
    String labelEnd = newLabel();

    // Início do loop
    tacBuilder.append(labelStart).append(":\n");

    // Condição do loop
    String expressao = processExpressaoBooleana(ctx.expressaoBooleana());
    tacBuilder.append("if not(").append(expressao).append(") goto ").append(labelEnd).append("\n");

    if (ctx.comando() != null) {
      processComando(ctx.comando());
    }

    // Voltar ao início do loop
    tacBuilder.append("goto ").append(labelStart).append("\n");

    // Fim do loop
    tacBuilder.append(labelEnd).append(":\n");
  }

  private void processChamadaMetodo(FoolGrammarParser.ChamadaMetodoContext ctx, String... args) {
    String metodo = ctx.IDENTIFIER().getText();

    // Obtém os parâmetros
    var parametros = ctx.expressao();

    // Processa os parâmetros
    if (parametros != null && !parametros.isEmpty()) {
      for (FoolGrammarParser.ExpressaoContext param : parametros) {
        String paramValue = param.getText(); // Obtém o texto da expressão
        tacBuilder.append("param ").append(paramValue).append("\n");
      }
    }

    if (args.length > 0) {
      tacBuilder.append(args[0]);
    }

    if (parametros != null && parametros.size() > 0) {
      tacBuilder.append("call ").append(metodo).append(", ").append(parametros.size()).append("\n");
    } else {
      tacBuilder.append("call ").append(metodo).append("\n");
    }
  }

  private void processAtribuicao(FoolGrammarParser.AtribuicaoContext atribuicaoContext) {
    String left = processExpressao(atribuicaoContext.expressao());
    String tac = atribuicaoContext.IDENTIFIER() + " = " + left;

    tacBuilder.append(tac).append("\n");
  }

  private String processExpressao(FoolGrammarParser.ExpressaoContext ctx) {
    if (ctx.expressaoAritmetica() != null) {
      return processArithmetic(ctx.expressaoAritmetica());
    } else if (ctx.expressaoBooleana() != null) {
      return processExpressaoBooleana(ctx.expressaoBooleana());
    }
    return "";
  }

  private String processArithmetic(FoolGrammarParser.ExpressaoAritmeticaContext ctx) {
    String left = processTerm(ctx.termo(0));

    for (int i = 1; i < ctx.termo().size(); i++) {
      String op = ctx.getChild(2 * i - 1).getText();
      String right = processTerm(ctx.termo(i));
      String temp = newTempVar();
      tacBuilder.append(temp + " = " + left + " " + op + " " + right).append("\n");
      ;
      left = temp;
    }
    return left;
  }

  private String processExpressaoBooleana(FoolGrammarParser.ExpressaoBooleanaContext ctx) {
    // A expressão booleana pode ser composta de múltiplos fatores
    String left = processFatorBoole(ctx.fatorBoole(0));

    for (int i = 1; i < ctx.fatorBoole().size(); i++) {
      String op = ctx.getChild(2 * i - 1).getText(); // Operador (&&, ||, etc.)
      String right = processFatorBoole(ctx.fatorBoole(i));
      String temp = newTempVar();

      // Gera o código para combinar os fatores usando o operador
      tacBuilder.append(temp).append(" = ").append(left).append(" ").append(op).append(" ").append(right).append("\n");
      ;
      left = temp; // Atualiza o fator esquerdo para o próximo operador
    }

    return left;
  }

  private String processFatorBoole(FoolGrammarParser.FatorBooleContext ctx) {
    // A expressão booleana pode ser composta de múltiplos fatores
    String left = processTermoBoleano(ctx.termoBoole(0));

    for (int i = 1; i < ctx.termoBoole().size(); i++) {
      String op = ctx.getChild(2 * i - 1).getText(); // Operador (&&, ||, etc.)
      String right = processTermoBoleano(ctx.termoBoole(i));
      String temp = newTempVar();

      // Gera o código para combinar os fatores usando o operador
      tacBuilder.append(temp).append(" = ").append(left).append(" ").append(op).append(" ").append(right).append("\n");
      ;
      left = temp; // Atualiza o fator esquerdo para o próximo operador
    }

    return left;
  }

  private String processTermoBoleano(FoolGrammarParser.TermoBooleContext ctx) {
    if (ctx.expressaoBooleana() != null) {
      return processExpressaoBooleana(ctx.expressaoBooleana());
    }
    if (ctx.TRUE() != null) {
      return ctx.TRUE().getText();
    } else if (ctx.FALSE() != null) {
      return ctx.FALSE().getText();
    } else if (ctx.termoBoole() != null) {
      return ctx.NOT().getText() + processTermoBoleano(ctx.termoBoole());
    } else if (ctx.IDENTIFIER() != null) {
      return ctx.IDENTIFIER().getText();
    }

    return "";
  }

  private String processTerm(FoolGrammarParser.TermoContext ctx) {
    if (ctx.NUMBER() != null) {
      return ctx.NUMBER().getText();
    } else if (ctx.IDENTIFIER() != null) {
      return ctx.IDENTIFIER().getText();
    } else if (ctx.chamadaMetodo() != null) {
      String tempVar = newTempVar();
      processChamadaMetodo(ctx.chamadaMetodo(), tempVar + " = ");
      return tempVar;
    }

    return "";
  }

  public String getTac() {
    return tacBuilder.toString();
  }

  public String getSymbolTable() {
    StringBuilder stringBuilder = new StringBuilder();

    symbolTable.forEach((key, value) -> {
      stringBuilder.append(key);
      stringBuilder.append(": ");
      stringBuilder.append(value);
      stringBuilder.append("\n");
    });

    return stringBuilder.toString();
  }
}
