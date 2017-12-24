import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class StudentFileReader {

	public static void main(String[] agrs) throws IOException {
		int group, studyNumber, birthDay, birthMonth, birthYear;
		String name, nationality;
		String[] content;
		Student student;
		MyDate birthday;
		StudentList list = new StudentList();
		
		System.out.println("Openning file...");
		Scanner in = new Scanner(Paths.get("Students.txt"));
		
		System.out.println("Reading file..");
		
		while(in.hasNextLine()) {
			content = in.nextLine().split(";");
			group = Integer.parseInt(content[0].trim());
			studyNumber = Integer.parseInt(content[1].trim());
			name = content[2].trim();
			nationality = content[3].trim();
			birthDay = Integer.parseInt(content[4].trim());
			birthMonth = Integer.parseInt(content[5].trim());
			birthYear = Integer.parseInt(content[6].trim());
			
			birthday = new MyDate(birthDay, birthMonth, birthYear);
			student = new Student(name, studyNumber, nationality, group, birthday);
			System.out.println("Created student object nr: " + studyNumber);
			list.add(student);
		}
		
		System.out.println(list);
		
	}
	
}
