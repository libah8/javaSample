package day14.lab3;

public class CommandTest2 {

	public static void main(String[] args) throws Exception{
		Command cmd = null;
		
		cmd = new day14.lab3.DeleteCommand();
		
		Class cls = Class.forName("day14.lab3.DeleteCommand"); // Ŭ������ �̸��� ��Ÿ�ӿ� string���� �Ѱܹ޴´�. �������ε�.
		cmd = (Command)cls.newInstance(); //�Ѱ� ���� �̸��� �޸𸮿� ����.
		
		cmd.exec();
	}

}
