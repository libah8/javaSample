package day2;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		Scanner input = null;
		input = new Scanner(System.in);
		
		System.out.print("학생이름을 입력하세요:_ ");
		String name = input.nextLine();
		
		System.out.print("점수를 입력하세요 ex)90 _");
		//int score = Integer.parseInt(input.nextLine());
		int score = input.nextInt();
		input.nextLine();
		
		System.out.printf("이름:%s, 점수:%d %n", name,score);
		
		input.close();
		input = null;

	}
}
