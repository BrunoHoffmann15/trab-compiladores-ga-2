grammar FoolGrammar;

// Tokens
CLASS: 'class';
INT: 'int';
BOOL: 'bool';
VOID: 'void';
IF: 'if';
ELSE: 'else';
RETURN: 'return';
TRUE: 'true';
FALSE: 'false';
COMMA: ',';
INVALIDIDENTIFIER: [0-9][a-zA-Z0-9_]*;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
ATRIB: '=';
PLUS: '+';
TIMES: '*';
EQUALS: '==';
LESS: '<';
GREATER: '>';
NOT: '!';
AND: '&&';
OR: '||';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';

// Classes
PALAVRARESERVADA: CLASS | INT | BOOL | VOID | IF | ELSE | RETURN;
LITERAL: TRUE | FALSE | NUMBER;
IDENTIFICADOR: IDENTIFIER;
OPERADOR: ATRIB | PLUS | TIMES | EQUALS | LESS | GREATER | NOT | AND | OR;
DELIMITADOR: COMMA | SEMICOLON | LPAREN | RPAREN | LBRACE | RBRACE;


// Regras de produção
expr: term ( (PLUS | MINUS) term )*; // Expressão
term: factor ( (TIMES | DIV) factor )*; // Termo
factor: NUMBER | LPAREN expr RPAREN; // Fator
