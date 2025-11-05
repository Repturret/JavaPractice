package exam1105;

public abstract class Employee {
	
	public String name;
	public String employeeId;
	
	Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	abstract int calculatePay();

}
