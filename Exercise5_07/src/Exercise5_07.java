import java.util.Scanner;

public class Exercise5_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is the size of the array?");
		final int ARRAY_SIZE = in.nextInt();
		int[] array = new int[ARRAY_SIZE];

		System.out.println("Insert values");
		for (int i = 0; i < ARRAY_SIZE; i++)
			array[i] = in.nextInt();

		int neg = 0;
		for(int e:array)
			if(e<0)
				neg++;
		
		System.out.println("There are " + neg + " negative numbers in array");
	}
}
