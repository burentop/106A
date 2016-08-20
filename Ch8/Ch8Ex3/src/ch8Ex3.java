/**
 * File: Ch8Ex3.java
 * -----------------
 * This program demonstrates a method that capitalizes the first letter in a word.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class ch8Ex3 extends ConsoleProgram {
	public void run() {
		println(capitalize("BOOLEAN"));
		println(capitalize("boolean"));
	}
	
	private String capitalize(String str) {
		String capitalized = "";
		char capital = str.charAt(0);
		capitalized += capital;
		String remainder = str.substring(1).toLowerCase();
		capitalized = capitalized.toUpperCase() + remainder;
		return capitalized;
	}
}
