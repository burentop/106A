/*
 * File: Ch2Ex5.java
 * -----------------
 * This program uses acm.graphics to draw a house.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch2Ex5 extends GraphicsProgram {
	public void run() {
		add(new GRect(200, 100), 5, 50);
		add(new GRect(40, 40), 25, 70);
		add(new GRect(40, 40), 145, 70);
		add(new GRect(40, 70), 85, 80);
		add(new GOval(8, 8), 110, 120);
		GPolygon triangle = new GPolygon();
		triangle.addVertex(-100, 0);
		triangle.addVertex(0, -30);
		triangle.addVertex(100, 0);
		add(triangle, 105, 50);
	}
}
