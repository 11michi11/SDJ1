import java.util.concurrent.TimeUnit;

public class ClockDemo {

	public static void main(String[] args) {
		Clock clock = new Clock(13,0,0);
		clock.set12HourFormat();
		System.out.println(clock);
		
		for(int i=0;i<86400;i++) {
			clock.tic();
			System.out.println(clock);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
