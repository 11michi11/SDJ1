
public class Apartment {

	private String addres;
	private double rent;
	private Tenant tenant;
	
	public Apartment(String addres, double rent) {
		this.addres = addres;
		this.rent = rent;
		this.tenant = null;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public String getAddres() {
		return addres;
	}
	
	public Tenant getTenant() {
		return this.tenant;
	}
	

	public void rentTo(String name, String phone) {
		this.tenant = new Tenant(name, phone);
	}
	
	public boolean isOccupied() {
		if(this.tenant == null)
			return false;
		else
			return true;
	}
	
	public void evict() {
		this.tenant = null;
	}
	
	
}
