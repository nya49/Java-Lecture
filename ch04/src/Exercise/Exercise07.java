package Exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			
			switch(num) {
			case 1 :
				System.out.print("예상액> ");
				int plus = Integer.parseInt(scanner.nextLine());
				balance += plus;
				break;
			case 2 :
				System.out.print("출금액> ");
				int minus = Integer.parseInt(scanner.nextLine());
				if(balance < minus) {
					System.out.println("잔액이 부족합니다. 현재 잔액 " + balance);
				} else {
					balance -= minus;
				}
				break;
			case 3 :
				System.out.print("잔고> " + balance);
				break;
			case 4 :
				run = false;
				System.out.println();
			}
		}	
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
