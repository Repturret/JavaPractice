package exam1015;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("짜장면", 7000);
		menus[1] = new Menu("짬뽕", 8000);
		menus[2]= new Menu("탕수육", 15000);
		
//		OrderItem o1 = new OrderItem(menus[0], 3);
//		System.out.println(o1.getTotalPrice());

//		OrderItem o2 = new OrderItem(menus[1], 2);
//		System.out.println(o2.getTotalPrice());
		
		Scanner sc = new Scanner(System.in);
		
		int menuIndex = sc.nextInt();
		int quantity = sc.nextInt();
		
		sc.close();
		
		if (menuIndex >= 0 && menuIndex <= 2 && quantity > 0) {
			OrderItem order = new OrderItem(menus[menuIndex], quantity);
			System.out.println(order.getTotalPrice());
		}

	}

}
