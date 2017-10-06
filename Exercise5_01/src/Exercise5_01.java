import java.util.Scanner;

public class Exercise5_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int ARRAY_SIZE = 10;

		int[] numbers = new int[ARRAY_SIZE];

		System.out.println("Give me 10 ints");

		for (int i = 0; i < ARRAY_SIZE; i++)
			numbers[i] = in.nextInt();

		System.out.println("Printed in reversed order:");
		for (int i = (ARRAY_SIZE - 1); i >= 0; i--)
			System.out.println(numbers[i]);

	}
}
