
public class Pies extends Zwierze{

	private Obroza obr;
	
	public Pies(String name, int age, Person owner, Obroza obr) {
		super(name, age, owner);
		this.obr = obr;
		this.name = "Kajtek";
	}
	
	public void makeNoise() {
		System.out.println("Hau hau");
	}
	
	
}