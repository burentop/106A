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
		
		GOval blue2 = new GOval(40, 40);
		blue2.setColor(Color.BLUE);
		GOval yellow2= new GOval(40, 40);
		yellow2.setColor(Color.YELLOW);
		GOval black2 = new GOval(40, 40);
		black2.setColor(Color.BLACK);
		GOval green2 = new GOval(40, 40);
		green2.setColor(Color.GREEN);
		GOval red2 = new GOval(40, 40);
		red2.setColor(Color.RED);
		
		GOval blue3 = new GOval(40, 40);
		blue3.setColor(Color.BLUE);
		GOval yellow3 = new GOval(40, 40);
		yellow3.setColor(Color.YELLOW);
		GOval black3 = new GOval(40, 40);
		black3.setColor(Color.BLACK);
		GOval green3 = new GOval(40, 40);
		green3.setColor(Color.GREEN);
		GOval red3 = new GOval(40, 40);
		red3.setColor(Color.RED);
		
		add(blue, 5, 5);
		add(blue2, 6, 6);
		add(blue3, 7, 7);
		add(black, 55, 5);
		add(black2, 56, 6);
		add(black3, 57, 7);
		add(red, 105, 5);
		add(red2, 106, 6);
		add(red3, 107, 7);
		add(yellow, 30, 27);
		add(yellow2, 31, 28);
		add(yellow3, 32, 29);
		add(green, 80, 27);
		add(green2, 81, 28);
		add(green3, 82, 29);
	}
}
