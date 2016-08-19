/**
 * File: Ch6Ex6.java
 * -----------------
 * This program asks 5 addition/subtraction questions (giving 3 chances for
 * the correct answer). Components and answers cannot be negative or over 20;
 * @author perramount
 *
 */

import acm.program.*;
import acm.util.*;

public class Ch6Ex6 extends ConsoleProgram {

	public void run() {
		println("Welcome to the Octal Math Quiz");
		for (int i = 0; i < TOTAL_QUESTIONS; i++) {
			int x = createX();
			boolean operator = createOp();
			int y = createY(x, operator);
			int user_answer = askQuestion(x, y, operator);
			int answer = 0;
			if (operator) answer = x + y;
			else answer = x - y;
			int octalAnswer = makeOctal(answer);
			checkAnswer(user_answer, octalAnswer);
		}
	}
	
	private int makeOctal(int dec) {
		int div = dec;
		int mod = 0;
		int oct = 0;
		int pow = 1;
		while (div > 0) {
			mod = div % 8;
			oct += mod * pow;
			pow *= 10;
			div = div / 8;
		}
		return oct;
	}
	
	private int createX() {
		return rgen.nextInt(UPPER_RANGE + 1);
	}
	
	private boolean createOp() {
		return rgen.nextBoolean();
	}
	
	private int createY(int x, boolean op) {
		if (op) return rgen.nextInt(UPPER_RANGE - (x - 1));
		return rgen.nextInt(x);
	}
	
	private int askQuestion(int x, int y, boolean op) {
		char operator = 'z';
		if (op) operator = '+';
		else operator = '-';
		return readInt("What is " + x + " " + operator + " " + y + "? ");
	}
	
	private void checkAnswer(int user, int answer) {
		int wrong = CHANCES;
		int user_answer = user;
		while (wrong > 0) {
			if (user_answer == answer) {
				congratulate();
				wrong = -1;
			} else {
				user_answer = readInt("That's incorrect - try a different answer: ");
				wrong--;
			}
		}
		if (wrong == 0) println("No, the answer is " + answer);
	}
	
	private void congratulate() {
		int message = rgen.nextInt(3);
		switch(message) {
		case 0:
			println("Correct!");
			break;
		case 1:
			println("You got it!");
			break;
		default:
			println("That's the answer!");
			break;
		}
	}
	
	/* Random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/* Named constants */
	private static final int TOTAL_QUESTIONS = 5;
	private static final int CHANCES = 2;
	private static final int UPPER_RANGE = 20;
}
