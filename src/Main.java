import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;

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

      // Listener para análise semântica
      ParseTree tree = parser.programa();
      FOOLISemanticoListener listener = new FOOLISemanticoListener();
      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(listener, tree);

      // Salvar a tabela de símbolos e o TAC no mesmo arquivo
      listener.saveOutput(outputFile);

      System.out.println("Análise concluída com sucesso. Resultados salvos em: " + outputFile);

    } catch (Exception e) {
      e.printStackTrace();
    }
  } 
}
