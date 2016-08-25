/**
 * File: Breakout.java
 * -------------------
 * This program emulates the classic game, Breakout!
 * @author perramount
 *
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {
	
	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;
	
	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;
	
	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;
	
	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;
	
	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;
	
	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;
	
	/** Separation between bricks */
	private static final int BRICK_SEP = 4;
	
	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;
	
	/** Height of a brick */
	private static final int BRICK_HEIGHT = 10;
	
	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;
	
	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;
	
	/** Number of turns */
	private static final int NTURNS = 3;
	
	public void run() {
		gameSetup();
		gamePlay();
		}
	
	private void gameSetup() {
		for (int i = 0; i < NBRICK_ROWS; i++) {
			for (int j = 0; j < NBRICKS_PER_ROW; j++) {
				addBrick(i, j);
			}
		}
		addPaddle();
		lives = NTURNS;
	}
	
	private void gamePlay() {
		addBall();
		moveBall();
	}
	
	private void addBrick(int row, int column) {
		GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
		add(brick, 2 + ((BRICK_WIDTH + BRICK_SEP) * column), BRICK_Y_OFFSET + ((BRICK_HEIGHT + BRICK_SEP) * row));
		brick.setFilled(true);
		if (row < 2) brick.setFillColor(Color.RED);
		else if (row < 4) brick.setFillColor(Color.ORANGE);
		else if (row < 6) brick.setFillColor(Color.YELLOW);
		else if (row < 8) brick.setFillColor(Color.GREEN);
		else brick.setFillColor(Color.CYAN);
	}
	
	public void addPaddle() {
		paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		paddle.setFillColor(Color.BLACK);
		add(paddle, getWidth() / 2, getHeight() - PADDLE_Y_OFFSET);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		if (e.getX() < getWidth() - PADDLE_WIDTH) {
			paddle.setLocation(e.getX(), getHeight() - PADDLE_Y_OFFSET);
		}
	}
	
	
	private void addBall() {
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		ball.setFillColor(Color.BLACK);
		add(ball, (getWidth() / 2) - BALL_RADIUS, (getHeight() / 2) - BALL_RADIUS);
	}
	
	private void moveBall() {
		int numBalls = NBRICKS_PER_ROW * NBRICK_ROWS;
		int consecutiveHits = 0;
		vy = 3.0;
		vx = rgen.nextDouble(1.0, 3.0);
		int pause = 15;
		if (rgen.nextBoolean(0.5)) vx = -vx;
		while (lives > 0) {
			if (numBalls < 1) {
				winner();
				break;
			}
			
			if (consecutiveHits > 3) pause = 10;
			ball.move(vx, vy);
			ball.pause(pause);
			if ((ball.getX() < 0) || (ball.getX() + (2 * BALL_RADIUS) > getWidth())) {
				vx = -vx;
			} else if (ball.getY() < 0) {
				vy = -vy;
			} else if (ball.getY() > getHeight()) {
				lives--;
				gamePlay();
			}
			GObject collider = getCollidingObject();
			if (collider == paddle) {
				vy = -vy;
				consecutiveHits++;
			} else if (collider != null){
				vy = -vy;
				remove(collider);
				numBalls--;
			}
		}
		loser();
	}
	
	private GObject getCollidingObject() {
		double x = ball.getX();
		double xRight = ball.getX() + 2 * BALL_RADIUS;
		double y = ball.getY();
		double yBottom = ball.getY() + 2 * BALL_RADIUS;
		if (getElementAt(x, yBottom) != null) {
			return getElementAt(x, yBottom);
		} else if (getElementAt(xRight, yBottom) != null) {
			return getElementAt(xRight, yBottom);
		} else if (getElementAt(x, y) != null) {
			return getElementAt(x, y);
		} else {
			return getElementAt(xRight, y);
		}
	}
	
	private void winner() {
		GLabel winningMessage = new GLabel("YOU WON!!");
		winningMessage.setColor(Color.BLUE);
		winningMessage.setFont("Font.SERIF-bold-24");
		add(winningMessage, (getWidth() - winningMessage.getWidth()) / 2, getHeight() / 2);
	}
	
	private void loser() {
		GLabel losingMessage = new GLabel("YOU LOSE!!");
		losingMessage.setColor(Color.RED);
		losingMessage.setFont("Font.SERIF-bold-24");
		add(losingMessage, (getWidth() - losingMessage.getWidth()) / 2, getHeight() / 2);
	}
	
	private GRect paddle;
	private GOval ball;
	private int lives;
	private double vx, vy;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
