/*
 * File: Ch5Ex8.java
 * -----------------
 * This program draws a train, with a specified number of each car.
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Ch5Ex8 extends GraphicsProgram {
	public void run() {
		double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
		double x = ((getWidth() - trainWidth) / 2) + 40;
		double y = getHeight();
		double dx = CAR_WIDTH + CONNECTOR;
		drawEngine(x, y);
		drawBoxcar(x + dx, y, Color.GREEN);
		drawCaboose(x + 2 * dx, y);
	}
	
	private void drawBoxcar(double x, double y, Color color) {
		drawCarFrame(x, y, color);
		double xRight = x + CONNECTOR + CAR_WIDTH / 2;
		double xLeft = xRight - DOOR_WIDTH;
		double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	private void drawEngine(double x, double y) {
		drawCarFrame(x, y, Color.BLACK);
		drawSmokestack(x, y);
		drawCab(x, y);
		drawCowcatcher(x, y);
	}
	
	private void drawCaboose(double x, double y) {
		drawCarFrame(x, y, Color.RED);
		double xCupola = x + CONNECTOR + ((CAR_WIDTH - CUPOLA_WIDTH) / 2);
		double yCupola = y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
		GRect caboose = new GRect(xCupola, yCupola, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		caboose.setFilled(true);
		caboose.setFillColor(Color.RED);
		add(caboose);
	}
	
	private void drawCarFrame(double x, double y, Color color) {
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		double top = y0 - CAR_HEIGHT;
		add(new GLine(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
		drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		GRect r = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
		r.setFilled(true);
		r.setFillColor(color);
		add(r);
	}
	
	private void drawWheel(double x, double y) {
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x - r, y - r, 2 * r, 2 * r);
		wheel.setFilled(true);
		wheel.setFillColor(Color.GRAY);
		add(wheel);
	}
	
	private void drawSmokestack(double x, double y) {
		double xSmoke = x + CONNECTOR + SMOKESTACK_WIDTH;
		double ySmoke = y - WHEEL_INSET - CAR_HEIGHT;
		GRect smokestack = new GRect(xSmoke, ySmoke, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		smokestack.setFilled(true);
		smokestack.setFillColor(Color.BLACK);
		add(smokestack);
	}
	
	private void drawCab(double x, double y) {
		double xCab = x + CONNECTOR + (CAR_WIDTH - CAB_WIDTH);
		double yCab = y - WHEEL_INSET - CAR_HEIGHT;
		GRect cab = new GRect(xCab, yCab, CAB_WIDTH, CAB_HEIGHT);
		cab.setFilled(true);
		cab.setFillColor(Color.BLACK);
		add(cab);
	}
	
	private void drawCowcatcher(double x, double y) {
		double x1 = x + (CONNECTOR / 2);
		double x2 = x + CONNECTOR;
		double y1 = y - CAR_BASELINE;
		double y2 = y - CAR_BASELINE - (CAR_HEIGHT / 2);
		add(new GLine(x, y1, x2, y2));
		add(new GLine(x1, y1, x2, y2));
	}
	
	/* Dimensions of the frame of a train car */
	private static final double CAR_WIDTH = 75;
	private static final double CAR_HEIGHT = 36;
	
	/* Distance from the bottom of a train car to the track below it */
	private static final double CAR_BASELINE = 10;
	
	/* Width of the connector, which overlaps between successive cars */
	private static final double CONNECTOR = 6;
	
	/* Radius of the wheels on each car */
	private static final double WHEEL_RADIUS = 8;
	
	/* Distance from the edge of the frame to the center of the wheel */
	private static final double WHEEL_INSET = 16;
	
	/* Dimensions of the cab on the engine */
	private static final double CAB_WIDTH = 35;
	private static final double CAB_HEIGHT = 8;
	
	/* Dimensions of the smokestack and its distance from the front */
	private static final double SMOKESTACK_WIDTH = 8;
	private static final double SMOKESTACK_HEIGHT = 8;
	private static final double SMOKESTACK_INSET = 8;
	
	/* Dimensions of the door panels on the boxcar */
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;
	
	/* Dimensions of the cupola on the caboose */
	private static final double CUPOLA_WIDTH = 35;
	private static final double CUPOLA_HEIGHT = 8;
}
