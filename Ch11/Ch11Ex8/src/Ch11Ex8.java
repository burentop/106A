/**
 * File: Ch11Ex8.java
 * ------------------
 * This program translates an English line into Morse code.
 * 
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch11Ex8 extends ConsoleProgram {
	public void run() {
		println("The program translates a line into Morse code.");
		String line = readLine("Enter English text: ");
		displayMorse(line);
	}
	
	private void displayMorse(String line) {
		String toDisplay = "";
		String toCheck = line.toUpperCase();
		for (int i = 0; i < line.length(); i++) {
			if (toCheck.charAt(i) >= 'A' && toCheck.charAt(i) <= 'Z') {
				toDisplay += morse[toCheck.charAt(i) - 'A'] + " ";
			} else if (toCheck.charAt(i) == ' ') {
				println(toDisplay);
				toDisplay = "";
			}
		}
		println(toDisplay);
	}
	
	private String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
							  "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
}
