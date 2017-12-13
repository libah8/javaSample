package day13;

public class ShapeTest {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10);
		
		Circle c1 = new Circle("RED",p1,3);
		System.out.println(c1);
		c1.draw();
		
		System.out.println("======================================");
	
		((Shape)c1).draw();
		Object obj = c1;
		System.out.println(obj);

	}

}
