import java.util.Scanner;

public class Exercise4_03 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Eneter a  number in the range of 10 through 25");
		int num = in.nextInt();
		while(num < 10 || num > 25) {
			System.out.println("Wrong number! Eneter a  number in the range of 10 through 25");
			num = in.nextInt();
		}
		
		System.out.println("Good! Your number is " + num);
	}
}
