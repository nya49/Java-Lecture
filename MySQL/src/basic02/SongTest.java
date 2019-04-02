package basic02;

public class SongTest {

	public static void main(String[] args) {
		
		SongDAO sDao = new SongDAO();
		
		//sDao.insertSong(new SongDTO("빨간 맛", "빠빠빨간 맛 궁금해 허니"));		// 추가
		
		/*SongDTO sDto = new SongDTO("빨간 맛", "빠빠빨간 맛 궁금해 허니");		// 추가
		sDao.insertSong(sDto);  이렇게도 사용 가능*/
		
		//SongDTO sDto = sDao.selectOne(117);				// 하나만 선택해서 검색, 조건은 _id로 함
		//System.out.println(sDto.toString() + "\n");
		
		// 업데이트
		SongDTO sDto = sDao.selectOne(119);					
		//System.out.println(sDto.toString() + "\n");
		sDto.setTitle("넌 is 뭔들");
		sDto.setLyris("나 지금 너 땜에 혼란스러");
		sDao.updateSong(sDto);
		sDto = sDao.selectOne(119);
		System.out.println(sDto.toString() + "\n");
		
		//삭제
		sDao.deleteSong(sDto);		
		sDao.close();
	}

}