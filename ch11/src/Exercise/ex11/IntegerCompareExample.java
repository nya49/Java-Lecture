package Exercise.ex11;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);		// 비교범위가 -128~127을 초과했기 때문에 false

	}

}
