
public class Car {
	
	private String owner;
	private String colour;
	private String registrationNumber;
	
	public Car(String owner, String colour, String registrationNumber) {
		this.owner = owner;
		this.colour = colour;
		this.registrationNumber = registrationNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
	
	
}
