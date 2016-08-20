/**
 * File: Ch8Ex5.java
 * -----------------
 * This program reads a word, and prints out its Scrabble score.
 * 
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex5 extends ConsoleProgram {
	public void run() {
		println("The Scrabble score for 'FARM' is: " + computeScore("FARM"));
		println("The Scrabble score for 'FaRM' is: " + computeScore("FaRM"));
		println("The Scrabble score for 'ZEBRA' is: " + computeScore("ZEBRA"));
	}
	
	private int computeScore(String str) {
		int total = 0;
		for (int i = 0; i < str.length(); i++) {
			total += lookupLetter(str.charAt(i));
		}
		return total;
	}
	
	private int lookupLetter(char ch) {
		switch(ch) {
		case 'A': case 'E': case 'I': case 'L': case 'N': case 'O': case 'R': case 'S': case 'T': case 'U':
			return 1;
		case 'D': case 'G':
			return 2;
		case 'B': case 'C': case 'M': case 'P':
			return 3;
		case 'F': case 'H': case 'V': case 'W': case 'Y':
			return 4;
		case 'K':
			return 5;
		case 'J': case 'X':
			return 8;
		case 'Q': case 'Z':
			return 10;
		default:
			return 0;
		}
	}
}
