import java.util.Scanner;

public class GradeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Give me a grade (7-scale)");

		int grade = in.nextInt();

		System.out.print("Your grade in ECTS is ");

		switch (grade) {
		case 12:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		case 2:
			System.out.println("E");
			break;
		case 0:
			System.out.println("Fx");
			break;
		case -3:
			System.out.println("F");
			break;
		default:
			System.out.println("Error");
		}
	}
}
