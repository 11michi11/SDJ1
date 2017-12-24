import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			int a = in.nextInt();
			System.out.println(a);
		}catch(InputMismatchException e) {
			System.out.println("Wrong input!!!");
			System.out.println("Enter correct value:");
			w
		}
	}
}
