package exam13;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	public static void main(String[] args) {
		int[] lottoArray = getLottoNumber();
		System.out.println(Arrays.toString(lottoArray));

	}
	
	static int[] getLottoNumber() {
		int number[] = new int[6];
		Random random = new Random();
		for(int i=0; i<6; i++) {
			number[i] = random.nextInt(45)+1;
		}
		return number;
	}

}
