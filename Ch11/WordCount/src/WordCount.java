/**
 * File: WordCount.java
 * --------------------
 * This program reads a text file, and then prints out a summary of the number of
 * lines, words and characters.
 * 
 * @author Brent Perry
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;

public class WordCount extends ConsoleProgram {
	public void run() {
		BufferedReader rd = null;
		int lines = 0;
		int words = 0;
		int chars = 0;
		try {
			rd = new BufferedReader(new FileReader("/Users/perramount/Desktop/Java/106A/Ch11/WordCount/lear.txt"));
		} catch (IOException ex) {
			System.out.println("File not found.");
		}
		String line = "";
		while (line != null) {
			try {
				line = rd.readLine();
				if (line == null) break;
				lines += 1;
				chars += 1;
				for (int i = 1; i < line.length(); i++) {
					char letter = line.charAt(i);
					char prevLetter = line.charAt(i - 1);
					if (Character.isLetterOrDigit(letter)) chars += 1;
					if (!Character.isLetterOrDigit(letter) && Character.isLetterOrDigit(prevLetter)) {
						words += 1;
					}
				}
			} catch (IOException ex) {
				break;
			}
			
		}
		try {
			rd.close();
		} catch (IOException e) {
			System.out.println("oops");
		}
		
		println("File: lear.txt");
		println("Lines: " + lines);
		println("Words: " + words);
		println("Chars: " + chars);
		
	}
}
