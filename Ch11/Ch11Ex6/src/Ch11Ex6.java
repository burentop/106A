/**
 * File: Ch11Ex6.java
 * ------------------
 * This program demonstrates the Sieve of Eratosthenes. (Finds all prime numbers up to N.)
 * @author Brent Perry
 *
 */

import java.util.ArrayList;
import acm.program.*;

public class Ch11Ex6 extends ConsoleProgram {
	public void run() {
		println("This program will find all prime numbers up to a given limit.");
		int upLimit = readInt("Enter the upper limit: ");
		println();
		findPrimes(upLimit);
		println("The primes are: ");
		for (int i = 0; i < primes.size(); i++) {
			println(primes.get(i));
		}
	}
	
	private void findPrimes(int limit) {
		for (int i = 2; i <= limit; i++) {
			list.add(i);
		}
		removeMultiples();
	}
	
	private void removeMultiples() {
		while (list.size() > 0) {
			int prime = list.get(0);
			primes.add(list.get(0));
			list.remove(0);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) % prime == 0) {
					list.remove(i);
				}
			}
		}
	}
	
	private ArrayList<Integer> list = new ArrayList<>();
	private ArrayList<Integer> primes = new ArrayList<>();
}
