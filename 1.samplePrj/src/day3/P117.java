package day3;

import java.util.Scanner;

public class P117{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�����ڸ� �ϳ� �Է��ϼ���: ");
		//String data = input.nextLine();
		//char c = data.charAt(0);		
		
		char c = input.nextLine().charAt(0);
		
		//System.out.println("\n�Էµ���Ÿ : "+data);

		boolean result = 'A'<=c && c <= 'z'; //�� ������ ���� ��ҹ��� ���о��� ���ĺ��̶�� �Ǻ����̴�.		
		System.out.println(c+"�� �������ΰ�? : "+result);
	}

}