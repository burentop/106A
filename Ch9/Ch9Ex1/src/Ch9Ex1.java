/**
 * File: Ch9Ex1.java
 * -----------------
 * This program displays an image, along with the citation.
 * @author perramount
 *
 */

import acm.graphics.*;
import acm.program.*;

public class Ch9Ex1 extends GraphicsProgram {
	public void run() {
		add(new GImage("style.jpeg"));
	}
	
	public static final int APPLICATION_WIDTH = 320;
	public static final int APPLICATION_HEIGHT = 320;
}
