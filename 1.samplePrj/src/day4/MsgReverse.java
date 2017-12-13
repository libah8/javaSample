package day4;

import java.util.Scanner;

public class MsgReverse {

	public static void main(String[] args) {
		/*예제 )문자열 참조변수  msg 가 "yes" 일때 true 인  조건식 */
		
		String example = "yes";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("메세지를 입력하세요:");
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
					System.out.printf("%s는 %s가 아니다.", msg, example);
					break;
				}
			}
			if(nResult == ExLength)	System.out.printf("%s는 %s와 같다.", msg, example);
		}else{
			System.out.printf("%s는 %s가 아니다.", msg, example);
		}*/
		
	}

}
