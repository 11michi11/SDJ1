
public class Student {
	private String name;
	private char gender;
	private int studyNumber;
	
	public Student(String name, char gender, int studyNumber) {
		this.name = name;
		this.gender = gender;
		this.studyNumber = studyNumber;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public int getStudyNumber() {
		return studyNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudyNumber(int studyNumber) {
		this.studyNumber = studyNumber;
	}
	
	@Override
	public String toString() {
		return name + ", " + gender + ", " + studyNumber;
	}
}
