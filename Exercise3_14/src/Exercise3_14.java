import java.util.Scanner;

public class Exercise3_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Give me 3 number (so I can change it to date)");
		
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		boolean flag = true;

		switch (b) {
		case 1:
			if (a < 1 || a >= 31) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 2:
			if (a < 1 || a >= 28) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 3:
			if (a < 1 || a >= 31) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 4:
			if (a < 1 || a >= 30) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 5:
			if (a < 1 || a >= 31) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 6:
			if (a < 1 || a >= 30) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 7:
			if (a < 1 || a >= 31) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 8:
			if (a < 1 || a >= 31) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 9:
			if (a < 1 || a >= 3) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 10:
			if (a < 1 || a >= 31) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 11:
			if (a < 1 || a >= 30) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		case 12:
			if (a < 1 || a >= 31) {
				System.out.println("Illegal date");
				flag = false;
			}
			break;
		default:
			System.out.println("Illegal date");
			flag = false;
		}

		if (flag)
			System.out.println(a + "/" + b + "/" + c);
	}
}
