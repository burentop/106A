/*
 * File: Ch5Ex9.java
 * -----------------
 * This program draws the outline of a house.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch5Ex9 extends GraphicsProgram {
	public void run() {
		double start_x = 50;
		double start_y = 90;
		drawFrame(start_x, start_y);
		drawDoor(start_x, start_y);
		drawRoof(start_x, start_y);
		double top_left_window_x = start_x + ((FRAME_WIDTH / 30) * 5);
		double top_window_y = start_y + (FRAME_HEIGHT * .1);
		double top_right_window_x = start_x + ((FRAME_WIDTH / 30) * 21);
		double bottom_window_y = start_y + (FRAME_HEIGHT * .6);
		double bottom_left_window_x = start_x + ((FRAME_WIDTH / 30) * 4);
		double bottom_right_window_x = start_x + ((FRAME_WIDTH / 30) * 20);
		drawWindow(2, 2, top_left_window_x, top_window_y);
		drawWindow(2, 2, top_right_window_x, top_window_y);
		drawWindow(3, 2, bottom_left_window_x, bottom_window_y);
		drawWindow(3, 2, bottom_right_window_x, bottom_window_y);
	}
	
	private void drawFrame(double x, double y) {
		add(new GRect(x, y, FRAME_WIDTH, FRAME_HEIGHT));
	}
	
	private void drawDoor(double x, double y) {
		double start_x = x + ((FRAME_WIDTH / 2) - (DOOR_WIDTH / 2));
		add(new GRect(start_x, y + (FRAME_HEIGHT - DOOR_HEIGHT), DOOR_WIDTH, DOOR_HEIGHT));
		add(new GOval(start_x + (DOOR_WIDTH * .75), y + (FRAME_HEIGHT - (DOOR_HEIGHT / 2)), DOOR_WIDTH * .1, DOOR_WIDTH * .1));
	}
	
	private void drawRoof(double x, double y) {
		GPolygon roof = new GPolygon();
		roof.addVertex(-(FRAME_WIDTH / 2), 0);
		roof.addVertex(0, -(FRAME_HEIGHT * .3));
		roof.addVertex(FRAME_WIDTH / 2, 0);
		add(roof, x + FRAME_WIDTH / 2, y);
	}
	
	private void drawWindow(int panes_wide, int panes_tall, double x, double y) {
		for(int i = 0; i < panes_tall; i++) {
			for(int j = 0; j < panes_wide; j++) {
				drawPane(x + (j * PANE_WIDTH), y + (i * PANE_HEIGHT));
			}
		}
	}
	
	private void drawPane(double x, double y) {
		add(new GRect(x, y, PANE_WIDTH, PANE_HEIGHT));
	}
	
	/* Variables for window panel dimensions */
	private static final double PANE_WIDTH = 20;
	private static final double PANE_HEIGHT = 30;
	
	/* Variables for door dimensions */
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 70;
	
	/* Variables for house frame dimensions */
	private static final double FRAME_WIDTH = 300;
	private static final double FRAME_HEIGHT = 200;
}
