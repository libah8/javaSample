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
		this("000","�����", "OO��");
		//this.num="000";
		//this.nmae="�����";
		//this.dept="OO��";
		
		System.out.println("Employee() ������ �Լ�");
	}
	public Employee(String num, String name, String dept){
		this.num = num ;
		this.name = name;
		this.dept = dept;
	}

	/**
	 *Employee ���� ��¿�~~~~ 
	 *
	 */
	public void display(){
		System.out.printf("Employee[%s,%s,%s] %n", num,name,dept);
	}
	
	//
	/* */
}