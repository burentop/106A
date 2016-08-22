/**
 * File: Ch8Ex20.java
 * ------------------
 * This program simulates the binding of DNA strands.
 * A and T can bind together; C and G can bind together.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex20 extends ConsoleProgram {
	public void run() {
		String shortStr = "TTGCC";
		String longStr = "TCTACGGTACGTC";
		println(findFirstMatchingPosition(shortStr, longStr));
		
		String testString = "test this phrase ";
		StringTokenizer testToken = new StringTokenizer(testString);
		println(testToken.nextToken());
		println(testToken.hasMoreTokens());
		println(testToken.nextToken());
		println(testToken.hasMoreTokens());
		println(testToken.nextToken());
		println(testToken.hasMoreTokens());
		println(testToken.nextToken());
	}
	
	private int findFirstMatchingPosition(String shortDNA, String longDNA) {
		int index = -1;
		for (int i = 0; i < longDNA.length() - shortDNA.length(); i++) {
			index = i;
			int k = i;
			for (int j = 0; j < shortDNA.length(); j++) {
				if (!isMatch(shortDNA.charAt(j), longDNA.charAt(k))) {
					index = -1;
					break;
				} else if (j == shortDNA.length() - 1) {
					return index;
				}
				k++;
			}
		}
		return index;
	}
	
	private boolean isMatch(char a, char b) {
		if (a == 'A' || a == 'T') {
			if (b == 'A' || b == 'T') {
				return true;
			}
		} else if (a == 'C' || a == 'G') {
			if (b == 'C' || b == 'G') {
				return true;
			}
		}
		return false;
	}
}
