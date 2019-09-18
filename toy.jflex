import token.*;

%%

%class ToyLexer

// this gets turned to code directly
%{

// trie table goes here; switch, symbol, and next

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
"+"			{System.out.println(yytext + "\n"); return (t_PLUS);}
"-"			{System.out.println(yytext + "\n"); return (t_MINUS);}
"*"			{System.out.println(yytext + "\n"); return (t_MULTIPLICATION);}
// need to make sure this doesn't happen when using "//" as comments
"/"			{System.out.println(yytext + "\n"); return (t_DIVISION);}
","			{System.out.println(yytext + "\n"); return (t_COMMA);}
";"			{System.out.println(yytext + "\n"); return (t_SEMICOLON);}
"."			{System.out.println(yytext + "\n"); return (t_PERIOD);}
// TODO 

// insert should go in here
{id}		{}

