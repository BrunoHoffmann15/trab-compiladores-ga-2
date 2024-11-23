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

  // Gera um novo rótulo único
  private String newLabel() {
    return "L" + labelCounter.getAndIncrement();
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
  }

  // Ações semânticas para comandos
  @Override
  public void exitAtribuicao(FoolGrammarParser.AtribuicaoContext ctx) {
    String variavel = ctx.IDENTIFIER().getText();

    if (!symbolTable.containsKey(variavel)) {
      throw new RuntimeException("Erro semântico: variável " + variavel + " não declarada.");
    }

    // Configuração

    String tac = variavel + " = " + ctx.expressao().getText();

    tacBuilder.append(tac).append("\n");
  }

  @Override
  public void exitCondicional(FoolGrammarParser.CondicionalContext ctx) {
    String labelElse = newLabel();
    String labelEnd = newLabel();

    // Gerar TAC para condição
    String expressao = ctx.expressaoBooleana().getText();
    tacBuilder.append("if not(").append(expressao).append(") goto ").append(labelElse).append("\n");

    // Comando "then"
    tacBuilder.append(ctx.comando(0).getText()).append("\n");
    tacBuilder.append("goto ").append(labelEnd).append("\n");

    // Comando "else" (se existir)
    tacBuilder.append(labelElse).append(":\n");
    if (ctx.comando(1) != null) {
      tacBuilder.append(ctx.comando(1).getText()).append("\n");
    }

    // Fim do if
    tacBuilder.append(labelEnd).append(":\n");
  }

  @Override
  public void exitRepeticao(FoolGrammarParser.RepeticaoContext ctx) {
    String labelStart = newLabel();
    String labelEnd = newLabel();

    // Início do loop
    tacBuilder.append(labelStart).append(":\n");

    // Condição do loop
    String expressao = ctx.expressaoBooleana().getText();
    tacBuilder.append("if not(").append(expressao).append(") goto ").append(labelEnd).append("\n");

    // Corpo do loop
    tacBuilder.append(ctx.comando().getText()).append("\n");

    // Voltar ao início do loop
    tacBuilder.append("goto ").append(labelStart).append("\n");

    // Fim do loop
    tacBuilder.append(labelEnd).append(":\n");
  }

  @Override public void exitChamadaMetodo(FoolGrammarParser.ChamadaMetodoContext ctx) {
    // Obtém o identificador do método
    String metodo = ctx.IDENTIFIER().getText();

    // Obtém os parâmetros
    List<FoolGrammarParser.ExpressaoContext> parametros = ctx.expressao();


    // Processa os parâmetros
    if (parametros != null && !parametros.isEmpty()) {
      for (FoolGrammarParser.ExpressaoContext param : parametros) {
        String paramValue = param.getText(); // Obtém o texto da expressão
        tacBuilder.append("param " + paramValue).append("\n");
      }
    }

    if (parametros != null && parametros.size() > 0) {
      tacBuilder.append("call " + metodo + ", " + parametros.size()).append("\n");
    } else {
      tacBuilder.append("call " + metodo).append("\n");
    }
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

  public void saveOutput(String filename) throws IOException {
    try (FileWriter writer = new FileWriter(filename)) {
      writer.write("==============================\n");
      writer.write("Tabela de Símbolos:\n");
      writer.write("==============================\n");
      symbolTable.forEach((key, value) -> {
        try {
          writer.write(key + ": " + value + "\n");
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      });

      writer.write("==============================\n");
      writer.write("\nCódigo Intermediário (TAC):\n");
      writer.write("==============================\n");
      writer.write(tacBuilder.toString());
    }
  }
}
