/*
 * File: Ch5Ex12.java
 * ------------------
 * This program displays all perfect numbers between 1 and 9999.
 */

import acm.program.*;

public class Ch5Ex12 extends ConsoleProgram {
	public void run() {
		println("This program displays all perfect numbers between 1 and 9999.");
		for (int i = 1; i <= 9999; i++) {
			if(isPerfect(i)) println(i);
		}
	}
	
	private boolean isPerfect(int n) {
		int total = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) total += i;
		}
		if (total == n) return true;
		return false;
	}
}
