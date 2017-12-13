package day8;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		//emp1.num = "001";
		//emp1.name = "홍길동";
		//emp1.dept = "기획부";
		emp1.display();
		
		Employee emp2 = new Employee("002","고길동", "개발부");
		emp2.display();
		
		Employee emp3 = new Employee("003","최길동","기획부");
		emp3.display();
	}

}
