package Exam02.ex16;

import java.util.List;
import java.util.Scanner;


public class Login {

	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---------로그인---------");	
		System.out.print("아이디>");
		int id = Integer.parseInt(scan.nextLine());
		MemberDTO mDto = mDao.login(id);
		
		System.out.print("패스워드> ");
		String pass = scan.nextLine();
		
		if(mDto.getPass().equals(pass)) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
		}
				
		scan.close();
	}
}
