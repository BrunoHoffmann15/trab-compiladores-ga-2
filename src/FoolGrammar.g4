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
ASSIGN: '=';
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

// Declaração de método
declaracaoMetodo: tipo IDENTIFIER LPAREN (argumentos)? RPAREN LBRACE comandos RBRACE;

// Argumentos de métodos
argumentos: tipo IDENTIFIER (COMMA tipo IDENTIFIER)*;

// Tipos permitidos
tipo: INT | BOOL | VOID;

// Comandos possíveis
comandos: (comando SEMICOLON)*;

// Comando individual
comando: atribuicao
       | condicional
       | chamadaMetodo
       | RETURN expressao;

// Atribuição
atribuicao: IDENTIFIER ASSIGN expressao;

// Condicional
condicional: IF LPAREN expressaoBooleana RPAREN comando (ELSE comando)?;

// Chamada de método
chamadaMetodo: IDENTIFIER LPAREN (expressao (COMMA expressao)*)? RPAREN;

// Expressões
expressao: expressaoAritmetica | expressaoBooleana;

// Expressão aritmética
expressaoAritmetica: termo ((PLUS | TIMES) termo)*;

// Termos para expressões aritméticas
termo: NUMBER | IDENTIFIER | chamadaMetodo;

// Expressão booleana
expressaoBooleana: fatorBoole (OR fatorBoole)*;

// Fatores booleanos
fatorBoole: termoBoole ((AND | EQUALS | LESS | GREATER) termoBoole)*;

// Termos booleanos
termoBoole: TRUE | FALSE | IDENTIFIER | LPAREN expressaoBooleana RPAREN | NOT termoBoole;

// Ignorar espaços em branco e comentários
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;