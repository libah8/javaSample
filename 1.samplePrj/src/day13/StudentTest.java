package day13;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.toString());
		System.out.println(s.getClass());
		Student s1 = s;
		System.out.println(s.equals(s1));
		System.out.println(s1==s);
		
		Student[] students = {s, new Student("B",1), new Student()};
		for(int i=0; i<students.length; i++){
			System.out.println(students[i]);
		}
	}
}
