package day15.inner03;

public class Test01 {

	public static void main(String[] args) {
		
		if(args.length==0){
			System.out.println("select|delete|update|insert|select");
			System.out.println("중 하나를 파라미터로 입력하세요.");
			return;
		}
		
		Command delete = new DeleteCommand();
		//delete.exec();
		Command insert = new Command(){
			public void exec(){
				System.out.println("등록 작업 수행 합니다.");
			}
		};
		//insert.exec();
		
		Command update = new Command(){
			public void exec(){
				System.out.println("수정 작업 수행합니다.");
			}
		};
		//update.exec();
		
		Command select = new Command(){
			public void exec(){
				System.out.println("목록 출력 작업을 수행합니다.");
			}
		};
		//select.exec();
		
		Command search = new Command() {
			@Override
			public void exec() {
				System.out.println("검색 작업을 수행합니다.");				
			}
		};
		//search.exec();
		
		/*
		 * if(args[0].equals("delete")){
			delete.exec();
		}else if(args[0].equals("insert")){
			insert.exec();
		}else if(args[0].equals("update")){
			update.exec();
		}else if(args[0].equals("select")){
			select.exec();
		}else{
			search.exec();
		}*/
		
		 
		switch(args[0]){
		case "delete":
			delete.exec();
			break;
		case "select":
			select.exec();
			break;
		case "update":
			update.exec();
			break;
		case "insert":
			insert.exec();
			break;
		default:
			break;
		}
	}	
}

interface Command{
	void exec();
}

class DeleteCommand implements Command{
	public void exec(){
		System.out.println("삭제 작업 수행 ~~~");
	}
}