/*
 * File: Ch4Ex15.java
 * ------------------
 * This program draws a ball in the center of the screen, and then
 * moves it around - "bouncing" off of walls.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch4Ex15 extends GraphicsProgram {
	public void run() {
		GOval circle = new GOval(getWidth() / 2, getHeight() / 2, CIRCLE_SIZE, CIRCLE_SIZE);
		circle.setFilled(true);
		add(circle);
		double dx = (getWidth() - CIRCLE_SIZE) / N_STEPS;
		double dy = (getHeight() - CIRCLE_SIZE) / N_STEPS;
		for (int i = 0; i < N_STEPS; i++) {
			circle.move(dx, dy);
			pause(PAUSE_TIME);
		}
		
	}
	
	/* Private constants */
	private static final int N_STEPS = 1000;
	private static final int PAUSE_TIME = 20;
	private static final double CIRCLE_SIZE = 50;
}
