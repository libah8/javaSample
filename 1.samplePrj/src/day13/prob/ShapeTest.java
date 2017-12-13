package day13.prob;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2];
		
		shape[0] = new Rectangle(4, 5, 6);
		shape[1] = new RectTriangle(3, 6, 2);
		
		for(int i=0; i<shape.length; i++){
			System.out.printf("area: %5.2f%n",shape[i].getArea());
			if(shape[i] instanceof Resizable){
				((Rectangle)shape[i]).resize(0.5);
				System.out.printf("new area: %5.2f%n",shape[i].getArea());
			}
		}
	}
}
