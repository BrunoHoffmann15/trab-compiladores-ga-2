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

// Regras de Produção
declaracaoClasse: CLASS IDENTIFIER LBRACE comandos RBRACE;
comandos: declaracaoAtributo | ;
declaracaoAtributo: tipo IDENTIFIER SEMICOLON;
argumentos: tipo IDENTIFIER | tipo IDENTIFIER COMMA argumentos;
declaracaoMetodo: tipo IDENTIFIER LPAREN argumentos RPAREN LBRACE comandos RBRACE | tipo IDENTIFIER LPAREN RPAREN LBRACE comandos RBRACE;
tipo: INT | BOOL;
expressaoAritmetica: IDENTIFIER PLUS IDENTIFIER | IDENTIFIER TIMES IDENTIFIER;