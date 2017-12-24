
public abstract class ClubMember {

	protected String name;
	protected int age;
	
	public ClubMember(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.name + ", " + this.age;
	}
	
	public abstract double getMembershipFee();
}
