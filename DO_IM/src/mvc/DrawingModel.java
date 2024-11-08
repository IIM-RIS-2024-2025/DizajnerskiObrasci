package mvc;

import java.util.ArrayList;

public class DrawingModel {

	public ArrayList<Point> shapes = new ArrayList<Point>();
	
	public ArrayList<Point> getShapes() {
		return shapes;
	}
	
	public void addShape(Point p) {
		shapes.add(p);
	}
	
	public void removeShape(Point p) {
		shapes.remove(p);
	}
	
	public Point getShape(int index) {
		return shapes.get(index);
	}
}
