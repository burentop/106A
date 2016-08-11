/*
 * File: Ch5Ex3.java
 * -----------------
 * This program displays a table of 2 to the power of 0 to 10.
 */

import acm.program.*;

public class Ch5Ex3 extends ConsoleProgram {
	public void run() {
		println("This program displays 2 to the power of 0 - " + MAX);
		for (int i = 0; i <= MAX; i++) {
			println("2 to the power of " + i + " = " + raiseIntToPower(2, i));
		}
	}
	
	private double raiseIntToPower(double n, double k) {
		return Math.pow(n, k);
	}
	
	private static final int MAX = 10;
}
