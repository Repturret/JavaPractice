package exam1015;

import java.util.Scanner;

public class PizzaExample {

	public static void main(String[] args) {
		
//		for (int j = 0; j <= 1; j++) {
//			for (int i = 0; i < 3; i++) {
//				Pizza p;
//				if (j == 0) p = new CheesePizza3 ((i == 0 ? "S" : i == 1 ? "M" : "L"));
//				else p = new PepperoniPizza((i == 0 ? "S" : i == 1 ? "M" : "L"));
//			
//				p.cook();
//				p.serve();
//				
//				System.out.println();
//			}
//			
//			System.out.println();
//		}
		
		Pizza p;
		
		Scanner sc = new Scanner(System.in);
		
		int menu = sc.nextInt();
		String size = sc.next();
		
		if (menu == 2) p = new PepperoniPizza(size);
		else if (menu == 3) p = new DoubleToppingPizza(size, sc.next(),sc.next());
		else p = new CheesePizza(size);
		
		p.cook();
		p.serve();
		
		sc.close();
		
	}

}
