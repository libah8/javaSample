package day9;

import util.Time;

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		
		Time t2 = new Time(15,0,2);
		
		//System.out.println(t2.hour);
		t2.setHour(52);
		System.out.println(t2.getHour()+"시");
		t2.setMinute(-7);
		t2.setSecond(-77);
		System.out.println(t2.getMinute());
		System.out.println(t2.getSecond());
		System.out.println("==============================");
		
		Time t3 = new Time(3,16,22);
		Time t4 = new Time(3,-77,22); //-77은 유효성 검사를 거쳐서 표시되지 않는다.
		System.out.println(t3);
		System.out.println(t4);
		t4.display();
	}

}
