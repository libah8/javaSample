package day17;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee<String, Integer> e1 = new Employee<String, Integer>();
		System.out.println(e1);
		e1.number = "2017";
		System.out.println(e1.number.charAt(e1.number.length()-1));//String 타입이므로 문자열 조작API사용가능.
		
		Employee<Integer, Integer> e2 = new Employee();
		System.out.println(e2);	//Integer객체이므로 주소로 관리
		e2.number = 2015;
		
		Employee e3 = new Employee();
		System.out.println(e3);
		e3.number = 2222;
		e3.number = "444";
		//e3.number.Indexof(); //Object이므로 다운캐스팅을 하지않으면 문자열 조작 API를 사용할 수 없다.
	}
}

class Employee<T,P> implements Comparable<Employee<T,P>>{
	P name;
	T number;

	public Employee() {
		super();
	}


	public Employee(P name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public P getName() {
		return name;
	}


	public void setName(P name) {
		this.name = name;
	}


	public T getNumber() {
		return number;
	}


	public void setNumber(T number) {
		this.number = number;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}


	@Override
	public int compareTo(Employee<T, P> o) {
		
		return 0;
	}
}
