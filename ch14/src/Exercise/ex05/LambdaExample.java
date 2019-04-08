package Exercise.ex05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {

	public static int[] scores = {10, 50, 3};
	
	public static int maxOrmin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrmin(
				(a, b) -> {
					if(a>=b) return a;
					else return b;
				}
				);
		System.out.println("최대값 : " + max);
				
		int min = maxOrmin(
				(a, b) -> {
					if(a<=b) return a;
					else return b;
				}
				);
		System.out.println("최소값 : " + min);
	}

}
