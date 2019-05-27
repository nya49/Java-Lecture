package Test01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("height = ");
		int height = scan.nextInt();
		
		System.out.println("Your height is " + height + "cm.");
		
		scan.close();
	}
}
