
public class ZwierzeDemo {

	public static void main(String[] args) {
		Pies kajtek = new Pies("Kajtek", 5, new Person("Kasia", 19), new Obroza());
		
		
		System.out.println(kajtek.getName());
		System.out.println(kajtek.getAge());
		System.out.println(kajtek.getOwner());
		kajtek.makeNoise();

		System.out.println(kajtek.name);
		
	}
}
