package day9;

public class Employee {
	private String name;  //이름
	private int salary;  //급여
	private String ssn; //주민번호
	
	public Employee(){
		
	}
	public Employee(String name, int salary, String ssn){
		this.name = name;
		this.salary = salary;
		this. ssn = ssn;
	}
	
	public void setName(String name){
		this.name = name;
	}//set property 또는 setter mothod
	
	public String getName(){
		return this.name;
	}//get property 또는 getter mothod
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
