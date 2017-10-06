import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the size of the array?");
		int size = in.nextInt();

		while (size < 1) {
			System.out.println("Invalid size! Insert size again");
			size = in.nextInt();
		}
		int[] array = new int[size];

		System.out.println("Insert integers:");

		for (int i = 0; i < size; i++)
			array[i] = in.nextInt();

		int tmp;
		for (int i = 0; i < size / 2; i++) {
			tmp = array[i];
			array[i] = array[(size - 1) - i];
			array[(size - 1) - i] = tmp;
		}

		System.out.println("Reversed:");
		for (int e : array)
			System.out.println(e);
	}
}
