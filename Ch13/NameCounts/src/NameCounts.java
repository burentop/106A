/**
 * File: NameCounts.java
 * ---------------------
 * This program prompts the user for names, and then prints the number of times
 * each name was entered.
 * 
 * @author Brent Perry
 *
 */

import java.util.HashMap;
import java.util.Map;
import acm.program.*;

public class NameCounts extends ConsoleProgram {
	public void run() {
		Map<String, Integer> names = new HashMap<String, Integer>();
		
		while (true) {
			String input = readLine("Enter name: ");
			if (input.equals("")) break;
			Integer count = names.get(input);
			if (count == null) {
				names.put(input, 1);
			} else {
				names.put(input, count + 1);
			}
		}
		for (String name : names.keySet()) {
			println("Entry [" + name + "] has count " + names.get(name));
		}
		
	}
}
