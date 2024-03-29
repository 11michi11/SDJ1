
public class Car {

	private String colour;
	private  String owner;
	private String registrationNumber;
	private boolean isWorking;
	
	public Car(String colour, String owner, String registrationNumber, boolean isWorking) {
		this.colour = colour;
		this.owner = owner;
		this.registrationNumber = registrationNumber;
		this.isWorking = isWorking;
	}
	
	
	
	public String getColour() {
		return this.colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public boolean isWorking() {
		return isWorking;
	}
	
	public boolean equal(Object obj) {
		if(obj instanceof Car) {
			Car other = (Car) obj;
			if(this.isWorking == other.isWorking && this.colour == other.colour && this.owner == other.owner && this.registrationNumber == other.registrationNumber)
				return true;
			else
				return false;
		}
		return false;
	}
	
	
	
	
	
}
