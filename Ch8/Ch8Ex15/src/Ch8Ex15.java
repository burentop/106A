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
			println("The longest word is " + longestWord(input));
		}
	}
	
	private String longestWord(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, " .,!;:");
		String longest = "";
		while (tokenizer.hasMoreTokens()) {
			String current = tokenizer.nextToken();
			if (current.length() > longest.length()) {
				longest = current;
			}
		}
		return longest;
	}
}
