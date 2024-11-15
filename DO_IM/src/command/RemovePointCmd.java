package command;

import mvc.DrawingModel;
import mvc.Point;

public class RemovePointCmd implements Command {

	private Point p;
	private DrawingModel model;

	public RemovePointCmd(Point p, DrawingModel model) {
		this.p = p;
		this.model = model;
	}

	@Override
	public void execute() {
		model.removeShape(p);
	}

	@Override
	public void unexecute() {
		model.addShape(p);
	}

}
