package day2;

public class P95 {

	public static void main(String[] args) {
		float x = 'a';
		double y = 7 + 8 * x;
		System.out.printf("y=%10.2f %n",y);
		
		int i = 5, j = 5;
		System.out.printf("i = %d, j = %d : i==j => %s %n",i,j,i==j);
		System.out.printf("i = %d, j = %d %n",i,j);
		System.out.println(i++);
		System.out.printf("i = %d, j = %d %n",i,j);
		System.out.printf("i = %d, j = %d : i==j => %s %n",i,j,i==j);
		
		int sum = 100;
		sum = sum + (int)y;
		//sum += (int)y;
		System.out.println(sum);
		System.out.println(sum%10);
		System.out.println(sum/10);
		
		

	}

}
