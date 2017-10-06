import java.util.Scanner;

public class Exercise3_16 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Give me a colour");
	String colour = in.nextLine().toUpperCase();
	
	switch(colour) {
	case "BLACK":
	    System.out.println("You must be a Goth!");
	    break;
	case "WHITE":
	    System.out.println("You are a very pure person");
	    break;
	case "RED":
	    System.out.println("You are fun and outgoing");
	    break;
	case "BLUE":
	    System.out.println("You're not a Chelsea fan, are you?");
	    break;
	default:
	    System.out.println("Error");
	}
    }
}
