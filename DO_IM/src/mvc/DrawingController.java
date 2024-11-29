package mvc;

import java.awt.Color;

import composite.SremBanatBacka;

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
		
		Point srem = new Point(20,20,Color.RED);
		Point banat = new Point(30,20,Color.RED);
		Point backa = new Point(25,12,Color.RED);
		
		SremBanatBacka sbb = new SremBanatBacka();
		sbb.add(srem);
		sbb.add(banat);
		sbb.add(backa);
		model.addShape(sbb);
		
		frame.repaint();
	}
	
}
