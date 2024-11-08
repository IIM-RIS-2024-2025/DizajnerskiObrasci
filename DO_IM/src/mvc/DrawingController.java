package mvc;

import java.awt.Color;

public class DrawingController {
	private DrawingModel model;
	private DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	public void mouseClicked(int x, int y) {
		Point p = new Point(x,y, Color.BLACK);
		model.addShape(p);
		frame.repaint();
	}
	
}
