package day20;

public class Test05 {

	public static void main(String[] args) {
		//���ٽ� ������ �Լ� ���
		Command delete = ()->{
			System.out.println("delete ����~~~~");
		};
		Command update = ()->System.out.println("Update����");
		Command insert = ()->System.out.println("insert ����");
		Command select = ()->{
			System.out.println("select ����");
		};
		
		select.exec();
		select.print();
	}

}

@FunctionalInterface  //�Լ�ȭ�� ������ �������̽� -->�߻� �޼ҵ尡 �ݵ�� �ϳ��� �־�� �Ѵ�.
interface Command{
	void exec();
	default void print(){
		System.out.println("*******************************");
	}
}

//@FunctionalInterface
interface A{
	void go();
	void stop();
}

class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand ����");
	}
}

class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("UpdateCommand ����");
		
	}
	
}

class SelectCommand implements Command{

	@Override
	public void exec() {
		System.out.println("SelectCommand ����");
		
	}
}

class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("InsertCommand ����");
		
	}
	
}
