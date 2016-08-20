/**
 * File: Ch8Ex6.java
 * -----------------
 * This program checks for palindromes.
 * @author Brent Perry
 *
 */

import acm.program.*;
import java.util.*;

public class Ch8Ex6 extends ConsoleProgram {
	public void run() {
		println("'noon' is a palindrome: " + isPalindrome("noon"));
		println("'breakfast' is a palindrome: " + isPalindrome("breakfast"));
		println("'racecar' is a palindrome: " + isPalindrome("racecar"));
		
		println("Now we will check for sentence palindromes.");
		println("Indicate the end of the input with a blank line.");
		
		while (true) {
			String input = readLine("Enter a sentence: ");
			if (input.equals("")) break;
			if (isSentencePalindrome(input)) {
				println("That sentence is a palindrome.");
			} else {
				println("That sentence is not a palindrome.");
			}
		}
	}
	
	private boolean isPalindrome(String str) {
		int end = str.length() - 1;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(end - i)) return false;
		}
		return true;
	}
	
	private boolean isSentencePalindrome(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str, " ,.';!:");
		String withoutPunc = "";
		while(tokenizer.hasMoreTokens()) {
			withoutPunc += tokenizer.nextToken();
		}
		return isPalindrome(withoutPunc.toLowerCase());
	}
}
