import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FriendsSaver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		File friendsFile = new File("friends.txt");
		PrintWriter out = new PrintWriter(friendsFile);

		
		System.out.println("Type name of friend: ");
		String friend = in.nextLine();
		while(!friend.equals("QUIT")) {
			out.println(friend);
			System.out.println("Type name of friend: ");
			friend = in.nextLine();
		}
		
		
		
		out.close();
	}
}
