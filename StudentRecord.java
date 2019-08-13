package Session3.assignmt3;

public class StudentRecord extends Student {
	int StudentAge;
	
	
	
	
	public StudentRecord(String studentName) {
		super(studentName);
		System.out.println("Student Name is Rahib and age is 22");
	}

	public static void main(String[] args) {
		StudentRecord st = new StudentRecord(StudentName);

	}


}
