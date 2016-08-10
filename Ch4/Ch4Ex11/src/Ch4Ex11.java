/*
 * File: Ch4Ex11.java
 * ------------------
 * This program draws a checkerboard using nested loops.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch4Ex11 extends GraphicsProgram {
	
	/* Variables to hold square width, circle width, and board size */
	private static final int SQUARE_SIDE = 40;
	private static final int CIRCLE_WIDTH = 30;
	private static final int BOARD_SIZE = 8;
	
	public void run() {
		/* Add loop to add other rows */
		for (int j = 0; j < BOARD_SIZE; j++) {
			/* Add loop to draw 1 row */
			for (int i = 0; i < BOARD_SIZE; i++) {
				if ((i + j) % 2 == 0) {
					/* Draw square */
					add (new GRect(SQUARE_SIDE, SQUARE_SIDE), i * SQUARE_SIDE, j * SQUARE_SIDE);
				} else {
					/* Draw square with circle inside */
					add (new GRect(SQUARE_SIDE, SQUARE_SIDE), i * SQUARE_SIDE, j * SQUARE_SIDE);
					add (new GOval(CIRCLE_WIDTH, CIRCLE_WIDTH), i * SQUARE_SIDE + 5, j * SQUARE_SIDE + 5);
				}
			}
		}
	}
}
