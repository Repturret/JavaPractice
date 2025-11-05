package exam1105;

public class BankAccountExample {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("test", "123-321");
		
		System.out.println(ba.deposit(10000));
		System.out.println(ba.withdrawal(5000));
		System.out.println(ba.withdrawal(6000));

	}

}
