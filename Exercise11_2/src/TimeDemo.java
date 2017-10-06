
public class TimeDemo {
	
	public static void main(String[] args) {
		Time t0 = new Time(0,3,25);
		Time t1 = new Time(375);
		Time t2 = new Time(0,4,52);
		System.out.println(t0 + "\n" + t1 + "\n" + t2);
		System.out.println(t1.getTimeInSeconds());
		
		t2 = new Time(100,5,1);
		System.out.println(t2);
	}
}
