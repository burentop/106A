/*
 * File: Ch2Ex4.java
 * -----------------
 * This program uses the graphics library to draw a snowman.
 */

import acm.program.*;
import acm.graphics.*;

public class Ch2Ex4 extends GraphicsProgram {
	public void run() {
		/* Draw the head */
		add(new GOval(25, 25), 40, 10);
		/* Draw the eyes */
		/* Draw left eye */
		add(new GOval(4, 4), 47, 15);
		/* Draw right eye */
		add(new GOval(4, 4), 55, 15);
		/* Draw the mouth */
		add(new GOval(6, 6), 50, 25);
		/* Add GLabel for the nose */
		add(new GLabel("v"), 50, 25);
		/* Draw the mid-section */
		add(new GOval(40, 40), 33, 35);
		/* Draw top button */
		add(new GRect(5, 5), 50, 42);
		/* Draw middle button */
		add(new GRect(5, 5), 50, 52);
		/* Draw lower button */
		add(new GRect(5, 5), 50, 62);
		/* Draw the lower body */
		add(new GOval(70, 70), 18, 75);
	}
}
