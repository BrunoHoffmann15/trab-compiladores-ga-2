import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Uso: java Main <arquivo de entrada> <arquivo de saída>");
      return;
    }

    String inputFile = args[0];
    String outputFile = args[1];

    try {
      // Lê o código-fonte de entrada
      String source = Files.readString(Paths.get(inputFile));
      CharStream input = CharStreams.fromString(source);

      // Lexer e Parser
      FoolGrammarLexer lexer = new FoolGrammarLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      FoolGrammarParser parser = new FoolGrammarParser(tokens);
      FooliLexerTable lexerTable = new FooliLexerTable(lexer, tokens);

      // Listener para análise semântica
      ParseTree tree = parser.programa();
      FOOLISemanticoListener listener = new FOOLISemanticoListener();
      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(listener, tree);

      // Obtém tabela de símbolos
      String symbolTable = lexerTable.getDataFromSymbolTable();

      // Obtém tac
      String tac = listener.getTac();

      writeFile(outputFile, symbolTable, tac);

      System.out.println("Análise concluída com sucesso. Resultados salvos em: " + outputFile);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void writeFile(String outputFile, String symbolTable, String tac) throws IOException {
    try (FileWriter writer = new FileWriter(outputFile)) {
      // Escreve tabela de símbolos
      writer.write("==============================\n");
      writer.write("Tabela de Símbolos:\n");
      writer.write("==============================\n");
      writer.write(symbolTable);

      // Escreve TAC
      writer.write("\n==============================\n");
      writer.write("Código Intermediário (TAC):\n");
      writer.write("==============================\n");
      writer.write(tac);
    }
  }
}
