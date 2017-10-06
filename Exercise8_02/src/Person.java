import java.util.Date;

public class Person {
	private String name;
	private String birthday;
	
	
	public Person(String name, String date) {
		this.name = name;
		this.birthday = date;
	}

	public String getName() {
		return name;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
