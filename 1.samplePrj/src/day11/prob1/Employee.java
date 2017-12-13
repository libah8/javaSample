package day11.prob1;

public class Employee extends Person {
	
	private String dept;
	
	public Employee() {
		super();
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
		//super();
		//super.setName(name);
		//super.setAge(age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print(){
		System.out.printf("이름 : %s  나이 : %d  부  서 : %s%n",super.getName(),super.getAge(),dept);
	}
	
}
