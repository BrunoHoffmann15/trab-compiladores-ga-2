import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) {
    try {
      // Lê o código-fonte de entrada
      String source = Files.readString(Paths.get("input.txt"));
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

      // Exibe resultados
      listener.printSymbolTable();
      listener.printTAC();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
