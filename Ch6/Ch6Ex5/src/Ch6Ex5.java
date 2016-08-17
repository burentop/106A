/**
 * File: Ch6Ex5.java
 * -----------------
 * This program simulates the play of a slot machine, giving the user
 * an initial $50 - and charging $1 per play.
 * @author perramount
 *
 */

import acm.program.*;
import java.util.ArrayList;
import acm.util.*;

public class Ch6Ex5 extends ConsoleProgram {
	public void run() {
		
		ArrayList<WheelCombo> wheelCombos = new ArrayList<>();
		
		wheelCombos.add(new WheelCombo(5, 5, 5, 250));
		wheelCombos.add(new WheelCombo(4, 4, 4, 20));
		wheelCombos.add(new WheelCombo(4, 4, 5, 20));
		wheelCombos.add(new WheelCombo(3, 3, 3, 14));
		wheelCombos.add(new WheelCombo(3, 3, 5, 14));
		wheelCombos.add(new WheelCombo(2, 2, 2, 10));
		wheelCombos.add(new WheelCombo(2, 2, 5, 10));
		wheelCombos.add(new WheelCombo(0, 0, 0, 7));
		
		for (int i = 0; i < 6; i++) {
			wheelCombos.add(new WheelCombo(0, 0, i, 5));
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				wheelCombos.add(new WheelCombo(0, i, j, 2));
			}
		}
		
		int pot = 50;
		
		while(pot > 0) {
			int potIncrease = 0;
			print("You have $" + pot + ". ");
			String input = readLine("Would you like to play? ");
			if (input.equals("no")) break;
			
			/* Charge $1 per play */
			pot--;
			
			int wheel1 = rgen.nextInt(6);
			int wheel2 = rgen.nextInt(6);
			int wheel3 = rgen.nextInt(6);
			
			for (int i = 0; i < wheelCombos.size(); i++) {
				if (wheelCombos.get(i).isMatch(wheel1, wheel2, wheel3)) {
					potIncrease = wheelCombos.get(i).getPayout();
					break;
				}
				
			}
			pot += potIncrease;
			
			String wheel1_result = checkWheel(wheel1);
			String wheel2_result = checkWheel(wheel2);
			String wheel3_result = checkWheel(wheel3);
			
			println(wheel1_result + "  " + wheel2_result + "  " + wheel3_result + " -- " +"You have $" + pot + ".");
		}
		
		println("You have $" + pot);
		
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
			return "BELL";
		default:
			return "BAR";
		}
	}
	
	/* Random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
