
public class Wine extends Beverage {
    
    private String type;
    private int originCountry;
    
    public Wine(double alcoholPercentages, double volume, String name, String type, int originCountry) {
	super(alcoholPercentages, volume, name);
	this.type = type;
	this.originCountry = originCountry;
    }

    
}
