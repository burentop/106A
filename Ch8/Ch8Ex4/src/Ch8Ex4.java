/**
 * File: Ch8Ex4.java
 * -----------------
 * This program takes the year, month and day in integer form, and prints a 
 * string in 'xx-Mon-xx' format.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex4 extends ConsoleProgram {
	public void run() {
		println(createDateString(22, 11, 1963));
	}
	
	private String createDateString(int d, int m, int y) {
		return (d + "-" + monthLookup(m) + "-" + ("" + y).substring(2));
	}
	
	private String monthLookup(int m) {
		switch (m) {
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";
		default:
			return "NaM";
		}
	}
}
