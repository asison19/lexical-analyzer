/* JFlex specification file for Toy Programming Language*/
// User Code
package lexicalAnalyzer;
import token.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.io.File;
import java.util.Scanner;

%%
// Options and Declarations
%public
%class ToyLexer
%type Integer

// this gets added to the constructor of the created lexer class
%init{
// User added code.
// Add keyword identifiers to the trie table.
FileReader reader;
File root = new File("");
try {
	root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
} catch (URISyntaxException e1) {
	e1.printStackTrace();
}
File infile = new File(root ,"../src/lexicalAnalyzer/keywords.txt");
Scanner s;

try {
	s = new Scanner(new FileReader(infile));
	while (s.hasNext()) {
		trie.insert(s.next());
	}
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
// end user added code.
%init}

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
int t_flag = 0;
int yylval;
// trie table that contains the identifiers and keywords
TrieTable trie = new TrieTable();

public void outputTrie() {
	trie.output();
}

// end of user code
%}
// end of direct code entry

// Pattern definitions
letter = [a-zA-Z]
digit = [0-9]
double = [0-9]*\.[0-9]*
// includes regular and both slanted quotation marks, char 84, 8220 and 8221
// does NOT match a mixture of both
str = \"([^\"\\\\]|\\\\.)*\" | \“([^\”\\\\]|\\\\.)*\”
id = {letter}({letter}|{digit})*
int = {digit}+
comment = {comment_multi}|{comment_line}
comment_multi = [/][*][^*]*[*]+([^*/][^*]*[*]+)*[/]
comment_line = "//".*  
// comment_body = ( [ˆ*] | \*+ [ˆ/*] )*
ws = [ \t\r\f]
newline = [\n]

%%
// Lexical Rules
{comment}		{}
{ws}			{}
{newline}		{System.out.print("\n");}
true			{t_flag = BOOLEANCONSTANT; System.out.print(yytext() + " "); return (TokenDefinitions.BOOLEANCONSTANT);}
false			{t_flag = BOOLEANCONSTANT; System.out.print(yytext() + " "); return (TokenDefinitions.BOOLEANCONSTANT);}
boolean	        {t_flag = BOOLEAN; System.out.print(yytext() + " "); return (TokenDefinitions.BOOLEAN);}
class	        {t_flag = CLASS; System.out.print(yytext() + " "); return (TokenDefinitions.CLASS);}
double        	{t_flag = DOUBLE; System.out.print(yytext() + " "); return (TokenDefinitions.DOUBLE);}
else	        {t_flag = ELSE; System.out.print(yytext() + " "); return (TokenDefinitions.ELSE);}
extends        	{t_flag = EXTENDS; System.out.print(yytext() + " "); return (TokenDefinitions.EXTENDS);}
for        		{t_flag = FOR; System.out.print(yytext() + " "); return (TokenDefinitions.FOR);}
if        		{t_flag = IF; System.out.print(yytext() + " "); return (TokenDefinitions.IF);}
implements	    {t_flag = IMPLEMENTS; System.out.print(yytext() + " "); return (TokenDefinitions.IMPLEMENTS);}
interface	    {t_flag = INTERFACE; System.out.print(yytext() + " "); return (TokenDefinitions.INTERFACE);}
new	        	{t_flag = NEW; System.out.print(yytext() + " "); return (TokenDefinitions.NEW);}
newarray	    {t_flag = NEWARRAY; System.out.print(yytext() + " "); return (TokenDefinitions.NEWARRAY);}
println	        {t_flag = PRINTLN; System.out.print(yytext() + " "); return (TokenDefinitions.PRINTLN);}
readln	        {t_flag = READLN; System.out.print(yytext() + " "); return (TokenDefinitions.READLN);}
return	        {t_flag = RETURN; System.out.print(yytext() + " "); return (TokenDefinitions.RETURN);}
String	        {t_flag = STRING; System.out.print(yytext() + " "); return (TokenDefinitions.STRING);}
this	        {t_flag = THIS; System.out.print(yytext() + " "); return (TokenDefinitions.THIS);}
void	        {t_flag = VOID; System.out.print(yytext() + " "); return (TokenDefinitions.VOID);}
while	        {t_flag = WHILE; System.out.print(yytext() + " "); return (TokenDefinitions.WHILE);}
break			{t_flag = BREAK; System.out.print(yytext() + " "); return (TokenDefinitions.BREAK);}
null	        {t_flag = NULL; System.out.print(yytext() + " "); return (TokenDefinitions.NULL);}
int 			{t_flag = INT; System.out.print(yytext() + " "); return (TokenDefinitions.INT);}
"+"				{System.out.print("plus" + " "); return (TokenDefinitions.PLUS);}
"-"				{System.out.print("minus" + " "); return (TokenDefinitions.MINUS);}
"*"				{System.out.print("multipication" + " "); return (TokenDefinitions.MULTIPLICATION);}
"/"				{System.out.print("division" + " "); return (TokenDefinitions.DIVISION);}
"%"				{System.out.print("mod" + " "); return (TokenDefinitions.MOD);}
"<"				{System.out.print("less" + " "); return (TokenDefinitions.LESS);}
">"				{System.out.print("greater" + " "); return (TokenDefinitions.GREATER);}
"<="			{System.out.print("lessequal" + " "); return (TokenDefinitions.LESSEQUAL);}
">="			{System.out.print("greaterequal" + " "); return (TokenDefinitions.GREATEREQUAL);}
"=="			{System.out.print("equal" + " "); return (TokenDefinitions.EQUAL);}
"!="			{System.out.print("notequal" + " "); return (TokenDefinitions.NOTEQUAL);}
"&&"			{System.out.print("and" + " "); return (TokenDefinitions.AND);}
"||"			{System.out.print("or" + " "); return (TokenDefinitions.OR);}
"!"				{System.out.print("not" + " "); return (TokenDefinitions.NOT);}
"="				{System.out.print("assignop" + " "); return (TokenDefinitions.ASSIGNOP);}
","				{System.out.print("comma" + " "); return (TokenDefinitions.COMMA);}
";"				{System.out.print("semicolon" + " "); return (TokenDefinitions.SEMICOLON);}
"."				{System.out.print("period" + " "); return (TokenDefinitions.PERIOD);}
"("				{System.out.print("leftparen" + " "); return (TokenDefinitions.LEFTPAREN);}
")"				{System.out.print("rightparen" + " "); return (TokenDefinitions.RIGHTPAREN);}
"["				{System.out.print("leftbracket" + " "); return (TokenDefinitions.LEFTBRACKET);}
"]"				{System.out.print("rightbracket" + " "); return (TokenDefinitions.RIGHTBRACKET);}
"{"				{System.out.print("leftbrace" + " "); return (TokenDefinitions.LEFTBRACE);}
"}"				{System.out.print("rightbrace" + " "); return (TokenDefinitions.RIGHTBRACE);}
{int}			{System.out.print("intconstant" + " "); return (TokenDefinitions.INTCONSTANT);}
{id}			{System.out.print("id" + " "); trie.insert(yytext()); return(TokenDefinitions.ID);}
{str}			{System.out.print("stringconstant" + " "); return (TokenDefinitions.STRINGCONSTANT);}
{double}		{System.out.print("doubleconstant" + " "); return (TokenDefinitions.DOUBLECONSTANT);}
