package JavaCodingT_0410.ex01;

import java.util.Arrays;

public class PersonExample {

	public static void main(String[] args) {
		String names = (
				"이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,"
				+ "최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,"
				+ "이재영,전경헌" );
		String name[] = names.split(",");
		int kimC = 0;
		int leeC = 0;

		// 1번
		for (int i = 0; i < name.length; i++) {
			if (String.valueOf(name[i].charAt(0)).equals("김")) {
				kimC++;
			}
		}
		System.out.println("중복을 포함한 김씨 수 : " + kimC + "명");

		for (int i = 0; i < name.length; i++) {
			if (String.valueOf(name[i].charAt(0)).equals("이")) {
				leeC++;
			}
		}
		System.out.println("중복을 포함한 이씨 수 : " + leeC + "명");

		// 2번
		int jaeyoung = 0;
		for (int i = 0; i < name.length; i++) {
			if (name[i].indexOf("이재영") >= 0) {
				jaeyoung++;
			}
		}
		System.out.println("이재영이름 중복 횟수 : " + jaeyoung + "번");

		// 3번
		String noOverlap = "";
		for (int i = 0; i < name.length; i++) {
			if (noOverlap.indexOf(name[i]) == -1) {
				noOverlap += (name[i] + " ");
			}
		}
		System.out.print("중복제거 이름 : ");
		System.out.println(noOverlap);

		// 4번
		String noOverlapnames[] = noOverlap.split(" ");
		Arrays.sort(noOverlapnames);
		System.out.print("중복제거 이름 : ");
		for (int i = 0; i < noOverlapnames.length; i++) {
			System.out.print(noOverlapnames[i] + " ");
		}


	}

}
