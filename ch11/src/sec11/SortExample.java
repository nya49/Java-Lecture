package sec11;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("scores[" + i + "]=" + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1, m2, m3};
		for(int i=0; i<members.length; i++) {
			System.out.println("scores[" + i + "].name=" + members[i].name);
		}
	}

}
