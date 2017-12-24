
public class PointDemo {

	public static void main(String[] args) {
		
		Line line = new Line(new Point(5,3), new Point(6, 9));
		
		System.out.println(line);
		
		Point a = line.getPointA();
		a.moveTo(9,  5);
		
		System.out.println(line);
	}
}
