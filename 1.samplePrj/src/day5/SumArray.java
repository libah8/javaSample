package day5;

public class SumArray {

	public static void main(String[] args) {
		//����)arr �迭 �� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�  .
		int[] arr = {10, 20, 30, 40, 50}; 
		//int[] arr = new int[5]; 
		int sum = 0;	
			
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
				}
		System.out.println("sum="+sum); 
	}

}
