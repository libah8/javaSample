package day20;

public class Test04 {

	public static void main(String[] args) {
		//if(args.length == 0){
			//System.out.println("delete update select insert �� �ϳ��� �Է��ϼ���.");
			//return;
		//}
		
		Command delete = new Command(){ //�͸� Ŭ������ �������̽� �ƴϴ��� ���� �� �ִ�.

			@Override
			public void exec() {
				System.out.println("~~~~~delete ����");
			}
		};
		
		Command update = new Command(){

			@Override
			public void exec() {
				System.out.println("~~~~~update ����");
			}
		};
		
		Command select = new Command(){

			@Override
			public void exec() {
				System.out.println("~~~~~~select ����");
			}
		};
		Command insert = new Command(){

			@Override
			public void exec() {
				System.out.println("~~~~~insert����");	
			}
		};
		
		insert.exec();
		delete.exec();
		select.exec();
		update.exec();

	}

}
