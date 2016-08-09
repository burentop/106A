/*
 * File: Ch4Ex2.java
 * -----------------
 * This program iterates through ten numbers of the song
 * This Old Man...
 */

import acm.program.*;

public class Ch4Ex2 extends ConsoleProgram {
	public void run() {
		/* Iterate from 1 to 10 */
		for (int i = 1; i <= 10; i++) {
			String played_on = "";
			switch (i) {
			case 1:
				played_on = " on my thumb.";
				break;
			case 2:
				played_on = " on my shoe.";
				break;
			case 3:
				played_on = " on my knee.";
				break;
			case 4:
				played_on = " on my door.";
				break;
			case 5:
				played_on = " on my hive.";
				break;
			case 6:
				played_on = " on my sticks.";
				break;
			case 7:
				played_on = " up to heaven.";
				break;
			case 8:
				played_on = " on my gate.";
				break;
			case 9:
				played_on = " on my spine.";
				break;
			case 10:
				played_on = " on my shin.";
				break;
			}
			println("This old man, he played " + i + ".");
			println("He played knick-knack" + played_on);
			println("With a knick-knack, paddy-whack,");
			println("give your dog a bone.");
			println("This old man came rolling home.");
			println("");
		}
	}
}
