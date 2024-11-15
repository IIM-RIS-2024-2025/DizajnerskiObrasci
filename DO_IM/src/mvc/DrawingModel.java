package mvc;

import java.util.ArrayList;

public class DrawingModel {

	public ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
	
	public void addShape(Shape p) {
		shapes.add(p);
	}
	
	public void removeShape(Shape p) {
		shapes.remove(p);
	}
	
	public Shape getShape(int index) {
		return shapes.get(index);
	}
}
