import java.util.Scanner;

public class MyNameAndAge {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String name, age;

	System.out.println("What's your name?");
	name = in.nextLine();

	System.out.println("What's your age?");
	age = in.nextLine();

	System.out.println("Your name is " + name + " and you're " + age);
    }

}
