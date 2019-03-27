package sec15;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID : {0} \n회원이름 : {1} \n회원전화 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member value({0}, {1}, {2})";
		Object[] arsuments = {"'java'","'신용권'","'010-123-5678'"};
		String result2 = MessageFormat.format(sql, arsuments);
		System.out.println(result2);
	}
}
