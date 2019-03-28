package JavaCodingT_0327;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input =scan.nextLine();
		
		
        StringBuilder number = new StringBuilder(input);
        String[] num = input.split("");


        for(int i=0, j=0; i<num.length-1 ; i++,j++) {

            int a = Integer.parseInt(String.valueOf(num[i]));
            int b = Integer.parseInt(String.valueOf(num[i+1]));
            if(a%2==0 && b%2==0) {
                number.insert(j+1,"*");
                j++;
            }else if ((a!=0&&b!=0) && (a%2!=0 && b%2!=0)) {
                number.insert(j+1, "-");
                j++;
            }

        }

        System.out.print(number);

        }
}
