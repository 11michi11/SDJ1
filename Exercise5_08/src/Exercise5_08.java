import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise5_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int ARRAY_SIZE = 4;
		int[] array1 = new int[ARRAY_SIZE];
		int[] array2 = new int[ARRAY_SIZE];

		System.out.println("Insert 4 ints to first array");
		for (int i = 0; i < ARRAY_SIZE; i++)
			array1[i] = in.nextInt();

		System.out.println("Insert 4 ints to second array");
		for (int i = 0; i < ARRAY_SIZE; i++)
			array2[i] = in.nextInt();
		
		System.out.println("Arrays are " + (checkArrays(array1, array2) ? "identical" : "not identical"));
	}

	public static boolean checkArrays(int[] array1, int[] array2) {
		if(array1.length != array2.length)
			return false;
		for (int i = 0; i < array1.length; i++) 
			if(array1[i] != array2[i]) 
				return false;

		return true;
	}
}
