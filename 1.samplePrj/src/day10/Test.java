package day10;

public class Test {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		System.out.println("---------------------------");
		Dog d = new Dog();
		d.display();
		d.breath();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind);//강아지 종류
		System.out.println(((Animal)d).kind);//동물의 종류
		System.out.println("----------------------------");
		//is A 관계 
		Animal e = new Dog(); //부모 타입으로 업캐스팅을 하면 자식 타입에 접근할 수 없다.
		e.breath();
		((Dog)e).bike();//그래서 자식 타입으로 다운캐스팅을 해줘야한다. 
		System.out.println(e.kind);
		
	
		
	}

}
