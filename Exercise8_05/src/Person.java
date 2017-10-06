public class Person {

	private String name;
	private MyDate birthday;

	public Person(String name, MyDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public Person(MyDate birthday) {
		this.birthday = birthday;
		this.name = "No name";
	}

	public String getName() {
		return name;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return birthday.yearsBetween(MyDate.now());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
