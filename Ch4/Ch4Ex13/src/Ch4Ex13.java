/*
 * File: Ch4Ex13.java
 * ------------------
 * This program reads in a series of integers from the user, until the 
 * sentinel is entered. Then it displays the largest number and the 
 * second largest entered.
 */

import acm.program.*;

public class Ch4Ex13 extends ConsoleProgram {
	/* Variable to store the sentinel value */
	private static final int SENTINEL = 0;
	
	public void run() {
		println("This program prompts you for a series of numbers, and");
		println("then displays the largest, and second largest ones entered.");
		println("Enter '0' to terminate the program.");
		
		int max = 0;
		int second_max = 0;
		
		while (true) {
			int input = readInt(" ? ");
			if (input == SENTINEL) break;
			if (input > max) {
				max = input;
			} else if (input > second_max) {
				second_max = input;
			}
		}
		
		println("The largest value is " + max);
		println("The second largest is " + second_max);
	}
}
