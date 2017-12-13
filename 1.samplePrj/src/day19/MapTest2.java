package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		//HashMap ������ Student ��ü �־ ����
		Map<String, Student> map = new HashMap<>();
		//Map<String, Student> map = new TreeMap<>(); //TreeMap�� �������� �۵��Ѵ�.

	 Student[] s ={
			 	new Student("ȫ�浿","2017008",80,90,80),
				new Student("��浿","2017009",80,90,80),
				new Student("�ڱ浿","20170010",80,90,80),
				new Student("�Ǳ浿","20170011",80,90,80),
				new Student("�̱浿","20170012",80,90,80),
				new Student("�ֱ浿","20170013",80,90,80),
				new Student("�ӱ浿","20170013",88,99,88)
				//�ֱ浿�� �ӱ浿 key���� ����.�ߺ������ ���� �ʱ� ������ ������ �����ͷ� ��������Ʈ.	 
	 }; 
	 
	 for(int i =0; i<s.length; i++){
		 map.put(s[i].getNum(), s[i]); 
	 }
	 
	 Set<String> keys = map.keySet();
	 Iterator<String> it = keys.iterator();
	 while (it.hasNext()) {
		String num = (String) it.next();
		System.out.println(map.get(num));
	 	}
	}
}

class Student{
	String name;
	String num;
	int ko;
	int eng;
	int math;
	int avg;
	
	public Student() {
		super();
	}

	public Student(String name,String num, int ko, int eng, int math) {
		super();
		this.name = name;
		this.num = num;
		this.ko = ko;
		this.eng = eng;
		this.math = math;
		//this.avg = avg;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avg;
		result = prime * result + eng;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (avg != other.avg)
			return false;
		if (eng != other.eng)
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + ", ko=" + ko + ", eng=" + eng + ", math=" + math + ", avg="
				+ avg + "]";
	}

	
	public int avg(){
		return ko+eng+math/3;
	}
	
	
}
