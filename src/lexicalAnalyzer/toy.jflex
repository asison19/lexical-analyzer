/* 
Jflex specification file used to create the .java file was created by:
Andrew Sison, and Zach Martin.
*/
// User Code
package lexicalAnalyzer;
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
true			{t_flag = ToyParserSym.BOOLEANCONSTANT;return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.ID);}
false			{t_flag = ToyParserSym.BOOLEANCONSTANT; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.BOOLEANCONSTANT);}
boolean	        {t_flag = ToyParserSym.BOOLEAN;  return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.BOOLEAN);}
class	        {t_flag = ToyParserSym.CLASS; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.CLASS);}
double        	{t_flag = ToyParserSym.DOUBLE; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.DOUBLE);}
else	        {t_flag = ToyParserSym.ELSE; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.ELSE);}
extends        	{t_flag = ToyParserSym.EXTENDS; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.EXTENDS);}
for        		{t_flag = ToyParserSym.FOR; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.FOR);}
if        		{t_flag = ToyParserSym.IF; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.IF);}
implements	    {t_flag = ToyParserSym.IMPLEMENTS; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.IMPLEMENTS);}
interface	    {t_flag = ToyParserSym.INTERFACE; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.INTERFACE);}
new	        	{t_flag = ToyParserSym.NEW; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NEW);}
newarray	    {t_flag = ToyParserSym.NEWARRAY; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NEWARRAY);}
println	        {t_flag = ToyParserSym.PRINTLN; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.PRINTLN);}
readln	        {t_flag = ToyParserSym.READLN; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.READLN);}
return	        {t_flag = ToyParserSym.RETURN; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.RETURN);}
String	        {t_flag = ToyParserSym.STRING; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.STRING);}
this	        {t_flag = ToyParserSym.THIS; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.THIS);}
void	        {t_flag = ToyParserSym.VOID; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.VOID);}
while	        {t_flag = ToyParserSym.WHILE; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.WHILE);}
break			{t_flag = ToyParserSym.BREAK; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.BREAK);}
null	        {t_flag = ToyParserSym.NULL; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NULL);}
int 			{t_flag = ToyParserSym.INT; return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.INT);}
"+"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.PLUS);}
"-"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.MINUS);}
"*"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.MULTIPLICATION);}
"/"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.DIVISION);}
"%"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.MOD);}
"<"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LESS);}
">"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.GREATER);}
"<="			{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LESSEQUAL);}
">="			{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.GREATEREQUAL);}
"=="			{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.EQUAL);}
"!="			{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NOTEQUAL);}
"&&"			{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.AND);}
"||"			{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.OR);}
"!"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.NOT);}
"="				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.ASSIGNOP);}
","				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.COMMA);}
";"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.SEMICOLON);}
"."				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.PERIOD);}
"("				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LEFTPAREN);}
")"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.RIGHTPAREN);}
"["				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LEFTBRACKET);}
"]"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.RIGHTBRACKET);}
"{"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.LEFTBRACE);}
"}"				{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.RIGHTBRACE);}
{int}			{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.INTCONSTANT);}
{id}			{trie.insert(yytext()); return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.ID);}
{str}			{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.STRINGCONSTANT);}
{double}		{return new java_cup.runtime.Symbol(syntaxAnalyzer.ToyParserSym.DOUBLECONSTANT);}
