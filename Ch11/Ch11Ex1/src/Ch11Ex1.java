/**
 * File: Ch11Ex1.java
 * ------------------
 * This program simulates taking individual scores from 7 judges, storing them in an
 * array, and then computing/displaying the average - after discarding the highest
 * and lowest scores.
 * @author Brent Perry
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import acm.program.*;

public class Ch11Ex1 extends ConsoleProgram {
	public void run() {
		println("Please enter the scores from each of the 7 judges.");
		scoreArray = new Double[7];
		for(int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] = new Double(readDouble("? "));
		}
		Arrays.sort(scoreArray);
		List<Double> scoreList = new ArrayList<Double>(Arrays.asList(scoreArray));
		scoreList.remove(0);
		scoreList.remove(scoreList.size() - 1);
		
		println("The average score is: " + mean(scoreArray));
		println("The standard deviation is: " + stdev(scoreArray));
	}
	
	private double mean(Double[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total / array.length;
	}
	
	private double stdev(Double[] array) {
		double distrMean = mean(array);
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += (distrMean - array[i]) * (distrMean - array[i]);
		}
		return Math.sqrt(total / array.length);
	}
	

	
	
	
	private Double[] scoreArray;
}
