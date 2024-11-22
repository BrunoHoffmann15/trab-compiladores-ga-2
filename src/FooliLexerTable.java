import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FooliLexerTable {
    FoolGrammarLexer lexer;
    CommonTokenStream tokens;
    Map<String, String> tokensTypes = new HashMap<>();

    public FooliLexerTable(FoolGrammarLexer lexer, CommonTokenStream tokens) {
        this.lexer = lexer;
        this.tokens = tokens;
        this.tokens.fill();
        this.populateTokensTypes();
    }

    public String getDataFromSymbolTable() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Token> tokenList = tokens.getTokens();

        for (Token token : tokenList) {
            String tokenText = token.getText();
            String tokenType = FoolGrammarLexer.VOCABULARY.getSymbolicName(token.getType());
            String tableType = tokensTypes.getOrDefault(tokenType, null);

            if (tableType == null)
                continue;

            stringBuilder.append(tokenText);
            stringBuilder.append(" - ");
            stringBuilder.append(tableType);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void populateTokensTypes() {
        // Associações dos tipos com as classes
        this.tokensTypes.put("CLASS", "rword");
        this.tokensTypes.put("INT", "rword");
        this.tokensTypes.put("BOOL", "rword");
        this.tokensTypes.put("VOID", "rword");
        this.tokensTypes.put("IF", "rword");
        this.tokensTypes.put("ELSE", "rword");
        this.tokensTypes.put("WHILE", "rword");
        this.tokensTypes.put("RETURN", "rword");
        this.tokensTypes.put("TRUE", "rword");
        this.tokensTypes.put("FALSE", "rword");

        this.tokensTypes.put("COMMA", "punct");
        this.tokensTypes.put("SEMICOLON", "punct");
        this.tokensTypes.put("LPAREN", "punct");
        this.tokensTypes.put("RPAREN", "punct");
        this.tokensTypes.put("LBRACE", "punct");
        this.tokensTypes.put("RBRACE", "punct");

        this.tokensTypes.put("IDENTIFIER", "ident");
        this.tokensTypes.put("NUMBER", "num");

        this.tokensTypes.put("ASSIGN", "op");
        this.tokensTypes.put("PLUS", "op");
        this.tokensTypes.put("TIMES", "op");
        this.tokensTypes.put("EQUALS", "op");
        this.tokensTypes.put("LESS", "op");
        this.tokensTypes.put("GREATER", "op");
        this.tokensTypes.put("NOT", "op");
        this.tokensTypes.put("AND", "op");
        this.tokensTypes.put("OR", "op");

        this.tokensTypes.put("WS", "ignored");
        this.tokensTypes.put("COMMENT", "ignored");
        this.tokensTypes.put("LINE_COMMENT", "ignored");
    }
}
