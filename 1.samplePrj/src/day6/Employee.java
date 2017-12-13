package day6;

public class Employee {
	String name;
	String dept;
	String number;	//이 변수들은 멤버 변수들이다.
	
	public void display(){
		System.out.printf("Employee [사번:%s 사원명:%s 근무부서:%s] %n",number, name, dept);
	}
}
