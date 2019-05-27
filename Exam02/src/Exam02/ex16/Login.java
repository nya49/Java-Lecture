package Exam02.ex16;

import java.util.List;
import java.util.Scanner;


public class Login {

	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.가입 | 2.조회 | 3.변경 | 4.삭제 | 5.검색 | 6.로그인 | 7. 종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(scan.nextLine());
			
			switch(num) {
			case 1 :
				System.out.print("패스워드> ");
				String pass = scan.nextLine();

				System.out.print("이름> ");
				String name = scan.nextLine();

				System.out.print("생년월일> ");
				String birthday = scan.nextLine();

				System.out.print("주소> ");
				String address = scan.nextLine();
				
				mDao.insertMember(new MemberDTO(pass, name, birthday, address));
				break;
			case 2 :
				List<MemberDTO> memberList = mDao.selectCondition();
				System.out.println("회원목록 조회");
				for(MemberDTO member : memberList)
					System.out.println(member.toString());
				break;
			case 3 :
				System.out.print("변경할 아이디>");
				int id = Integer.parseInt(scan.nextLine());
				MemberDTO mDto = mDao.selectMod(id);
				
				System.out.print("이름> ");
				name = scan.nextLine();
				
				System.out.print("패스워드> ");
				pass = scan.nextLine();
				
				System.out.print("생년월일> ");
				birthday = scan.nextLine();
				
				System.out.print("주소> ");
				address = scan.nextLine();
				
				mDto.setName(name);
				mDto.setPass(pass);
				mDto.setBirthday(birthday);
				mDto.setAddress(address);
				
				mDao.updateMember(mDto);
				System.out.println(mDto.toString());
				break;
			case 4 :
				System.out.print("삭제할 아이디> ");
				id = Integer.parseInt(scan.nextLine());
				mDao.deleteMember(id);
				List<MemberDTO> memberList2 = mDao.selectCondition();
				System.out.println("회원목록 조회");
				for(MemberDTO member : memberList2)
					System.out.println(member.toString());
				break;
				
			case 5 :
				System.out.print("검색할 이름> ");
				name = scan.nextLine();
				mDto = mDao.selectOne(name);
				
				List<MemberDTO> memberList1 = mDao.selectCondition();
				System.out.println("회원목록 조회");
				for(MemberDTO member : memberList1)
					System.out.println(member.toString());
				break;
				
			case 6 :
				System.out.print("아이디>");
				id = Integer.parseInt(scan.nextLine());
				mDto = mDao.login(id);
				
				System.out.print("패스워드> ");
				pass = scan.nextLine();
				
				if(mDto.getPass().equals(pass)) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
				}
				
				break;
			case 7 :
				run = false;
				System.out.println();
			}
			
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
