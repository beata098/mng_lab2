grammar Calculator;

expression: '(' expression ')'| multiplyExpression ((PLUS | MINUS) multiplyExpression)*;
multiplyExpression: powerExpression ((MULT | DIVIDE) powerExpression)*;
powerExpression: sqrtExpression (POWER powerExpression)?;
sqrtExpression: atom | SQRT sqrtExpression;
atom : NUMBER | '-' atom | '(' expression ')';


NUMBER: ('0'..'9')+ ('.' ('0'..'9')+)?;
PLUS: '+';
MINUS: '-';
MULT : '*';
DIVIDE: '/';
POWER: '^';
SQRT: 'sqrt';
WS: [ \t\r\n]+ -> skip ;
