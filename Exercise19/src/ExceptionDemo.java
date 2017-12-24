import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] array = new int[5];
		int x = 0;

		System.out.println("Give me 5 numbers (10 - 99)");
		for (int i = 0; i < 5; i++) {
			try {
				x = in.nextInt();
				if (x < 10 || x > 99) {
					System.out.println("Wrong imput! Number not in range Try again");
					i--;
				} else
					array[i] = x;
			} catch (InputMismatchException e) {
//				String str = in.nextLine();
//				if (str.equals("end"))
//					break;
//				else {
				in.nextLine();
				System.out.println("Wrong imput! NaN Try again");
				i--;
//				}
			}
		}
		for (int e : array)
			System.out.println(e);
	}
}
