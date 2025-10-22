package exam1022;

public class EmployeeExample {

	public static void main(String[] args) {
		
		Employee[] emps = new Employee[2];
		emps[0] = new FullTimeEmployee("kim", "1111", 36000000);
		emps[1] = new PartTimeEmployee("lee", "2222", 20000, 100);
		
		for (Employee i : emps) {
			System.out.println(i.getName() + "-" + i.calculatePay());
		}

	}

}
