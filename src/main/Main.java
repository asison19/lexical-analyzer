package main;
import lexicalAnalyzer.*;
import token.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String inFile = "src/Sample.in";

		if (args.length > 1) {
			inFile = args[0];
		}

		LexicalAnalyzer lexer = new LexicalAnalyzer(inFile);

		Token t;
		System.out.println("Done tokenizing file: " + inFile + "\n");
		
		while ((t = lexer.nextToken()) != null) {
			System.out.println(t.toString());
		}
	}
}