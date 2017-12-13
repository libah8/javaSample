package day12;

public abstract class Animal {
	private String kind = "동물의 종류";
	
	public Animal() {
		System.out.println("Animal()수행");
		//super();를 지워도 Animal의 부모 생성자(object)에 갔다온다.
	}
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

	public abstract void breath();
}
