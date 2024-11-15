package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		Point p1 = new Point(10,10,Color.black);
		DrawingModel model = new DrawingModel();
		
		AddPointCmd addFirstPoint = new AddPointCmd(p1, model);
		System.out.println(model.getShapes().size());
		addFirstPoint.execute();
		System.out.println(model.getShapes().size());
		//addFirstPoint.unexecute();
		System.out.println(model.getShapes().size());
		
		Point p2 = new Point(20,20,Color.RED);
		UpdatePointCmd updateP = new UpdatePointCmd(p1,p2);
		updateP.execute();
		System.out.println(model.getShape(0));
	}

}
