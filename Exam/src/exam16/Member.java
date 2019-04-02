package exam16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호의 앞자리 입력");
		System.out.print("예) 180917-4 : ");
		
		String ssn = scan.nextLine().trim();
		String sex = "";
		
		int num = 0;
		
		switch(num) {
		case 0 :
			sex = "여자";
			break;
		case 1 :
			sex = "남자";
			break;
		}
		
		int year = Integer.parseInt(ssn.substring(0, 2))+100;
		int month = Integer.parseInt(ssn.substring(2, 4))-1;
		int day = Integer.parseInt(ssn.substring(4, 6));
		Date date = new Date(year, month, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 (E)");
		System.out.println(sdf.format(date) + ", " + sex);
	}

	public static int getNum(String ssn) {
		int num = ssn.charAt(7) % 2;
		return num;
	}

}
