package day2;

import java.util.Date; //path��ο� ������ ����̴�.
//import java.sql.Date; //���� class�� import�� �� �� ����. full path.

public class test2 {

	public static void main(String[] args) {
		
		Date now = new java.util.Date();
		System.out.println(now);
		System.out.println(now.getYear()); //�������� API. �������Ѵ�.
				
		java.sql.Date today = null;
		System.out.println(today);
		
		now = null; //garbage collector�� ���� now �� �޸𸮸� �����Ѵ�.
	}

}
