import acm.program.*;

/*
 * Program that prints the Fibonacci sequence up to a defined maximum
 */

public class Fibonacci extends ConsoleProgram{
	
	public void run() {
		
		// Program will terminate the sequence exceeds this number
		final int MAX_TERM_VALUE = 10000;
		// Variables to hold prior 2 values (next number is the sum of previous two) 
		int before_previous = 0;
		// First two values are always 0 and 1
		int previous = 1;
		int current = 1;
		
		println("This program lists the Fibonacci sequence.");
		println(before_previous);
		println(previous);
		println(current);
		
		// Loop until MAX_TERM_VALUE is reached
		while (true) {
			before_previous = previous;
			previous = current;
			current = before_previous + previous;
			// Check if 'current' is greater than MAX_TERM_VALUE
			if (current > MAX_TERM_VALUE) break;
			println(current);
		}
		
	}
	
}
