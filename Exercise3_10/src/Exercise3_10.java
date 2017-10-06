import java.util.Scanner;

public class Exercise3_10 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Give me three numbers");
	double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();

	System.out.print("Sorted: ");
	if(a >= b && b >= c)
	    System.out.println(a + " " + b + " " + c);
	else if(a >= c && c >= b)
	    System.out.println(a + " " + c + " " + b);
	else if(b >= a && a >= c)
	    System.out.println(b + " " + a + " " + c);
	else if(b >= c && c >= a)
	    System.out.println(b + " " + c + " " + a);
	else if(c >= a && a >= b)
	    System.out.println(c + " " + a + " " + b);
	else if(c >= b && b >= a)
	    System.out.println(c + " " + b + " " + a);
    }
}
