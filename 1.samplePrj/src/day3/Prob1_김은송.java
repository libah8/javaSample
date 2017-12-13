package day3;

import java.util.Scanner;

public class Prob1_김은송 {

	public static void main(String[] args) {
		  /*
        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 문자가 대문자 인 경우에만 
	소문자로 변경하는 코드를 완성 합니다.
  	*/
	
	char ch = 'a';
	int convert = ch+32;
	
	char lowerCase = ('A'<= ch && ch <='Z') ? (char)convert : ch ;
	System.out.printf("ch: %c\t", ch);
	
	if('A'<= ch && ch <='Z'){	
		System.out.println(" to lowerCase :"+lowerCase);
	}else{
		System.out.println("ch는 소문자 입니다.\n");
	}
	
	
	
	/*
	 아래는 변수 num의 값에따라  양수 음수 0을 출력하는 코드입니다.
	삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요. 
	*/
		int num = -90;
		int result = 0;
		
		result = (num == 0) ? 0 :((num > 0) ? num : num);
		System.out.printf("num의 삼항 연산 결과는 %d 입니다.", result);
	}
	
}
	


