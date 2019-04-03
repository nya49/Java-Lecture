package Exercise01;

import java.util.List;

public class MamberTest {

	public static void main(String[] args) {
	 
		MemberDAO mDao = new MemberDAO();
		
		// 1. 가입
		//mDao.insertMember(new MemberDTO(1, "1234", "김자바", "1988-07-12", "대전광역시 서구 월평동 이젠아카데미"));
		
		// 2. 조회
		/*List<MemberDTO> memberList = mDao.selectCondition();
		System.out.println("회원목록 조회");
		for(MemberDTO member : memberList)
			System.out.println(member.toString());*/
		
		// 3. 변경, 5. 검색
		/*MemberDTO mDto = mDao.selectOne("김자바");
		mDto.setPass("5678");
		mDao.updateMember(mDto);
		System.out.println(mDto.toString());*/
		
		// 4. 삭제
		mDao.deleteMember(100009);
		List<MemberDTO> memberList = mDao.selectCondition();
		System.out.println("회원목록 조회");
		for(MemberDTO member : memberList)
			System.out.println(member.toString());
		
	}

}
