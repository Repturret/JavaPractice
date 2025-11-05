package exam1105;

public class EmployeeExample {

	public static void main(String[] args) {
		
		FullTimeEmployee fte = new FullTimeEmployee("e1", "111", 36000000);
		
		PartTimeEmployee pte = new PartTimeEmployee("e2", "222", 15000, 200);
		
		System.out.println(fte.employeeId + ": " + fte.calculatePay());
		System.out.println(pte.employeeId + ": " + pte.calculatePay());

	}

}
