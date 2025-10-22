package exam1022;

public class TireExample {

	public static void main(String[] args) {
		
		Tire[] t = new Tire[3];
		
		t[0] = new Tire("a", 10);
		t[1] = new WideTire("b", 15, 10);
		t[2] = new ColorTire("c", 13, "Red");
		
		int c = 0;
		
		while (c >= 0) {
			boolean b = true;
			for (Tire i : t) {
				b = b && i.Roll();
			}
			if (!b) break;
			c++;
		}
		
		System.out.println(c);

	}

}
