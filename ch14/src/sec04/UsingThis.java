package sec04;

public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerFied = 20;
		
		void method() {
			//람다식
			MyFunctionalInterface fi = () -> {
				System.out.println("outterFied : " + outterField);
				System.out.println("outterFied : " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerFied : " + innerFied);
				System.out.println("outterFied : " + this.innerFied + "\n");
			};
			fi.method();
		}
	}
}
