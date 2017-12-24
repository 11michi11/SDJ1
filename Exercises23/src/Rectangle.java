
public class Rectangle extends TwoDimensionalShape{

	private double width;
	private double height;
	
	public Rectangle(double x, double y, double width, double heigth) {
		super(x, y);
		this.width = width;
		this.height = heigth;
	}

	public double getWidth() {
		return width;
	}

	public double getHeigth() {
		return height;
	}
	
	public void setSides(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return this.height * this.width;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			if(this.x == other.x && this.y == other.y && this.width == other.width && this.height == other.height)
				return true;
		}
		return false;
	}

	public String toString() {
		return "X = " + this.x + " Y = "  + this.y + " Width = " + this.width + " Height = " + this.height;
	}
	
}
