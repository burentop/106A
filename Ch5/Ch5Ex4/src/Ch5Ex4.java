/*
 * File: Ch5Ex4.java
 * -----------------
 * This program counts the number of digits of a number input by the user.
 */

import acm.program.*;

public class Ch5Ex4 extends ConsoleProgram {
	public void run() {
		println("This program counts the number of digits in an integer.");
		int input = readInt("Enter a positive integer: ");
		println(input + " has " + countDigits(input) + " digits.");
	}
	
	private int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}
}
