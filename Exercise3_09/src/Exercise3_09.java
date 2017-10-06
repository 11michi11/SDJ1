import java.util.Scanner;

public class Exercise3_09 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Give me a, b and c (integers)");
	int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
	
	double d = Math.pow(b, 2) - 4 * a * c;
 	
	if(d < 0)
	    System.out.println("No solutions");
	else if(d == 0)
	    System.out.println("One solution: " + (-b/(2*a)));
	else if(d > 0)
	    System.out.println("Two soultions:\n" + ((-b + Math.sqrt(d))/(2*a)) + "\n" + ((-b - Math.sqrt(d))/(2*a)));
	else
	    System.out.println("Error");
    }
}

