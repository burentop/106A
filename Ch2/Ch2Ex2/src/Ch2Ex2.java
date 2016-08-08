/*
 * File: Ch2Ex2.java
 * This program prompts for two doubles from the user,
 * which are used as the base and height of a triangle.
 * It then calculates the area, and displays the value.
 */

import acm.program.*;

public class Ch2Ex2 extends ConsoleProgram {
	public void run() {
		println("This program will calculate the area of a triangle, ");
		println("based on your inputs for base and height.");
		/* Prompt for base and height */
		double base = readDouble("Enter the base: ");
		double height = readDouble("Enter the height: ");
		
		/* Calculate the area: (base * height) / 2 */
		double area = (base * height) / 2;
		
		/* Display area */
		println("The area = " + area);
	}
}
