grammar DimensionsParser;

file: dimensions* EOF;

dimensions: 
			NAMEOFDIM '[' UNITS ']' ';'  							#EnterIndepentDim
			| e1=NAMEOFDIM '=' e2=NAMEOFDIM '/' e3=NAMEOFDIM ';'  			#EnterDependentDimDiv
			| e1=NAMEOFDIM '=' e2=NAMEOFDIM '*' e3=NAMEOFDIM ';'				#EnterDependentDimMul
			;
			

NAMEOFDIM: [A-Z][a-z]+;
UNITS: [a-z];
WHITESPACE: [ \t\r\n]+ -> skip;

