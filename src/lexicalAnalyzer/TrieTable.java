package lexicalAnalyzer;

import java.util.Arrays;

/* TODO
 * subsequent strings get written over
 */

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
		
		int n;
		// check swtch if it contains a spot
		// check if first character of the string is uppercase
		if(Character.isUpperCase(str.charAt(0)))
			n = 65;
		else
			n = 90;

		// if the swtch does not contain an index for the symbol array, add it in
		// else go to that index
		if(swtch[((int)str.charAt(0)) - n] < 0) {
			swtch[((int)str.charAt(0)) - n] = last;
			
			// add to the symbol array the rest of the characters should they exist
			if(!str.substring(1).equals(""))
				add(str.substring(1), last);
		} else {
			if(!str.substring(1).equals(""))
				add(str.substring(1), swtch[((int)str.charAt(0)) - n]);
		}
		
	}
	
	// check and add the remaining characters of the inputed string
	// if they're the same, continue checking, if not go to the next free spots
	private void add(String str, int index) {
		int i = 0; // index of the string, str, characters
		// check the prefix first
		while(symbol[index] == str.charAt(i) && i < str.length()) {
			index++;
			i++;
		}
		
		// if () TODO check if
		// once we've past what's the same go to the next available spot
		// and put the rest of the string's characters in.
		index = last; // ?
		next[index] = last;
		while(i < str.length()) {
			symbol[index] = str.charAt(i);
			index++;
			i++;
		}
		
		// add end of string sign, @
		symbol[index] = '@'; // TODO does not add on all strings, or gets overwritten
		last = index;
	}
	
	// TODO 
	public String retrieve() {
		return "";
	}
	
	public void output() {
		
	}
	
}
