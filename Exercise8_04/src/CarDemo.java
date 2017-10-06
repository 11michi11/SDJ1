
public class CarDemo {

	public static void main(String[] args) {

		Car skoda = new Car("John", "blue", "65464");

		System.out.println(skoda.getOwner() + 
				"\n" + skoda.getColour() +
				"\n" + skoda.getRegistrationNumber());
		
		skoda.setColour("black");
		skoda.setOwner("Maggie");
		skoda.setRegistrationNumber("694682");
		
		System.out.println("After changes");
		System.out.println(skoda.getOwner() + 
				"\n" + skoda.getColour() +
				"\n" + skoda.getRegistrationNumber());
		
	}
}
