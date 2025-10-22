package exam1022;

public class PartTimeEmployee extends Employee {
	
	public int hourlyRate;
	public int workHours;
	
	public PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHours) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.workHours = workHours;
	}
	
	@Override
	public int calculatePay() {
		return hourlyRate * workHours;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

}
