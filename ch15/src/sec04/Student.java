package sec04;

import java.util.Objects;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (name.equals(student.name));
		} else {
			return super.equals(obj);
		}
	}

	@Override
	public int hashCode() {
		return sno;
	}
	
	
}
