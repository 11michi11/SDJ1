import java.io.Serializable;
import java.util.LinkedList;

import org.omg.PortableInterceptor.Interceptor;

public class ShapesDemo {

	public static void main(String[] args) {
		LinkedList<TwoDimensionalShape> list = new LinkedList<TwoDimensionalShape>();
		
		Circle circle = new Circle(5,8,2);
		
		System.out.println(circle instanceof TwoDimensionalShape);

		list.add(new Rectangle(1, 5, 5, 9));
		list.add(new Circle(5, 6, 9));
		list.add(new Triangle(5, 6, 3, 4, 5));

//		for (TwoDimensionalShape e : list)
//			System.out.println(e.getArea());		
//		
		for(int i = 0;i<list.size();i++)
			System.out.println(list.get(i).getArea());
	}

}
