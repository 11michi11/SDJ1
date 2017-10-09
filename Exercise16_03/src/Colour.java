
public class Colour {

	private int[] RGB;
	
	public Colour(int red, int green, int blue) {
		this.RGB[0] = red;
		this.RGB[1] = green;
		this.RGB[2] = blue;
	}
	
	public void set(int red, int green, int blue) {
		this.RGB[0] = red;
		this.RGB[1] = green;
		this.RGB[2] = blue;
	}
	
	public int getRed() {
		return this.RGB[0];
	}
	
	public int getGreen() {
		return this.RGB[1];
	}

	public int getBlue() {
		return this.RGB[2];
	}
	
	public boolean isBlack() {
		if(this.RGB[0] == 0 && this.RGB[1] == 0 && this.RGB[2] == 0)
			return true;
		else
			return false;
	}
	
	public Colour copy() {
		return new Colour(this.RGB[0], this.RGB[1], this.RGB[2]);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Colour) {
			Colour other = (Colour) obj;
			if(this.RGB[0] == other.RGB[0] && this.RGB[1] == other.RGB[1] && this.RGB[2] == other.RGB[2])
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "RGB = (" + this.RGB[0] + ", " + this.RGB[1] + ", " + this.RGB[2] + ")";
	}
}
