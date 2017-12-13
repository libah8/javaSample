package day5;

import java.util.Arrays;
import java.util.Scanner;

public class P187 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요");
		int[] num;
		num = new int[Integer.parseInt(scanner.nextLine())];
		for(int i=0; i<num.length; i++){
			num[i] = (int)(Math.random()*45)+1;
		}
		
		/*
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		*/
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(num));
		System.out.println();
	}

}
