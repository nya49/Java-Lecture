package Exercise.ex03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student compareStudent = (Student) obj;
			if(this.studentNum == compareStudent.studentNum) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	
}
