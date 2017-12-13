package day12;

public abstract class Animal {
	private String kind = "������ ����";
	
	public Animal() {
		System.out.println("Animal()����");
		//super();�� ������ Animal�� �θ� ������(object)�� ���ٿ´�.
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
