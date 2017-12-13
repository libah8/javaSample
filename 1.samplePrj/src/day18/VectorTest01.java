package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();
		
		List<Student> list = new Vector<Student>();
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
		//Collection api인 toArray()를 사용할 수 없기 때문에 list를 Student[]로 캐스팅을 할 수 없는것인가?  
		
		Student[] temp2 = new Student[list.size()]; //list를 배열로 바꾼다.
		list.toArray(temp2);
		
		Arrays.sort(temp2);
		Arrays.sort(list.toArray()); //배열로 바꿔야만 Arrays로 sort가 가능하다.
		
		Collections.sort(list); //Collections ->interface, Collections -> util Class
		
		for(Student data:list){
			System.out.println(data);
			System.out.println("---------------------------------");
		}

	}
}		
	
