/**
 * File: Ch6Ex1.java
 * -----------------
 * This program randomly selects a rank, and suit, and then displays
 * it as a randomly selected card.
 * @author perramount
 *
 */

import acm.program.*;
import acm.util.*;

public class Ch6Ex1 extends ConsoleProgram {
	public void run() {
		println("This program displays a randomly chosen card.");
		RandomGenerator rgen = RandomGenerator.getInstance();
		int rank = rgen.nextInt(13);
		int suit = rgen.nextInt(4);
		
		String suit_name = "";
		String rank_name = "";
		
		switch(rank) {
		case 0: rank_name = "Ace"; break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9: rank_name = "" + (rank + 1); break;
		case 10: rank_name = "Jack"; break;
		case 11: rank_name = "Queen"; break;
		case 12: rank_name = "King"; break;
		}
		
		switch(suit) {
		case 0: suit_name = "Clubs"; break;
		case 1: suit_name = "Diamonds"; break;
		case 2: suit_name = "Hearts"; break;
		case 3: suit_name = "Spades"; break;
		}
		
		println(rank_name + " of " + suit_name);
	}
}
