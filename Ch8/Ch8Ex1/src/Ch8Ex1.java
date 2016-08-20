/**
 * File: Ch8Ex1.java
 * -----------------
 * This program finds, and lists, all the consonants in the alphabet.
 * @author perramount
 *
 */

import acm.program.*;

public class Ch8Ex1 extends ConsoleProgram {
	public void run() {
		
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			if (isEnglishConsonant(letter)) {
				println(letter);
			}
		}
		
		
		
	}
	
	private boolean isEnglishConsonant(char ch) {
		return !isEnglishVowel(ch);
	}
	
	private boolean isEnglishVowel(char ch) {
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return true;
			default:
				return false;
		}
	}
}
