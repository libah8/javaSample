package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("��","001");
		Employee emp2 = emp1;
		
		Set<Employee> set = new TreeSet<>(); 
		//TreeSet�� sort����� ����Ϸ��� Employee class�� Comparable �������̽��� implements�ؾ��Ѵ�.
		set.add(emp1);
		set.add(emp2);
		System.out.println(set);
		set.add(new Employee("��","002"));
		set.add(new Employee("��","009"));
		set.add(new Employee("��","005"));
		set.add(new Employee("��","011"));
		set.add(new Employee("��","011"));
		System.out.println(set);
		//������ equals()�޼ҵ尡 �������̵��� �����̴�.
		//���� equals()�޼ҵ尡 �������̵� ���� ������ �ּҸ� ���ϱ� ������ �ߺ��� ���ȴ�.
		
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

