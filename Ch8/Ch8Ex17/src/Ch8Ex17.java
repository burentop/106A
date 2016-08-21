/**
 * File: Ch8Ex17.java
 * ------------------
 * This program translates phrases to Pig Latin.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex17 extends ConsoleProgram {
	public void run() {
		while(true) {
			String line = readLine("Enter a line: ");
			if (line.length() == 0) break;
			println(translateLine(line));
		}
	}
	
	
	private String translateLine(String line) {
		String result = "";
		int start = 0;
		for (int i = 0; i < line.length(); i++) {
			String letter = "" + line.charAt(i);
			if (DELIMITERS.contains(letter)) {
				result += letter;
				start++;
			} else if (!Character.isAlphabetic(line.charAt(i + 1))) {
				String word = line.substring(start, i + 1);
				start = i + 1;
				result += translateWord(word);
			}
		}
		return result;
	}
	
	private String translateWord(String word) {
		int vp = findFirstVowel(word);
		if(vp == -1) {
			return word;
		} else if (vp == 0) {
			return word + "way";
		} else {
			String head = word.substring(0, vp);
			String tail = word.substring(vp);
			return tail + head + "ay";
		}
	}
	
	private int findFirstVowel(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (isEnglishVowel(word.charAt(i))) return i;
		}
		return -1;
	}
	
	private boolean isEnglishVowel(char ch) {
		switch(Character.toLowerCase(ch)) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
		default:
			return false;
		}
	}
	
	private static final String DELIMITERS = " ,.;:!-";
}
