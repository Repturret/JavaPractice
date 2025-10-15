package exam1015;

public class StudentExample {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		Student stu2 = new Student("홍길동", "student2@test.com", "1101");
		
		stu1.setName("유지성");
		stu1.setEmail("mymiwltjd@naver.com");
		stu1.setId("1407");
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getEmail());
		System.out.println(stu1.getId());
		
		System.out.println(stu2.getName());
		System.out.println(stu2.getEmail());
		System.out.println(stu2.getId());

	}

}
