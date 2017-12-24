
public class Hotel {

	private Room[] rooms;
	private int numberOfRooms;

	public Hotel(int maxNumberOfRooms) {
		this.rooms = new Room[maxNumberOfRooms];
		this.numberOfRooms = 0;
	}

	public void addRoom(int roomNumber) {
		rooms[numberOfRooms] = new Room(roomNumber);
		numberOfRooms++;
	}

	public boolean hasEmptyRoom() {
		for (Room e : rooms)
			if (e.isEmpty())
				return true;
		return false;
	}

	public int getNumberOfEmptyRooms() {
		int counter = 0;
		for (Room e : rooms)
			if (e.isEmpty())
				;
		counter++;
		return counter;
	}

	public Room getNextEmptyRoom() {
		if (hasEmptyRoom())
			for (Room e : rooms)
				if (e.isEmpty())
					return e;
		return new Room(-1);
	}

	public int rentRoom(Person guest) {
		Room room = this.getNextEmptyRoom();
		if (room.getNumber() != -1) {
			room.moveInGuest(guest);
			guest.addRoom(room);
		}
		return room.getNumber();
	}

	public boolean doesGuestRentRoom(Person guest) {
		for (Room e : rooms)
			if (e.getGuest().equals(guest))
				return true;
		return false;
	}

	public void freeAllGuestsRooms(Person guest) {
		for (Room e : rooms)
			if (e.getGuest().equals(guest))
				e.moveOutGuest();
	}

	public Room getRoom(int roomNumber) {
		for (Room e : rooms)
			if (e.getNumber() == roomNumber)
				return e;
		return new Room(-1);
	}

}
