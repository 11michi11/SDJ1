
public class Beer extends Beverage {
    
    private String type;
    
    public Beer(String type, double alcPerc, double vol, String name) {
	super(alcPerc, vol, name);
	this.type = type;
    }

}
