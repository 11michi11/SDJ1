import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[100];
		int number;

		System.out.println("Insert positive integers (maximum 100 integers, insert 0 to stop)");

		for (int i = 0; i < 100; i++) {
			System.out.print("Enter the next number:");
			number = in.nextInt();
			while (number < 0) {
				System.out.println("Insert positive integer!");
				number = in.nextInt();
			}

			if (number == 0)
				break;
			else
				array[i] = number;
		}

		for (int i = 0; i < 100; i++) {
			if (array[i] != 0) {
				for (int j = 0; j < 100; j++) {
					if (array[j] != 0)
						System.out.println(array[i] + " - " + array[j] + " = " + (array[i] - array[j]));
				}
			}

		}

	}
}
