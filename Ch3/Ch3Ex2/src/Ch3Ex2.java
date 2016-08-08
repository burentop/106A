/*
 * File: Ch3Ex2.java
 * -----------------
 * This program takes an account balance and annual interest rate
 * as inputs from the user. Then displays the new balance after
 * a year.
 */

import acm.program.*;

public class Ch3Ex2 extends ConsoleProgram {
	public void run() {
		println("This program will take a bank balance and annual rate; ");
		println("and then display the new balance after a year.");
		double balance = readDouble("Enter starting balance: ");
		double rate = readDouble("Enter annual interest rate: ");
		balance = balance * (1 + (rate / 100));
		println("Balance after one year = " + balance);
	}
}
