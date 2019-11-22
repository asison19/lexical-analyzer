/*
 * Created by: Andrew Sison, and Zach Martin
 * This code is the driver class for the 
 * lexical analysis of the Toy programming language.
 */

package main;
import lexicalAnalyzer.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
	public static void main(String[] args) throws IOException, URISyntaxException {
		// get the file for the lexer, if no inputed file, use the default one.
		File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
		File infile = new File(root ,"../inputs/test.txt");
		FileReader reader;
		try {
			infile = new File(args[0]);
			System.out.println("Using file: " + infile);
			reader = new FileReader(infile);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("No inputed file detected, using default file:\n" + infile);
			reader = new FileReader(infile);
		}
		
		// Actual lexical analysis
		ToyLexer lexer = new ToyLexer(reader);
		int count = 0;
		System.out.println("\n********** Start of lexical analysis **********");
		do {
			count++;
		} while (lexer.next_token().sym != 0); // 0 being EOF symbol
		
		System.out.println("\n********** End of lexical analysis **********");
		System.out.println("There were " + count +" tokens in the file:\n" + infile);
		lexer.outputTrie();
	}
}
