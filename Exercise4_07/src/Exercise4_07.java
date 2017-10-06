import java.util.Scanner;

public class Exercise4_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Give me an positive int");
		
		n = in.nextInt();
		
		while(n < 1) {
			System.out.println("That's not positive int, you've got one more try");
			n = in.nextInt();
		}
		
		for(int i=1;i<=n;i++) {
			System.out.println(i + "\t" + 2*i + "\t" + Math.pow(i, 2));
		}
	}
}
