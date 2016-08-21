/**
 * File: Ch8Ex15.java
 * ------------------
 * This program selects the longest word in a sentence.
 * @author Brent Perry
 *
 */

import acm.program.*;
import java.util.*;

public class Ch8Ex15 extends ConsoleProgram {
	public void run() {
		while (true) {
			String input = readLine("Enter a line: ");
			if (input.length() == 0) break;
			println("The acronym is " + acronym(input));
		}
	}
	
	private String longestWord(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS);
		String longest = "";
		while (tokenizer.hasMoreTokens()) {
			String current = tokenizer.nextToken();
			if (current.length() > longest.length()) {
				longest = current;
			}
		}
		return longest;
	}
	
	private String acronym(String str) {
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS);
		while (tokenizer.hasMoreTokens()) {
			result += Character.toUpperCase(tokenizer.nextToken().charAt(0));
		}
		return result;
	}
	
	private static final String DELIMITERS = " ,.-;:!";
}
