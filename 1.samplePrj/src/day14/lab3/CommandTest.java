package day14.lab3;

public class CommandTest {

	public static void main(String[] args) {
		Command cmd = null;
		
		if(args[0].equals("delete")){
			cmd = new DeleteCommand();
		}else if(args[0].equals("update")){
			cmd = new UpdateCommand();
		}else{
			cmd = new InsertCommand();
		}
		
		//기능확장이 어렵다.(유지보수 불편)
		cmd.exec();
		cmd.newMethod();
	}

}
