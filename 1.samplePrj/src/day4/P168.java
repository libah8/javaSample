package day4;

public class P168 {

	public static void main(String[] args) {
		/*1~100������ �հ踦 ���Ͻÿ�.*/
		int sum = 0;
		
		for(int i=1; i<=100; i++){
			sum += i;
			//sum = sum+i;
		}
		System.out.println(sum);
		
		/*4�� ����� �հ�*/
		sum = 0;
		
//		for(int i=0; i<=100; i=i+4){
//			sum = sum + i;
//		}
		
		for(int i=0; i<=100; i++){
		 if(i % 4 == 0)	sum = sum + i;
		}
		System.out.println(sum);
		
		
		sum = 0;
		int i = 1;
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		while(sum!=5050){
			System.out.println("~~~~");
			break; // break�� ���� ������ ���ѷ����� ������.
		}
		
		boolean flag = true;
		do{
			System.out.println("do while "+flag);
			break; 
		}while(flag);
			
	}
}
