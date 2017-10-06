import java.util.ArrayList;

public class GradeList {

	private ArrayList<Grade> grades;
	
	public GradeList() {
		this.grades = new ArrayList<Grade>();
	}
	
	public int getNumberOfGrades() {
		return this.grades.size();
	}
	
	public Grade getGrade(int index) {
		return grades.get(index);
	}
	
	public void addGrade(Grade grade) {
		grades.add(grade);
	}
	
	public double getAvarage() {
		double sum = 0;
		for(Grade e:grades)
			sum+=e.getGrade();
		return sum/grades.size();
	}

	@Override
	public String toString() {
		return "GradeList [" + (grades != null ? "grades=" + grades : "") + "]";
	}

	
}
