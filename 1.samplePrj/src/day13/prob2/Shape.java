package day13.prob2;

public abstract class Shape {

	private int numSides;
	
	//public Shape() {
		//super();
	//}-->문제에서 디폴트 생성자를 원하지 않았다.
	
	
	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	abstract double getArea();//넓이
	
	@Override
	public String toString() {
		return "Shape [numSides=" + numSides + "]";
	}
	
}

interface Resizable{
	void resize(double s);
}

class RecTriangle extends Shape{
	double w;
	double h;
	
	
	public RecTriangle(int w, int h) {
		super(3);
		this.w = w;
		this.h = h;
	}


	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return w*h/2;
	}
	
}

class Rectangle extends Shape implements Resizable{
	double w;
	double h;
	
	public Rectangle(int w, int h) {
		super(4);
		this.w = w;
		this.h = h;
	}

	@Override
	public void resize(double s) {
		this.w = w*s;
		this.h = h*s;
		
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return w*h;
	}
}