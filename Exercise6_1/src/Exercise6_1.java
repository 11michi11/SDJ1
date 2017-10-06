import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise6_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Insert some positive integers (insert -1 to stop)");
		
		int number = in.nextInt();
		
		while(number != -1) {
			list.add(number);
			number = in.nextInt();
		}
		
		if(list.size() == 0)
			System.out.println("List empty!");
		else {
			int max = Collections.max(list), index = list.indexOf(max);
			System.out.println("Largest element is at " + index + " index");
		}
		
	}
}
