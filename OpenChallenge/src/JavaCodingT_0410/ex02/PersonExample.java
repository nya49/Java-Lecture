package JavaCodingT_0410.ex02;

import java.util.ArrayList;
import java.util.Collections;

public class PersonExample {

	public static void main(String[] args) {
		
		String names = (
				"이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,"
				+ "최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,"
				+ "이재영,전경헌" );
		
		String[] arr = names.split(",");
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i< arr.length; i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		int kimC = 0;
		int leeC = 0;
		
		// 1번
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("김")) {
				kimC++;
			}
		}
		System.out.println("중복을 포함한 김씨 수 : " + kimC + "명");

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("이")) {
				leeC++;
			}
		}
		System.out.println("중복을 포함한 이씨 수 : " + leeC + "명");

		// 2번
		int jaeyoung = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("이재영")) {
				jaeyoung++;
			}
		}
		System.out.println("이재영이름 중복 횟수 : " + jaeyoung + "번");
		
		// 3번
		System.out.println("중복제거 이름 : " + list);
		
		Collections.sort(list);
		System.out.println("중복제거 이름 : " + list);

	}
	
}
