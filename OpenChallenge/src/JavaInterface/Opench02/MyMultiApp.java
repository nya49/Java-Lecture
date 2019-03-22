package JavaInterface.Opench02;

public class MyMultiApp {

	public static void main(String[] args) {
		MyMultiImpl impl = new MyMultiImpl();
			int[] array = {1, 2, 3, 4, 5};
		
		System.out.println("max : " + impl.max(array));
		System.out.println("min : " + impl.min(array));
		System.out.println("sum : " + impl.sum(array));
		System.out.println("avg : " + impl.avg(array));
	}
}
