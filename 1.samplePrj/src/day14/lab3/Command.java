package day14.lab3;

public interface Command {
	void exec();
	default void newMethod(){
		System.out.println("deault �޼ҵ�");
	}
}

class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("���� ��� ����");
	}
	
	@Override
	public void newMethod(){
		//Command.suptr.newMethod();
		System.out.println("default�޼ҵ� �������");
	}
}

class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("��� ��� ����");
	}
	
}

class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("���� ��� ����");
	}
}

class SelectCommand implements Command{

	@Override
	public void exec() {
		System.out.println("��� ���� ��� ����");
	}

}