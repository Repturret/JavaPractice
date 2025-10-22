package exam1022;

public class FullTimeEmployee extends Employee {
	
	private int annualSalary;
	
	public FullTimeEmployee(String name, String employeeId, int annualSalary) {
		super(name, employeeId);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public int calculatePay() {
		return annualSalary / 12;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

}
