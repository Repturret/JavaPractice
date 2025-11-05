package exam1105;

public class OrderExample {

	public static void main(String[] args) {
		
		Menu menu1 = new Menu("menu1", 1000);
		Menu menu2 = new Menu("menu2", 2000);
		Menu menu3 = new Menu("menu3", 5000);
		
		OrderItem oi = new OrderItem(menu1, 3);
		
		System.out.println(oi.getPrice());
		
		oi.menu = menu2;
		oi.quantity = 5;
		
		System.out.println(oi.getPrice());

		oi.menu = menu3;
		oi.quantity = 3;
		
		System.out.println(oi.getPrice());
		
	}

}
