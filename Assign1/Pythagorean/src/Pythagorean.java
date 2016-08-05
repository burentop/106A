import acm.program.*;

/*
 * Pythagorean theorem
 * Prompt for a and b values, then output value for c
 */

public class Pythagorean extends ConsoleProgram {

	public void run() {
		
		println("Enter values to compute Pythagorean theorem.");
		
		// Prompt for a
		int a = readInt("a: ");
		
		// Prompt for b
		int b = readInt("b: ");
		
		// Calculate c
		double c = Math.sqrt(((double) a * (double) a) + ((double) b * (double) b));
		
		println("c = " + c);
		
	}
	
}
