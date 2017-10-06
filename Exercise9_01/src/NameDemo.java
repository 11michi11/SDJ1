
public class NameDemo {

	public static void main(String[] args) {
		Name name = new Name("John", "Nobody");
		System.out.println(name);
		System.out.println(name.getFullName());
		
		Name chuck = new Name("Chuck Norris");
		System.out.println(chuck.getFormalName());
		
		System.out.println(chuck.getFirstName() + "\n" + chuck.getLastName());
		
		
	}
}
