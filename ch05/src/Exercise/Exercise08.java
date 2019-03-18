package Exercise;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		int max, min;
		max = min = array[0][0];
		double var = 0.0;
		
		for (int i=0; i<array.length; i++) {
            for (int k=0; k<array[i].length; k++) {
                sum += array[i][k];
                count++;
               
	             if(max<array[i][k]) { 
	            	 max = array[i][k];
	             } else if(min>array[i][k]) {
	            	 min = array[i][k];
	             }
            }
		}
		avg = (double) sum/count;
		
		for(int i=0; i<array.length; i++) {								//분산값을 구하는 방법
			for(int k=0; k<array[i].length; k++) {
				var += (array[i][k] - avg) * (array[i][k] - avg);
			}
		}
		
		var /= count;
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("분산 : " + var);
	}

}
