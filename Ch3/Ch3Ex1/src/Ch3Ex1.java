/*
 * File: Ch3Ex1.java
 * -----------------
 * This program converts feet and inches, to centimeters.
 */

import acm.program.*;

public class Ch3Ex1 extends ConsoleProgram {
	public void run() {
		println("This program converts feet and inches to centimeters.");
		double feet = readDouble("Enter number of feet: ");
		double inches = readDouble("Enter number of inches: ");
		double total_inches = (feet * 12) + inches;
		double cm = total_inches * CENTIMETERS_PER_INCH;
		println(feet + "ft " + inches + "in = " + cm + "cm");
	}
	
	private static final double CENTIMETERS_PER_INCH = 2.54;
}
