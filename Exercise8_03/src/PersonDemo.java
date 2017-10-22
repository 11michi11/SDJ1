public class PersonDemo {

	public static void main(String[] args) {

		MyDate date = new MyDate(1998,6,11);
		Person john = new Person("John", date);

		john.getBirthday().set(6546, 12, 6);
		System.out.println(john.getName());
		System.out.println(john.getBirthday());

		
		john.setName("Johnny");
		System.out.println(john.getName());

		Person noName = new Person(new MyDate(1998, 6, 11));
		System.out.println(noName.getName());
		System.out.println(john);
	}
}
