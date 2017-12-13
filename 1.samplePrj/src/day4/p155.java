package day4;

import java.util.Scanner;

public class p155 {

	public static void main(String[] args) {
		char gender;
		String regNo;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민번호 입력하세요. 입력예) 990909-2933314 ");
		regNo = scanner.nextLine();
		
		if(regNo.length() != 14){
			System.out.println("주민번호 에러");
			return; // 이 곳에서 main 함수가  종료된다.
		}
			gender = regNo.charAt(7);
			System.out.println(regNo+" => "+gender); //1 2 3 4 
			
			//if, switch
			
			switch(gender){
				case'1': case'3':
					switch(gender){
					case '1':
						System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
						break;
					case '3':
						System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
					}
					break;
				case'2': case'4':
					switch(gender){
					case '2':
						System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
						break;
					case '4':
						System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
					}
					break;
					default:
					System.out.println("주민번호 오류");
			}

	}

}
