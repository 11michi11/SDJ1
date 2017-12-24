
public abstract class TwoDimensionalShape {

	protected double x;
	protected double y;
	
	public TwoDimensionalShape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract String toString();

	public abstract boolean equals(Object obj);
	
	public abstract double getArea();
	
}
