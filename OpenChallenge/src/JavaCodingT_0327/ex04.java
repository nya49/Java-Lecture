package JavaCodingT_0327;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int n = Integer.parseInt(scan.nextLine());
		int result1=0;
		int result2=0;
		
		for(int i=1; i<=n; i++) { 
			result1 += (int) Math.pow(i, 2);
        }
		System.out.println(n + "까지의 제곱의 합 : " + result1);
		
		for(int i=1; i<=n; i++) { 
			result2 += i;
        }
		int result3 = (int)Math.pow(result2, 2);
		System.out.println(n + "까지의 합의 제곱 : " + result3);
		
		System.out.println("1부터 " + n + "까지의 합의 제곱과 제곱의 합의 차 : " + (result3-result1));
		
		scan.close();
    }

}
