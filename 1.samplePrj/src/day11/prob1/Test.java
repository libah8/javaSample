package day11.prob1;

public class Test {

	public static void main(String[] args) {
		Object s = new Student("±æµ¿", 20,1);
		((Student)s).print();
		s="Hello";
		if(s instanceof Student)((Student)s).print();
		
		String name = "OOO";
		Student s1 = new Student("±æµ¿", 20,1);
		Teacher t1 = new Teacher("È«»ù",40,"java");
		Employee e1 = new Employee("È«±æµ¿", 44, "±³¹«½Ç");
		
		
		Person[] p = {s1,t1,e1,new Student("°í±æµ¿",30,2)};
		
		System.out.println("====================================1");
		for(int i=0; i<p.length; i++){
			if(p[i] instanceof Student)((Student)p[i]).print();
			if(p[i] instanceof Teacher)((Teacher)p[i]).print();
			if(p[i] instanceof Employee)((Employee)p[i]).print();
		}
		System.out.println("====================================2");
		for(int i=0; i<p.length; i++){
			p[i].print();
		}
		System.out.println("======================================3");
		Person pp = s1;
		pp.print();
		
		System.out.println("=====================================4");
		Object[] obj = {name,s1,t1,e1};
		for(int i=0; i<obj.length; i++){
			if(obj[i] instanceof Person)	((Person)obj[i]).print();
		}
	}

}
