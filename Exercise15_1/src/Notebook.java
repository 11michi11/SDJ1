import java.util.Arrays;

public class Notebook {

	private int numberOfNotes;
	private Note[] notes;
	
	public Notebook(int maxNumberOfNotes) {
		this.numberOfNotes = 0;
		this.notes = new Note[maxNumberOfNotes];
	}

	public int getNumberOfNotes() {
		return numberOfNotes;
	}
	
	public Note getNote(int index) {
		return notes[index];
	}
	
	public String getMessage(int index) {
		return notes[index].getMessage();
	}
	
	public void addNote(Note note) {
		notes[numberOfNotes] = note;
		numberOfNotes++;
	}
	
	public void addNote(String message) {
		notes[numberOfNotes] = new Note(message);
		numberOfNotes++;
	}
	
	public void addHighPriorityNote(String message) {
		notes[numberOfNotes] = new Note(message);
		notes[numberOfNotes].setToHighPriority();
		numberOfNotes++;
	}
	
	public void removeNote(int index) {
		for(int i = index;i<numberOfNotes - 1;i++)
			notes[i] = notes[i + 1];
		notes[numberOfNotes] = null;
	
		numberOfNotes--;
	}
	
	public Note[] getAllNotes() {
		Note[] copy = new Note[numberOfNotes];
		for(int i = 0;i<numberOfNotes;i++)
			copy[i] = this.notes[i].copy();
		return copy;
	}
	
	public int getNumberOfHighPriorityNotes() {
		int count = 0;
		for(Note e:notes) {
			if(e != null)
				if(e.isHighPrioriy())
					count++;
		}
		return count;
	}
	
	public Note[] getAllHighPriorityNotes() {
		Note[] highNotes = new Note[getNumberOfHighPriorityNotes()];
		int count = 0;
		for(Note e:notes) {
			if(e != null)
				if(e.isHighPrioriy()) {
					highNotes[count] = e;
					count++;
				}
		}
		return highNotes;
	}

	@Override
	public String toString() {
		return "Notebook [numberOfNotes=" + numberOfNotes + ", "
				+ (notes != null ? "notes=" + Arrays.toString(notes) : "") + "]";
	}
	
	
}
