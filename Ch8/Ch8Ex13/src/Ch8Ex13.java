/**
 * File: Ch8Ex13.java
 * ------------------
 * This program adds comma format to long integers.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex13 extends ConsoleProgram {
	public void run() {
		while (true) {
			String digits = readLine("Enter a number: ");
			if (digits.length() == 0) break;
			println(addCommas(digits));
		}
	}
	
	private String addCommas(String number) {
		int digCount = -1;
		String formatted = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			digCount++;
			if (digCount != 0 && digCount % 3 == 0) {
				formatted = number.charAt(i) + "," + formatted;
			} else {
				formatted = number.charAt(i) + formatted;
			}
		}
		return formatted;
	}
}
