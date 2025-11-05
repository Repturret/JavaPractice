package exam1105;

public class PartTimeEmployee extends Employee {
	
	public int hourlyRate;
	public int workHours;
	
	public PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHours) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.workHours = workHours;
	}

	@Override
	int calculatePay() {
		return hourlyRate * workHours;
	}

}
