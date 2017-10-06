
public class Clock {

	private int hour;
	private int minute;
	private int second;
	private boolean is24HourFormat;

	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.is24HourFormat = true;
	}

	public Clock(int timeInSeconds) {
		this.hour = timeInSeconds / 3600;
		this.minute = (timeInSeconds - (this.hour * 3600)) / 60;
		this.second = timeInSeconds - (this.hour * 3600 + this.minute * 60);
		this.is24HourFormat = true;
	}

	public void set(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.second = seconds;
	}

	public void tic() {
		if ((this.second + 1) > 59) {
			if ((this.minute + 1) > 59) {
				if (this.hour + 1 > 23) {
					this.hour = 0;
					this.minute = 0;
					this.second = 0;
				} else {
					this.hour++;
					this.minute = 0;
					this.second = 0;
				}
			} else {
				this.minute++;
				this.second = 0;
			}
		} else {
			this.second++;
		}
	}

	public int convertToSeconds() {
		return hour * 3600 + minute * 60 + second;
	}

	public boolean isBefore(Clock time) {
		if (time.hour > this.hour)
			return false;
		else {
			if (time.minute > this.minute)
				return false;
			else {
				if (time.second > this.second)
					return false;
			}
		}
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Clock))
			return false;
		Clock other = (Clock) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	public void set24HourFormat() {
		this.is24HourFormat = true;
	}

	public void set12HourFormat() {
		this.is24HourFormat = false;
	}

	public boolean is24HourFormat() {
		return is24HourFormat;
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
		if (is24HourFormat) {
			String hour = "00".substring(Integer.toString(this.hour).length()) + Integer.toString(this.hour);
			String minute = "00".substring(Integer.toString(this.minute).length()) + Integer.toString(this.minute);
			String second = "00".substring(Integer.toString(this.second).length()) + Integer.toString(this.second);
			return hour + ":" + minute + ":" + second;
		} else {
			boolean flag = false;
			String hour;
			if (this.hour > 12) {
				hour = "00".substring(Integer.toString(this.hour - 12).length()) + Integer.toString(this.hour - 12);
				flag = true;
			} else
				hour = "00".substring(Integer.toString(this.hour).length()) + Integer.toString(this.hour);

			String minute = "00".substring(Integer.toString(this.minute).length()) + Integer.toString(this.minute);
			String second = "00".substring(Integer.toString(this.second).length()) + Integer.toString(this.second);
			return hour + ":" + minute + ":" + second + (flag ? "PM" : "AM");
		}
	}

}
