package JavaCodingT_0408.ex02;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("김자바", "rlawkqk", "1111", 29);
		Member m2 = new Member("박자바", "rlawkqk", "1111", 19);
		Member m3 = new Member("홍자바", "rlawkqk", "1111", 54);
		Member m4 = new Member("이자바", "rlawkqk", "1111", 29);
		
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.compareTo(m3));
		System.out.println(m1.compareTo(m4));
		
	}

}
