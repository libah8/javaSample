package day15.inner02;

public class Test01 {
	public static void main(String[] args) {
		A.B b = new A().new B();
		b.print();
		
		new A().pp();
		
		A.S s = new A.S();
		s.print();
	}
}

class A{
	String name = "A";
	
	void pp(){
		new B().print();
	}
	
	class B{
		void print(){
			System.out.println(name);
		}
	}
	
	static class S{
		void print(){
			//System.out.println(name);
			System.out.println("~~~~~~~~~~~");
		}
	}
}


