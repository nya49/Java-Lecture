package sec03;

public class Student extends People {
	public int StudentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		StudentNo = studentNo;
	}


	
}
