/*
 * File: Ch2Ex1.java
 * -----------------
 * This program displays "I love Java" on the screen.
 * It is inspired by the first program in Brian
 * Kernighan and Dennis Ritchie's classic book,
 * The C Programming Language.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch2Ex1 extends GraphicsProgram {
	public void run() {
		add(new GLabel("I love Java"), 100, 75);
		add(new GLabel("Brent"), 200, 200);
	}
}
