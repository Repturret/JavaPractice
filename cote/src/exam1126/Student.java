package exam1126;

public class Student {
	
	public String studentId;
	public String name;
	public String email;
	
	public Student(String stuentId, String name, String email) {
		this.studentId = stuentId;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.studentId == std.studentId && this.name == std.name) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
//		return studentId + " " + name + " " + email;
		return super.toString() + " " + studentId + " " + name + " " + email;
	}

}
