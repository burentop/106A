import acm.graphics.*;
import acm.program.*;
public class Pyramid extends GraphicsProgram {
    public void run() {
        final int BRICK_WIDTH = 30;
        final int BRICK_HEIGHT = 12;
        final int BRICKS_IN_BASE = 14;
        int start_x_position = (getWidth() / 2) - ((BRICKS_IN_BASE / 2) * BRICK_WIDTH);
        int start_y_position = getHeight();
        
        for (int i = 0; i < BRICKS_IN_BASE; i++) {
            GRect rect = new GRect(start_x_position + (i * BRICK_WIDTH), start_y_position + (i * BRICK_HEIGHT), BRICK_WIDTH, BRICK_HEIGHT);
            add(rect);
        }
        
    }
    
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.run();
    }
    
}
