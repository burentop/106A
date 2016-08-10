/*
 * File: Ch3Ex10.java
 * ------------------
 * This program draws a tic-tac-toe board.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch3Ex10 extends GraphicsProgram {
	/* variable to determine the board size */
	private static final int BOARD_SIZE = 300;
	
	public void run() {
		add(new GLine(0, BOARD_SIZE * .333, BOARD_SIZE, BOARD_SIZE * .333));
		add(new GLine(0, BOARD_SIZE * .666, BOARD_SIZE, BOARD_SIZE * .666));
		add(new GLine(BOARD_SIZE * .333, 0, BOARD_SIZE * .333, BOARD_SIZE));
		add(new GLine(BOARD_SIZE * .666, 0, BOARD_SIZE * .666, BOARD_SIZE));
	}
}
