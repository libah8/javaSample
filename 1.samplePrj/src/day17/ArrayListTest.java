package day17;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		int[] i;
		String[] s;
		Student[] ss;
		Object[] ob;
		
		ArrayList list1 = new ArrayList();	//Object 관리
		list1.add(new Student("홍씨",23));
		list1.add("hello java");
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		((String)list1.get(1)).toUpperCase();
		
		ArrayList<String> list2 = new ArrayList<String>();	//String 관리
		for(int j=0;j<100;j++){
			list2.add("test"+j);
		}
		list2.add(3,"~~~");
		list2.remove(1);
		list2.remove("test 0");
		System.out.println(list2);
		System.out.println(list2.size()); //배열을 자동으로 관리하고 있기 때문에 j가 200이면 200으로 길이가 증가한다.

		for(int j=0;j<list2.size();j++){
			//System.out.println(list2.get(j).substring(list2.get(j).length()-2));
			System.out.println(list2.get(j).toUpperCase());
			
		}
		
		
					}

}
