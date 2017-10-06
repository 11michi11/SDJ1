
import java.util.Scanner;

public class Exercise4_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Type an integer: ");
			int value = in.nextInt();
			sum += value;
		}
		System.out.println("The avg is " + (double)sum/5);
	}
}
