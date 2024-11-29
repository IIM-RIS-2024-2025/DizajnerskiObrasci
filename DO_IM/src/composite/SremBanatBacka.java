package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mvc.Shape;

public class SremBanatBacka extends Shape{
	public List<Shape> sremBanatBacka = new ArrayList<Shape>();
	
	public void add (Shape shape) {
		sremBanatBacka.add(shape);
	}
	public void remove (Shape shape ) {
		sremBanatBacka.remove(shape);
	}
	public void draw(Graphics g) { 
		Iterator<Shape> it = sremBanatBacka.iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
	}
}
