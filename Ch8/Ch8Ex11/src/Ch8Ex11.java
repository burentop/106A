/**
 * File: Ch8Ex11.java
 * ------------------
 * This program uses a "Caesar cipher" to encrypt a string.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch8Ex11 extends ConsoleProgram {
	public void run() {
		println("This program encodes a message using a Caesar cipher.");
		int shift = readInt("Enter the number of character positions to shift: ");
		String str = readLine("Enter a message: ");
		println("Encoded message: " + encodeCaesarCipher(str, shift));
	}
	
	private String encodeCaesarCipher(String str, int shift) {
		String encrypted = "";
		int key = 0;
		if (shift < 0) {
			key = 26 - (-shift % 26);
		} else {
			key = shift;
		}
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (Character.isUpperCase(str.charAt(i))) {
					encrypted += (char) (((str.charAt(i) - 'A' + key) % 26) + 'A');
				} else {
					encrypted += (char) (((str.charAt(i) - 'a' + key) % 26) + 'a');
				}
				
			} else {
				encrypted += str.charAt(i);
			}
			
		}
		return encrypted;
	}
	
	
}
