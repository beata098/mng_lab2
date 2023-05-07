grammar Calculator;

expression: addExpression;
addExpression: multiplyExpression ((PLUS | MINUS) multiplyExpression)*;
multiplyExpression: powerExpression ((MULT | DIV) powerExpression)*;
powerExpression: sqrtExpression (POWER sqrtExpression)?;
sqrtExpression: atom (SQRT atom)?;
atom: INT | FLOAT | LPAREN expression RPAREN;


INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
POWER: '^';
SQRT: 'sqrt';
LPAREN: '(';
RPAREN: ')';
WS: [ \t\r\n]+ -> skip;

/*grammar Calculator;
 
expression: multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*;
multiplyingExpression: powExpression ((MULT|DIV) powExpression)*;
powExpression: signedAtom (POW signedAtom)*
integralExpression: MINUS INT | INT;
 
INT: [0-9]+ ;
PLUS: '+' ;
MINUS: '-' ;
MULT: '*';
DIV: '/';
POW: '^';
SQRT: 'sqrt';
LPAREN: '(';
RPAREN: ')';
INTEGRAL: 'cal';
WS : [ \t\r\n]+ -> skip ;*/
