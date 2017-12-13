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
	static int count = 0; //static �޸� ������ count�� ���.
	int serialNum; //heap �޸� ������ serialNum�� ���.
	static{
		System.out.println("static{}");//�� �ѹ��� ����. Ŭ���� ������ Ÿ�Լ���(import���ص�)�ص� �޸𸮿� ���.�׷��� ���� ���� �޸𸮿� ���.
	}
	
	{
		//System.out.println("{}");	//�ʱ�ȭ ���� �����ں��� ���� ���� , �ν��Ͻ�, Ŭ���� ���� ��� ���� �����ϴ�.
		
		++count;
		serialNum = count;
	}
	
	public Product(){
		//System.out.println("BlockTest() �⺻ ������");//���������� ����Ʈ �����ڰ� ����ȴ�. 
	}
}
