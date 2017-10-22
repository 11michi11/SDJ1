
public class Service {

	private int mileage;
	private Date date;

	public Service(int mileage, Date date) {
		this.mileage = mileage;
		this.date = date.copy();
	}

	public int getMileage() {
		return mileage;
	}

	public Date getDate() {
		return date.copy();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Service) {
			Service other = (Service) obj;
			if (this.date.equals(other.date) && this.mileage == other.mileage)
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Date = " + this.date + " mileage = " + this.mileage;
	}

}
