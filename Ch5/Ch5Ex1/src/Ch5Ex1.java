/*
 * File: Ch5Ex1.java
 * -----------------
 * This program calculates the quadratic formula based on values
 * input by the user.
 */

import acm.program.*;

public class Ch5Ex1 extends ConsoleProgram {
	public void run() {
		println("Enter coefficients for the quadratic equation:");
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");
		
		if (under_root(a, b, c) < 0) {
			println("There is no real solution for those inputs.");
		} else {
			double solution_one = (-b + Math.sqrt(under_root(a, b, c))) / (2 * a);
			double solution_two = (-b - Math.sqrt(under_root(a, b, c))) / (2 * a);
			println("The first solution is " + solution_one);
			println("The second solution is " + solution_two);
		}
	}
	
	private double under_root(int a, int b, int c) {
		return ((b * b) - (4 * a * c));
	}
}
