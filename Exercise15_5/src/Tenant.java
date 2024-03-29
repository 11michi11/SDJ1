
public class Tenant {

	private String name;
	private String phone;
	private double rentDue;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		this.phone = phone;
		this.rentDue = 0;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getRentDue() {
		return rentDue;
	}

	public void setRentDue(double rentDue) {
		this.rentDue = rentDue;
	}

	public Tenant(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public Tenant copy() {
		return new Tenant(this.name, this.phone);
	}

	@Override
	public String toString() {
		return "Tenant [" + (name != null ? "name=" + name + ", " : "") + (phone != null ? "phone=" + phone + ", " : "")
				+ "rentDue=" + rentDue + "]";
	}
	
	
}
