
public class Junior extends ClubMember {

	private char gender;
	
	public Junior(String name, int age, char gender) {
		super(name, age);
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString(){
		return this.name + ", " + this.age + ", " + (this.gender == 'm' ? "Boy" : "Girl");
	}

	@Override
	public double getMembershipFee() {
		return this.gender == 'm' ? 400 : 300;
	}

}
