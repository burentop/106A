/**
 * File: Ch11Ex1.java
 * ------------------
 * This program simulates taking individual scores from 7 judges, storing them in an
 * array, and then computing/displaying the average - after discarding the highest
 * and lowest scores.
 * @author Brent Perry
 *
 */

import acm.program.*;

public class Ch11Ex1 extends ConsoleProgram {
	public void run() {
		println("Please enter the scores from each of the 7 judges.");
		scoreArray = new double[7];
		for(int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] = readDouble("? ");
		}
		double low = removeLow(scoreArray);
		double high = removeHigh(scoreArray);
		println("The average score is: " + computeAvg(scoreArray, low, high));
	}
	
	private double computeAvg(double[] array, double low, double high) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		total = total - low - high;
		return total / (array.length - 2);
	}
	
	private double removeLow(double[] array) {
		double low = 11.0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < low) low = array[i];
		}
		return low;
	}
	
	private double removeHigh(double[] array) {
		double high = -1.0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > high) high = array[i];
		}
		return high;
	}
	
	private double[] scoreArray;
}
