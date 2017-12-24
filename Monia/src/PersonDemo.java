public class PersonDemo {

	private int age = 20;
	private String name = "John";
	
	public PersonDemo() {

	}

	public PersonDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public PersonDemo(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		PersonDemo per = new PersonDemo();
		System.out.println(per.name);
		
		PersonDemo per2 = new PersonDemo("John", 21);
		System.out.println(per2.age);

		PersonDemo per3 = new PersonDemo("Adam");
		System.out.println(per3.age);
	}
}
