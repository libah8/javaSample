package day8;

public class Student {
	String name;
	String grade;
	String num;
	
	Student(){
		this("��OO","OO�г�","OO��");
	}
	Student(String name, String grade, String num){
		this.name = name;
		this.grade = grade;
		this.num = num;
	}
	
	 void display(){
		System.out.printf("%s %s %s %n",name, grade, num);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student("����","2�г�","6��");
		s2.display();
		Student s3 = new Student("������", "5�г�", "7��");
		s3.display();
		Student s4 = new Student("�ڿ���","3�г�","5��");
		s4.display();
		Student s5 = new Student("�⿵��","1�г�","9��");
		s5.display();
	}
}
