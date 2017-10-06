
public class Exercise5_05 {

	public static void main(String[] args) {
		double sum = 0.0;
		for(double a = 1,b = 30;a<=30 && b > 0; a++, b--)
			sum += a/b;
		
		System.out.println(sum);
		
	}
}
