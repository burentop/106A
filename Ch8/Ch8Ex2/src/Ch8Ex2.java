/**
 * File: Ch8Ex2.java
 * -----------------
 * This program prints out 5 random "words" of random lengths.
 * @author perramount
 *
 */

import acm.program.*;
import acm.util.*;

public class Ch8Ex2 extends ConsoleProgram {

	public void run() {
		for (int i = 0; i < 5; i++) {
			println(randomWord());
		}
	}
	
	private String randomWord() {
		int letters = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
		String word = "";
		for (int i = 0; i < letters; i++) {
			word += (char) rgen.nextInt('a', 'z');
		}
		return word;
	}
	
	private static final int MIN_LETTERS = 3;
	private static final int MAX_LETTERS = 9;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
