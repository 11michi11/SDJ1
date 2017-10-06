public class PersonDemo {

	public static void main(String[] args) {

		Person john = new Person("John", new MyDate(1998, 6, 11));

		System.out.println(john.getName());
		System.out.println(john.getBirthday());

		john.setName("Johnny");
		System.out.println(john.getName());

		Person noName = new Person(new MyDate(1998, 6, 11));
		System.out.println(noName.getName());
		System.out.println(john);
	}
}
