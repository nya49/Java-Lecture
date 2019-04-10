package JavaCodingT_0410.ex03;

import java.time.LocalDate;
import java.util.TreeSet;

public class MemberExample {

	public static void main(String[] args) {
		TreeSet<Member> treeSet = new TreeSet<Member>();
		
		treeSet.add(new Member(1001, "김자바", "부장", LocalDate.of(2011, 03, 02)));
		treeSet.add(new Member(1002, "노연아", "차장", LocalDate.of(2012, 03, 02)));
		treeSet.add(new Member(1003, "신용권", "과장", LocalDate.of(2015, 02, 10)));
		treeSet.add(new Member(1004, "홍민지", "대리", LocalDate.of(2016, 03, 15)));
		treeSet.add(new Member(1005, "홍길동", "사원", LocalDate.of(2017, 05, 14)));
		
		treeSet.add(new Member(1006, "어피치", "부장", LocalDate.of(2012, 03, 05)));
		treeSet.add(new Member(1007, "정정화", "차장", LocalDate.of(2013, 07, 14)));
		treeSet.add(new Member(1008, "천세은", "과장", LocalDate.of(2015, 11, 10)));
		treeSet.add(new Member(1009, "이네오", "대리", LocalDate.of(2016, 06, 30)));
		treeSet.add(new Member(1010, "라이언", "사원", LocalDate.of(2018, 04, 10)));
	
	
		for(Member member : treeSet) {
			System.out.println(member);
		}
		
	}

}
