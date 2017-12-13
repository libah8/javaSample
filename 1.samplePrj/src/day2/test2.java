package day2;

import java.util.Date; //path경로와 유사한 기능이다.
//import java.sql.Date; //같은 class는 import를 걸 수 없다. full path.

public class test2 {

	public static void main(String[] args) {
		
		Date now = new java.util.Date();
		System.out.println(now);
		System.out.println(now.getYear()); //사용금지된 API. 동작은한다.
				
		java.sql.Date today = null;
		System.out.println(today);
		
		now = null; //garbage collector가 변수 now 힙 메모리를 정리한다.
	}

}
