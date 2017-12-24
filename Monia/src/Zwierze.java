
public class Zwierze {

	public String name;
	protected int age;
	protected Person owner;
	
	public Zwierze(String name, int age, Person owner) {
		this.name = name;
		this.age = age;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	public void makeNoise() {
		System.out.println("Noise");
	}
	
	
	
}
