package day3;

import java.util.Scanner;

public class Prob1_������ {

	public static void main(String[] args) {
		  /*
        ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�.
        ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� 
	�ҹ��ڷ� �����ϴ� �ڵ带 �ϼ� �մϴ�.
  	*/
	
	char ch = 'a';
	int convert = ch+32;
	
	char lowerCase = ('A'<= ch && ch <='Z') ? (char)convert : ch ;
	System.out.printf("ch: %c\t", ch);
	
	if('A'<= ch && ch <='Z'){	
		System.out.println(" to lowerCase :"+lowerCase);
	}else{
		System.out.println("ch�� �ҹ��� �Դϴ�.\n");
	}
	
	
	
	/*
	 �Ʒ��� ���� num�� ��������  ��� ���� 0�� ����ϴ� �ڵ��Դϴ�.
	���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���. 
	*/
		int num = -90;
		int result = 0;
		
		result = (num == 0) ? 0 :((num > 0) ? num : num);
		System.out.printf("num�� ���� ���� ����� %d �Դϴ�.", result);
	}
	
}
	


