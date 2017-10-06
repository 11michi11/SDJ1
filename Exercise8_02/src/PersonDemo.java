import java.util.Date;

public class PersonDemo {
	
	public static void main(String[] args) {
		
		
		Person john = new Person("John", "11.06.1998");
		
		System.out.println(john.getName());
		System.out.println(john.getBirthday());
		
		
		john.setName("Johnny");
		System.out.println(john.getName());
	}
}
