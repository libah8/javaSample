package day13.prob;

public class RectTriangle extends Shape {
	double width;
	double height;
	
	
	public RectTriangle() {
		super();
	}

	public RectTriangle(int triangle, double width, double height) {
		super(triangle);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width*height/2;
	}

	@Override
	public String toString() {
		return "RectTriangle [width=" + width + ", height=" + height + "]";
	}
	
}
