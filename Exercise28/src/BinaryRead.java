import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class BinaryRead {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Type binary file name: ");
		FileInputStream file = new FileInputStream(new File(in.nextLine()));
		ObjectInputStream inf = new ObjectInputStream(file);
		
		int count = inf.readInt();
		
		for(int i=0;i<count;i++)
			System.out.println(inf.readInt());
	}
	
}