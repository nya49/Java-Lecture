package Exam02.ex18;

import java.util.List;

public class KorApp {

	public static void main(String[] args) {
		System.out.println("국내에서 인구 100만명 이상인 도시를 인구가 많은 도시부터 정렬");
		KorDAO kDao = new KorDAO();
		List<KorDTO> korList = kDao.selectAll();
		for(KorDTO kor : korList) {
			System.out.println(kor.toString());
		}
		

	}

}
