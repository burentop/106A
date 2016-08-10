/*
 * File: Ch2Ex5.java
 * -----------------
 * This program uses acm.graphics to draw a house.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch2Ex5 extends GraphicsProgram {
	
	/* Variables used to define house dimensions */
	private static final int HOUSE_WIDTH = 300;
	private static final int HOUSE_HEIGHT = 150;
	private static final int START_X = 5;
	private static final int START_Y = 50;
	
	public void run() {
		add(new GRect(HOUSE_WIDTH, HOUSE_HEIGHT), START_X, START_Y);
		add(new GRect(HOUSE_WIDTH / 5, HOUSE_WIDTH / 5), START_X + (HOUSE_WIDTH / 10), START_Y + (HOUSE_WIDTH / 10));
		add(new GRect(HOUSE_WIDTH / 5, HOUSE_WIDTH / 5), START_X + (HOUSE_WIDTH * .7), START_Y + (HOUSE_WIDTH / 10));
		add(new GRect(HOUSE_WIDTH / 5, HOUSE_HEIGHT * .6), START_X + (HOUSE_WIDTH * .4), START_Y + (HOUSE_HEIGHT * .4));
		add(new GOval(HOUSE_HEIGHT * .08, HOUSE_HEIGHT * .08), START_X + (HOUSE_WIDTH * .55), START_Y + (HOUSE_HEIGHT * .7));
		GPolygon triangle = new GPolygon();
		triangle.addVertex(-(HOUSE_WIDTH / 2), 0);
		triangle.addVertex(0, -(HOUSE_HEIGHT * .3));
		triangle.addVertex(HOUSE_WIDTH / 2, 0);
		add(triangle, START_X + (HOUSE_WIDTH / 2), START_Y);
	}
}
