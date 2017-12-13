package day12;
//Animal을 import시키면 지금 만든 Animal클래스가 아니라 전에 만들어 둔 Animal클래스가 import된다.
public class Dog extends Animal {
	String kind = "강아지 종류";
	String name;
	
	public Dog() {
		super();
	}

	public Dog(String kind, String name) {
		super();
		this.kind = kind;
		this.name = name;
	}
	
	public Dog(String superk, String kind, String name) {
		super(superk);
		this.kind = kind;
		this.name = name;
	}
	public void display(){
		System.out.printf("Dog[%s %s %s]%n",super.getKind(),kind,name);
	}

	@Override
	public void breath() {
		System.out.println("폐로 동작");
	}
}
