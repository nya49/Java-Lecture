package sec05.exam03;

public class Car {

	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
