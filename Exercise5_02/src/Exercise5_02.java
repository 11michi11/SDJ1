import java.util.Scanner;

public class Exercise5_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int ARRAY_SIZE = 7;

		double[] numbers = new double[ARRAY_SIZE];

		System.out.println("Give me 7 doubles");
		for (int i = 0; i < ARRAY_SIZE; i++)
			numbers[i] = in.nextDouble();

		double min = Double.MAX_VALUE;
		for (int i = 0; i < ARRAY_SIZE; i++)
			if (numbers[i] < min)
				min = numbers[i];

		System.out.println("Min value is: " + min);
	}
}
