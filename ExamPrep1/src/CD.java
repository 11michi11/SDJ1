import java.util.ArrayList;

public class CD {

	private String title;
	private ArrayList<CDTrack> trackList;

	public CD(String title) {
		this.title = title;
		this.trackList = new ArrayList<CDTrack>();
	}

	public void addTrack(CDTrack track) {
		this.trackList.add(track.copy());
	}

	public String getTitle() {
		return this.title;
	}

	public Time getDuration() {
		int len = 0;

		for (CDTrack e : trackList)
			len += e.getLength().getTimeInSeconds();

		return new Time(len);
	}

	public CDTrack getCDTrack(int trackNumber) {
		return trackList.get(trackNumber - 1).copy();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("");

		sb.append(this.title);
		sb.append("\n" + this.getDuration());

		for (CDTrack e : trackList)
			sb.append("\n" + e);

		return sb.toString();
	}
}
