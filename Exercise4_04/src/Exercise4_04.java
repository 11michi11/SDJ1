import java.util.Scanner;

public class Exercise4_04 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] strings = new String[6];
		System.out.println("Give me 6 strings");
		
		for(int i = 0;i<6;i++)
			strings[i] = in.nextLine();
		
		int chars = 0;
		for(String e : strings)
			chars += e.length();
		
		System.out.println("Total number of characters is " + chars);
	}
}
