/**
 * File: UniqueNames.java
 * ----------------------
 * This program prompts the user for names, and then prints a list of unique names
 * (ignoring duplicates).
 * 
 * @author Brent Perry
 *
 */

import acm.program.*;
import java.util.ArrayList;

public class UniqueNames extends ConsoleProgram {
	public void run() {
		ArrayList<String> names = new ArrayList<>();
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			if (!names.contains(name)) {
				names.add(name);
			}
		}
		println("Unique name list contains:");
		for (String unique : names) {
			println(unique);
		}
	}
}
