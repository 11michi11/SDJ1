import java.util.Scanner;

public class GenderTest {
    
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Type gender (M or F): ");
	char gender = in.nextLine().toUpperCase().charAt(0);
	System.out.print("What is your age? ");
	int age = in.nextInt();
	if (gender == 'M' && age >= 18)
	    System.out.print("Man");
	else if (gender == 'M' && age < 18)
	    System.out.print("Boy");
	else if (gender == 'F' && age >= 18)
	    System.out.print("Woman");
	else if (gender == 'F' && age < 18)
	    System.out.print("Girl");
	else
	    System.out.print("Error");
    }
}