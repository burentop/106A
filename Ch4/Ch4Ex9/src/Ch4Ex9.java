/*
 * File: Ch4Ex9.java
 * -----------------
 * This program displays the first 16 numbers in the Fibonacci sequence.
 */

import acm.program.*;

public class Ch4Ex9 extends ConsoleProgram {
	
	/* Variable to indicate max Fibonacci number */
	private static final int MAX = 10000;
	
	public void run() {
		println("This program displays the first 16 Fibonacci numbers.");
		println("");
		println("0");
		println("1");
		int recent = 1;
		int second_recent = 0;
		int current = 0;
		while (current < MAX) {
			current = fibonacci(recent, second_recent);
			if (current < MAX) println(current);
			second_recent = recent;
			recent = current;
			
		}
	}
	
	private int fibonacci(int a, int b) {
		return a + b;
	}
}
