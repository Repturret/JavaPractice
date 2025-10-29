package exam1029;

public class PCExample {

	public static void main(String[] args) {
		
		PC pc = new PC();
		
		pc.port1 = new SonDisk();
		pc.port2 = new SonDisk(16);
		pc.test();
		
		System.out.println("-----");
		
		pc.port2 = new MockDisk();
		pc.test();

	}

}
