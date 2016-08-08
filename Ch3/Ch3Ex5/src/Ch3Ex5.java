/*
 * File: Ch3Ex5.java
 * -----------------
 * This program prompts the user for a temperature in Fahrenheit,
 * and then displays the temperature in Celsius.
 */

import acm.program.*;

public class Ch3Ex5 extends ConsoleProgram {
	public void run() {
		println("This program converts Fahrenheit to Celsius.");
		double fahrenheit = readDouble("Enter Fahrenheit temperature: ");
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		println("Celsius equivalent = " + celsius);
	}
}
