/*
 * File: Ch5Ex5.java
 * -----------------
 * This program draws a series of rings, based on constants.
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Ch5Ex5 extends GraphicsProgram {
	
	public void run() {
		double start_x = (getWidth()) / 2;
		double start_y = (getHeight()) / 2;
		double xy_increment = (OUTER_RADIUS - INNER_RADIUS) / N_CIRCLES;
		
		for (int i = 0; i < N_CIRCLES; i++) {
			if (i % 2 == 0) {
				add(createFilledCircle(start_x, start_y, OUTER_RADIUS - (i * xy_increment), Color.RED));
			} else {
				add(createFilledCircle(start_x, start_y, OUTER_RADIUS - (i * xy_increment), Color.WHITE));
			}
		}
	}
	
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
	
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
}
