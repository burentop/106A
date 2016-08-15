/**
 * File: Ch6Ex10.java
 * ------------------
 * This program demonstrates an instance of the Rational class.
 * @author perramount
 *
 */

import acm.program.*;

public class Ch6Ex10 extends ConsoleProgram {
	public void run() {
		Rational num1 = new Rational(1, 3);
		Rational num2 = new Rational(1, 2);
		
		println("1/2 + 1/3 = " + num1.add(num2));
	}
}
