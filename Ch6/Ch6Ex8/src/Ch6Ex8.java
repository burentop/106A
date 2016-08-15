/**
 * File: Ch6Ex8.java
 * -----------------
 * This program creates a Card object, and prints the contents.
 * @author perramount
 *
 */

import acm.program.*;

public class Ch6Ex8 extends ConsoleProgram {
	public void run() {
		Card first_card = new Card("Spades", 9);
		Card second_card = new Card("Diamonds", 12);
		
		println(first_card);
		println(second_card);
	}
}
