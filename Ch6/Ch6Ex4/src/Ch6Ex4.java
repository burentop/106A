/**
 * File: Ch6Ex4.java
 * -----------------
 * This program simulates the number of years it would take for 10,000 atoms
 * to decay, given the assumptions of a typical half-life.
 * @author perramount
 *
 */

import acm.program.*;
import acm.util.*;

public class Ch6Ex4 extends ConsoleProgram {
	public void run() {
		println("There are 10000 atoms initially.");
		int atoms = 10000;
		int year = 0;
		while (atoms > 0) {
			int atoms_decayed = 0;
			for (int i = 0; i < atoms; i++) {
				boolean is_decayed = rgen.nextBoolean();
				if (is_decayed) atoms_decayed++;
			}
			atoms -= atoms_decayed;
			year++;
			println("There are " + atoms + " atoms at the end of year " + year);
		}
	}
	
	/* Generate random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
