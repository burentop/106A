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
			int digits = readInt("Enter a number: ");
			if (digits < 0) break;
			println(numberToWords(digits));
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
	
	private String numberToWords(int n) {
		String result = "";
		int thousands = n / 1000;
		int hundreds = n % 1000;
		if (n > 999) {
			return stringify(thousands, true) + stringify(hundreds, false);
		} else {
			return stringify(hundreds, false);
		}
		
	}
	
	private String stringify(int n, boolean thou) {
		String result = "";
		if (!thou) {
			if (n < 10) {
				return lookupOnes(n);
			} else if (n < 100) {
				return lessThan100(n);
			} else {
				return lookupOnes(n / 100) + " hundred and " + lessThan100(n % 100);
			}
		} else {
			if (n < 10) {
				return lookupOnes(n) + " thousand ";
			} else if (n < 100) {
				return lessThan100(n) + " thousand ";
			} else {
				return lookupOnes(n / 100) + " hundred " + lessThan100(n % 100) + " thousand ";
			}
		}
		
	}
	
	private String lessThan100(int n) {
		if (n < 10) {
			return lookupOnes(n);
		} else if (n < 20) {
			return lookupOnes(n);
		} else {
			return lookupTens(n / 10) + "-" + lookupOnes(n % 10);
		}
	}
	
	private String lookupOnes(int n) {
		switch(n) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		default:
			return "";
		}
	}
	private String lookupTens(int n) {
		switch(n) {
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "forty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		default:
			return "";
		}
	}
}
