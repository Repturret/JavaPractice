package exam1126;

public class StudentExample {

	public static void main(String[] args) {
		
		Student std1 = new Student("1111", "홍길동", "hong@gil.dong");
		Student std2 = new Student("2222", "길동홍", "gil@dong.hong");
		Student std3 = new Student("1111", "홍길동", "gil@dong.hong");
		
		System.out.println(std1 == std2);
		System.out.println(std1 == std3);
		
		System.out.println(std1.equals(std2));
		System.out.println(std1.equals(std3));
		
		System.out.println(std1.toString());

	}

}
