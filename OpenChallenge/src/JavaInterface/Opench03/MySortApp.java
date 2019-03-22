package JavaInterface.Opench03;

public class MySortApp {

	public static void main(String[] args) {
		
		MySortImpl impl = new MySortImpl();		
		String[] strArray = {"하하", "가가", "바바", "쿠쿠", "나노"};
		
		System.out.println(impl.sort(strArray));

	}

}
