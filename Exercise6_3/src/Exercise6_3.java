import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise6_3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> positive = new ArrayList<Integer>(), negative = new ArrayList<Integer>();
		
		System.out.println("Insert some integers (0 to teminate)");
		int number = in.nextInt();
		while(number != 0) {
			if(number > 0)
				positive.add(number);
			else
				negative.add(number);
			
			number = in.nextInt();
		}
		
		
		System.out.println(positive.size() + " positves and " + negative.size() + " negatives. Largest = " + Collections.max(positive) + " Smallest = " + Collections.min(negative));
		
	}
}
