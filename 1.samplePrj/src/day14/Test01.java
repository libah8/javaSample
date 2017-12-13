package day14;

public class Test01 {

	public static void main(String[] args) {
	AA a = new AA();
	BB b = new BB();
	//a = b; 타입 불일치. a에 b는 들어갈 수 없다.
	
	A[] aaa = {new AA(), new BB()};
	B[] bbb = {new AA(), new BB()};
	C[] ccc = {new AA(), new BB()};
	I[] iii = {new AA(), new BB()};
	
	for(int i=0; i<aaa.length; i++){
		aaa[i].a();
		bbb[i].b();
		ccc[i].c();
		iii[i].a();
		iii[i].b();
		iii[i].c();
	}
	
	
	}

}

class AA extends Object implements I{

	@Override
	public void c() {	}

	@Override
	public void b() {	}

	@Override
	public void a() {	}
	
}

class BB extends Object implements I{
	@Override
	public void c() {	}

	@Override
	public void b() {	}

	@Override
	public void a() {	}
}

interface I extends A,B,C{
	
}

interface A{
	void a();
}

interface B{
	void b();
}

interface C{
	void c();
}

