/**
 * File: Ch9Ex3.java
 * -----------------
 * This program adds GLabels to the canvas, which contain the names of colors.
 * The background color of each label is set to a random color that is not the
 * color written in the label.
 * @author Brent Perry
 *
 */

import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.Color;

import acm.graphics.*;

public class Ch9Ex3 extends GraphicsProgram {
	public void run() {
		GLabel red = new GLabel("RED");
		GLabel orange = new GLabel("ORANGE");
		GLabel yellow = new GLabel("YELLOW");
		GLabel green = new GLabel("GREEN");
		GLabel cyan = new GLabel("CYAN");
		GLabel blue = new GLabel("BLUE");
		GLabel magenta = new GLabel("MAGENTA");
		
		red.setColor(Color.BLACK);
		
		
	}
	
	private void setRandomColor(String label) {
		while (true) {
			int color = rgen.nextInt(0, 6);
			if (Color.label != color) {
				
			}
		}
	}
	
	private enum Colors {
		red, orange, yellow, green, cyan, blue, magenta
	}

	
	private String colorLookup(int color) {
		switch(color) {
		case 0:
			return "Color.RED";
		case 1:
			return "Color.ORANGE";
		case 2:
			return "Color.YELLOW";
		case 3:
			return "Color.GREEN";
		case 4:
			return "Color.CYAN";
		case 5:
			return "Color.BLUE";
		default:
			return "Color.MAGENTA";
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
