import java.util.ArrayList;
public class Notebook {

	private ArrayList<Note> notes;

	public Notebook() {
		this.notes = new ArrayList<Note>();
	}
	
	public int getSize() {
		return notes.size();
	}

	public Note getNote(int index) {
		return notes.get(index);
	}

	public void addNote(Note note) {
		notes.add(note);
	}

	public void addNote(String message) {
		notes.add(new Note(message));
	}

	public void addHighPriorityNote(String message) {
		Note note = new Note(message);
		note.setToHighPriority();
		notes.add(note);
	}

	public void removeNote(int index) {
		notes.remove(index);
	}

	public String getMostImportantNote() {
		for(Note e:notes)
			if(e.isHighPrioriy())
				return e.getMessage();
		return notes.get(0).getMessage();
	}
	
	public int indexOfMostImportantNote() {
		for(Note e:notes)
			if(e.isHighPrioriy())
				return notes.indexOf(e);
		return 0;
	}

}
