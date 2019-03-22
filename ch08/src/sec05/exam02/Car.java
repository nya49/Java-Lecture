package sec05.exam02;

public class Car {

	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backtLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backtLeftTire.roll();
		backRightTire.roll();
	}
}
