/*
 * File: Ch4Ex16.java
 * ------------------
 * This program places a GLabel to the right of the canvas, and then
 * gradually scrolls it left, until it disappears again.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch4Ex16 extends GraphicsProgram {
	public void run() {
		GLabel headline = new GLabel("DEWEY DEFEATS TRUMAN", getWidth() + 1, getHeight() / 2);
		add(headline);
		for (int i = 0; i < N_STEPS; i++) {
			headline.move(-1, 0);
			pause(PAUSE_TIME);
		}
	}
	
	/* Private constants */
	private static final int N_STEPS = 1000;
	private static final int PAUSE_TIME = 20;
}
