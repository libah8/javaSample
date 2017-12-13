package day20;

import java.util.Vector;
import day13.Student;

public class ExcalssTest {

	public static void main(String[] args) {
		Student s = new Student("ȫ",24);
		Vector<Integer> i = new Vector<>();
		Exclass e = new Exclass(s, i);
		i.add(55);
		i.add(155);
		i.add(455);
		e.print();
		System.out.println(e);
	}

}
