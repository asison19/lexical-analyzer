/*
 * Created by: Andrew Sison, and Zach Martin
 * This code is the driver class for the 
 * lexical analysis of the Toy programming language.
 */

package main;
import lexicalAnalyzer.*;
import syntaxAnalyzer.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
	public static void main(String[] args) throws IOException, URISyntaxException {
		// get the file for the lexer, if no inputed file, use the default one.
		File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
		File infile = new File(root ,"../inputs/test18.txt");
		FileReader reader;
		try {
			infile = new File(args[0]);
			System.out.println("Using file: " + infile + "\n");
			reader = new FileReader(infile);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("No inputed file detected, using default file:\n" + infile + "\n");
			reader = new FileReader(infile);
		}
		
		ToyLexer lexer = new ToyLexer(reader);
		ToyParser parser = new ToyParser(lexer);
		System.out.println("********** Start of Syntax Analysis **********");
		try {
			parser.parse();
			System.out.println("[accept]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[reject]"); 
		}
		
		System.out.println("\n********** End of syntax analysis **********");
	}
}
