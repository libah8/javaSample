package day9;

public class P303 {

	public static void main(String[] args) {
		System.out.println("start");
		Product b1 = new Product();
		Product b2 = new Product();
		Product b3 = new Product();
		
		System.out.println(b1.serialNum);
		System.out.println(b2.serialNum);
		System.out.println(b3.serialNum);
		
		System.out.println(b1.count);
		System.out.println(b2.count);
		System.out.println(b3.count);
		
		System.out.println("end");
	}

}

class Product{
	static int count = 0; //static 메모리 영역에 count가 뜬다.
	int serialNum; //heap 메모리 영역에 serialNum이 뜬다.
	static{
		System.out.println("static{}");//단 한번만 실행. 클래스 변수는 타입선언만(import만해도)해도 메모리에 뜬다.그래서 제일 먼저 메모리에 뜬다.
	}
	
	{
		//System.out.println("{}");	//초기화 블럭이 생성자보다 먼저 수행 , 인스턴스, 클래스 변수 모두 접근 가능하다.
		
		++count;
		serialNum = count;
	}
	
	public Product(){
		//System.out.println("BlockTest() 기본 생성자");//마지막으로 디폴트 생성자가 실행된다. 
	}
}
