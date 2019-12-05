
grammar SourceLanguage;

main: (instruction ';')* EOF;

instruction:    
        declaration
        | assignment
        | print
        | expression
        ;

declaration: 
	
          'Integer' VARNAME 		#IntegerType
	| 'Double' VARNAME 		#DoubleType	
	| TYPENAME VARNAME 		#NewType
	;

assignment:
          declaration '=' expression    #AssignDeclaration
        | VARNAME '=' expression      #AssignVariable
        ;			

print:    'print' '(' expression ')'                #PrintExpression
        ;

expression:'('expression')'                               #ExpressionAssociation
        |op=('+'|'-') expression                          #ExpressionSignal
        | e1=expression op=('*'|'/') e2=expression        #ExpressionMulDiv
        | e1=expression op=('+'|'-') e2=expression        #ExpressionAddSub
        | DOUBLE                                          #ExpressionDouble
        | INTEGER                                         #ExpressionInteger
	| VARNAME				          #ExpressionVariable
        ;

TYPENAME: [A-Z][a-z]+;
VARNAME: [a-zA-Z_][a-zA-Z_0-9]*;
INTEGER: [0-9]+;
DOUBLE: INTEGER '.' INTEGER;
WHITESPACE: [ \t\r\n]+ -> skip;
ERROR:.;
