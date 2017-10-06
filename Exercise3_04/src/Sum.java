import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one, two, three;
        
        System.out.println("Give me first number");
        one = in.nextInt();
        System.out.println("Give me second number");
        two = in.nextInt();
        System.out.println("Give me third number");
        three = in.nextInt();
        
        System.out.println("Here's your sum: " + (one + two + three));
    }
    
    
}
