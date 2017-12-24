
public class HotelDemo {

	public static void main(String[] args) {
		Hotel hotel = new Hotel(5);
		
		for(int i = 1;i<6;i++)
			hotel.addRoom(i);
		
		for(int i = 1;i<6;i++){
			Room room = hotel.getRoom(i);
			System.out.println(room.getNumber() + ":" + room.getGuest().getName());
		}
		
		Person john = new Person("John");
		
		hotel.rentRoom(john);
		
		System.out.println("\n\n");
		for(int i = 1;i<6;i++){
			Room room = hotel.getRoom(i);
			System.out.println(room.getNumber() + ":" + room.getGuest().getName());
		}
		
		System.out.println("\n\nDoes John rent a room? " +hotel.doesGuestRentRoom(john));
		
		hotel.rentRoom(john);
		hotel.rentRoom(john);
		
		for(int i = 1;i<6;i++){
			Room room = hotel.getRoom(i);
			System.out.println(room.getNumber() + ":" + room.getGuest().getName());
		}
		
		System.out.println("\n\nHow many empty rooms left? " + hotel.getNumberOfEmptyRooms());
		System.out.println("\n\n Free all John's rooms");
		hotel.freeAllGuestsRooms(john);
		
		for(int i = 1;i<6;i++){
			Room room = hotel.getRoom(i);
			System.out.println(room.getNumber() + ":" + room.getGuest().getName());
		}
		
	}
}
