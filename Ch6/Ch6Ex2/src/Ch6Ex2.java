/**
 * File: Ch6Ex2.java
 * -----------------
 * This program simulates flipping a coin continuously, until
 * it flips 3 heads in a row. It then displays the total number
 * of flips that it took.
 * @author perramount
 *
 */
import acm.program.*;
import acm.util.*;

public class Ch6Ex2 extends ConsoleProgram {
	public void run() {
		int flips = 0;
		int heads = 0;
		
		while (heads < 3) {
			boolean flip = rgen.nextBoolean();
			println(flip);
			if(flip) {
				heads++;
			} else {
				heads = 0;
			}
			flips++;
		}
		println("It took " + flips + " flips to get 3 consecutive heads.");
	}
	
	/* Generate random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
