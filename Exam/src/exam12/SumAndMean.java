package exam12;

public class SumAndMean {

	public static void main(String[] args) {
		int[][] intArray = {
				{95, 86, 88},
				{88, 92, 96, 85},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i=0; i<intArray.length; i++) {
            for (int k=0; k<intArray[i].length; k++) {
                sum += intArray[i][k];
                count++;
            }
		}
		avg = (double) sum/count;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
