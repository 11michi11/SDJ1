
public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour >= 0 ? hour : 0;

		if (minute >= 60)
			this.minute = 59;
		else if (minute < 0)
			this.minute = 0;
		else
			this.minute = minute;

		if (second >= 60)
			this.second = 59;
		else if (second < 0)
			this.second = 0;
		else
			this.second = second;
	}

	public Time(int timeInSeconds) {
		this.hour = timeInSeconds / 3600;
		this.minute = (timeInSeconds - this.hour * 3600) / 60;
		this.second = ((timeInSeconds - hour * 3600) - this.minute * 60);
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	public int getTimeInSeconds() {
		return this.hour * 3600 + this.minute * 60 + this.second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour >= 0 ? hour : 0;

		if (minute >= 60)
			this.minute = 59;
		else if (minute < 0)
			this.minute = 0;
		else
			this.minute = minute;

		if (second >= 60)
			this.second = 59;
		else if (second < 0)
			this.second = 0;
		else
			this.second = second;
	}

	public String toString() {
		String hour = "00".substring(Integer.toString(this.hour).length()) + Integer.toString(this.hour);
		String minute = "00".substring(Integer.toString(this.minute).length()) + Integer.toString(this.minute);
		String second = "00".substring(Integer.toString(this.second).length()) + Integer.toString(this.second);
		return hour + ":" + minute + ":" + second;
	}

}
