package day12;

public class ObjectOverrideTest {

	public static void main(String[] args) {
		int i=0, j=0;
		System.out.println(i==j);
		String name = new String("java Test~~~");
		String name2 = new String("java Test~~~");
		System.out.println(name);
		System.out.printf("printf ->%s%n",name);
		
		System.out.println(name.toString());
		System.out.println(name==name2);
		System.out.println(name.equals(name2));
		System.out.println("========================================");
		java.util.Date date = new java.util.Date(); 
		java.util.Date date2 = new java.util.Date(); 
		System.out.println(date.toString());
		System.out.println(date==date2);
		System.out.println(date.equals(date2));
		System.out.println("===================================");		
		ObjectOverride s = new ObjectOverride("홍길동", 22, 1);
		ObjectOverride s2 = new ObjectOverride("홍길동", 22, 1);
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s==s2);
		System.out.println(s.equals(s2));//다운캐스팅
		System.out.println(s.equals(date));
		System.out.println(s.equals(null));
		String s3 = null;
		System.out.println(s.equals(s3));
		
		System.out.println("===================================");
		
	}

}
