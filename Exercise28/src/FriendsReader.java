import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FriendsReader {

	public static void main(String[] args) throws IOException {
		System.out.println("Type file name to read: ");
		Scanner in = new Scanner(System.in);
		Scanner file = new Scanner(Paths.get(in.nextLine()));
		
		while(file.hasNextLine()) {
			System.out.println(file.nextLine());
		}
		
	}
	
}
