package day3;

import java.util.Scanner;

public class P142 {

	public static void main(String[] args) {
		//Ű���带 ���ؼ� ������ �Է¹ް� 
		
		int jumsu;
		char grade = ' '; //java������ char �� �ʱ�ȭ�� ' ' blank�� ���� �Ѵ�.
		Scanner scanner = new Scanner(System.in); //local variable�� �ʱ�ȭ�� �ʿ��ϴ�.
		System.out.println("������ �Է��ϼ���! �Է¿���)100");
		jumsu = Integer.parseInt(scanner.nextLine());
		
		if(!(0<=jumsu&&jumsu<=100)){
			System.out.println("jumsu�� ��ȿ���� �ʾ� ���� �˴ϴ�...");
			return; // ���ǽ��� �������� ���ϸ� main�ռ��� �����Ų��. 
			        //�Լ� ������ ������ ���� �θ� ������ �ǵ��ư��� ���� return�̴�.
		}
		
		//���ó��
		System.out.println("�������� ���ó��====");
		
		if(jumsu >= 90){
			grade = 'A'; /*���࿡ char grade�� �ʱ�ȭ���� �ʴ´ٸ�
						�� ���ǿ� ���� ������ 'A'�� �ʱ�ȭ�� �� ���̰� ������ �߻��Ѵ�.*/
		}else if(jumsu >= 80) {
			grade = 'B';
		}else if(jumsu >= 70){
			grade = 'C';
		}else if(jumsu >= 60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		
		System.out.println(jumsu+" �� ����� "+grade);
	}

}
