package day13.prob;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;
	
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int rectangle, double width, double height) {
		super(rectangle);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width*height;
	}

	@Override
	public void resize(double s) {
		this.width = width*s;
		this.height = height*s;
	}

}
