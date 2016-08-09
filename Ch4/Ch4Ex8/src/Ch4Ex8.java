/*
 * File: Ch4Ex8.java
 * -----------------
 * This program counts backwards from the value START
 * to zero, as in the countdown preceding a rocket
 * launch.
 */

import acm.program.*;

public class Ch4Ex8 extends ConsoleProgram {

	/* Indicates the value from which to start the countdown */
	private static final int START = 10;

	public void run() {
		int t = START;
		while (t >= 0) {
			println(t);
			t--;
		}
		println("Liftoff!");
	}
}
