/*
 * File: Ch4Ex12.java
 * ------------------
 * This program prints a calendar, based on constants for days in the month, 
 * starting day of the month, and the size of each day square.
 */

import acm.graphics.*;
import acm.program.*;

public class Ch4Ex12 extends GraphicsProgram {
	
	/* Number of days in the month */
	private static final int DAYS_IN_MONTH = 31;
	
	/* The day of the week on which the month starts */
	/* (Sunday = 0, Monday = 1, etc */
	private static final int DAY_MONTH_STARTS = 4;
	
	/* The pixel width of a day square */
	private static final int DAY_WIDTH = 40;
	
	/* The pixel height of a day square */
	private static final int DAY_HEIGHT = 30;
	
	public void run() {
		int day = 1;
		for (int i = 0; i <= ((DAYS_IN_MONTH + DAY_MONTH_STARTS) / 7); i++) {
			for (int j = 0; j < 7; j++) {
				add (new GRect(DAY_WIDTH, DAY_HEIGHT), j * DAY_WIDTH, i * DAY_HEIGHT);
				if ((i > 0 || j > DAY_MONTH_STARTS) && day <= DAYS_IN_MONTH) {
					add (new GLabel("" + day), (j * DAY_WIDTH) + 1, (i * DAY_HEIGHT) + (DAY_HEIGHT * 0.45));
					day++;
				}
			}
		}
	}
}
