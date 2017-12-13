package day13;

import java.util.Arrays;

public class Rectangle extends Shape {
	Point[] p = new Point[4];
	int w;
	int h;

	public Rectangle() {
		super();
	}
	public Rectangle(Point[] p,String color) {
		super(color);
		this.p = p;
	}
	@Override
	public String toString() {
		return "Rectangle [p=" + Arrays.toString(p) + ",\n w=" + w + ", h=" + h + "]";
	}
	@Override
	public void draw(){
		super.draw();
		System.out.println("사각형 그리기");
	}

}
