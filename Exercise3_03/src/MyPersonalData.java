import java.util.Scanner;

public class MyPersonalData {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String name, address;
	int age;
	
	System.out.println("What's your name?");
	name = in.nextLine();

	System.out.println("What's your age?");
	age = in.nextInt();
	in.nextLine();
	
	System.out.println("What's your address?");
	address = in.nextLine();

	System.out.println("Your name is " + name + ", you're " + age + " and your address is " + address);
    }

}
