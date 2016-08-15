/**
 * File: Ch6Ex3.java
 * -----------------
 * In order to calculate an approximation of pi, this program simulates
 * throwing 10,000 darts at a circle within a square; then, calculating
 * the ratio of darts that fell within the circle to those within the square.
 * @author perramount
 *
 */

import acm.program.*;
import acm.util.*;

public class Ch6Ex3 extends ConsoleProgram {
	public void run() {
		
		int circle_hits = 0;
		
		for (int i = 0; i < 10000; i++) {
			/* Generate the x,y coordinates where the dart hits. */
			double x = rgen.nextDouble(-1, 1);
			double y = rgen.nextDouble(-1, 1);
			
			if ((x * x + y * y) < 1) circle_hits++;
		}
		
		double ratio = circle_hits / 10000.0;
		double my_pi = 4.0 * ratio;
		
		println("Approximate pi = " + my_pi);
		
	}
	
	/* Generate random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
