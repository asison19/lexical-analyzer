package lexicalAnalyzer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import token.Token;

public class LexicalAnalyzer {

	private BufferedReader reader; // Reader
	private char curr; // The current character being scanned

	private static final char EOF = (char) (-1);

	// End of file character

	public LexicalAnalyzer(String file) {
		try {
             	reader = new BufferedReader(new FileReader(file));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Read the first character
		curr = read();
	}

	private char read() {
		try {
			return (char) (reader.read());
		} catch (IOException e) {
			e.printStackTrace();
			return EOF;
		}
	}

	// Checks if a character is a digit
	private boolean isNumeric(char c) {
		if (c >= '0' && c <= '9')
			return true;

		return false;
	}

	public boolean isAlpha(char c){
		if(c>='a' && c<='z' )
		return true;
		if(c>='A' && c<='Z' )
		return true;	
		
		return false;

	}

	public Token nextToken() {

		int state = 1; // Initial state
		int numBuffer = 0; // A buffer for number literals
		String alphaBuffer = "";
		int decBuffer=0;
                boolean skipped = false;
		while (true) {
		if (curr == EOF && !skipped) {
                        skipped = true;
                      
                }else if (skipped) {
                            
                            try {
                            
                                    reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
                                
				return null;
			}
				
			switch (state) {
			// Controller
			case 1:
				switch (curr) {
				case ' ': // Whitespaces
				case '\n':
				case '\b':
				case '\f':
				case '\r':
				case '\t':	
					curr = read();
					continue;

				case ';':
					curr = read();
					return new Token("semicolon", ";");

				case '+':
					curr = read();
					return new Token("plus", "+");

				case '-':
					curr = read();
					return new Token("minus", "-");

				case '*':
					curr = read();
					return new Token("multiplication", "*");

				case '/':
					curr = read();
                                        state = 14;
                                        continue;
				case',':
					curr=read();	
					return new Token("comma",",");
				case'(':
					curr=read();	
					return new Token("leftparen","(");
				case')':
					curr=read();	
					return new Token("rightparen",")");
				case'{':
					curr=read();	
					return new Token("leftbrace","{");
				case'}':
					curr=read();	
					return new Token("rightbrace","}");
				case '[':
					curr=read();
					return new Token("leftbracket", "[");
				case ']':
					curr=read();
					return new Token("rightbracket", "]");
				case '.':
					curr=read();
					return new Token("period", ".");
				case'%':
					curr=read();	
					return new Token("mod","%");
				case '>':
					curr=read();
					state=18;
					continue;
				case '<':
					curr=read();
					state=19;
					continue;
				case'=':
					curr=read();	
					state=8;
					continue;
					
				case'!':
					curr=read();
					state=9;
					continue;
				case'&':
					curr=read();
					state=10;
					continue;
				case'|':
					curr=read();
					state=11;
					continue;	 
                case '"':
                    curr=read();
                    state=13;
                    alphaBuffer="";
                    continue;
                             
				default:
					state = 2; // Check the next possibility
					continue;
				}

				// Integer - Start
			case 2:
				if (isNumeric(curr)) {
					numBuffer = 0; // Reset the buffer.
					numBuffer += (curr - '0');

					state = 3;
                                     
					curr = read();
                                       
				} else {
					state=5; //doesnot start with number or symbol go to case 5
				}
				continue;

				// Integer - Body
			case 3:
				if (isNumeric(curr)) {
					numBuffer *= 10;
					numBuffer += (curr - '0');

					curr = read();
                                        
				}else if(curr=='.'){
					
					curr = read();	
                                       
					state=4; //has decimal point go to case 4
                                        
                                        } else {
					return new Token("intconstant", "" + numBuffer);
				}
                                
				continue;
				
				//decimal-start	
			case 4:
				if (isNumeric(curr)) {
					decBuffer = 0;
					decBuffer += (curr - '0');
					state=7;					
					curr = read();	
                                        
				}else  {
					return new Token("ERROR", "Invalid input: "+numBuffer+"." );
				}
				continue;
				//decimal body
			case 7:
				if (isNumeric(curr)) {
					decBuffer *= 10;
					decBuffer += (curr - '0');

					curr = read();
				} else {
					return new Token("doubleconstant", "" + numBuffer+"."+decBuffer);
				}
				continue;	

				//identifier -start
			case 5:
				if(isAlpha(curr)|| curr=='_'){
				alphaBuffer = "";					
				alphaBuffer+=curr;
				state=6;
				curr = read();
				}else {
                                    alphaBuffer = "";					
				    alphaBuffer+=curr;
                                        curr=read();
					return new Token("ERROR", "Invalid input:"+alphaBuffer); // reading string error ends up here
				}
				continue;	
			
				//identifier - Body
			case 6:	
				if ((isAlpha(curr) || isNumeric(curr) || curr=='_')) {
					
					alphaBuffer += curr;
					curr = read();
                                       
                                        
				} else {
                                    
                    if( alphaBuffer.equals("class")){
                        return new Token("class", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("boolean")){
                        return new Token("boolean", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("break")){
                        return new Token("break", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("double")){
                        return new Token("double", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("else")){
                        return new Token("else", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("extends")){
                        return new Token("extends", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("for")){
                        return new Token("for", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("if")){
                        return new Token("if", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("implements")){
                        return new Token("implements", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("int")){
                        return new Token("int", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("interface")){
                        return new Token("interface", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("new")){
                        return new Token("new", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("newarray")){
                        return new Token("newarray", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("null")){
                        return new Token("null", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("println")){
                        return new Token("println", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("readln")){
                        return new Token("readln", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("return")){
                        return new Token("return", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("string")){
                        return new Token("string", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("this")){
                        return new Token("this", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("void")){
                        return new Token("void", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("while")){
                        return new Token("while", "" + alphaBuffer);
                    }
                    else if(alphaBuffer.equals("true")||alphaBuffer.equals("false"))
                    {
                        return new Token("booleanconstant", "" + alphaBuffer);
                    }
                                    
                                    
					return new Token("id", "" + alphaBuffer);
				}
				continue;
				
				// if ==
			case 8: 
				if(curr=='=')	{
					curr=read();
					return new Token("equal","==");
				}
				else {
					
					return new Token("assignop","=");		
				}
				//if !=
			case 9: 
				if(curr=='=')	{
					curr=read();
					return new Token("notequal","!=");
				}
				else {
					return new Token("not", "!");
				}

			// if &&
			case 10: 
				if(curr=='&')	{
					curr=read();
					return new Token("and","&&");
				}
				else {
					return new Token("ERROR", "Invalid input: &");
				}
			// if || 
			case 11: 
				if(curr=='|')	{
					curr=read();
					return new Token("or","||");
				}
				else {
					return new Token("ERROR", "Invalid input: |");
				}
			case 18:
            	if(curr=='=')	{
					curr=read();
					return new Token("greaterequal",">=");
				}
				else {
					return new Token("greater", ">");
				} 
			case 19:
            	if(curr=='=')	{
					curr=read();
					return new Token("lessequal","<=");
				}
				else {
					return new Token("less", "<");
				}
            case 13:
                if(curr=='"'){
                    curr=read();
                    return new Token("stringconstant","\""+alphaBuffer+"\"");
                }
                else if(curr=='\n' || curr==EOF){
                    curr=read();
                    return new Token("ERROR","Invalid string literal"); 
                }
                else{
                	//curr = read();
                	//while(curr != '"') {
	                    alphaBuffer += curr;
	                    curr = read();
                	//}
                }
                //continue;
                //alphaBuffer += curr;
                //curr = read();
             
            case 14:
                if(curr=='/'){
                     state = 15;
                     curr=read();
                }else if(curr=='*')
                {
                    state = 16;
                    curr=read();
                }
                else{
                    return new Token("division", "/");
                }
                continue;
            case 15:
                 if(curr=='\n'){
                     
                      state = 1;
                 }
                curr=read();
                continue;
            case 16:
                if(curr=='*')
                {
                    state = 17;
                   
                }
                 curr=read();
                continue;
            case 17:
                if(curr=='/'){
                    curr=read();
                    state = 1;
                }
                else{
                    curr=read();
                    state=16;
                }
                continue;
                       
			}
		}
	}
}
