/* 
Jflex specification file used to create the .java file was created by:
Andrew Sison, and Zach Martin.
*/
// User Code
package lexicalAnalyzer;
import token.*;
import syntaxAnalyzer.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.io.File;
import java.util.Scanner;

%%
// Options and Declarations
%public
%class ToyLexer
//%type Integer
//%type java_cup.runtime.Symbol
%cup
%eofval{
return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.EOF);
%eofval}

// this gets added to the constructor of the created lexer class
%init{
// User added code.
// Add keyword identifiers to the trie table.
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
/* From Prompt:
A double constant is a sequence of at least one digit, a period, followed by any sequence of
digits, may be none. Thus, .12 is not a valid double but both 0.12 and 12. are valid 
*/
double = {double_regular} | {exponential}
double_regular = [-+]?{digit}+\.{digit}*
exponential = [-+]?{digit}+\.{digit}*([eE][-+]?{digit}+)
// exponential = [-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+) // old exponential for 123456E+7
// includes regular and both slanted quotation marks, char 84, 8220 and 8221
// does NOT match a mixture of both
str = \"([^\"\\\\]|\\\\.)*\" | \“([^\”\\\\]|\\\\.)*\”
// id = ("_"|{letter})("_"|{letter}|{digit})* // id can't start with '_' as per the prompt's switch array?
id = {letter}("_"|{letter}|{digit})*
int = [-+]?{digit}+|[-+]?{hex}
comment = {comment_multi}|{comment_line}
comment_multi = [/][*][^*]*[*]+([^*/][^*]*[*]+)*[/]
comment_line = "//".*  
// comment_body = ( [ˆ*] | \*+ [ˆ/*] )*
ws = [ \t\r\f]
newline = [\n]
hex = 0[xX][0-9a-fA-F]+

%%
// Lexical Rules // TODO do we need the t_flag?
{comment}		{}
{ws}			{}
{newline}		{
					System.out.print("\n");
				}
true			{t_flag = TokenDefinitions.BOOLEANCONSTANT; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.ID);}
false			{t_flag = TokenDefinitions.BOOLEANCONSTANT; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.BOOLEANCONSTANT);}
boolean	        {t_flag = TokenDefinitions.BOOLEAN; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.BOOLEAN);}
class	        {t_flag = TokenDefinitions.CLASS; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.CLASS);}
double        	{t_flag = TokenDefinitions.DOUBLE; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.DOUBLE);}
else	        {t_flag = TokenDefinitions.ELSE; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.ELSE);}
extends        	{t_flag = TokenDefinitions.EXTENDS; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.EXTENDS);}
for        		{t_flag = TokenDefinitions.FOR; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.FOR);}
if        		{t_flag = TokenDefinitions.IF; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.IF);}
implements	    {t_flag = TokenDefinitions.IMPLEMENTS; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.IMPLEMENTS);}
interface	    {t_flag = TokenDefinitions.INTERFACE; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.INTERFACE);}
new	        	{t_flag = TokenDefinitions.NEW; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NEW);}
newarray	    {t_flag = TokenDefinitions.NEWARRAY; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NEWARRAY);}
println	        {t_flag = TokenDefinitions.PRINTLN; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.PRINTLN);}
readln	        {t_flag = TokenDefinitions.READLN; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.READLN);}
return	        {t_flag = TokenDefinitions.RETURN; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.RETURN);}
String	        {t_flag = TokenDefinitions.STRING; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.STRING);}
this	        {t_flag = TokenDefinitions.THIS; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.THIS);}
void	        {t_flag = TokenDefinitions.VOID; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.VOID);}
while	        {t_flag = TokenDefinitions.WHILE; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.WHILE);}
break			{t_flag = TokenDefinitions.BREAK; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.BREAK);}
null	        {t_flag = TokenDefinitions.NULL; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NULL);}
int 			{t_flag = TokenDefinitions.INT; System.out.print(yytext() + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.INT);}
"+"				{System.out.print("plus" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.PLUS);}
"-"				{System.out.print("minus" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.MINUS);}
"*"				{System.out.print("multipication" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.MULTIPLICATION);}
"/"				{System.out.print("division" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.DIVISION);}
"%"				{System.out.print("mod" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.MOD);}
"<"				{System.out.print("less" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LESS);}
">"				{System.out.print("greater" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.GREATER);}
"<="			{System.out.print("lessequal" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LESSEQUAL);}
">="			{System.out.print("greaterequal" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.GREATEREQUAL);}
"=="			{System.out.print("equal" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.EQUAL);}
"!="			{System.out.print("notequal" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NOTEQUAL);}
"&&"			{System.out.print("and" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.AND);}
"||"			{System.out.print("or" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.OR);}
"!"				{System.out.print("not" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NOT);}
"="				{System.out.print("assignop" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.ASSIGNOP);}
","				{System.out.print("comma" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.COMMA);}
";"				{System.out.print("semicolon" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.SEMICOLON);}
"."				{System.out.print("period" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.PERIOD);}
"("				{System.out.print("leftparen" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LEFTPAREN);}
")"				{System.out.print("rightparen" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.RIGHTPAREN);}
"["				{System.out.print("leftbracket" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LEFTBRACKET);}
"]"				{System.out.print("rightbracket" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.RIGHTBRACKET);}
"{"				{System.out.print("leftbrace" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LEFTBRACE);}
"}"				{System.out.print("rightbrace" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.RIGHTBRACE);}
{int}			{System.out.print("intconstant" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.INTCONSTANT);}
{id}			{System.out.print("id" + " "); trie.insert(yytext()); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.ID);}
{str}			{System.out.print("stringconstant" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.STRINGCONSTANT);}
{double}		{System.out.print("doubleconstant" + " "); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.DOUBLECONSTANT);}
