
public class Person {

	private String name;
	private String birthday;
	
	public Person(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String toString() {
		return "My name is " + this.name + " and my birthday is " + this.birthday;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person other = (Person) obj;
			if(this.name.equals(other.name) && this.birthday.equals(other.birthday))
				return true;
		}
		return false;
	}
	
	public Person copy() {
		return new Person(this.name, this.birthday);
	}
	
}
