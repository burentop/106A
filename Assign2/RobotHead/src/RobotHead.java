import acm.program.*;

import java.awt.Color;

import acm.graphics.*;

/*
 * Program to print a robot head, given constants for dimensions and defined relative distance
 */

public class RobotHead extends GraphicsProgram {

	public void run() {
		final int HEAD_WIDTH = 100;
		final int HEAD_HEIGHT = 180;
		final int EYE_RADIUS = 15;
		final int MOUTH_WIDTH = 70;
		final int MOUTH_HEIGHT = 20;
		final int HEAD_START_X = getWidth() / 2;
		final int HEAD_START_Y = getHeight() / 2;
		
		// Draw head
		GRect head = new GRect(HEAD_START_X, HEAD_START_Y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setColor(Color.BLACK);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
		
		// Draw mouth
		GRect mouth = new GRect(HEAD_START_X + ((HEAD_WIDTH - MOUTH_WIDTH) / 2), HEAD_START_Y + (HEAD_HEIGHT * 0.75), MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
		
		// Draw left eye
		GOval left_eye = new GOval(HEAD_START_X + (HEAD_WIDTH / 4), HEAD_START_Y + (HEAD_HEIGHT * 0.25), EYE_RADIUS, EYE_RADIUS);
		left_eye.setFilled(true);
		left_eye.setFillColor(Color.YELLOW);
		add(left_eye);
		
		// Draw right eye
		GOval right_eye = new GOval(HEAD_START_X + (HEAD_WIDTH * 0.75) - EYE_RADIUS, HEAD_START_Y + (HEAD_HEIGHT * 0.25), EYE_RADIUS, EYE_RADIUS);
		right_eye.setFilled(true);
		right_eye.setFillColor(Color.YELLOW);
		add(right_eye);
	}
	
}
