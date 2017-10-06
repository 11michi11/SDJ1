import java.util.Arrays;

public class GradeList {

	private Grade[] grades;
	private int numberOfGrades;
	
	public GradeList(int maxNumberOfGrades) {
		this.grades = new Grade[maxNumberOfGrades];
	}
	
	public int getNumberOfGrades() {
		return this.numberOfGrades;
	}
	
	public Grade getGrade(int index) {
		return grades[index];
	}
	
	public void setGrade(Grade grade, int index) {
		grades[index] = grade;
	}
	
	public double getAvarage() {
		double sum = 0;
		for(Grade e:grades)
			sum+=e.getGrade();
		return sum/numberOfGrades;
	}

	@Override
	public String toString() {
		return "GradeList [" + (grades != null ? "grades=" + Arrays.toString(grades) + ", " : "") + "numberOfGrades="
				+ numberOfGrades + "]";
	}
	
}
