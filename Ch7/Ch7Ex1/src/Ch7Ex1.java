/**
 * File: Ch7Ex1.java
 * -----------------
 * This program simulates the conversion from hexadecimal to decimal.
 * @author perramount
 *
 */

import acm.program.*;

public class Ch7Ex1 extends ConsoleProgram {
	public void run() {
		println("This program converts hexadecimal to decimal.");
		println("Enter G to stop.");

		
		while (true) {
			String hex = readLine("Enter a hexadecimal number: ");
			if (hex.equals("G")) break;
			convert(hex);
		}
	}
	
	private void convert(String hex) {
		int end = hex.length() - 1;
		int dec = 0;
		double multiply = 1;
		int power = 0;
		for (int i = end; i >= 0; i--) {
			dec += (lookup(hex.charAt(i)) * multiply);
			power++;
			multiply = Math.pow(16, power);
		}
		println(hex + " hex = " + dec + " decimal");
	}
	
	private int lookup(char a) {
		switch(a) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			return java.lang.Character.getNumericValue(a);
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		default:
			return 15;
		}
	}
}
