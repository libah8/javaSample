package day20;

public class Test04 {

	public static void main(String[] args) {
		//if(args.length == 0){
			//System.out.println("delete update select insert 중 하나를 입력하세요.");
			//return;
		//}
		
		Command delete = new Command(){ //익명 클래스는 인터페이스 아니더라도 만들 수 있다.

			@Override
			public void exec() {
				System.out.println("~~~~~delete 수행");
			}
		};
		
		Command update = new Command(){

			@Override
			public void exec() {
				System.out.println("~~~~~update 수행");
			}
		};
		
		Command select = new Command(){

			@Override
			public void exec() {
				System.out.println("~~~~~~select 수행");
			}
		};
		Command insert = new Command(){

			@Override
			public void exec() {
				System.out.println("~~~~~insert수행");	
			}
		};
		
		insert.exec();
		delete.exec();
		select.exec();
		update.exec();

	}

}
