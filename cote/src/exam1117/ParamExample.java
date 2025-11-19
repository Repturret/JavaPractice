package exam1117;

public class ParamExample {
	
	public static void main(String[] args) {
		
		int[] arr = { 0, 1, 2 };
		printInfo(arr);
		System.out.println("in main " + arr[2]);
		
	}
	
	public static void printInfo(int[] values) {
		
		System.out.println(values[2]);
		values[2] += 10;
		System.out.println(values[2]);
		
	}

}
