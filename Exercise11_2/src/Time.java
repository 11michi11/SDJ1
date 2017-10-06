
public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public Time(int timeInSeconds) {
		this.hour = timeInSeconds / 3600;
		this.minute = (timeInSeconds - (this.hour * 3600)) / 60;
		this.second = timeInSeconds - (this.hour * 3600 + this.minute * 60);
	}

	public int getTimeInSeconds() {
		return this.hour * 3600 + this.minute * 60 + this.second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public String toString() {
		String hour;
		if (Integer.toString(this.hour).length() > 2) 
			hour = Integer.toString(this.hour);
		 else 
			hour = "00".substring(Integer.toString(this.hour).length()) + Integer.toString(this.hour);

		String minute = "00".substring(Integer.toString(this.minute).length()) + Integer.toString(this.minute);
		String second = "00".substring(Integer.toString(this.second).length()) + Integer.toString(this.second);

		return hour + ":" + minute + ":" + second;
	}
}
