/*
 * File: Ch2Ex7.java
 * -----------------
 * This program draws the 5 Olympic rings.
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Ch2Ex7 extends GraphicsProgram {
	public void run() {
		
		
		GOval blue = new GOval(40, 40);
		blue.setColor(Color.BLUE);
		GOval yellow = new GOval(40, 40);
		yellow.setColor(Color.YELLOW);
		GOval black = new GOval(40, 40);
		black.setColor(Color.BLACK);
		GOval green = new GOval(40, 40);
		green.setColor(Color.GREEN);
		GOval red = new GOval(40, 40);
		red.setColor(Color.RED);
		
		add(blue, 5, 5);
		add(black, 55, 5);
		add(red, 105, 5);
		add(yellow, 30, 27);
		add(green, 80, 27);
	}
}
