import java.util.Scanner;

public class Exercise5_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int ARRAY_SIZE = 5;
		int sum = 0, min = Integer.MAX_VALUE, max = 0;

		int[] numbers = new int[ARRAY_SIZE];
		System.out.println("Give me 5 ints");

		for (int i = 0; i < ARRAY_SIZE; i++)
			numbers[i] = in.nextInt();

		for (int i : numbers) {
			sum += i;
			if (i < min)
				min = i;
			if (i > max)
				max = i;
		}
		
		System.out.println("Sum: " + sum + "\nAvg: " + ((double)sum/ARRAY_SIZE) + "\nMin: " + min + "\nMax: " + max);

	}
}
