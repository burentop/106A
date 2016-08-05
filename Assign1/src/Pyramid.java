import acm.graphics.*;
import acm.program.*;
public class Pyramid extends GraphicsProgram {
    public void run() {
        final int BRICK_WIDTH = 30;
        final int BRICK_HEIGHT = 12;
        final int BRICKS_IN_BASE = 14;
        int start_x_position = getWidth();
        int start_y_position = getHeight();
        
        for (int j = BRICKS_IN_BASE; j > 0; j--) {
        	for (int i = 0; i < j; i++) {
                GRect rect = new GRect((start_x_position + ((BRICKS_IN_BASE - j) * (BRICK_WIDTH / 2))) + (i * BRICK_WIDTH), start_y_position + (j * BRICK_HEIGHT), BRICK_WIDTH, BRICK_HEIGHT);
                add(rect);
            }
        }
        
        
    }
    
   
}
