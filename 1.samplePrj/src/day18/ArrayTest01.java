package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayTest01 {

	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();
		
		List<Student> list = new ArrayList<Student>();
		//List<Student> list = new Vector<Student>();
		//등록
		list.add(new Student("길동이",90,99));
		list.add(new Student("김씨",100,99));
		list.add(new Student("고씨",90,80));
		list.add(new Student("박씨",70,99));
		
		System.out.println(list);
		
		int delindex = -1;
		for(int i=0; i<list.size(); i++){
			Student data = list.get(i);
			data.avg();
			//list.remove(i);  //삭제 시 for문과 문제 발생.
			//System.out.println(list.size());
			if(data.name.equals("길동")){
				delindex = i;
			}
		}
		//list.remove(delindex);
		System.out.println(list);
		
		for(Student data :list){ //인덱스가 없는 경우
			//System.out.println(data);
			//data.avg();
			//list.remove(data);
		}
		System.out.println(list);
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student data = it.next();
			
			if(data.name.equals("길동이")){
				it.remove();
			}
		}
		//System.out.println(list);
		
		System.out.println("======================================================");
		
		if(list.contains(list.get(2))){
			System.out.println(list.get(2));
		}
		
		System.out.println(list.contains(new Student("고씨", 90, 99)));
		//Student객체는 비교할 능력이 없다.
		//contains는 내부에서 equals로 비교를 한다.
		//그래서 equals메소드는 매우 중요하다.
		
		//Student[] temp = (Student[])list.toArray();
		
		//ArrayList를 배열로 바꾸는 방법들 3
		
		//1
		Object[] tmp = list.toArray();//제네릭이 지원되지 않는 toArray()
		
		//2
		Student[] temp2 = new Student[list.size()];
		list.toArray(temp2); //제네릭이 지원되는 toArray()로 사용
		
		Arrays.sort(temp2);
		Arrays.sort(list.toArray()); //배열로 바꿔야만 Arrays로 sort가 가능하다.
		
		//3
		Collections.sort(list); //Collections ->interface, Collections -> util 
		
		for(Student data:list){
			System.out.println(data);
			System.out.println("---------------------------------");
		}
		
	}
}		
	
class Student implements Comparable<Student>{
	String name;
	int ko;
	int math;
	int avg;
	
	public Student() {
		super();
	}

	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;

	}

	public void avg(){
		avg = (ko+math)/2;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {	//avg를 제외시키고 비교.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public int compareTo(Student o) {
		
		//return name.compareTo(o.name);
		return avg-o.avg;
		
		}
}
