package day12;

public class SingleStaticP352 {

	public static void main(String[] args) {
		//new SingleTone(); //private이므로 외부에서 SingleTone생성자 사용 불가
		SingleTone.getInstance();// static 단 한번만 출력된다.
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
	}

}

class SingleTone{
	private static SingleTone s = new SingleTone();
	
	private SingleTone(){	//외부에서 생성자 사용 불가
		System.out.println("SingleTone()생성");
	}
	
	public static SingleTone getInstance(){
		return s;
	}
}
