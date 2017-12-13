package day3;

import java.util.Scanner;

public class P117{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("영문자를 하나 입력하세요: ");
		//String data = input.nextLine();
		//char c = data.charAt(0);		
		
		char c = input.nextLine().charAt(0);
		
		//System.out.println("\n입력데이타 : "+data);

		boolean result = 'A'<=c && c <= 'z'; //이 범위에 들어가면 대소문자 구분없는 알파벳이라는 판별식이다.		
		System.out.println(c+"는 영문자인가? : "+result);
	}

}