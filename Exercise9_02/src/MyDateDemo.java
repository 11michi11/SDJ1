
public class MyDateDemo {

	public static void main(String[] args) {
		MyDate date = new MyDate(2017, 9, 19);
		System.out.println(date);
		
		date.set(-1998, -5, 45);
		System.out.println(date);
		
		System.out.println(date.getDay() + " " + date.getMonth() + " " + date.getYear());
		
		
		
		System.out.println("Is leap year? " + date.isLeapYear());
		System.out.println("Number of days in month: " + date.numberOfDaysInMonth());
		System.out.println("Month: " + date.getMonthName());
		
		System.out.println(date);
		date.stepForward(10);
		date.stepForward(400);
		System.out.println(date);
		
		System.out.println(MyDate.convertToMonthNumber("May"));
		
		date.set(15, "May", 8512);
		System.out.println(date);
		
		System.out.println(date.equals(new MyDate(8512,5,15)));
		System.out.println(date.equals(new MyDate(16,5,8512)));
		
		MyDate copyDate = date.copy();
		System.out.println(copyDate);
		
		MyDate dateNoParam = new MyDate();
		System.out.println(dateNoParam);
		
		date.set(2017,9,19);
		System.out.println(date.isBefore(new MyDate(2017,9,18)));
		
		System.out.println(date.yearsBetween(new MyDate(2027,9,20)));
		System.out.println(date.daysBetween(new MyDate(2017,12,24)));
		
		System.out.println(MyDate.now());
		
		date.set(1582,2,24);
		
		MyDate now = MyDate.now();
		
		int leaps = 0;
		while(date.isBefore(now)) {
			if(date.isLeapYear())
				leaps++;
			date.set(date.getYear()+1, date.getMonth(), date.getDay());
		}
		System.out.println(leaps);
		
		
		
	}
}
