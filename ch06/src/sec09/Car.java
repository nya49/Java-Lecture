package sec09;

public class Car {
	
	String model;
	int seppd;
	
	Car (String model) {
		this.model = model;
	}
	void setSeppd(int seppd) {
		this.seppd = seppd;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSeppd(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.seppd + "km/h)");
		}
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", seppd=" + seppd + "]";
	}
	
	
}	
