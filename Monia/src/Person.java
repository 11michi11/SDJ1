import java.util.ArrayList;

public class Person {

	private ArrayList<Room> rooms;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.rooms = new ArrayList<Room>();
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age > 0)
			this.age = age;
	}
	
	public String toString() {
		return "Name: " + this.name + ", Age: " + this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person other = (Person) obj;
			if(this.name.equals(other.name) && this.rooms.equals(other.rooms))
				return true;
		}
		return false;
	}
	
	public Person copy() {
		return new Person(this.name, this.age);
	}
	
	
	

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void addRoom(Room room) {
		this.rooms.add(room);
	}
	public static Person getDefaultPerson() {
		return new Person("Empty room", 0);
	}
	
	
}
