/*
 * File: Ch5Ex11.java
 * ------------------
 * This program prompts the user for an integer, and determines if it is prime.
 */

import acm.program.*;

public class Ch5Ex11 extends ConsoleProgram {
	public void run() {
		println("This program will ask for a number, and then tell you if it is prime.");
		int input = readInt("Enter number: ");
		if(isPrime(input)) {
			println(input + " is prime.");
		} else {
			println(input + " is not prime.");
		}
	}
	
	private boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
