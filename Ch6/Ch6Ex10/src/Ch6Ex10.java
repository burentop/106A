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
		println("Allocating 10000 Rational objects");
		
		for (int i = 1; i <= 10000; i++) {
			println(new Rational(1, i));
		}
		
		Runtime myRuntime = Runtime.getRuntime();
		long before = myRuntime.freeMemory();
		myRuntime.gc();
		long after = myRuntime.freeMemory();
		
		println("Garbage collection freed " + (after - before) + " bytes");
	}
}
