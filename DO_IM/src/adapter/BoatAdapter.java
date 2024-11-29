package adapter;

public class BoatAdapter implements Vehicle {

	public Boat boat;
	
	public BoatAdapter(Boat boat) {
		this.boat = boat;
	}
	
	@Override
	public void goFaster() {
		boat.rowFaster();
	}

}
