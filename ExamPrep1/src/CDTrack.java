
public class CDTrack {

	private String title;
	private String artist;
	private Time length;

	public CDTrack(String title, String artist, Time length) {
		this.title = title;
		this.artist = artist;
		this.length = new Time(length.getHour(), length.getMinute(), length.getSecond());
	}

	public String getTitle() {
		return this.title;
	}

	public String getArtist() {
		return this.artist;
	}

	public Time getLength() {
		return new Time(this.length.getHour(), this.length.getMinute(), this.length.getSecond());
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String toString() {
		return artist + " - " + title + " (" + length + ")";
	}
	
	public CDTrack copy() {
		return new CDTrack(this.title, this.artist, this.length);
	}
}
