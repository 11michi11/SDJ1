
public class Note {

	private String message;
	private boolean highPriority;

	public Note(String message) {
		this.message = message;
		this.highPriority = false;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isHighPrioriy() {
		return this.highPriority;
	}

	public void setToHighPriority() {
		this.highPriority = true;
	}

	public void setToLowPriority() {
		this.highPriority = false;
	}

	public Note copy() {
		Note copy = new Note(this.message);
		if (this.highPriority)
			copy.setToHighPriority();
		else
			copy.setToLowPriority();

		return copy;
	}

	@Override
	public String toString() {
		return "Note [message=" + message + ", highPriority=" + highPriority + "]";
	}
}
