
public class JobDemo {
	
	public static void main(String[] args) {
		
		Person john = new Person("John", new MyDate(1987,10,2));
		Person bob = new Person("Bob", new MyDate(1997,4,12));
		
		Job delivery = new Job("Delivery", 200.0, john);
		Job transport = new Job("Transport", 300.0);
		
		transport.hire(bob);
		
		System.out.println(delivery.getEmployee());
		
		delivery.fire();
		delivery.hire(bob);
		
		System.out.println(delivery.getEmployee());
		
		System.out.println(delivery.getTitle());
		delivery.setSalary(300.0);
		System.out.println(delivery.getSalary());
		System.out.println(delivery + "\n" + transport);
	}
}
