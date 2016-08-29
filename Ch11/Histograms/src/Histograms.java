/**
 * File: Histograms.java
 * ---------------------
 * This program reads numeric scores from a file, and then displays a
 * histogram of those scores.
 * 
 * @author Brent Perry
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;

public class Histograms extends ConsoleProgram {
	public void run() {
		try {
			rd = new BufferedReader(new FileReader("/Users/perramount/Desktop/Java/106A/Ch11/Histograms/MidtermScores.txt"));
		} catch (IOException ex) {
			System.out.println("File not found.");
		}
		String score = "";
		while (score != null) {
			try {
				score = rd.readLine();
				if (score == null) break;
				int numScore = Integer.parseInt(score);
				assignScore(numScore);
			} catch (IOException ex) {
				break;
			}
			
		}
		try {
			rd.close();
		} catch (IOException e) {
			System.out.println("oops");
		}
		
		println("00-09: " + drawStars(nine));
		println("10-19: " + drawStars(nineteen));
		println("20-29: " + drawStars(twenty9));
		println("30-39: " + drawStars(thirty9));
		println("40-49: " + drawStars(forty9));
		println("50-59: " + drawStars(fifty9));
		println("60-69: " + drawStars(sixty9));
		println("70-79: " + drawStars(seventy9));
		println("80-89: " + drawStars(eighty9));
		println("90-99: " + drawStars(ninety9));
		println("  100: " + drawStars(hundred));
	}
	
	private void assignScore(int score) {
		if (score < 10) nine++;
		else if (score < 20) nineteen++;
		else if (score < 30) twenty9++;
		else if (score < 40) thirty9++;
		else if (score < 50) forty9++;
		else if (score < 60) fifty9++;
		else if (score < 70) sixty9++;
		else if (score < 80) seventy9++;
		else if (score < 90) eighty9++;
		else if (score < 100) ninety9++;
		else hundred++;
	}
	
	private String drawStars(int category) {
		String stars = "";
		for (int i = 0; i < category; i++) {
			stars += "*";
		}
		return stars;
	}
	
	private BufferedReader rd;
	private int nine = 0;
	private int nineteen = 0;
	private int twenty9 = 0;
	private int thirty9 = 0;
	private int forty9 = 0;
	private int fifty9 = 9;
	private int sixty9 = 0;
	private int seventy9 = 0;
	private int eighty9 = 0;
	private int ninety9 = 0;
	private int hundred = 0;
}
