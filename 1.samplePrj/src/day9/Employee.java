package day9;

public class Employee {
	private String name;  //�̸�
	private int salary;  //�޿�
	private String ssn; //�ֹι�ȣ
	
	public Employee(){
		
	}
	public Employee(String name, int salary, String ssn){
		this.name = name;
		this.salary = salary;
		this. ssn = ssn;
	}
	
	public void setName(String name){
		this.name = name;
	}//set property �Ǵ� setter mothod
	
	public String getName(){
		return this.name;
	}//get property �Ǵ� getter mothod
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public int getSalary(){
		return this.salary;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return this.ssn;
	}
	
	
	public void display(){
		System.out.printf("Employee[%s,%d,%s]%n",name,salary,ssn);
	}
	
}