package JavaCodingT_0327;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String dashInsert = scan.nextLine();
		String[] nums = dashInsert.split("");
		
		for(String num : nums) {
		System.out.print(num);
		}
		
	}

}
