package command;

import mvc.DrawingModel;
import mvc.Point;

public class UpdatePointCmd implements Command {

	private Point oldState;
	private Point newState;
	private Point originalState = new Point();
	//private DrawingModel model;

	public UpdatePointCmd(Point oldState, Point newState) {
		this.oldState = oldState;
		this.newState = newState;
	}

	@Override
	public void execute() {
		originalState.setX(oldState.getX());
		originalState.setY(oldState.getY());
		originalState.setColor(oldState.getColor());
		// oldState = newState;
		oldState.setX(newState.getX());
		oldState.setY(newState.getY());
		oldState.setColor(newState.getColor());

	}

	@Override
	public void unexecute() {
		oldState.setX(originalState.getX());
		oldState.setY(originalState.getY());
		oldState.setColor(originalState.getColor());
	}

}
