
public class Polygon {
	
	private int numberOfEdges;
	private Colour lineColour;
	private Colour fillColour;
	
	public Polygon(int numberOfEdges, Colour lineColour) {
		this.numberOfEdges = numberOfEdges;
		this.lineColour = lineColour.copy();
		this.fillColour = null;
	}

	public Polygon(int numberOfEdges) {
		this.numberOfEdges = numberOfEdges;
		this.lineColour = new Colour(0,0,0);
		this.fillColour = null;
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	public Colour getLineColour() {
		return lineColour;
	}
	
	
	
	
}
