package Member_EX;

public class Member extends Customer{
	
	int num;
	String mg;
	
	public Member(String name, String phone, String add, int num, String mg) {
		super(name, phone, add);
		this.num = num;
		this.mg = mg;
	}

	@Override
	public String toString() {
		return "Member [이름 =" + name + ", 전화번호 = " + phone + ", 주소 =" + add +", 고객번호=" + num + ", 마일리지=" + mg + "]";
	}
}
