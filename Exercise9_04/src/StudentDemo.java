
public class StudentDemo {

	public static void main(String[] args) {
		Student john = new Student("John", 'M', 123);
		Student tom = new Student("Tom", 'M', 321);
		Student eve = new Student("Eve", 'F', 666);
		
		System.out.println(john + "\n" + tom + "\n" + eve);
		
		tom.setName("Tomasz");
		eve.setStudyNumber(555);
		System.out.println(john.getName() + " is " + john.getGender());
		
		System.out.println(john + "\n" + tom + "\n" + eve);
		
	}
}
