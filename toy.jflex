/* JFlex specification file for Toy Programming Language
*/

// User Code
package lexicalAnalyzer;
import token.*;

%%
// Options and Declarations

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
line_terminator = \r|\n|\r\n
input_character = [ˆ\r\n]
letter = [a-zA-Z]
digit = [0-9]
id = {letter}({letter}|{digit})*
int = {digit}*
comment = {comment_multi} | {comment_line}
comment_multi = "/*" [ˆ*] {comment_body} "*" + "/"
comment_line = "//" {input_character}* {line_terminator}
comment_body = ( [ˆ*] | \*+ [ˆ/*] )*
ws = [ \t\n]

%%
// Lexical Rules
{comment}	{}
{ws}		{}
true		{t_flag = t.BOOLEAN; System.out.println(yytext() + "\n"); return t.BOOLEAN;}
false		{t_flag = t.BOOLEAN; System.out.println(yytext() + "\n"); return t.BOOLEAN;}
break		{t_flag = t.BREAK; System.out.println(yytext() + "\n"); return t.BREAK;}
int 		{t_flag = t.INT; System.out.println(yytext() + "\n"); return (t.INT);}
"+"			{System.out.println(yytext() + "\n"); return (t.PLUS);}
"-"			{System.out.println(yytext() + "\n"); return (t.MINUS);}
"*"			{System.out.println(yytext() + "\n"); return (t.MULTIPLICATION);}
// need to make sure this doesn't happen when using "//" as comments
"/"			{System.out.println(yytext() + "\n"); return (t.DIVISION);}
","			{System.out.println(yytext() + "\n"); return (t.COMMA);}
";"			{System.out.println(yytext() + "\n"); return (t.SEMICOLON);}
"."			{System.out.println(yytext() + "\n"); return (t.PERIOD);}
// TODO 

// insert should go in here
{id}		{}

