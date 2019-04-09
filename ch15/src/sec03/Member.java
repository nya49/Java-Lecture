package sec03;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	public String tel;
	
	

	public Member(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return super.equals(obj);
		}
	}*/

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name);		// 이름비교
			//return member.name.equals(name) && (member.tel.equals(tel));
		} else {
			return super.equals(obj);
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(tel);		// tel 비교
		//return Objects.hash(name, tel);
		//return name.hashCode() + tel.hashCode();
	}
	
	
}
