/* JFlex specification file for Toy Programming Language
*/

// User Code
package lexicalAnalyzer;
import token.*;

%%
// Options and Declarations
%public
%class ToyLexer
%type int
// this gets turned to code directly
%{

// trie table goes here; switch, symbol, and next
class entry{
 public char name[] = new char[10];
 public int type;
}
char table[] = new char[100];
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
double = [0-9]*\.[0-9]*
str = [\"]([^\"])*[\"]
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
true		{t_flag = t.BOOLEANCONSTANT; System.out.println(yytext() + "\n"); return (t.BOOLEANCONSTANT);}
false		{t_flag = t.BOOLEANCONSTANT; System.out.println(yytext() + "\n"); return (t.BOOLEANCONSTANT);}
boolean	        {t_flag = t.BOOLEAN; System.out.println(yytext() + "\n"); return (t.BOOLEAN);}
class	        {t_flag = t.CLASS; System.out.println(yytext() + "\n"); return (t.CLASS);}
double        {t_flag = t.DOUBLE; System.out.println(yytext() + "\n"); return (t.DOUBLE);}
else	        {t_flag = t.ELSE; System.out.println(yytext() + "\n"); return (t.ELSE);}
extends        {t_flag = t.EXTENDS; System.out.println(yytext() + "\n"); return (t.EXTENDS);}
for        {t_flag = t.FOR; System.out.println(yytext() + "\n"); return (t.FOR);}
if        {t_flag = t.IF; System.out.println(yytext() + "\n"); return (t.IF);}
implements	        {t_flag = t.IMPLEMENTS; System.out.println(yytext() + "\n"); return (t.IMPLEMENTS);}
interface	        {t_flag = t.INTERFACE; System.out.println(yytext() + "\n"); return (t.INTERFACE);}
new	        {t_flag = t.NEW; System.out.println(yytext() + "\n"); return (t.NEW);}
newarray	        {t_flag = t.NEWARRAY; System.out.println(yytext() + "\n"); return (t.NEWARRAY);}
println	        {t_flag = t.PRINTLN; System.out.println(yytext() + "\n"); return (t.PRINTLN);}
readln	        {t_flag = t.READLN; System.out.println(yytext() + "\n"); return (t.READLN);}
return	        {t_flag = t.RETURN; System.out.println(yytext() + "\n"); return (t.RETURN);}
String	        {t_flag = t.STRING; System.out.println(yytext() + "\n"); return (t.STRING);}
this	        {t_flag = t.THIS; System.out.println(yytext() + "\n"); return (t.THIS);}
void	        {t_flag = t.VOID; System.out.println(yytext() + "\n"); return (t.VOID);}
while	        {t_flag = t.WHILE; System.out.println(yytext() + "\n"); return (t.WHILE);}
break		{t_flag = t.BREAK; System.out.println(yytext() + "\n"); return (t.BREAK);}
null	        {t_flag = t.NULL; System.out.println(yytext() + "\n"); return (t.NULL);}
int 		{t_flag = t.INT; System.out.println(yytext() + "\n"); return (t.INT);}
"+"			{System.out.println(yytext() + "\n"); return (t.PLUS);}
"-"			{System.out.println(yytext() + "\n"); return (t.MINUS);}
"*"			{System.out.println(yytext() + "\n"); return (t.MULTIPLICATION);}
// need to make sure this doesn't happen when using "//" as comments
"/"			{System.out.println(yytext() + "\n"); return (t.DIVISION);}
"%"			{System.out.println(yytext() + "\n"); return (t.MOD);}
"<"			{System.out.println(yytext() + "\n"); return (t.LESS);}
">"			{System.out.println(yytext() + "\n"); return (t.GREATER);}
"<="			{System.out.println(yytext() + "\n"); return (t.LESSEQUAL);}
">="			{System.out.println(yytext() + "\n"); return (t.GREATEREQUAL);}
"=="			{System.out.println(yytext() + "\n"); return (t.EQUAL);}
"!="			{System.out.println(yytext() + "\n"); return (t.NOTEQUAL);}
"&&"			{System.out.println(yytext() + "\n"); return (t.AND);}
"||"			{System.out.println(yytext() + "\n"); return (t.OR);}
"!"			{System.out.println(yytext() + "\n"); return (t.NOT);}
"="			{System.out.println(yytext() + "\n"); return (t.ASSIGNOP);}
","			{System.out.println(yytext() + "\n"); return (t.COMMA);}
";"			{System.out.println(yytext() + "\n"); return (t.SEMICOLON);}
"."			{System.out.println(yytext() + "\n"); return (t.PERIOD);}
"("			{System.out.println(yytext() + "\n"); return (t.LEFTPAREN);}
")"			{System.out.println(yytext() + "\n"); return (t.RIGHTPAREN);}
"["			{System.out.println(yytext() + "\n"); return (t.LEFTBRACKET);}
"]"			{System.out.println(yytext() + "\n"); return (t.RIGHTBRACKET);}
"{"			{System.out.println(yytext() + "\n"); return (t.LEFTBRACE);}
"}"			{System.out.println(yytext() + "\n"); return (t.RIGHTBRACE);}
{int}			{System.out.println(yytext() + "\n"); return (t.INTCONSTANT);}
{id}			{System.out.println(yytext() + "\n"); return (t.ID);}
{str}			{System.out.println(yytext() + "\n"); return (t.STRINGCONSTANT);}
{double}		{System.out.println(yytext() + "\n"); return (t.DOUBLECONSTANT);}
// TODO 

// insert should go in here
