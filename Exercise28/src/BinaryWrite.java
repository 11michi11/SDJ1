import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BinaryWrite {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Type binary file name: ");
		FileOutputStream file = new FileOutputStream(new File(in.nextLine()));
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		int count = 10;
		out.writeInt(count);
		for(int i=1;i<=10;i++)
			out.writeInt(i*7);
		
		System.out.println("Saved!");
		out.close();
		
	}
	
}
