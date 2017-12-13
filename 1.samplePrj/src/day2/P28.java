package day2;

public class P28 {

	public static void main(String[] args) {
		float f = 55.8f;
		System.out.println("f = "+f); //string대상으로 +연산을 하지 않는 것이 좋다.성능저하.
		System.out.printf("f= %5.2f %n",f); //%n (newline)
		System.out.println("=======");
		System.out.println(5/2+","+(5/2.)); //String+연산, 안좋은 코드.
		byte b = 127;
		b=(byte)(b+1);
		System.out.println();
		System.out.println(b);
		char c = 'A';
		System.out.println(c+","+(int)c);
		int n = c+1;
		System.out.println((char)n+","+n);
		
		int num = Integer.parseInt("600");
		System.out.println(num/10);
		//System.out.println("600"/10);
	}

}
