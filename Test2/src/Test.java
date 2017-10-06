
public class Test {

	public static void main(String[] args) {
		Car car = new Car("black", "John", "165", true);
		
		Car newCar = new Car("black", "John", "165", true);
		
		
		if(newCar.equals(newCar))
			System.out.println("Equal");

		if(this.x == other.x && this.y == other.y)
			return true;
	}
}
