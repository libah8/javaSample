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
		System.out.println(d.kind);//������ ����
		System.out.println(((Animal)d).kind);//������ ����
		System.out.println("----------------------------");
		//is A ���� 
		Animal e = new Dog(); //�θ� Ÿ������ ��ĳ������ �ϸ� �ڽ� Ÿ�Կ� ������ �� ����.
		e.breath();
		((Dog)e).bike();//�׷��� �ڽ� Ÿ������ �ٿ�ĳ������ ������Ѵ�. 
		System.out.println(e.kind);
		
	
		
	}

}