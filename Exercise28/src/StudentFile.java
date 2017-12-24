import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Scanner;

public class StudentFile {
	private File file;

	public StudentFile(String filename) {
		setFile(filename);
	}

	public void setFile(String filename) {
		file = new File(filename);
	}

	public File getFile() {
		return file;
	}

	public StudentList readTextFile() throws FileNotFoundException, ParseException {
		int group, studyNumber, birthDay, birthMonth, birthYear;
		String name, nationality;
		String[] content = new String[1];
		Student student;
		MyDate birthday;
		StudentList list = new StudentList();
		Scanner in = null;

		try {
			in = new Scanner(file);
			try {
				while (in.hasNextLine()) {
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
					list.add(student);
				}
			} finally {
				if (content.length != 7)
					throw new ParseException("Input in wrong formatt", content.length);
			}
		} finally {
			if (in == null)
				throw new FileNotFoundException();
		}
		
		in.close();
		return list;
	}

	public StudentList readTextFile(String filename) throws FileNotFoundException, ParseException {
		setFile(filename);
		return readTextFile();
	}

	public void writeTextFile(StudentList students) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(file);
		
	}

	public void writeTextFile(StudentList students, String filename) throws FileNotFoundException {
		setFile(filename);
		writeTextFile(students);
	}

	public void writeBinaryFile(StudentList list) throws IOException {
		// TODO: Implement this method
	}

	public void writeBinaryFile(StudentList list, String filename) throws IOException {
		setFile(filename);
		writeBinaryFile(list);
	}

	public StudentList readBinaryFile() throws IOException, ClassNotFoundException {
		// TODO: Implement this method
		return null;
	}

	public StudentList readBinaryFile(String filename) throws IOException, ClassNotFoundException {
		setFile(filename);
		return readBinaryFile();
	}

	public static void main(String[] args) {
		StudentFile sFile = new StudentFile("Students.txt");

	}
}
