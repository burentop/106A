/*
 * File: Ch3Ex6.java
 * -----------------
 * This program shows the equation given in The Phantom Tollbooth,
 * as Java integer arithmetic solves it.
 */

import acm.program.*;

public class Ch3Ex6 extends ConsoleProgram {
	public void run() {
		println("The Mathemagician gave the following equation: ");
		println("4+9-2*16+1/3*6-67+8*2-3+26-1/34+3/7+2-5");
		double java_answer = 4 + 9 - 2 * 16 + 1 / 3 * 6 - 67 + 8 * 2 - 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5;
		println("He said it came out to zero, but the answer in Java is " + java_answer);
	}
}
