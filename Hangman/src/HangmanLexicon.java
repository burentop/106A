/**
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that will be reimplemented for Part III.
 * @author Brent Perry
 *
 */

import acm.util.*;
import java.io.*;
import java.util.ArrayList;

public class HangmanLexicon {
	
/** Constructor */
	public HangmanLexicon() throws IOException {
		wordList = new ArrayList<>();
		BufferedReader rd = null;
		try {
			rd = new BufferedReader(new FileReader("/Users/perramount/Desktop/Java/106A/Hangman/HangmanLexicon.txt"));
		} catch (IOException ex) {
			System.out.println("File not found.");
		}
		String line = "";
		while (line != null) {
			try {
				line = rd.readLine();
				wordList.add(line);
			} catch (IOException ex) {
				rd.close();
				break;
			}
			
		}
		try {
			rd.close();
		} catch (IOException e) {
			System.out.println("oops");
		}
		
	}

/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return wordList.size();
	}
	
/** Returns the word at the specified index. */
	public String getWord(int index) {
		return wordList.get(index);
	}
	
	private ArrayList<String> wordList;
}
