
public class Room {

	private int number;
	private Person guest;
	
	public Room(int number, Person guest) {
		this.number = number;
		this.guest = guest;
	}
	
	public Room(int number) {
		this.number = number;
		this.guest = Person.getDefaultPerson();
	}
	
	public void moveInGuest(Person guest) {
		this.guest = guest;
	}
	
	public void moveOutGuest() {
		this.guest = Person.getDefaultPerson();
	}
	
	public Person getGuest() {
		return this.guest;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public boolean isEmpty() {
		if(this.guest.equals(Person.getDefaultPerson()))
			return true;
		return false;
	}
	
	
	
}
