/*
 * File: Ch3Ex8.java
 * -----------------
 * This program takes 4 integer inputs, and computes the average.
 */

import acm.program.*;

public class Ch3Ex8 extends ConsoleProgram {

	public void run() {
		println("This program will take 4 integer inputs, and compute the avg.");
		int n1 = readInt("n1: ");
		int n2 = readInt("n2: ");
		int n3 = readInt("n3: ");
		int n4 = readInt("n4: ");
		double avg = (n1 + n2 + n3 + n4) / 4.0;
		println("The average = " + avg);
	}
}
