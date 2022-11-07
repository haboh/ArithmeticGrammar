grammar Arithmetic;
s: eq=a ';'   #equation |
   expr=e ';' #exp      ;

a: var=VAR '=' expr=e;

e:
    left=e op=('+'|'*') right=e #opExpr      |
    '(' value=e ')'             #parenExpr   |
    variable=VAR                #varEquation |
    atom    =NUMBER             #atomExpr    ;

NUMBER : ('0' .. '9')+;
VAR:     (('a' .. 'z') | ('A' .. 'Z'))+;