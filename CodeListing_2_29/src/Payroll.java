import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {
	
	String name;
	int hours;
	double payRate, grossPay;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("What is your name?");
	name = in.nextLine();
	
	System.out.println("How many hours did you work this week?");
	hours = in.nextInt();
	
	System.out.println("What is your hourly pay rate?");
	payRate = in.nextDouble();
	
	grossPay = hours * payRate;
	
	System.out.println("Hello " + name
		+ "\nYour gross pay is $" + grossPay);
    }
}
