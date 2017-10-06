import java.util.Scanner;

public class Exercise4_06 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ints = 0, sentinel;
		do {
			System.out.println("Give me an int (-1 to exit)");
			sentinel = in.nextInt();
			ints++;
		}while(sentinel != -1);
		
		if(ints == 0)
			ints++;
		
		System.out.println("You've entered " + --ints + " numbers");
	}
}
