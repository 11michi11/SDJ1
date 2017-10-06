
public class RectangleDemo {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(100,100);
		Rectangle rect2 = new Rectangle(200,50);
		
		System.out.println(rect1.getWidth());
		System.out.println(rect2.getLength());
		
		rect1.setWidth(300);
		rect2.setLength(500);
		
		System.out.println("After changes");
		System.out.println(rect1.getWidth());
		System.out.println(rect2.getLength());
		
		
	}
}
