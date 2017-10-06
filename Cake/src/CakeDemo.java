import java.util.Calendar;
import java.util.GregorianCalendar;

public class CakeDemo {
	
	public static void main(String[] args) {
		Cake cake = new Cake("Sernik", 200);
		
		System.out.println(cake);
		
		
		
		Cake cake2 = new Cake("cake", 300);
		Cake rumBall = Cake.makeRumBall(cake, cake2);
		System.out.println(rumBall);
	}
}
