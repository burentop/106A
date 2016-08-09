/*
 * File: Ch4Ex3.java
 * -----------------
 * This program prompts the user for an integer, N.
 * Then calculates, and displays, the first N odd integers.
 */

import acm.program.*;

public class Ch4Ex3 extends ConsoleProgram {
	public void run() {
		println("This program will ask you for a number, ");
		println("and then display the sum of that many odd numbers, starting with 1.");
		int input = readInt("How many odds: ");
		/* Variables to track odds found, counter of numbers checked, 
		 * and sum of odds.
		 */
		int found = 0;
		int counter = 1;
		int sum = 0;
		/* Loop until found = N; add found odds to sum. */
		while (found < input) {
			if (counter % 2 != 0) {
				found++;
				sum += counter;
			}
			counter++;
		}
		/* Display sum. */
		println("The sum of the first " + input + " odds is " + sum);
	}
}
