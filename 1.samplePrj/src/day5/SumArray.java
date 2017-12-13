package day5;

public class SumArray {

	public static void main(String[] args) {
		//예제)arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오  .
		int[] arr = {10, 20, 30, 40, 50}; 
		//int[] arr = new int[5]; 
		int sum = 0;	
			
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
				}
		System.out.println("sum="+sum); 
	}

}
