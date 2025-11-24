package exam1124;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exam1 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
////		try {
////			System.out.println(sc.nextInt() + sc.nextInt());
////		}
////		catch (InputMismatchException e) {
////			System.out.println(0);
////		}
//		
//		int[] values = { 1, 3, 5, 7, 9 };
//		
//		try {
//			System.out.println("인덱스를 선택하세요");
//			int index = sc.nextInt();
//			System.out.println(values[index]);
//		}
////		catch (InputMismatchException e) {
////			System.out.println(values[0]);
////		}
////		catch (ArrayIndexOutOfBoundsException e) {
////			System.out.println(values[0]);
////		}
//		catch (Exception e) {
//			System.out.println(values[0]);
//		}
//		
//		sc.close();
		
		int[] values = { 1, 3, 5, 7, 9 };
		
		try {
			int index = getIndex();
			System.out.println(values[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(values[0]);
		}
		catch (InputMismatchException e) {
			System.out.println(values[0]);
		}
		finally {
			System.out.println("종료.");
		}

	}
	
	public static int getIndex() throws InputMismatchException {
		
		Scanner sc = new Scanner(System.in);
		int index = 0;
//		try {
			index = sc.nextInt();
//		}
//		catch (InputMismatchException e) {}
		sc.close();
		return index;
		
	}

}
