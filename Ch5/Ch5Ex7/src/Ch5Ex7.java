/*
 * File: Ch5Ex7.java
 * -----------------
 * This program uses a method to prompt the user for the answer
 * to a yes/no question.
 */

import acm.program.*;

public class Ch5Ex7 extends ConsoleProgram {
	public void run() {
		String question = "Would you like instructions?";
		askYesNoQuestion(question);
	}
	
	private boolean askYesNoQuestion(String prompt) {
		while(true) {
			String answer = readLine(prompt);
			if (answer.equals("yes")) {
				return true;
			} else if (answer.equals("no")) {
				return false;
			} else {
				println("Please answer yes or no.");
			}
		}
	}
}
