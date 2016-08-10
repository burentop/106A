/*
 * File: Ch4Ex7.java
 * -----------------
 * This program takes an integer as input, and then displays the reverse
 * of that number. ex: 1729 --> 9271
 */

import acm.program.*;

public class Ch4Ex7 extends ConsoleProgram {
	public void run() {
		println("This program calculates the digital root of an integer.");
		int n = readInt("Enter a positive integer: ");
		int root = n;
		while (root / 10 > 0) {
			n = root;
			root = 0;
			while (n > 0) {
				root += (n % 10);
				n /= 10;
			}
			
		}
		
		println("The digital root of the number is " + root);
	}
}
