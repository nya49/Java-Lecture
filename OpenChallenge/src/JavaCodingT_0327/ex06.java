package JavaCodingT_0327;

import java.util.Arrays;

public class ex06 {

	public static void main(String[] args) {
		
		int num=0;
		int max=0;
		String str = null;
	
		for(int i=100; i<=999; i++) {
			for(int k=100; k<=999; k++) {
				num = i*k;
				str = num + "";
				
				char[] arr1 = new char[str.length()];
				char[] arr2 = new char[str.length()];
				for(int m=0; m<str.length(); m++) {
					arr1[m] = str.charAt(m);
				}
				
				int index=0;
				for(int n=str.length()-1; n>=0; n--) {
					arr2[index] = str.charAt(n);
					index++;
				}
				if(Arrays.equals(arr1, arr2)) {
					if(num > max) {
						max = num;
					}
					
				}
			}
			
		}
		System.out.println("세자릿수 곱하기 대칭수 중 가장 큰 수 : " + max);	
	}
		
	
}
