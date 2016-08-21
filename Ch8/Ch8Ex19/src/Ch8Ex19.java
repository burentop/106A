/**
 * File: Ch8Ex19.java
 * ------------------
 * This program translates words to Obenglobish.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex19 extends ConsoleProgram {
	public void run() {
		while (true) {
			String word = readLine("Enter a word: ");
			if (word.equals("")) break;
			println(word + " -> " + obenglobish(word));
		}
	}
	
	private String obenglobish(String word) {
		String result = "";
		for (int i = 0; i < word.length(); i++) {
			if (isVowel(word.charAt(i))) {
				if (i > 0 && isVowel(word.charAt(i - 1))) {
					result += word.charAt(i);
				} else if (i == word.length() - 1 && word.charAt(i) == 'e') {
					result += word.charAt(i);
				} else {
					result += "ob" + word.charAt(i);
				}
			} else {
				result += word.charAt(i);
			}
		}
		return result;
	}
	
	private boolean isVowel(char ch) {
		switch(ch) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		default:
			return false;
		}
	}
}
