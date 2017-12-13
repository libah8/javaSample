package day8;

public class Calc {
	/*
	public static int add(){
		return 0;
	}
	public static int add(int a, int b){
		return a+b;
	}
	*/
	/**
	 * 
	 * @param a 더할 데이터
	 * @return 합계가 리턴됩니다.
	 */
	public static int add(int...a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	public static double add(double a, double b){
		return a+b;
	}
}
