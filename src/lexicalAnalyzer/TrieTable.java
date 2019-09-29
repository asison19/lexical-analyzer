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
		Arrays.fill(next, -1);
	}
	
	public void insert(String str) {
		
		// number we need to delete from character ASCII value
		// to get the corresponding swtch array location
		int n; 
		
		// check swtch if it contains a spot
		// check if first character of the string is uppercase
		if(Character.isUpperCase(str.charAt(0)))
			n = 65;
		else
			n = 71;

		// if the swtch does not contain an index for the symbol array, add it in
		// else go to that index
		if(swtch[((int)str.charAt(0)) - n] < 0) {
			swtch[((int)str.charAt(0)) - n] = last;
			create(str.substring(1), last);
		} else {
			add(str.substring(1), swtch[((int)str.charAt(0)) - n]);
		}
	}
	
	// check and add the remaining characters of the inputed string
	// if they're the same, continue checking, if not go to the next free spots
	private void add(String str, int index) {
		int i = 0;
		
		boolean exit = false;
		while(!exit) {
			// if the current character of the string is the same as the one in the symbol array
			if(i < str.length() && symbol[index] == str.charAt(i)) { 
				if(i < str.length()) {
					index++;
					i++;
				} else 
					exit = true;
				
			// if we're at the end of the identifier, check if it already exists
			} else if(i == str.length() && symbol[index] == '@') { 
				exit = true;
				
			// if there is another location from next that we can go to
			} else if (next[index] > 0) {
				index = next[index];
			
			} else { // else create new identifier
				next[index] = last;
				create(str.substring(i), last);
				exit = true;
			}
		}
	}
	
	// create new identifier at the index
	private void create(String str, int index) {
		for(int i =0; i < str.length(); i++) {
			symbol[index] = str.charAt(i);
			index++;
		}
		symbol[index] = '@';
		last = index + 1;
	}
	
	// TODO 
	public String retrieve() {
		return "";
	}
	
	// Outputs the arrays of the Trie Table
	// Last edited by: Andrew Sison 9/28 ~7pm
	public void output() {
		System.out.println("\n\nOutputing the Trie Table: ");
		// output the swtch array
		int perLineSwtch = 15; // how many elements of the array to output per line
		int a = 0, b = 0, n = 0;
		while(a < ALPHABET_LENGTH) {
			n = 0;
			System.out.format("%8s","");
			// output the letters
			while(a < ALPHABET_LENGTH && n < perLineSwtch) {
				if(a < 26)
					System.out.format("%5s", (char) (a + 65));
				else
					System.out.format("%5s", (char) (a + 71));
				
				a++;
				n++;
			}
			
			// output the swtch array
			System.out.print("\nswitch: ");
			n = 0;
			while(b < ALPHABET_LENGTH && n < perLineSwtch) {
				System.out.format("%5d", swtch[b]);
				b++;
				n++;
			}
			System.out.println("\n");
			
		}
		
		// output the symbol and next array
		int perLine = 18; // how many elements of the arrays to output per line
		int j = 0, k = 0, l = 0, m = 0;
		System.out.println("\nSymbol and Next Arrays: ");
		while( l < last) {
			
			// output the index numbers
			System.out.format("%8s", "");
			for(m = 0; m < perLine; m++) {
				System.out.format("%4d", j);		
				j++;
			}
			
			// output the symbol
			System.out.print("\nsymbol: ");
			for(m = 0; m < perLine; m++) {
				System.out.format("%4s", symbol[k]);
				k++;
			}
			
			// output the next index
			System.out.print("\nnext:   ");
			for(m = 0; m < perLine; m++) {
				if(next[l]!= -1)
					System.out.format("%4d", next[l]);
				else
					System.out.format("%4s", "");
				l++;
			}
			System.out.println("\n");
		}
	}
}
