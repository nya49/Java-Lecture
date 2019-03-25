package sec06;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findCalss();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findCalss() throws ClassNotFoundException{
		Class clazz =Class.forName("java.lang.String2");
	}

}
