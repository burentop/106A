/*
 * File: Ch4Ex1.java
 * -----------------
 * A program to demonstrate the counting involved in the classic
 * 99 bottles of beer song.
 */

import acm.program.*;

public class Ch4Ex1 extends ConsoleProgram {
	
	/* Constant to store beginning number of bottles */
	private static final int NUM_BOTTLES = 99;
	
	public void run() {
		println("This program will count down the number of bottles of beer");
		println("in the classic song.");
		
		/* Start looping through bottles */
		for (int i = NUM_BOTTLES; i > 0; i--) {
			/* Variables to determine plural or singular use of 'bottle'. */
			String pl_or_sing = "bottles";
			String pl_minus = "bottles";
			if (i == 2) pl_minus = "bottle";
			if (i == 1) pl_or_sing = "bottle";
			println(i + " " + pl_or_sing + " of beer on the wall.");
			println(i + " " + pl_or_sing + " of beer.");
			println("Take one down, pass it around.");
			println((i - 1) + " " + pl_minus + " of beer on the wall.");
			println("");
		}
		/* Print end of song after last bottle */
		println("No more bottles of beer on the wall!");
	}
	
	
}
