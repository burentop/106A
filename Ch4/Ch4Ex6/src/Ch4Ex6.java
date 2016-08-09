/*
 * File: Ch4Ex6.java
 * -----------------
 * Reads in exam scores from the user, then prints out the average
 * when the sentinel is entered.
 */

import acm.program.*;

public class Ch4Ex6 extends ConsoleProgram {
	
	/* Value of the 'sentinel' */
	private static final int SENTINEL = -1;
	
	public void run() {
		println("This program averages a list of integers.");
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list.");
		double total = 0;
		int count = 0;
		while (true) {
			int value = readInt(" ? ");
			if (value == SENTINEL) break;
			total += value;
			count++;
		}
		println("The average is " + (total / (double) count) + ".");
	}
}
