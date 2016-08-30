/**
 * File: Ch13Ex1.java
 * ------------------
 * This program re-implements a Map class for Strings. It uses two parallel arrays.
 * 
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch13Ex1 extends ConsoleProgram {
	public void run() {
		SimpleStringMap states = new SimpleStringMap();
		
		states.put("TX", "Texas");
		states.put("TN", "Tennessee");
		states.put("GA", "Georgia");
		
		println(states.get("GA"));
		
	}
}
