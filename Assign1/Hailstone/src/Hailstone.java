import acm.program.*;

/*
 * Program that takes in a positive integer and assigns it to n variable.
 * Then, until n equals 1, you divide n if even, and if add, multiply by 3 and add 1
 */
public class Hailstone extends ConsoleProgram {

	public void run() {
		
		int count = 0;
		
		// Read in user input
		int n = readInt("Enter a number: ");
		
		// Loop until equal to 1
		while (true) {
			if (n == 1) break;
			// Check if even
			if (n % 2 == 0) {
				// Divide by two if even, multiply by 3 and add 1 if odd
				// Print out calculation, and add to count
				println(n + " is even, so I take half: " + (n / 2));
				n /= 2;
			} else {
				println(n + " is odd, so I make 3n + 1: " + (3 * n + 1));
				n = 3 * n + 1;
			}
			count++;
		}
				
		// Print out count
		println("The process took " + count + " to reach 1.");
	}
	
}
