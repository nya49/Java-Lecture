package JavaInterface.Opench01;

public class MyCalc implements Calculator{
	
	
	@Override
	public int add(int a, int b) {
		return  a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return  a-b;
		
	}

	@Override
	public int multiply(int a, int b) {
		return  a*b;
		
	}

	
}
