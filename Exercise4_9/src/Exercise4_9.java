import java.util.Scanner;

public class Exercise4_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = 512, ans, base = 512;
		boolean won = false;
		
		do {
			System.out.println("Is your number " + num +"? (0 - too low, 1 - yes, 2 - too high)");
			ans=in.nextInt();
			
			switch(ans) {
			case 0: 
				num += base/2;
				base/=2;
				break;
			case 1:
				won = true;
				break;
			case 2:
				num -= base/2;
				base/=2;
				break;
			}
		}while(!won);
		System.out.println("I won!");

	}

}
