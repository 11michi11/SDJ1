import java.util.Scanner;

public class Exercise3_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Give me two integers and I'll do the magic");
		int a = in.nextInt(), b = in.nextInt();

		System.out.print("Sorted: ");
		System.out.println(a > b ? a + " " + b : b + " " + a);
		System.out.println("Sum: " + (a + b));
		System.out.println("Quotient: " + (a * b != 0 ? ((double) a / b) : "cannot divide by 0"));
		System.out.println("Modulus: " + (a * b != 0 ? (a % b) : "cannot divide by 0"));
	}
}
