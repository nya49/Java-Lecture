package ClassEx.OpenChallenge3;

import java.util.Scanner;

public class Operation {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		 System.out.print("숫자입력 : ");
		 int a = Integer.parseInt(scan.nextLine());
		 
		 System.out.print("부호입력 : ");
		 String boho = scan.nextLine();
		 
		 System.out.print("숫자입력 : ");
		 int b = Integer.parseInt(scan.nextLine());
		 

		 switch(boho) {
		 case "+" :
			 Add add = new Add();
			 add.setValue(a, b);
			 System.out.println("결과 : " + add.calculate());
			 break;
		 case "-" :
			 Sub sub = new Sub();
			 sub.setValue(a, b);
			 System.out.println("결과 : " + sub.calculate());
			 break;
		 case "*" :
			 Mul mul = new Mul();
			 mul.setValue(a, b);
			 System.out.println("결과 : " + mul.calculate());
			 break;
		 case "/" :
			 Div div = new Div();
			 div.setValue(a, b);
			 System.out.println("결과 : " + div.calculate());
			 break;
		 }
		scan.close();
	}
}
