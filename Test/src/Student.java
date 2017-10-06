
public class Student {

	private String name;
	private char gender;
	private int studentNumber;
	
	public Student(String name, char gender, int studentNumber) {
		this.name = name;
		this.gender = gender;
		this.studentNumber = studentNumber;
	}
	
	public String toString() {
		return name + ", " + gender + ", " + studentNumber;
	}
	
}
