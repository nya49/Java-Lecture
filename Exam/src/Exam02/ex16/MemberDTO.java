package Exam02.ex16;

public class MemberDTO {
	private int id;
	private String pass;
	
	public MemberDTO() {
	}
	
	public MemberDTO(int id, String pass) {
		this.id = id;
		this.pass = pass;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
