
public class Job {

	private String title;
	private double salary;
	private Person employee;

	public Job(String title, double salary, Person employee) {
		this.title = title;
		this.salary = salary;
		this.employee = employee;
	}
	
	public Job(String title, double salary) {
		this.title = title;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public Person getEmployee() {
		return employee;
	}

	public boolean isAvailable() {
		if (this.employee == null)
			return true;
		else
			return false;
	}

	public void hire(Person employee) {
		if (isAvailable())
			this.employee = employee;
	}
	
	public void fire() {
		this.employee = null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Job))
			return false;
		Job other = (Job) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Job [title=" + title + ", salary=" + salary + ", employee=" + employee + "]";
	}
	
}
