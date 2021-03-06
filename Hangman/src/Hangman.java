/**
 * File: Hangman.java
 * ------------------
 * This program plays a game of Hangman.
 * @author Brent Perry
 *
 */

import java.io.IOException;

import acm.program.*;
import acm.util.RandomGenerator;

public class Hangman extends ConsoleProgram {
	
	public void init() {
		canvas = new HangmanCanvas();
		add(canvas);
	}
	
	public void run() {
		HangmanLexicon game = null;
		try {
			game = new HangmanLexicon();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		canvas.reset(toDisplay);
		println("Welcome to Hangman!");
		int pick = rgen.nextInt(game.getWordCount());
		toGuess = game.getWord(pick);
		toDisplay = "";
		for (int i = 0; i < toGuess.length(); i++) {
			toDisplay += "-";
		}
		guesses = GUESSES;
		while (true) {
			if (guesses < 1) {
				println("You're completely hung.");
				println("The word was: " + toGuess);
				println("You lose.");
				break;
			}
			println("The word now looks like this: " + toDisplay);
			canvas.displayWord(toDisplay);
			println("You have " + guesses + " guesses left.");
			String guess = readLine("Your guess: ");
			String upperGuess = guess.toUpperCase();
			if ((guess.length() == 1) && (upperGuess.charAt(0) >= 'A') && (upperGuess.charAt(0) <= 'Z')) {
				char charGuess = upperGuess.charAt(0);
				checkGuess(charGuess);
			} else {
				println("Please enter a single letter.");
			}
			if (toDisplay.equals(toGuess)) {
				println("You guessed the word: " + toGuess);
				canvas.displayWord(toDisplay);
				break;
			}
		}
	}
	
	private void checkGuess(char guess) {
		String tempDisplay = "";
		int matches = 0;
		for (int i = 0; i < toGuess.length(); i++) {
			if(toGuess.charAt(i) == guess) {
				tempDisplay += guess;
				matches++;
			} else {
				tempDisplay += toDisplay.charAt(i);
			}
		}
		toDisplay = tempDisplay;
		if (matches > 0) {
			println("That guess is correct.");
		} else {
			println("There are no " + guess + "'s in the word.");
			guesses--;
			canvas.noteIncorrectGuess(guess, guesses);
		}
		
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int GUESSES = 8;
	private String toGuess;
	private String toDisplay;
	private int guesses;
	private HangmanCanvas canvas;
}
