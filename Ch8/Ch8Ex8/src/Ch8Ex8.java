/**
 * File: Ch8Ex8.java
 * -----------------
 * This program returns the plural form of words.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex8 extends ConsoleProgram {
	public void run() {
		println("The plural of 'class' is: " + createRegularPlural("class"));
		println("The plural of 'beach' is: " + createRegularPlural("beach"));
		println("The plural of 'cherry' is: " + createRegularPlural("cherry"));
		println("The plural of 'noun' is: " + createRegularPlural("noun"));
		println();
		println("The present participle of 'think' is: " + createPresentParticiple("think"));
		println("The present participle of 'cogitate' is: " + createPresentParticiple("cogitate"));
		println("The present participle of 'program' is: " + createPresentParticiple("program"));
		println("The present participle of 'move' is: " + createPresentParticiple("move"));
		println("The present participle of 'see' is: " + createPresentParticiple("see"));
	}
	
	private String createRegularPlural(String word) {
		switch(word.charAt(word.length() - 1)) {
		case 's': case 'x': case 'z':
			return word + "es";
		case 'h':
			if ((word.charAt(word.length() - 2) == 'c') || (word.charAt(word.length() - 2) == 's')) {
				return word + "es";
			} else {
				return word + "s";
			}
		case 'y':
			if (!isVowel(word.charAt(word.length() - 2))) {
				return word.substring(0, word.length() - 1) + "ies";
			} else {
				return word + "s";
			}
		default:
			return word + "s";
		}
	}
	
	private String createPresentParticiple(String word) {
		switch(word.charAt(word.length() - 1)) {
		case 'e':
			if (!isVowel(word.charAt(word.length() - 2))) {
				return word.substring(0, word.length() - 1) + "ing";
			} else {
				return word + "ing";
			}
		default:
			if (!isVowel(word.charAt(word.length() - 1))) {
				if (isVowel(word.charAt(word.length() - 2))) {
					return word + word.charAt(word.length() - 1) + "ing";
				} else {
					return word + "ing";
				}
			} else {
				return word + "ing";
			}
		}
	}
	
	private boolean isVowel(char ch) {
		switch(ch) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
		default:
			return false;
		}
	}
}
