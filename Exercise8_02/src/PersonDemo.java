import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		Person john = new Person("John", "19.16.3543");
		
		Person mike = john.copy();
		
		mike.setName("Micha�");

		System.out.println(john);
		System.out.println(mike);

	}
}
