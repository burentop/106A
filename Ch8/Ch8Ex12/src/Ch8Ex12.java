/**
 * File: Ch8Ex12.java
 * ------------------
 * This program demonstrates a custom version of the readInt method.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex12 extends ConsoleProgram {
	public void run() {
		int test = myReadInt("Enter a number: ");
		println(test * test);
	}
	
	private int myReadInt(String prompt) {
		String str = "";
		int start = -1;
		boolean isCorrect = false;
		while (!isCorrect) {
			str = readLine(prompt);
			start = -1;
			if (str.charAt(0) == '-') {
				start = 1;
			} else {
				start = 0;
			}
			for (int i = start; i < str.length(); i++) {
				if (!Character.isDigit(str.charAt(i))) {
					println("Illegal integer format");
					break;
				} else {
					isCorrect = true;
				}
			}
		}
		
		String outputString = str.substring(start);
		int output = Integer.parseInt(outputString);
		if (start == 1) output = -output;
		return output;
	}
}
