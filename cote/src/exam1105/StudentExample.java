package exam1105;

public class StudentExample {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		Student stu2 = new Student("홍길동", "hong@gil.dong", "1101");
		
		stu1.setName("테스트");
		stu1.setEmail("test@te.st");
		stu1.setId("1102");
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getEmail());
		System.out.println(stu1.getId());
		
		System.out.println();
		
		System.out.println(stu2.getName());
		System.out.println(stu2.getEmail());
		System.out.println(stu2.getId());

	}

}
