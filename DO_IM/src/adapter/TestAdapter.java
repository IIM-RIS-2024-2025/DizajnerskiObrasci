package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Boat boat = new Boat();
		Vehicle boatAdapter = new BoatAdapter(boat);
		Vehicle boatAdapter2 = new BoatAdapter2();
		
		car.goFaster();
		plane.goFaster();
		boatAdapter.goFaster();
		boatAdapter2.goFaster();

	}

}
