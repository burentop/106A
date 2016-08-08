/*
 * File: Ch3Ex4.java
 * -----------------
 * This program asks the user for a radius, and displays the area
 * of a circle.
 */

import acm.program.*;

public class Ch3Ex4 extends ConsoleProgram {
	public void run() {
		println("This program will display the area of a circle, ");
		println("based on your input of a radius.");
		double radius = readDouble("Enter radius: ");
		double area = PI * (radius * radius);
		println("The area = " + area);
	}
	
	private static final double PI = 3.1415926535;
}
