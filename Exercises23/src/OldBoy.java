
public class OldBoy extends ClubMember {

	private int yearsOfMembership;
	
	public OldBoy(String name, int age, int yearsOfMembership) {
		super(name, age);
		this.yearsOfMembership = yearsOfMembership;
	}

	public int getYearsOfMembership() {
		return yearsOfMembership;
	}

	public void setYearsOfMembership(int yearsOfMembership) {
		this.yearsOfMembership = yearsOfMembership;
	}

	public String toString() {
		return this.name + ", " + this.age + ", Years of membership = " + this.yearsOfMembership;
	}
	
	@Override
	public double getMembershipFee() {
		if(this.yearsOfMembership < 5)
			return 300;
		else if(this.yearsOfMembership <= 9)
			return 200;
		else
			return 100;
	}

}
