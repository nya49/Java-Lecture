package JavaException;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		String id = scan.nextLine();
		System.out.print("PW 입력 : ");
		String pw = scan.nextLine();
		

		try {
			if(checkIdPw(id, pw)) 
				System.out.println("로그인 성공");	
		} catch(InvalidLoginIdException | IncorectPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

		
	static boolean checkIdPw(String id, String pw) throws InvalidLoginIdException, IncorectPasswordException {
		
		String loginIds[] = {"abcde", "fghii", "klmno", "pqrst", "uvwxyz"};
		String passwords[] = {"abcde12", "fghii12", "klmno12", "pqrst12", "uvwxyz12"};
		
		int index = -1;
		
		for(int i=0; i<loginIds.length; i++) {
			if(loginIds[i].equals(id)) {
				index = i;
				break;
			}
		}
		if(index < 0)
			throw new InvalidLoginIdException("로그인 아이디가 없습니다.");
		
		if(passwords[index].equals(pw))
				return true;
		else
			throw new IncorectPasswordException("패스워드가 틀립니다.");
				
	}
	
}

