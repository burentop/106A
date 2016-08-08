/*
 * File: Ch3Ex7.java
 * -----------------
 * This program takes a weight in kilograms, and converts it to pounds & ounces.
 */

import acm.program.*;

public class Ch3Ex7 extends ConsoleProgram {
	public void run() {
		println("This program will convert your input of kilograms into pounds and ounces.");
		double kilos = readDouble("Enter weight in kilograms: ");
		double total_ounces = (kilos * POUNDS_IN_KILO) * OZ_IN_POUND;
		int pounds = (int) total_ounces / OZ_IN_POUND;
		int ounces = (int) total_ounces % OZ_IN_POUND;
		println(kilos + " kilograms = " + pounds + " pounds, " + ounces + "oz");
	}
	
	private static final double POUNDS_IN_KILO = 2.2;
	private static final int OZ_IN_POUND = 16;
}
