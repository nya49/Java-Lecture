package JavaInterface.Opench01;

import java.util.Scanner;

public class MyCalcApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.print("숫자입력 : ");
		 int a = Integer.parseInt(scan.nextLine());
		 
		 System.out.print("부호입력 : ");
		 String buho = scan.nextLine();
		 
		 System.out.print("숫자입력 : ");
		 int b = Integer.parseInt(scan.nextLine());
		 
		 switch(buho) {
		 case "+" :
			 Calculator cla;
			 
			 cla = new MyCalc();
			 cla.add(a, b);
			 System.out.println("결과 : " + cla.add(a, b));
			 break;
		case "-" :
			 cla = new MyCalc();
			 cla.subtract(a, b);
			 System.out.println("결과 : " + cla.subtract(a, b));
			 break;
		 case "*" :
			 cla = new MyCalc();
			 cla.multiply(a, b);
			 System.out.println("결과 : " + cla.multiply(a, b));
			 break;
		 }
		 
		 scan.close();
	}

}
