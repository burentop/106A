import java.awt.Color;

import acm.graphics.*;
import acm.program.*;


public class Target extends GraphicsProgram {
	public void run() {
		GOval big_oval = new GOval(getWidth() / 2, getHeight() / 2, 144, 144);
		big_oval.setColor(Color.RED);
		big_oval.setFilled(true);
		big_oval.setFillColor(Color.RED);
		add(big_oval);
		
		GOval med_oval = new GOval((getWidth() / 2) + 25, (getHeight() / 2) + 25, 94, 94);
		med_oval.setColor(Color.WHITE);
		med_oval.setFilled(true);
		med_oval.setFillColor(Color.WHITE);
		add(med_oval);
		
		GOval sm_oval = new GOval((getWidth() / 2) + 50, (getHeight() / 2) + 50, 43, 43);
		sm_oval.setColor(Color.RED);
		sm_oval.setFilled(true);
		sm_oval.setFillColor(Color.RED);
		add(sm_oval);
	}
}
