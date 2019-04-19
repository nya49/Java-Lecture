package Exam02.ex17;


public class EgApp {

	public static void main(String[] args) {
		EgDAO eDao = new EgDAO();
		
		// 1. 육성 선수중 한명 등록
		//eDao.insertEg(new EgDTO(99, "정민철", "투수", "대전고", "우", "우", "1999", 2700));
		
		// 2. 이 육성 선수를 다음 선수로 트레이드
		
		EgDTO eDto = eDao.selectOne(99);
		eDto.setBack_no(98);
		eDto.setName("박재홍");
		eDto.setPos("외야수");
		eDto.setH_school("인천고");
		eDto.setT("우");
		eDto.setHit("좌");
		eDto.setYeras("1995");
		eDto.setAnnual_income(30000);
		eDao.updateEg(eDto);
		System.out.println(eDto.toString());

	}

}
