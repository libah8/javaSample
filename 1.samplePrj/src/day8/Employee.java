package day8;
/**
 * 
 * @author student
 * @since 2017.11.08
 */
public class Employee {
	String name;
	String dept;
	String num;
	
	
	public Employee(){
		this("000","사원명", "OO부");
		//this.num="000";
		//this.nmae="사원명";
		//this.dept="OO부";
		
		System.out.println("Employee() 생성자 함수");
	}
	public Employee(String num, String name, String dept){
		this.num = num ;
		this.name = name;
		this.dept = dept;
	}

	/**
	 *Employee 정보 출력용~~~~ 
	 *
	 */
	public void display(){
		System.out.printf("Employee[%s,%s,%s] %n", num,name,dept);
	}
	
	//
	/* */
}
