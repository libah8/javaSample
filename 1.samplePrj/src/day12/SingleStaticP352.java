package day12;

public class SingleStaticP352 {

	public static void main(String[] args) {
		//new SingleTone(); //private�̹Ƿ� �ܺο��� SingleTone������ ��� �Ұ�
		SingleTone.getInstance();// static �� �ѹ��� ��µȴ�.
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
	}

}

class SingleTone{
	private static SingleTone s = new SingleTone();
	
	private SingleTone(){	//�ܺο��� ������ ��� �Ұ�
		System.out.println("SingleTone()����");
	}
	
	public static SingleTone getInstance(){
		return s;
	}
}
