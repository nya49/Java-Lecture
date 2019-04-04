package Exercise02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class BbsTest {
	
	public static void main(String[] args) {
	
		BbsDAO bDao = new BbsDAO();
		Calendar cal = Calendar.getInstance();

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = df.format(cal.getTime());

		// 1. 글쓰기
		bDao.insertBbs(new BbsDTO(100012, 100012, "abcd", strDate, "asdcf"));
		
		
		// 2. 조회, 5. 상세조회
		/*List<BbsDTO> bbsList = bDao.selectCondition();
		System.out.println("게시글");
		for(BbsDTO bbs : bbsList)
			System.out.println(bbs.toString());*/
		
		// 3. 수정
		/*BbsDTO bDto = bDao.selectOne(100012);
		bDto.setDate(strDate);
		bDao.updatebbs(bDto);
		System.out.println(bDto.toString());*/
		
		// 4. 삭제
		/*bDao.deleteBbs(100006);
		List<BbsDTO> bbsList = bDao.selectCondition();
		System.out.println("게시글 조회");
		for(BbsDTO bbs : bbsList)
			System.out.println(bbs.toString());*/
	}
}
	