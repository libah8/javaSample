package day4;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/*[����] int�� ���� year�� 400���� �����������ų� 
	    �Ǵ� 4�� ������������  
	    100 ������������ ���� �� �� ���ǽ��� ����� ������(�������).*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ���ϰ� ���� �⵵�� �Է��ϼ���:");
		int inputYear = Integer.parseInt(scanner.nextLine());
		
		if(inputYear % 4 == 0 && inputYear % 100 != 0 || inputYear % 400 == 0 ){
			System.out.printf("%d���� �����Դϴ�.", inputYear);
		}else{
			System.out.printf("%d���� ����Դϴ�.", inputYear);
		}
		
		
		

	}

}
