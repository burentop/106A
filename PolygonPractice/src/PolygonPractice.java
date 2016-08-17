import acm.graphics.*;
import acm.program.*;

public class PolygonPractice extends GraphicsProgram {
	public void run() {
		GPolygon trapezoid = new GPolygon();
		trapezoid.addVertex(-30, 12.5);
		trapezoid.addEdge(35, 0);
		trapezoid.addEdge(25, -25);
		trapezoid.addEdge(-35, 0);
		
		add(trapezoid, 75, 75);
		
		
		GPolygon pentagon = new GPolygon();
		pentagon.addVertex(-25, -7.5);
		pentagon.addEdge(12, 25);
		pentagon.addEdge(25, 0);
		pentagon.addEdge(12, -25);
		pentagon.addEdge(-25, -15);
	
		add(pentagon, 175, 175);
		
		
		GPolygon cross = new GPolygon();
		cross.addVertex(-22.5, -7.5);
		cross.addEdge(0, 15);
		cross.addEdge(15, 0);
		cross.addEdge(0, 15);
		cross.addEdge(15, 0);
		cross.addEdge(0, -15);
		cross.addEdge(15, 0);
		cross.addEdge(0, -15);
		cross.addEdge(-15, 0);
		cross.addEdge(0, -15);
		cross.addEdge(-15, 0);
		cross.addEdge(0, 15);
		
		add(cross, 175, 20);
	}
}
