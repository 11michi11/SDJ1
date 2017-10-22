import java.util.Arrays;

public class HandIn2Demo {

	public static void main(String[] args) {
		Car car1 = new Car("DW9626", 5161);

		System.out.println("RegNumber:" + car1.getRegistrationNumber() + "\nMileage: " + car1.getMileage()
				+ car1.getServiceBook());
		System.out.println("");

		car1.service();
		car1.drive(500);
		car1.service(new Date(12, 10, 2017));

		System.out.println(car1);

		Car car2 = new Car("987456", 5161);
		car2.service();
		car2.drive(500);
		car2.service(new Date(12, 10, 2017));
		car2.setRegistrationNumber("DW9626");

		Car car3 = new Car("DW5465", 9846);

		System.out.println("");
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car3));

		ServiceBook book1 = car1.getServiceBook();
		car1.drive(600);
		car1.service(new Date(14, 10, 2017));
		System.out.println(book1);
		System.out.println("Last service: " + book1.getDateOfLastService());
		System.out.println("Number of services: " + book1.getNumberOfServices());
		System.out.println("Has service on date 10.10.2017: " + book1.hasServiceOnDate(new Date(10, 10, 2017)));
		System.out.println("Has service on date 11.10.2017: " + book1.hasServiceOnDate(new Date(11, 10, 2017)));
		System.out.println("All services mileage: " + Arrays.toString(book1.getAllServicesMileage()));
		System.out.println("All services: ");
		Service[] servicesArr = book1.getAllServices();
		for (Service e : servicesArr)
			System.out.println(e);

		Service serv = servicesArr[0];
		System.out.println("");
		System.out.println("Service" + serv.getMileage() + " " + serv.getDate());
		System.out.println("Is leap year: " + serv.getDate().isLeapYear());	
	}
}