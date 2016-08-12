/*
 * File: Ch5Ex6.java
 * -----------------
 * This program draws a traffic stoplight.
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Ch5Ex6 extends GraphicsProgram {
	public void run() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double fx = cx - FRAME_WIDTH / 2;
		double fy = cy - FRAME_HEIGHT / 2;
		double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
		add(createFilledRect(fx, fy, FRAME_WIDTH, FRAME_HEIGHT, Color.GRAY));
		add(createFilledCircle(cx, cy - dy, LAMP_RADIUS, Color.RED));
		add(createFilledCircle(cx, cy, LAMP_RADIUS, Color.YELLOW));
		add(createFilledCircle(cx, cy + dy, LAMP_RADIUS, Color.GREEN));
		
	}
	
	/* Creates the frame for the stoplight */
	private GRect createFilledRect(double x, double y, double width, double height, Color color) {
		GRect frame = new GRect(x, y, width, height);
		frame.setFilled(true);
		frame.setColor(color);
		return frame;
	}
	
	/* Creates the lights for the stoplight */
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
	
	/* Private constants */
	private static final double FRAME_WIDTH = 50;
	private static final double FRAME_HEIGHT = 100;
	private static final double LAMP_RADIUS = 10;
}
