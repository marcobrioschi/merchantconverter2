grammar merchantshell;

start :
    commandline (CMDSEP commandline)* EOF
    ;

commandline :
    |   symboldeclaration
    |   symbolconversion
    |   goodspricing
    |   goodstrading
    ;

// glob means I
symboldeclaration :
    symbol=STRING MEANS ROMANCHAR
    ;

// how much is pish tegj glob glob ?
symbolconversion :
    EVAL symbols+=STRING+ QST
    ;

// glob glob units of Silver are worth 34 Credits
goodspricing :
    symbols+=STRING+ UNITSOF goods=STRING COMPARE credits=INT CREDITS
    ;

// how many Credits is glob prok Gold ?
goodstrading :
    TRADE symbols+=STRING+ goods=STRING QST
    ;

MEANS       : 'means';
EVAL        : 'how much is';
UNITSOF     : 'units of';
COMPARE     : 'are worth';
CREDITS     : 'Credits';
TRADE       : 'how many Credits is';
QST         : '?';

ROMANCHAR   : ('M' | 'D' | 'C' | 'L' | 'X' | 'V' | 'I');
INT         : '0'..'9'+;
STRING      : ('a'..'z'|'A'..'Z')+;

CMDSEP      : [\r\n]+;

WS          : [ \t]+ -> skip;