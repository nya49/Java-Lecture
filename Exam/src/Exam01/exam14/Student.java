package Exam01.exam14;

public class Student extends Person {

	private int id;
	private String name;
	private int score;
	
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (id==student.id) && (name.equals(student.name)); 
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id+name.hashCode();
	}
	
	
	
	
}
