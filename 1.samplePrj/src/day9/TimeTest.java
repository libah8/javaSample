package day9;

import util.Time;

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		
		Time t2 = new Time(15,0,2);
		
		//System.out.println(t2.hour);
		t2.setHour(52);
		System.out.println(t2.getHour()+"��");
		t2.setMinute(-7);
		t2.setSecond(-77);
		System.out.println(t2.getMinute());
		System.out.println(t2.getSecond());
		System.out.println("==============================");
		
		Time t3 = new Time(3,16,22);
		Time t4 = new Time(3,-77,22); //-77�� ��ȿ�� �˻縦 ���ļ� ǥ�õ��� �ʴ´�.
		System.out.println(t3);
		System.out.println(t4);
		t4.display();
	}

}
