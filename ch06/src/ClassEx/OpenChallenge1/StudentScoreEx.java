package ClassEx.OpenChallenge1;

import java.util.Scanner;

public class StudentScoreEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String name = scan.nextLine();
		System.out.print("수학 > ");
		int math = Integer.parseInt(scan.nextLine());
		System.out.print("영어 > ");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.print("과학 > ");
		int sci = Integer.parseInt(scan.nextLine());
		
		
		StudentScore score = new StudentScore(name, math, eng, sci);
		double dummy = score.average();								// dummy 를 써야 return 값이 받아짐.
		
		System.out.printf("평균(둘째자리까지) : %.2f\n", dummy);
		
		System.out.println(score.toString());
		scan.close();
	}
}
