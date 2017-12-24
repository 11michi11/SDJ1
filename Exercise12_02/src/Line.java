
public class Line {

	private String colour;
	private Point pointA, pointB;

	public Line(String colour, Point pointA, Point pointB) {
		this.colour = colour;
		this.pointA = pointA.copy();
		this.pointB = pointB.copy();
	}

	public Line(Point pointA, Point pointB) {
		this.colour = "black";
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Point getPointA() {
		return pointA.copy();
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB.copy();
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public double getLength() {
		return Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
	}

	public String toString() {
		return "A " + colour + " line from (" + pointA.getX() + "," + pointA.getY() + ") to (" + pointB.getX() + ","
				+ pointB.getY() + ") with length equal to " + this.getLength();
	}

	public double getSlope() {
		return (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
	}

	public double getYIntercept() {
		return (pointA.getY() - this.getSlope() * pointA.getX());
	}
	
	public String getSlopeIntercept() {
		return "y=" + this.getSlope() +"x + " + this.getYIntercept();
	}
	
	public boolean equalSlopeIntercept(Line other) {
		if(this.getSlopeIntercept().equals(other.getSlopeIntercept()))
			return true;
		else
			return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Line))
			return false;
		Line other = (Line) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (pointA == null) {
			if (other.pointA != null)
				return false;
		} else if (!pointA.equals(other.pointA))
			return false;
		if (pointB == null) {
			if (other.pointB != null)
				return false;
		} else if (!pointB.equals(other.pointB))
			return false;
		return true;
	}
}
