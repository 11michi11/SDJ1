import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise6_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();

		String word = in.nextLine();
		while (!word.equals("")) {
			list.add(word);
			word = in.nextLine();
		}

		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++)
			array[i] = list.get(i);
		
		String[] array1 = new String[list.size()];
		list.toArray(array1);
		
		for(String e : array)
			System.out.println(e);
		
		System.out.println(Arrays.toString(array1));

	}
}
