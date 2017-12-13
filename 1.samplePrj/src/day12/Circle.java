package day12;

public class Circle extends Shape {
	/*원의 면적 구하기*/
	
	@Override
	public double getArea(double r){
		return Math.PI*r*r;
	}
}
