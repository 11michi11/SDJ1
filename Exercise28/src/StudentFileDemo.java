import java.io.FileNotFoundException;
import java.text.ParseException;

public class StudentFileDemo {

	public static void main(String[] args) {
		StudentFile file = new StudentFile("Students.txt");
		try {
			System.out.println(file.readTextFile());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
