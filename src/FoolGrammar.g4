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
WS : [ \t\r\n]+ -> skip ;

// Classes
PALAVRARESERVADA: CLASS | INT | BOOL | VOID | IF | ELSE | RETURN;
LITERAL: TRUE | FALSE | NUMBER;
IDENTIFICADOR: IDENTIFIER;
OPERADOR: ATRIB | PLUS | TIMES | EQUALS | LESS | GREATER | NOT | AND | OR;
DELIMITADOR: COMMA | SEMICOLON | LPAREN | RPAREN | LBRACE | RBRACE;


declaracaoClasse: CLASS IDENTIFIER LBRACE comandos RBRACE | CLASS IDENTIFIER LBRACE RBRACE;
comandos: declaracaoAtributo;
declaracaoAtributo: INT IDENTIFIER SEMICOLON | BOOL IDENTIFIER SEMICOLON;
expressaoAritmetica: IDENTIFIER PLUS IDENTIFIER | IDENTIFIER TIMES IDENTIFIER;