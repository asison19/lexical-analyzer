package lexicalAnalyzer;

import java.util.Arrays;

public class TrieTable {
	// length of the swtch int array, includes letters, [A-Za-z]
	private static final int ALPHABET_LENGTH = 52;
	private static final int MAX_TRANSITION = 5000;
	
	// index 0 is A, 1 is B etc.
	private int[] swtch = new int[ALPHABET_LENGTH];
	private char[] symbol = new char[MAX_TRANSITION];
	private int[] next = new int[MAX_TRANSITION];
	
	// last available index in char array, symbol.
	private int last = 0;
	
	public TrieTable() {
		Arrays.fill(swtch, -1);
	}
	
	public void insert(String str) {
		// check swtch if it contains a spot
		// check is first character of the string is uppercase
		if(Character.isUpperCase(str.charAt(0))) {
			// if the swtch does not contain an index for the symbol array, add it in
			if(swtch[((int)str.charAt(0)) - 65] < 0) {
				swtch[((int)str.charAt(0)) - 65] = last;
				
			} else {
				
			}
			
		} else {
			
		}
		
		// add to the symbol array the rest of the characters
		add(str.substring(1));
	}
	
	private void add(String str) {
		
		
		// last = ;
	}
	
	// TODO 
	public String retrieve() {
		return "";
	}
	
}
