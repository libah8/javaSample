package day8;

public class Student {
	String name;
	String grade;
	String num;
	
	Student(){
		this("김OO","OO학년","OO반");
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
		Student s2 = new Student("진영","2학년","6반");
		s2.display();
		Student s3 = new Student("성미정", "5학년", "7반");
		s3.display();
		Student s4 = new Student("박영미","3학년","5반");
		s4.display();
		Student s5 = new Student("기영주","1학년","9반");
		s5.display();
	}
}
