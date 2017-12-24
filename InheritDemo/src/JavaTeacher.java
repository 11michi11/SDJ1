
public class JavaTeacher extends Teacher {

	private String majorCourse;
	
	public JavaTeacher(String title, String dept, String majorCourse) {
		super(title, dept);
		this.majorCourse = majorCourse;
	}
	
	public JavaTeacher(String dept, String majorCourse) {
		super(dept);
		this.majorCourse = majorCourse;
	}

	public void code() {
		System.out.println("public static void main(String[] args)"); 
	}
	
	
	public static void main(String[] args) {
		
		JavaTeacher javaTeacher = new JavaTeacher("Michael", "ICT", "SDJ1");
		javaTeacher.teach();
		javaTeacher.code();
		System.out.println(javaTeacher.title);
		System.out.println(javaTeacher.dept);
		javaTeacher.saySmth();
		System.out.println(javaTeacher.toString());
		

	}
	
	public void teach() {
		System.out.println("I teach Java!");
	}
	
}
