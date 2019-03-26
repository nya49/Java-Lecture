package sec03.exam05;

public class FinalizeExample {

	@SuppressWarnings("unused")
	
	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			
			counter = null;
			
			System.gc();
		}
	}
}
