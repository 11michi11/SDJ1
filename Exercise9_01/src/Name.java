
public class Name {

	private String firstName;
	private String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Name(String name) {
		String[] nameParts = name.split(" ");
		this.firstName = nameParts[0];
		this.lastName = nameParts[1];
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String getFormalName() {
		return lastName + ", " + firstName;
	}
	
	@Override
	public String toString() {
		return this.getFullName();
	}

}
