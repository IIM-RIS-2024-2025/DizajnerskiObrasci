package command;

import mvc.DrawingModel;
import mvc.Point;

public class AddPointCmd implements Command {

	private Point p;
	private DrawingModel model;
	
	public AddPointCmd(Point p, DrawingModel model) {
		
		this.p = p;
		this.model = model;
	}

	@Override
	public void execute() {
		model.addShape(p);
	}

	@Override
	public void unexecute() {
		model.removeShape(p);
	}

}
