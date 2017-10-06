import java.util.Scanner;

public class PayrollWithTax {

    public static void main(String[] args) {
	
	String name;
	int hours;
	double payRate, grossPay, taxRate;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("What is your name?");
	name = in.nextLine();
	
	System.out.println("How many hours did you work this week?");
	hours = in.nextInt();
	
	System.out.println("What is your hourly pay rate?");
	payRate = in.nextDouble();
	
	System.out.println("What is your tax rate?");
	taxRate = in.nextDouble();
	
	grossPay = (hours * payRate) - (hours * payRate * taxRate);
	
	System.out.println("Hello " + name
		+ "\nYour gross pay is $" + grossPay);

    }

}
