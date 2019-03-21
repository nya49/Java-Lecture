package Member_EX;

public class Customer {
	
	public String name;
	public String phone;
	public String add;
	
	public Customer(String name, String phone, String add) {
		this.name = name;
		this.phone = phone;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", add=" + add + "]";
	}
	
	
}
