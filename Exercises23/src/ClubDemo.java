import java.util.LinkedList;

public class ClubDemo {

	public static void main(String[] args) {
		LinkedList<ClubMember> list = new LinkedList<ClubMember>();
		
		list.add(new Junior("John", 12, 'm'));
		list.add(new Junior("Clementine", 13, 'f'));
		list.add(new Senior("Ted", 60));
		list.add(new OldBoy("Fred", 40, 7));
		
		
		for(ClubMember e : list)
			System.out.println(e.getMembershipFee());
		
	}
}
