/*
 * File: Ch4Ex14.java
 * ------------------
 * This program draws a checkerboard, complete with checkers.
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Ch4Ex14 extends GraphicsProgram {
	public void run() {
		double sqSize = (double) getHeight() / N_ROWS;
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLUMNS; j++) {
				double x = j * sqSize;
				double y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFilled((i + j) % 2 != 0);
				sq.setFillColor(Color.GRAY);
				add(sq);
				
				/* Create red/black checkers */
				GOval red = new GOval(sqSize * .8, sqSize * .8);
				red.setFilled(true);
				red.setFillColor(Color.RED);
				
				GOval black = new GOval(sqSize * .8, sqSize * .8);
				black.setFilled(true);
				black.setFillColor(Color.BLACK);
				
				if (((i + j) % 2 != 0) && (i < 3)) {
					add(red, x + (sqSize * .1), y + (sqSize * .1));
				} else if (((i + j) % 2 != 0) && (i > 4)) {
					add(black, x + (sqSize * .1), y + (sqSize * .1));
				}
			}
		}
	}
	
	/* Private constants */
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
}
