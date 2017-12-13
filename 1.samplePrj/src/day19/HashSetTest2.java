package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("��","001");
		Employee emp2 = emp1;
		
		Set<Employee> set = new HashSet<>();
		set.add(emp1);
		set.add(emp2);
		System.out.println(set);
		
		set.add(new Employee("��","002"));
		set.add(new Employee("��","002"));
		set.add(new Employee("ȫ","005"));
		set.add(new Employee("��","011"));
		set.add(new Employee("��","022"));
		System.out.println(set);//���� equals()�޼ҵ尡 �������̵� ���� ������ �ּҸ� ���ϱ� ������ �ߺ��� ���ȴ�.
		
		for(Employee data :set){
			System.out.println(data);
			System.out.println("--------------------------------");
		}
		
		System.out.println("====================Iterator=======================");
		Iterator<Employee> data = set.iterator(); 
		while(data.hasNext()){
			Employee emp = data.next();
			System.out.println(emp);
			System.out.println("-------------------------");
		}
	}
}

class Employee implements Comparable<Employee>{
	String name;
	String num;
		
	public Employee() {
		super();
	}

	public Employee(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(num.compareTo(o.num) == 0)
			return name.compareTo(o.name);
		
			return num.compareTo(o.num);
	}
}