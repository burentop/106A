/**
 * File: Ch8Ex6.java
 * -----------------
 * This program checks for palindromes.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex6 extends ConsoleProgram {
	public void run() {
		println("'noon' is a palindrome: " + isPalindrome("noon"));
		println("'breakfast' is a palindrome: " + isPalindrome("breakfast"));
		println("'racecar' is a palindrome: " + isPalindrome("racecar"));
	}
	
	private boolean isPalindrome(String str) {
		int end = str.length() - 1;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(end - i)) return false;
		}
		return true;
	}
}
