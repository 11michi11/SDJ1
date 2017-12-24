
public class Polygon {

	private int numberOfEdges;
	private Colour lineColour;
	private Colour fillColour;

	public Polygon(int numberOfEdges, Colour lineColour) {
		this.numberOfEdges = numberOfEdges;
		this.lineColour = lineColour.copy();
		this.fillColour = null;
	}

	// If there is no fill colour, it is set to white
	// to avoid nulls which causes NullPointerException
	public Polygon(int numberOfEdges) {
		this.numberOfEdges = numberOfEdges;
		this.lineColour = new Colour(0, 0, 0);
		this.fillColour = new Colour(255, 255, 255);
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	public Colour getLineColour() {
		return this.lineColour.copy();
	}

	// If there is no fill colour, method returns new Colour object,
	// which represents white (255, 255, 255) to avoid nulls which causes
	// NullPointerException
	public Colour getFillColour() {
		if (this.isFilled())
			return this.fillColour.copy();
		else
			return new Colour(255, 255, 255);
	}

	public void fill(Colour colour) {
		this.fillColour = colour.copy();
	}

	// If there is no fill colour, it is set to white
	// to avoid nulls which causes NullPointerException
	public void removeFillColour() {
		this.fillColour = new Colour(255, 255, 255);
	}

	public boolean isFilled() {
		if (!this.fillColour.equals(new Colour(255, 255, 255)))
			return false;
		else
			return true;
	}

	public String getName() {
		switch (this.numberOfEdges) {
		case 3:
			return "Triangle";
		case 4:
			return "Rectanlge";
		case 5:
			return "Pentagon";
		case 6:
			return "Hexagon";
		case 7:
			return "Heptagon";
		case 8:
			return "Octagon";
		default:
			return "Polygon";
		}
	}

	public boolean equals(Object obj) {
		if (obj instanceof Polygon) {
			Polygon other = (Polygon) obj;
			if (this.fillColour.equals(other.fillColour) && this.lineColour.equals(other.lineColour)
					&& this.numberOfEdges == other.numberOfEdges)
				return true;
		}
		return false;
	}

	public String toString() {
		return getName() + " with " + this.lineColour + " line colour and " + this.fillColour + " fill colour";
	}

}
