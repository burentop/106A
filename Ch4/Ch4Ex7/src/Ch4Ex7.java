/*
 * File: Ch4Ex7.java
 * -----------------
 * This program takes an integer as input, and then displays the reverse
 * of that number. ex: 1729 --> 9271
 */

import acm.program.*;

public class Ch4Ex7 extends ConsoleProgram {
	public void run() {
		println("This program reverses the digits in an integer.");
		int n = readInt("Enter a positive integer: ");
		String reverse = "";
		while (n > 0) {
			reverse += (n % 10);
			n /= 10;
		}
		println("The reverse of the digits is " + reverse);
	}
}
