package Exercise;

public class Exercise04 {

	public static void main(String[] args) {
			
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			int sum = num1 + num2;
			
			if(sum != 5) {
				System.out.println("(" + num1 + ", " + num2 + ")");
			} else {
				System.out.println("(" + num1 + ", " + num2 + ")");
				break;
			}
			
		}
	}
}
