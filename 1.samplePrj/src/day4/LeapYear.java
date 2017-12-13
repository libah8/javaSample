package day4;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/*[예제] int형 변수 year가 400으로 나눠떨어지거나 
	    또는 4로 나눠떨어지고  
	    100 나눠떨어지지 않을 때 인 조건식을 만들어 보세요(윤년공식).*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윤년을 구하고 싶은 년도를 입력하세요:");
		int inputYear = Integer.parseInt(scanner.nextLine());
		
		if(inputYear % 4 == 0 && inputYear % 100 != 0 || inputYear % 400 == 0 ){
			System.out.printf("%d년은 윤년입니다.", inputYear);
		}else{
			System.out.printf("%d년은 평년입니다.", inputYear);
		}
		
		
		

	}

}
