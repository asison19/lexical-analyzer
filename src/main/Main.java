/*
 * Created by: Andrew Sison, and Zach Martin
 * This code does lexical analysis for the Toy programming language.
 */

package main;
import lexicalAnalyzer.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
	public static void main(String[] args) throws IOException, URISyntaxException {
		File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
		File infile = new File(root ,"../inputs/SampleOriginalUTF8.in");
		FileReader reader;
		try {
			infile = new File(args[0]);
			System.out.println("Using file: " + infile);
			reader = new FileReader(infile);
		} catch(IndexOutOfBoundsException e) {
			// infile = new File("inputs/SampleOriginalUTF8.in");
			System.out.println("No inputted file detected, using default file: " + infile);
			reader = new FileReader(infile);
		}
		
		ToyLexer lexer = new ToyLexer(reader);
		int count = 0;
		System.out.println("********** Start of lexical analysis **********");
		do {
			count++;
		} while (lexer.yylex() != null);
		
		System.out.println("\n********** End of lexical analysis **********");
		System.out.println("There were " + count +" tokens in the file: " + infile);
	}
}
