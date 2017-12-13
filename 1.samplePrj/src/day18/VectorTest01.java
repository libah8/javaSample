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
		//���
		list.add(new Student("�浿��",90,99));
		list.add(new Student("�达",100,99));
		list.add(new Student("��",90,80));
		list.add(new Student("�ھ�",70,99));
		
		System.out.println(list);
		
		int delindex = -1;
		for(int i=0; i<list.size(); i++){
			Student data = list.get(i);
			data.avg();
			//list.remove(i);  //���� �� for���� ���� �߻�.
			//System.out.println(list.size());
			if(data.name.equals("�浿")){
				delindex = i;
			}
		}
		//list.remove(delindex);
		System.out.println(list);
		
		for(Student data :list){ //�ε����� ���� ���
			//System.out.println(data);
			//data.avg();
			//list.remove(data);
		}
		System.out.println(list);
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student data = it.next();
			
			if(data.name.equals("�浿��")){
				it.remove();
			}
		}
		//System.out.println(list);
		
		System.out.println("======================================================");
		
		if(list.contains(list.get(2))){
			System.out.println(list.get(2));
		}
		
		System.out.println(list.contains(new Student("��", 90, 99)));
		//Student��ü�� ���� �ɷ��� ����.
		//contains�� ���ο��� equals�� �񱳸� �Ѵ�.
		//�׷��� equals�޼ҵ�� �ſ� �߿��ϴ�.
		
		//Student[] temp = (Student[])list.toArray();	
		//Collection api�� toArray()�� ����� �� ���� ������ list�� Student[]�� ĳ������ �� �� ���°��ΰ�?  
		
		Student[] temp2 = new Student[list.size()]; //list�� �迭�� �ٲ۴�.
		list.toArray(temp2);
		
		Arrays.sort(temp2);
		Arrays.sort(list.toArray()); //�迭�� �ٲ�߸� Arrays�� sort�� �����ϴ�.
		
		Collections.sort(list); //Collections ->interface, Collections -> util Class
		
		for(Student data:list){
			System.out.println(data);
			System.out.println("---------------------------------");
		}

	}
}		
	
