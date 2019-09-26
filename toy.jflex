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
static final int BOOLEANCONSTANT = 0;
static final int BOOLEAN = 1;
static final int CLASS = 2;
static final int DOUBLE = 3;
static final int ELSE = 4;
static final int EXTENDS = 5;
static final int FOR = 6;
static final int IF = 7;
static final int IMPLEMENTS = 8;
static final int INTERFACE = 9;
static final int NEW = 10;
static final int NEWARRAY = 11;
static final int PRINTLN = 12;
static final int READLN = 13;
static final int RETURN = 14;
static final int STRING = 15;
static final int THIS = 16;
static final int VOID = 17;
static final int WHILE = 18;
static final int BREAK = 19;
static final int NULL = 20;
static final int INT = 21;
TokenDefinitions t;
int t_flag = 0;
int yylval;
// trie table goes here; switch, symbol, and next

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
true		{t_flag = BOOLEANCONSTANT; System.out.println(yytext() + "\n"); return (t.BOOLEANCONSTANT);}
false		{t_flag = BOOLEANCONSTANT; System.out.println(yytext() + "\n"); return (t.BOOLEANCONSTANT);}
boolean	        {t_flag = BOOLEAN; System.out.println(yytext() + "\n"); return (t.BOOLEAN);}
class	        {t_flag = CLASS; System.out.println(yytext() + "\n"); return (t.CLASS);}
double        {t_flag = DOUBLE; System.out.println(yytext() + "\n"); return (t.DOUBLE);}
else	        {t_flag = ELSE; System.out.println(yytext() + "\n"); return (t.ELSE);}
extends        {t_flag = EXTENDS; System.out.println(yytext() + "\n"); return (t.EXTENDS);}
for        {t_flag = FOR; System.out.println(yytext() + "\n"); return (t.FOR);}
if        {t_flag = IF; System.out.println(yytext() + "\n"); return (t.IF);}
implements	        {t_flag = IMPLEMENTS; System.out.println(yytext() + "\n"); return (t.IMPLEMENTS);}
interface	        {t_flag = INTERFACE; System.out.println(yytext() + "\n"); return (t.INTERFACE);}
new	        {t_flag = NEW; System.out.println(yytext() + "\n"); return (t.NEW);}
newarray	        {t_flag = NEWARRAY; System.out.println(yytext() + "\n"); return (t.NEWARRAY);}
println	        {t_flag = PRINTLN; System.out.println(yytext() + "\n"); return (t.PRINTLN);}
readln	        {t_flag = READLN; System.out.println(yytext() + "\n"); return (t.READLN);}
return	        {t_flag = RETURN; System.out.println(yytext() + "\n"); return (t.RETURN);}
String	        {t_flag = STRING; System.out.println(yytext() + "\n"); return (t.STRING);}
this	        {t_flag = THIS; System.out.println(yytext() + "\n"); return (t.THIS);}
void	        {t_flag = VOID; System.out.println(yytext() + "\n"); return (t.VOID);}
while	        {t_flag = WHILE; System.out.println(yytext() + "\n"); return (t.WHILE);}
break		{t_flag = BREAK; System.out.println(yytext() + "\n"); return (t.BREAK);}
null	        {t_flag = NULL; System.out.println(yytext() + "\n"); return (t.NULL);}
int 		{t_flag = INT; System.out.println(yytext() + "\n"); return (t.INT);}
"+"			{System.out.println("plus"+yytext() + "\n"); return (t.PLUS);}
"-"			{System.out.println("minus"+yytext() + "\n"); return (t.MINUS);}
"*"			{System.out.println("multipication"+yytext() + "\n"); return (t.MULTIPLICATION);}
// need to make sure this doesn't happen when using "//" as comments
"/"			{System.out.println("division" + "\n"); return (t.DIVISION);}
"%"			{System.out.println("mod" + "\n"); return (t.MOD);}
"<"			{System.out.println("less" + "\n"); return (t.LESS);}
">"			{System.out.println("greater" + "\n"); return (t.GREATER);}
"<="			{System.out.println("lessequal" + "\n"); return (t.LESSEQUAL);}
">="			{System.out.println("greaterequal" + "\n"); return (t.GREATEREQUAL);}
"=="			{System.out.println("equal" + "\n"); return (t.EQUAL);}
"!="			{System.out.println("notequal" + "\n"); return (t.NOTEQUAL);}
"&&"			{System.out.println("and" + "\n"); return (t.AND);}
"||"			{System.out.println("or" + "\n"); return (t.OR);}
"!"			{System.out.println("not" + "\n"); return (t.NOT);}
"="			{System.out.println("assignop" + "\n"); return (t.ASSIGNOP);}
","			{System.out.println("comma" + "\n"); return (t.COMMA);}
";"			{System.out.println("semicolon" + "\n"); return (t.SEMICOLON);}
"."			{System.out.println("period" + "\n"); return (t.PERIOD);}
"("			{System.out.println("leftparen" + "\n"); return (t.LEFTPAREN);}
")"			{System.out.println("rightparen" + "\n"); return (t.RIGHTPAREN);}
"["			{System.out.println("leftbracket" + "\n"); return (t.LEFTBRACKET);}
"]"			{System.out.println("rightbracket" + "\n"); return (t.RIGHTBRACKET);}
"{"			{System.out.println("leftbrace" + "\n"); return (t.LEFTBRACE);}
"}"			{System.out.println("rightbrace" + "\n"); return (t.RIGHTBRACE);}
{int}			{System.out.println("intconstant" + "\n"); return (t.INTCONSTANT);}
{id}			{System.out.println("id" + "\n"); return(t_ID);}
{str}			{System.out.println("stringconstant" + "\n"); return (t.STRINGCONSTANT);}
{double}		{System.out.println("doubleconstant" + "\n"); return (t.DOUBLECONSTANT);}
