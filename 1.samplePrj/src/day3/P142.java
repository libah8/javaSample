package day3;

import java.util.Scanner;

public class P142 {

	public static void main(String[] args) {
		//키보드를 통해서 점수를 입력받고 
		
		int jumsu;
		char grade = ' '; //java에서는 char 의 초기화는 ' ' blank로 많이 한다.
		Scanner scanner = new Scanner(System.in); //local variable는 초기화가 필요하다.
		System.out.println("점수를 입력하세요! 입력예시)100");
		jumsu = Integer.parseInt(scanner.nextLine());
		
		if(!(0<=jumsu&&jumsu<=100)){
			System.out.println("jumsu가 유효하지 않아 종료 됩니다...");
			return; // 조건식을 만족하지 못하면 main합수를 종료시킨다. 
			        //함수 수행을 끝내고 나를 부른 곳으로 되돌아가는 것이 return이다.
		}
		
		//등급처리
		System.out.println("이제부터 등급처리====");
		
		if(jumsu >= 90){
			grade = 'A'; /*만약에 char grade를 초기화하지 않는다면
						이 조건에 맞을 때에만 'A'로 초기화가 될 것이고 에러가 발생한다.*/
		}else if(jumsu >= 80) {
			grade = 'B';
		}else if(jumsu >= 70){
			grade = 'C';
		}else if(jumsu >= 60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		
		System.out.println(jumsu+" 의 등급은 "+grade);
	}

}
