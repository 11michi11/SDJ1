import java.util.Scanner;

public class Exercise4_8a {

	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);

		double x = 1;

		for (int i = 1; i <= 100; i++) {
			x += Math.pow(0.5, i);
			if (i == 5 || i == 25 || i == 100)
				System.out.println("S(" + i + ") = " + x);
		}

		System.out.println("Give me an int");
		int n = in.nextInt();

		x = 1;

		for (int i = 1; i <= n; i++)
			x += Math.pow(0.5, i);

		System.out.println("Your number is " + x);
	}

}
