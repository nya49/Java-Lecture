package JavaCodingT_0327;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int n = Integer.parseInt(scan.nextLine());
		for(int i=1;i<=n;i++) {
            int sum=0;
            for(int j=1;j<i;j++) {
                if(i%j==0)
                    sum+=j;
            }
            if(sum==i)
                System.out.println("완전수 : " + i);
        }
    }

}
