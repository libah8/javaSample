package day10;

public class Test02 {

	public static void main(String[] args) {
		Fish f = new Fish();
		f.breath();
		
		Animal ff = new Fish();
		ff.breath(); //오버라이딩된 메소드는 부모 메소드를 호출하더라도 자식 메소드가 호출된다.
	}

}
