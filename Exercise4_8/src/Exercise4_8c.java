import java.util.Random;
import java.util.Scanner;

public class Exercise4_8c {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rn = new Random();
		
		int x = rn.nextInt(1000) + 1, n;
		
		System.out.println("Guess number (1 - 1000)");
		n = in.nextInt();
		
		while(n != x) {
			if(n > x)
				System.out.println("Too high");
			else if(n < x)
				System.out.println("Too low");
			n = in.nextInt();
		}
		System.out.println("You won!");
	}
}
