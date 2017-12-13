package day16.lang;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[] num = {77,8,99,34};
		int[] num2 = num.clone();
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		
		System.out.println(num); //주소까지 확인.
		System.out.println(num2);
		
		String[] str = {"java","programming"};
		String[] str2 = str.clone();
		str[0] = "python";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
		System.out.println(str);
		System.out.println(str2);
		
		
	}

}
