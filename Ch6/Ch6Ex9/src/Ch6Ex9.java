/**
 * File: Ch6Ex9.java
 * -----------------
 * This program tests an instance of the LibraryRecord class.
 * @author perramount
 *
 */

import acm.program.*;

public class Ch6Ex9 extends ConsoleProgram {
	public void run() {
		LibraryRecord book1 = new LibraryRecord("Quiet", "Susan Cain", "1234-56", "Crown", 2012, true);
		LibraryRecord book2 = new LibraryRecord("Just Do Something", "Kevin DeYoung", "456-781", "Thomas Nelson", 2009);
		
		println(book1);
		println(book2);
	}
}
