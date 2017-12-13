package day9;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.display();
		//class 프로퍼티들이 (name, salary, ssn) 캡슐화(private)되었다. set,get메소드를 통해서만 접근 가능하다.
		emp1.setName("홍길동"); 
		emp1.setSalary(50000);
		emp1.setSsn("111-111");
		//emp1.setSsn ="111-111"; //캡슐화전
		emp1.display();
		System.out.println(emp1.getSalary()*0.01);
		

	}

}
