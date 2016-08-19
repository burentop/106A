/*
 * File: Ch4Ex6.java
 * -----------------
 * Reads in exam scores from the user, then prints out the average
 * when the sentinel is entered.
 */

import acm.program.*;

public class Ch4Ex6 extends ConsoleProgram {
	
	/* Value of the 'sentinel' */
	private static final String SENTINEL = "";
	
	public void run() {
		println("This program averages a list of integers.");
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list.");
		double total = 0;
		int count = 0;
		while (true) {
			String input = readLine(" ? ");
			if (input.equals(SENTINEL)) break;
			total += Integer.parseInt(input);
			count++;
		}
		println("The average is " + (total / (double) count) + ".");
	}
}
