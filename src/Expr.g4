grammar Expr;

// Tokens
NUMBER: [0-9]+;      // Um ou mais dígitos
PLUS:   '+';         // O símbolo de adição
MINUS:  '-';         // O símbolo de subtração
TIMES:  '*';         // O símbolo de multiplicação
DIV:    '/';         // O símbolo de divisão
LPAREN: '(';         // Parêntese esquerdo
RPAREN: ')';         // Parêntese direito
WS:     [ \t\r\n]+ -> skip; // Ignora espaços em branco

// Regras de produção
expr: term ( (PLUS | MINUS) term )*; // Expressão
term: factor ( (TIMES | DIV) factor )*; // Termo
factor: NUMBER | LPAREN expr RPAREN; // Fator
