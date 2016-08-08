/*
 * File: Ch3Ex9.java
 * -----------------
 * This program calculates the total number of things met on the way to St. Ives,
 * as described in the nursery rhyme.
 */

import acm.program.*;

public class Ch3Ex9 extends ConsoleProgram {
	public void run() {
		println("As I was going to St. Ives,");
		println("I met a man with seven wives,");
		int man = 1;
		int total = man;
		int wives = 7;
		total += wives;
		println("Each wife had seven sacks,");
		int sacks = wives * 7;
		println("Each sack had seven cats,");
		int cats = sacks * 7;
		total += cats;
		println("Each cat had seven kits:");
		int kits = cats * 7;
		total += kits;
		println("Kits, cats, sacks, and wives,");
		println("How many were going to St. Ives?");
		println("None. But " + total + " were leaving it (excl. sacks).");
	}
}
