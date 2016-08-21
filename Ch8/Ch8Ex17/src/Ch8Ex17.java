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
		String result = "";
		boolean isCapital = Character.isUpperCase(word.charAt(0));
		int vp = findFirstVowel(word);
		if(vp == -1) {
			result = word;
		} else if (vp == 0) {
			result = word + "way";
		} else {
			String head = word.substring(0, vp);
			String tail = word.substring(vp);
			result = tail + head + "ay";
		}
		if (isCapital) return result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase();
		else return result.toLowerCase();
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
