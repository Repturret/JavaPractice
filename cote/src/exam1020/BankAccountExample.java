package exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("kim", "123-4567-8910-11");
		
		System.out.println(ba.deposit(100000));
		System.out.println(ba.withdrawal(50000));
		System.out.println(ba.withdrawal(100000));
		
		System.out.println(BankAccount.getCount());
		
		BankAccount ba2 = new BankAccount("lee", "110-1987-6543-21");
		
		System.out.println(BankAccount.getCount());

	}

}
