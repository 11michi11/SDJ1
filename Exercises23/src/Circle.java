
public class Circle extends TwoDimensionalShape{

	private double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "X = " + this.x + " Y = " + this.y + " Radius = " + this.radius;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle other = (Circle) obj;
			if(this.x == other.x && this.y == other.y && this.radius == other.radius)
				return true;
		}
		return false;
	}
	
	public double getArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	
}
