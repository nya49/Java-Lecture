package Exercise02;

import java.util.List;
import java.util.Scanner;


public class BbsApp {
	 
	static Scanner scan = new Scanner(System.in);
	static BbsDAO bDao = new BbsDAO();
	
	public static void main(String[] args) {
		int memberId = login();
		boolean run = true;	
		while(run) {
			System.out.print("1.글쓰기 | 2.조회 | 3.수정 | 4.삭제 | 5.상세조회 | 6.종료 >>> ");
			int selectNo = Integer.parseInt(scan.nextLine());
			
			switch(selectNo) {
			case 1:
				create(memberId); break;
			case 2:
				list(); break;
			case 3:
				update(memberId); break;
			case 4:
				delete(memberId); break;
			case 5:
				view(); break;
			case 6:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 7까지의 숫자만 입력하세요.");
			}
		}
		bDao.close();
		System.out.println("프로그램 종료");
	}
	
	private static void create(int memberId) {
		System.out.println("글 쓰기");
		System.out.print("제목> ");
		String title = scan.nextLine();
		System.out.print("내용> ");
		String content = scan.nextLine();
		bDao.insertBbs(new BbsDTO(memberId, title, content));
	}

	private static void list() {
		List<BbsMember> bmList = bDao.selectJoinAll(10);
		for (BbsMember bmDto: bmList)
			System.out.println(bmDto.toString());
	}
	
	private static void update(int memberId) {
		System.out.print("수정할 글의 ID> ");
		int id = Integer.parseInt(scan.nextLine());
		BbsDTO bDto = bDao.selectOne(id);
		if (bDto.getMemberid() != memberId) {
			System.out.println("수정 권한이 없음");
			return;
		}
		System.out.print("제목> ");
		String title = scan.nextLine();
		if (title.length() != 0)
			bDto.setTitle(title);
		System.out.print("내용> ");
		String content = scan.nextLine();
		if (content.length() != 0)
			bDto.setContent(content);
		bDao.updateBbs(bDto);
	}
	
	private static void delete(int memberId) {
		System.out.print("삭제할 글의 ID> ");
		int id = Integer.parseInt(scan.nextLine());
		BbsDTO bDto = bDao.selectOne(id);
		if (bDto.getMemberid() != memberId) {
			System.out.println("삭제 권한이 없음");
			return;
		}
		bDao.deleteBbs(id);
	}
	
	private static void view() {
		System.out.print("상세조회할 ID> ");
		int id = Integer.parseInt(scan.nextLine());
		BbsMember bm = bDao.ViewData(id);
		System.out.println(bm.fullString());
	}
	
	private static int login() {
		System.out.print("회원 ID > ");
		int memberId = Integer.parseInt(scan.nextLine());
		System.out.print("패스워드> ");
		String password = scan.nextLine();
		MemberDAO mDao = new MemberDAO();
		MemberDTO mDto = mDao.selectMod(memberId);
		
		if (memberId != mDto.getId()) {
			System.out.println("회원 ID에 해당하는 회원이 없습니다.");
			System.exit(-1);
		}
		if (!password.equals(mDto.getPass())) {
			System.out.println("패스워드가 틀렸습니다.");
			System.exit(-1);
		}
		System.out.println("로그인 되었습니다.");
		bDao.close();
		return memberId;
	}
}
