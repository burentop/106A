/**
 * File: Ch9Ex2.java
 * -----------------
 * This program draws a filled square, and then changes the color every second.
 * @author Brent Perry
 *
 */

import acm.program.*;
import acm.util.*;
import java.awt.Color;
import acm.graphics.*;

public class Ch9Ex2 extends GraphicsProgram {
	public void run() {
		GRect square = new GRect(WIDTH, WIDTH);
		square.setFilled(true);
		square.setFillColor(Color.BLACK);
		add(square, getWidth() / 2, getHeight() / 2);
		
		while(true) {
			square.setFillColor(rgen.nextColor());
			pause(1000);
		}
	}
	
	private static final int WIDTH = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
