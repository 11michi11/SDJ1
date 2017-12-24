
public class Senior extends ClubMember {

	
	public Senior(String name, int age) {
		super(name, age);
	}

	@Override
	public double getMembershipFee() {
		return 10*(100-this.age);
	}
	
}
