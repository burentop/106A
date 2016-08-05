import acm.program.*;

/*
 * Prompt for values, and then output the min and max
 */

public class MinMaxSentinel extends ConsoleProgram {

	public void run() {
		
		// Value that terminates program
		final int SENTINEL = 0;
		
		int min = 0;
		int max = 0;
		int count = 0;
		
		println("This program finds the largest and smallest numbers.");
		
		while (true) {
			int input = readInt("? ");
			
			// End program if user enters terminating value
			if (input == SENTINEL) break;
			
			// Initial value entered is both min and max
			if (count < 1) min = max = input;
			
			count++;
			
			if (input < min) min = input;
			if (input > max) max = input;
			
		}
		
		// Check to see if values were entered
		if (count == 0) println("You didn't enter any values.");
		
		println("smallest: " + min);
		println("largest: " + max);
		
		
		
	}
	
}
