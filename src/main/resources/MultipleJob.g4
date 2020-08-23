grammar MultipleJob;
prog : statement+ ;
statement : JOB NEWLINE
    | NEWLINE;
JOB : [ a-zA-Z]+';'+;
NEWLINE : '\r'? '\n';

