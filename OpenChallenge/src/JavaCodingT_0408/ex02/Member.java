package JavaCodingT_0408.ex02;

public class Member implements Comparable<Member>{
	String name;
	String id;
	String pw;
	int age;
	
	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Member o) {
		Member m = (Member) o;
		if(this.age > m.age) {
			return 1;
		}
		if(this.age < m.age) {
			return -1;
		}
		return 0;
	}

	
}
