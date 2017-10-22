import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.set(day, month, year);
	}

	public Date() {
		Calendar cal = GregorianCalendar.getInstance();
		this.day = cal.get(Calendar.DAY_OF_MONTH);
		this.month = cal.get(Calendar.MONTH) + 1;
		this.year = cal.get(Calendar.YEAR);
	}

	public void set(int day, int month, int year) {
		this.year = year > 0 ? year : -year;

		if (month < 1)
			this.month = 1;
		else if (month > 12)
			this.month = 12;
		else
			this.month = month;

		if (day < 1)
			this.day = 1;
		else if (day > numberOfDaysInMonth())
			this.day = numberOfDaysInMonth();
		else
			this.day = day;
	}

	public int numberOfDaysInMonth() {
		switch (this.month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (this.isLeapYear())
				return 29;
			else
				return 28;
		default:
			return -1;
		}
	}

	public boolean isLeapYear() {
		if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0)
			return true;
		return false;
	}

	public Date copy() {
		return new Date(this.day, this.month, this.year);
	}

	@Override
	public String toString() {
		String day = "00".substring(Integer.toString(this.day).length()) + Integer.toString(this.day);
		String month = "00".substring(Integer.toString(this.month).length()) + Integer.toString(this.month);
		String year = "0000".substring(Integer.toString(this.year).length()) + Integer.toString(this.year);

		return day + "." + month + "." + year;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Date) {
			Date date2 = (Date) obj;
			if (this.day == date2.day && this.month == date2.month && this.year == date2.year)
				return true;
			else
				return false;
		} else {
			return false;
		}
	}

}
