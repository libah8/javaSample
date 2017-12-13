package day11.prob1;

public class Student extends Person {
	private int id;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, int id) {
		super(name,age);
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void print(){
		System.out.printf("이름 : %s  나이 : %d  학  번:%d%n",super.getName(),super.getAge(),id);
	}

	
}
