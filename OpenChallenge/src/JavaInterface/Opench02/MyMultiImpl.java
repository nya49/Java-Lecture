package JavaInterface.Opench02;

public class MyMultiImpl implements MyMulti{

	
	@Override
	public int max(int array[]) {
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	@Override
	public int min(int[] array) {
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	@Override
	public int sum(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	@Override
	public double avg(int[] array) {
		int sum = 0;
		int avg = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		avg = sum/array.length;
		
		return avg;
	}


	
}
