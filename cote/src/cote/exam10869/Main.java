package cote.exam10869;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ss = sc.nextLine();
		String[] sl = ss.split(" ");
		
		int a = Integer.parseInt(sl[0]), b = Integer.parseInt(sl[1]);
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		sc.close();
		
	}

}
