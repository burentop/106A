/**
 * File: Ch6Ex5.java
 * -----------------
 * This program simulates the play of a slot machine, giving the user
 * an initial $50 - and charging $1 per play.
 * @author perramount
 *
 */

import acm.program.*;
import acm.util.*;

public class Ch6Ex5 extends ConsoleProgram {
	public void run() {
		int pot = 50;
		while(pot > 0) {
			print("You have $" + pot + ". ");
			String input = readLine("Would you like to play? ");
			if (input.equals("no")) break;
			
			/* Charge $1 per play */
			pot--;
			
			int wheel1 = rgen.nextInt(6);
			int wheel2 = rgen.nextInt(6);
			int wheel3 = rgen.nextInt(6);
			
			String wheel1_result = checkWheel(wheel1);
			String wheel2_result = checkWheel(wheel2);
			String wheel3_result = checkWheel(wheel3);
			
			if (wheel1_result.equals("BAR")) {
				if (wheel2_result.equals("BAR")) {
					if (wheel3_result.equals("BAR")) {
						pot += 250;
					}
				}
			} else if (wheel1_result.equals("BELL")) {
				if (wheel2_result.equals("BELL")) {
					if ((wheel3_result.equals("BELL")) || (wheel3_result.equals("BAR"))) {
						pot += 20;
					}
				}
			} else if (wheel1_result.equals("PLUM")) {
				if (wheel2_result.equals("PLUM")) {
					if ((wheel3_result.equals("PLUM")) || (wheel3_result.equals("BAR"))) {
						pot += 14;
					}
				}
			} else if (wheel1_result.equals("ORANGE")) {
				if (wheel2_result.equals("ORANGE")) {
					if ((wheel3_result.equals("ORANGE")) || (wheel3_result.equals("BAR"))) {
						pot += 10;
					}
				}
			} else if (wheel1_result.equals("CHERRY")) {
				if (wheel2_result.equals("CHERRY")) {
					if (wheel3_result.equals("CHERRY")) {
						pot += 7;
					} else {
						pot += 5;
					}
				} else {
					pot += 2;
				}
			}
		}
		println("You have $" + pot + ".");
	}
	
	/**
	 * This method checks the random number between 0-5 and returns the String result.
	 * @param n random number passed in as wheel spin.
	 * @return String representing result.
	 */
	private String checkWheel(int n) {
		switch(n) {
		case 0:
			return "CHERRY";
		case 1:
			return "LEMON";
		case 2:
			return "ORANGE";
		case 3:
			return "PLUM";
		case 4:
			return "BALL";
		default:
			return "BAR";
		}
	}
	
	/* Random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
