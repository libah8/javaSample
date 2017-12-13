package day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("delete update select insert �� �ϳ��� �Է��ϼ���.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Command> map = new HashMap<>();
		
		map.put("delete", new DeleteCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("insert", new InsertCommand());

		Command command = map.get(args[0]);
		if(command==null){
			System.out.println(args[0]+"����� �������� �ʽ��ϴ�.");
			return;
		}
		command.exec();
			
		/*if(map.containsKey(args[0])){
		map.get(args[0]).exec();
		}else{
			System.out.println(args[0]+"����� ���� ���� �ʽ��ϴ�.");
		}
*/	
		System.out.println("Main End");
	}
}



