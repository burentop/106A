/*
 * File: Ch2Ex9.java
 * -----------------
 * This program draws a rainbow.
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Ch2Ex9 extends GraphicsProgram {
	public void run() {
		setBackground(Color.CYAN);
		
		GOval red1 = new GOval(300, 300);
		red1.setColor(Color.RED);
		add(red1, 0, 5);
		
		GOval red2 = new GOval(298, 298);
		red2.setColor(Color.RED);
		add(red2, 1, 7);
		
		GOval red3 = new GOval(296, 296);
		red3.setColor(Color.RED);
		add(red3, 2, 8);
		
		GOval red4 = new GOval(294, 294);
		red4.setColor(Color.RED);
		add(red4, 3, 9);
		
		GOval orange1 = new GOval(292, 292);
		orange1.setColor(Color.ORANGE);
		add(orange1, 4, 10);
		
		GOval orange2 = new GOval(290, 290);
		orange2.setColor(Color.ORANGE);
		add(orange2, 5, 11);
		
		GOval orange3 = new GOval(288, 288);
		orange3.setColor(Color.ORANGE);
		add(orange3, 6, 12);
		
		GOval orange4 = new GOval(286, 286);
		orange4.setColor(Color.ORANGE);
		add(orange4, 7, 13);
		
		GOval yellow1 = new GOval(284, 284);
		yellow1.setColor(Color.YELLOW);
		add(yellow1, 8, 14);
		
		GOval yellow2 = new GOval(282, 282);
		yellow2.setColor(Color.YELLOW);
		add(yellow2, 9, 15);
		
		GOval yellow3 = new GOval(280, 280);
		yellow3.setColor(Color.YELLOW);
		add(yellow3, 10, 16);
		
		GOval yellow4 = new GOval(278, 278);
		yellow4.setColor(Color.YELLOW);
		add(yellow4, 11, 17);
		
		GOval green1 = new GOval(276, 276);
		green1.setColor(Color.GREEN);
		add(green1, 12, 18);
		
		GOval green2 = new GOval(274, 274);
		green2.setColor(Color.GREEN);
		add(green2, 13, 19);
		
		GOval green3 = new GOval(272, 272);
		green3.setColor(Color.GREEN);
		add(green3, 14, 20);
		
		GOval green4 = new GOval(270, 270);
		green4.setColor(Color.GREEN);
		add(green4, 15, 21);
		
		GOval blue1 = new GOval(268, 268);
		blue1.setColor(Color.BLUE);
		add(blue1, 16, 22);
		
		GOval blue2 = new GOval(266, 266);
		blue2.setColor(Color.BLUE);
		add(blue2, 17, 23);
		
		GOval blue3 = new GOval(264, 264);
		blue3.setColor(Color.BLUE);
		add(blue3, 18, 24);
		
		GOval blue4 = new GOval(262, 262);
		blue4.setColor(Color.BLUE);
		add(blue4, 19, 25);
		
		GOval magenta1 = new GOval(260, 260);
		magenta1.setColor(Color.MAGENTA);
		add(magenta1, 20, 26);
		
		GOval magenta2 = new GOval(258, 258);
		magenta2.setColor(Color.MAGENTA);
		add(magenta2, 21, 27);
		
		GOval magenta3 = new GOval(256, 256);
		magenta3.setColor(Color.MAGENTA);
		add(magenta3, 22, 28);
		
		GOval magenta4 = new GOval(254, 254);
		magenta4.setColor(Color.MAGENTA);
		add(magenta4, 23, 29);
	}
}
