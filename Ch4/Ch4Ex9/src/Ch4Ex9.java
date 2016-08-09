/*
 * File: Ch4Ex9.java
 * -----------------
 * This program displays the first 16 numbers in the Fibonacci sequence.
 */

import acm.program.*;

public class Ch4Ex9 extends ConsoleProgram {
	public void run() {
		println("This program displays the first 16 Fibonacci numbers.");
		println("");
		println("0");
		println("1");
		int recent = 1;
		int second_recent = 0;
		for (int i = 2; i <= 15; i++) {
			int current = recent + second_recent;
			println(current);
			second_recent = recent;
			recent = current;
			
		}
	}
}
