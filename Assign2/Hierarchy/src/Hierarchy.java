import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

/*
 * Draws the ACM Program Hierarchy
 */

public class Hierarchy extends GraphicsProgram {

	public void run() {
		
		final int BOX_WIDTH = 125;
		final int BOX_HEIGHT = 33;
		final int START_X = (getWidth() / 2) + 150;
		final int START_Y = getHeight() / 2;
		
		// Draw "Program" box, and label
		
		GRect program = new GRect(START_X, START_Y, BOX_WIDTH, BOX_HEIGHT);
		add(program);
		
		// Labels are centered by using the width of the box, and the "ascent" of the label
		
		GLabel program_label = new GLabel("Program");
		double program_label_x = START_X + ((program.getWidth() - program_label.getWidth()) / 2);
		double program_label_y = START_Y + ((program.getHeight() + program_label.getAscent()) / 2);
		program_label.setColor(Color.BLACK);
		add(program_label, program_label_x, program_label_y);
		
		GRect console_program = new GRect(START_X, START_Y + (BOX_HEIGHT + 25), BOX_WIDTH, BOX_HEIGHT);
		add(console_program);
		
		GRect graphics_program = new GRect(START_X - (BOX_WIDTH + 25), START_Y + (BOX_HEIGHT + 25), BOX_WIDTH, BOX_HEIGHT);
		add(graphics_program);
		
		GRect dialog_program = new GRect(START_X + (BOX_WIDTH + 25), START_Y + (BOX_HEIGHT + 25), BOX_WIDTH, BOX_HEIGHT);
		add(dialog_program);
		
		GLabel console_label = new GLabel("ConsoleProgram");
		double console_label_x = START_X + ((console_program.getWidth() - console_label.getWidth()) / 2);
		double console_label_y = (START_Y + BOX_HEIGHT + 25) + ((console_program.getHeight() + console_label.getAscent()) / 2);
		console_label.setColor(Color.BLACK);
		add(console_label, console_label_x, console_label_y);
		
		GLabel graphics_label = new GLabel("GraphicsProgram");
		double graphics_label_x = (START_X - BOX_WIDTH - 25) + ((graphics_program.getWidth() - graphics_label.getWidth()) / 2);
		double graphics_label_y = (START_Y + BOX_HEIGHT + 25) + ((console_program.getHeight() + console_label.getAscent()) / 2);
		graphics_label.setColor(Color.BLACK);
		add(graphics_label, graphics_label_x, graphics_label_y);
		
		GLabel dialog_label = new GLabel("DialogProgram");
		double dialog_label_x = (START_X + BOX_WIDTH + 25) + ((dialog_program.getWidth() - dialog_label.getWidth()) / 2);
		double dialog_label_y = (START_Y + BOX_HEIGHT + 25) + ((dialog_program.getHeight() + dialog_label.getAscent()) / 2);
		dialog_label.setColor(Color.BLACK);
		add(dialog_label, dialog_label_x, dialog_label_y);
		
		// Add lines to/from boxes
		
		GLine prog_graph = new GLine(START_X + (BOX_WIDTH / 2), START_Y + BOX_HEIGHT, (START_X - (BOX_WIDTH + 25)) + (BOX_WIDTH / 2), (START_Y + (BOX_HEIGHT + 25)));
		add(prog_graph);
		
		GLine prog_console = new GLine(START_X + (BOX_WIDTH / 2), START_Y + BOX_HEIGHT, (START_X) + (BOX_WIDTH / 2), (START_Y + (BOX_HEIGHT + 25)));
		add(prog_console);
		
		GLine prog_dialog = new GLine(START_X + (BOX_WIDTH / 2), START_Y + BOX_HEIGHT, (START_X + BOX_WIDTH + 25) + (BOX_WIDTH / 2), (START_Y + (BOX_HEIGHT + 25)));
		add(prog_dialog);
		
	}
	
}
