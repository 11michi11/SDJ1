
public class Triangle extends TwoDimensionalShape {

	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double x, double y, double sideA, double sideB, double sideC) {
		super(x, y);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSides(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		
	}

	@Override
	public double getArea() {
		double angleC = Math.acos((sideA*sideA + sideB*sideB - sideC*sideC)/(2*sideA*sideB));
		return 0.5*sideA*sideB*Math.sin(angleC);
	}
	
	public String toString() {
		return "X = " + this.x + " Y = " + this.y + "SideA = " + this.sideA + "SideB = " + this.sideB + "SideC = " + this.sideC; 
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Triangle) {
			Triangle other = (Triangle) obj;
			if(this.x == other.x && this.y == other.y && this.sideA == other.sideA && this.sideB == other.sideB && this.sideC == other.sideC)
				return true;
		}
		return false;
	}
	
	
	

}
