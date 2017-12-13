package day14.lab3;

public class CommandTest2 {

	public static void main(String[] args) throws Exception{
		Command cmd = null;
		
		cmd = new day14.lab3.DeleteCommand();
		
		Class cls = Class.forName("day14.lab3.DeleteCommand"); // 클래스의 이름을 런타임에 string으로 넘겨받는다. 동적바인딩.
		cmd = (Command)cls.newInstance(); //넘겨 받은 이름을 메모리에 띄운다.
		
		cmd.exec();
	}

}
