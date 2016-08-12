/*
 * File: Ch5Ex10.java
 * ------------------
 * This program draws the outline of the House of Usher
 */

import acm.graphics.*;
import acm.program.*;

public class Ch5Ex10 extends GraphicsProgram {
	public void run() {
		double start_x = 50;
		double start_y = 50 + SPIRE_HEIGHT;
		drawBigColumn(start_x, start_y);
		drawHouse(start_x + BIG_COLUMN_WIDTH, start_y + BIG_COLUMN_HEIGHT - HOUSE_HEIGHT);
		drawBigColumn(start_x + BIG_COLUMN_WIDTH + HOUSE_WIDTH, start_y);
		drawSmallColumn(start_x + HOUSE_WIDTH + (BIG_COLUMN_WIDTH * 3), start_y + BIG_COLUMN_HEIGHT - SMALL_COLUMN_HEIGHT);
		drawSmallColumn(start_x + HOUSE_WIDTH + (BIG_COLUMN_WIDTH * 4) + SMALL_COLUMN_WIDTH, start_y + BIG_COLUMN_HEIGHT - SMALL_COLUMN_HEIGHT);
		drawSmallColumn(start_x + HOUSE_WIDTH + (BIG_COLUMN_WIDTH * 5) + (SMALL_COLUMN_WIDTH * 2), start_y + BIG_COLUMN_HEIGHT - SMALL_COLUMN_HEIGHT);
		
	}
	
	private void drawBigColumn(double x, double y) {
		add(new GRect(x, y, BIG_COLUMN_WIDTH, BIG_COLUMN_HEIGHT));
		GPolygon spire = new GPolygon();
		spire.addVertex(-(BIG_COLUMN_WIDTH / 2), 0);
		spire.addVertex(0, -SPIRE_HEIGHT);
		spire.addVertex(BIG_COLUMN_WIDTH / 2, 0);
		add(spire, x + (BIG_COLUMN_WIDTH / 2), y);
	}
	
	private void drawHouse(double x, double y) {
		add(new GRect(x, y, HOUSE_WIDTH, HOUSE_HEIGHT));
		drawWindow(x + (HOUSE_WIDTH * .25) - (WINDOW_SIZE / 2), y + (HOUSE_HEIGHT / 4));
		drawWindow(x + (HOUSE_WIDTH * .75) - (WINDOW_SIZE / 2), y + (HOUSE_HEIGHT / 4));
		drawDoor(x + ((HOUSE_WIDTH - DOOR_WIDTH) / 2), y + (HOUSE_HEIGHT - DOOR_HEIGHT));
		GPolygon roof = new GPolygon();
		roof.addVertex(-(HOUSE_WIDTH / 2), 0);
		roof.addVertex(0, -(HOUSE_HEIGHT / 2));
		roof.addVertex(HOUSE_WIDTH / 2, 0);
		add(roof, x + (HOUSE_WIDTH / 2), y);
	}
	
	private void drawSmallColumn(double x, double y) {
		add(new GRect(x, y, SMALL_COLUMN_WIDTH, SMALL_COLUMN_HEIGHT));
		GPolygon spire = new GPolygon();
		spire.addVertex(-(SMALL_COLUMN_WIDTH / 2), 0);
		spire.addVertex(0, -SPIRE_HEIGHT);
		spire.addVertex(SMALL_COLUMN_WIDTH / 2, 0);
		add(spire, x + (SMALL_COLUMN_WIDTH / 2), y);
	}
	
	private void drawWindow(double x, double y) {
		add(new GOval(x, y, WINDOW_SIZE, WINDOW_SIZE));
	}
	
	private void drawDoor(double x, double y) {
		add(new GRect(x, y, DOOR_WIDTH, DOOR_HEIGHT));
		GPolygon spire = new GPolygon();
		spire.addVertex(-(DOOR_WIDTH / 2), 0);
		spire.addVertex(0, -DOOR_CANOPY_HEIGHT);
		spire.addVertex(DOOR_WIDTH / 2, 0);
		add(spire, x + (DOOR_WIDTH / 2), y);
		add(new GOval(x + (DOOR_WIDTH * .8), y + (DOOR_HEIGHT / 2), DOOR_WIDTH * .1, DOOR_WIDTH * .1));
	}
	
	/* Variables for dimenions of components */
	private static final double BIG_COLUMN_WIDTH = 100;
	private static final double BIG_COLUMN_HEIGHT = 800;
	private static final double HOUSE_WIDTH = 450;
	private static final double HOUSE_HEIGHT = 600;
	private static final double SMALL_COLUMN_WIDTH = 50;
	private static final double SMALL_COLUMN_HEIGHT = 450;
	private static final double WINDOW_SIZE = 70;
	private static final double DOOR_WIDTH = 100;
	private static final double DOOR_HEIGHT = 190;
	private static final double DOOR_CANOPY_HEIGHT = 50;
	private static final double ROOF_HEIGHT = 450;
	private static final double SPIRE_HEIGHT = 160;
}
