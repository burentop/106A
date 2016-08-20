/**
 * File: Ch8Ex10.java
 * ------------------
 * This program converts integer cardinal numbers to string ordinal numbers.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex10 extends ConsoleProgram {
	public void run() {
		println("cardinal: 1; ordinal: " + createOrdinalForm(1));
		println("cardinal: 2; ordinal: " + createOrdinalForm(2));
		println("cardinal: 3; ordinal: " + createOrdinalForm(3));
		println("cardinal: 10; ordinal: " + createOrdinalForm(10));
		println("cardinal: 11; ordinal: " + createOrdinalForm(11));
		println("cardinal: 12; ordinal: " + createOrdinalForm(12));
		println("cardinal: 21; ordinal: " + createOrdinalForm(21));
		println("cardinal: 42; ordinal: " + createOrdinalForm(42));
		println("cardinal: 101; ordinal: " + createOrdinalForm(101));
		println("cardinal: 111; ordinal: " + createOrdinalForm(111));
	}
	
	private String createOrdinalForm(int n) {
		String stringed = "" + n;
		String lastTwo = "";
		if (n > 9) {
			lastTwo = stringed.substring(stringed.length() - 2);
		}
		
		if (lastTwo.equals("11") || lastTwo.equals("12") || lastTwo.equals("13")) {
			return n + "th";
		} else if (stringed.charAt(stringed.length() - 1) == '1') {
			return n + "st";
		} else if (stringed.charAt(stringed.length() - 1) == '2') {
			return n + "nd";
		} else if (stringed.charAt(stringed.length() - 1) == '3') {
			return n + "rd";
		} else {
			return n + "th";
		}
	}
}
