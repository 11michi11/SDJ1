
public class Teacher{

	protected String title;
	protected String dept;
	
	public Teacher(String title, String dept) {
		this.title = title;
		this.dept = dept;
	}
	
	public Teacher(String dept) {
		this.title = "Associate Professor";
		this.dept = dept;
	}
	
	public void teach() {
		System.out.println("6 * 4 = 4!");
	}
	
	public void saySmth() {
		System.out.println("I'm teacher");
	}
}
