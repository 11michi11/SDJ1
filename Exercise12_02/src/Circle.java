
public class Circle {

	private double radius;
	private Point centerPoint;
	
	public Circle(double radius, Point centerPoint) {
		this.radius = radius;
		this.centerPoint = centerPoint;
	}

	public double getRadius() {
		return radius;
	}

	public Point getCenterPoint() {
		return centerPoint;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", centerPoint=" + centerPoint + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		if (centerPoint == null) {
			if (other.centerPoint != null)
				return false;
		} else if (!centerPoint.equals(other.centerPoint))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
	
}
