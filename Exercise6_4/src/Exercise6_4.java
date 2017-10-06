import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise6_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		System.out.println("Insert 10 integers");
		for (int i = 0; i < 10; i++)
			numbers.add(in.nextInt());

		Collections.sort(numbers);
		System.out.println(numbers);
		int occur = 1, curr = 0, next = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			curr = next;
			next = numbers.get(i);

			if (curr == next)
				occur++;
			else {
				System.out.println(curr + " occurs " + occur + " times");
				occur = 1;
			}
		}
		if (curr == next) {
			System.out.println(curr + " occurs " + occur + " times");
		} else {
			System.out.println(next + " occurs " + occur + " times");
			occur = 1;
		}

	}
}
