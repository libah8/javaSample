package day4;

import java.util.Scanner;

public class MsgReverse {

	public static void main(String[] args) {
		/*���� )���ڿ� ��������  msg �� "yes" �϶� true ��  ���ǽ� */
		
		String example = "yes";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�޼����� �Է��ϼ���:");
		String msg = scanner.nextLine();
		
		int ExLength = example.length();
		int msgLength = msg.length();
		int nResult = 0;
		boolean result = msg.equals(example);
			
		if(result){
			System.out.println(result);
		}else{
			System.out.println(result);
		}
		
		/*if(ExLength == msgLength){
			for(int i=0; i<ExLength; ++i){
				if(msg.charAt(i) == example.charAt(i)){
					++nResult;
				}else{
					System.out.printf("%s�� %s�� �ƴϴ�.", msg, example);
					break;
				}
			}
			if(nResult == ExLength)	System.out.printf("%s�� %s�� ����.", msg, example);
		}else{
			System.out.printf("%s�� %s�� �ƴϴ�.", msg, example);
		}*/
		
	}

}
