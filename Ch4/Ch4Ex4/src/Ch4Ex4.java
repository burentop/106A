/*
 * File: Ch4Ex4.java
 * -----------------
 * This program prints all numbers between 1 and 100 that are
 * divisible by 6 or 7.
 */

import acm.program.*;

public class Ch4Ex4 extends ConsoleProgram {
	public void run() {
		println("This program prints all numbers between 1 and 100,");
		println("that are divisible by 6 or 7.");
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0 || i % 7 == 0) println(i);
		}
	}
}
