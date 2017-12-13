package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("김","001");
		Employee emp2 = emp1;
		
		Set<Employee> set = new TreeSet<>(); 
		//TreeSet의 sort기능을 사용하려면 Employee class가 Comparable 인터페이스를 implements해야한다.
		set.add(emp1);
		set.add(emp2);
		System.out.println(set);
		set.add(new Employee("김","002"));
		set.add(new Employee("김","009"));
		set.add(new Employee("김","005"));
		set.add(new Employee("김","011"));
		set.add(new Employee("고","011"));
		System.out.println(set);
		//지금은 equals()메소드가 오버라이딩된 상태이다.
		//만약 equals()메소드가 오버라이딩 되지 않으면 주소만 비교하기 때문에 중복이 허용된다.
		
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

