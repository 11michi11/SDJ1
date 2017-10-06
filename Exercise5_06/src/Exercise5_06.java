import java.util.Arrays;
import java.util.Scanner;

public class Exercise5_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[5];

		System.out.println("Give me 5 ints");

		for (int i = 0; i < 5; i++)
			array[i] = in.nextInt();
		
		Arrays.sort(array);
		
		System.out.println("Second largest value: " + array[3]);
	}
}
