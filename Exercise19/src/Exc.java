import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("");
		
		
		try{
			int x = in.nextInt();
			System.out.println(x);
		}catch(InputMismatchException e) {
			System.out.println("WRONG");
		}
		
		
		
	}
	
}
