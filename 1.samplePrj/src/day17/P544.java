package day17;

import java.util.Calendar;
import java.util.Date;

import sun.util.resources.cldr.bem.CalendarData_bem_ZM;

public class P544 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		System.out.printf("%s , %s , %d , %f %n",name,"~~~",90,5.5);
		
		String msg = String.format("%s , %s , %d , %f %n",name,"~~~",90,5.5);
		System.out.println(msg);
		
		String df = String.format("%5.2f", Math.PI);
		System.out.println(df);
		
		Date d = new Date(2017,11,21);
		System.out.println(d);
		System.out.println(d.getYear());
		System.out.println("========================================");
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		//c.set(2016, 11, 21);
		//System.out.println(c);
		
		df = String.format("%tY년 %tm월 %te일 %ta %n", c,c,c,c);
		System.out.println(df);
		df = String.format("%1$tY년 %1$tm월 %1$te일  %n", c);
		System.out.println(df);
		
	}

}
