package test.two;

public class Customer {
	
	public String name;
	public String phone;
	public int point;
	
	public Customer(String name, String phone) {
		this(name, phone, 0);
	}
	
	public Customer(String name, String phone, int point) {
		this.name = name;
		this.phone = phone;
		this.point = point;
	}
	
	public int updatePoint(int amount) { 
		point += amount;
		return point;
	}
	
	public int setPoint(int point) {
		this.point = point;
		return point;
	}

}
