package day13;

public class Circle extends Shape {
	Point center = new Point();
	int r;
		
	public Circle() {
		super();
	}

	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}
	public Circle(String color, Point center, int r) {
		super(color);
		this.center = center;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [중심점=" + center + ", 반지름=" + r + ", color= "+getColor()+"]";
	}
	
	@Override
	public void draw(){
		super.draw();
		System.out.println("원 그리기");
	}

}
