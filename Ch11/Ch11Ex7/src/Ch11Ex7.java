/**
 * File: Ch11Ex7.java
 * ------------------
 * This program plots an array of double values.
 * 
 * @author Brent Perry
 *
 */

import acm.program.*;
import acm.graphics.*;

public class Ch11Ex7 extends GraphicsProgram {
	public void run() {
		println("This program displays a line graph of Java job postings over time.");
		double[] javaJobs = {1.63, 1.73, 1.74, 1.72, 1.72, 1.63, 1.64, 1.68, 1.76, 1.69, 1.7, 1.65, 1.55};
		double minY = 1.55;
		double maxY = 1.76;
		double range = maxY - minY;
		drawLineGraph(javaJobs, range, maxY);
	}
	
	private void drawLineGraph(double[] array, double range, double max) {
		for (int i = 0; i < array.length - 1; i++) {
			GLine line = new GLine(MARGIN + ((getWidth() / array.length) * i), MARGIN + (getHeight() * ((max - array[i]) / range)), MARGIN + ((getWidth() / array.length) * (i + 1)), MARGIN + (getHeight() * ((max - array[i + 1]) / range)));
			add(line);
			GOval dot = new GOval(2, 2);
			add(dot, MARGIN + ((getWidth() / array.length) * i), MARGIN + (getHeight() * ((max - array[i]) / range)));
		}
		GOval dot = new GOval(2, 2);
		add(dot, MARGIN + ((getWidth() / array.length) * (array.length - 1)), MARGIN + (getHeight() * ((max - array[array.length - 1]) / range)));
	}
	
	private static final double MARGIN = 5.0;
}
