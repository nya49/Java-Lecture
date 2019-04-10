package sec05;

import java.util.Arrays;

public class BubbleSortTest {

	public static void main(String[] args) {
		String str[] = { "김", "이", "박", "한", "정"};
		bubbleSort(str);
		//Arrays.sort(str);
		System.out.println(Arrays.toString(str));

	}
	
	static void bubbleSort(String[] str) {
		int len = str.length;
		for(int i=0; i<len-1; i++) {
			for(int k=i+1; k<len; k++) {
				// str[i] 와 str[k]를 비교하여 조건에 맞으면 swap
				if(str[i].compareTo(str[k]) > 0) {
					String strr = str[i];
					str[i] = str[k];
					str[k] = strr;
				}
			}
		}
	}

}
