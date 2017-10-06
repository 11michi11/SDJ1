
public class Exercise4_8b {
	public static void main(String[] args) {
		double pi = 4, x = -3;

		for(int i=1;i<=500;i++) {
			pi += 4/x;
			x = x > 0 ? x + 2 : x - 2;
			x*=-1;
		}

		System.out.println("Pi: " + pi);
	}
}
