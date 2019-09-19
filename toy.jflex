import token.*;

%%

%class ToyLexer

// this gets turned to code directly
%{

// trie table goes here; switch, symbol, and next

TokenDefinitions t = new TokenDefinitions();

int t_index = 0;
int t_flag = 0;
%}
// end of direct code entry

// Pattern definitions
letter = [a-zA-Z]
digit = [0-9]
id = {letter}({letter}|{digit})*
ws = [ \t\n]

%%


// {ws}		;
int 		{t_flag = INT; System.out.println(yytext + "\n"); return (t_INT);}
float		{t_flag = FLOAT; System.out.println(yytext + "\n"); return (t_FLOAT);}
"+"			{System.out.println(yytext + "\n"); return (t.PLUS);}
"-"			{System.out.println(yytext + "\n"); return (t.MINUS);}
"*"			{System.out.println(yytext + "\n"); return (t.MULTIPLICATION);}
// need to make sure this doesn't happen when using "//" as comments
"/"			{System.out.println(yytext + "\n"); return (t.DIVISION);}
","			{System.out.println(yytext + "\n"); return (t.COMMA);}
";"			{System.out.println(yytext + "\n"); return (t.SEMICOLON);}
"."			{System.out.println(yytext + "\n"); return (t.PERIOD);}
// TODO 

// insert should go in here
{id}		{}

