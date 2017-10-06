import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give me radius");
		double radius = in.nextDouble(), area, circumference;

		area = 2 * Math.PI * radius;
		circumference = Math.PI * Math.pow(radius, 2);

		System.out.println("Radius: " + radius + "\nArea: " + area + "\nCircumference: " + circumference);
	}

}
