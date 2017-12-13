package day3;

public class Prob1_과제설명 {

	public static void main(String[] args) {
		//char c ='a', d = 'A'; //-32 +32
				//System.out.println((c)+" "+(int)(c++)+" "+(d)+" "+(int)(d++));
				
				  /*
		        다음은 대문자를 소문자로 변경하는 코드입니다.
		        변수 ch에 저장된 문자가 대문자 인 경우에만 
			소문자로 변경하는 코드를 완성 합니다.
		  	*/
				char ch ='a';
				char lowerCase= ('A'<= ch && ch <= 'Z')?(char)(ch+32):ch;
				System.out.print("ch:"+ch);
				System.out.println(" to lowerCase :"+lowerCase);
				
				/*
				 아래는 변수 num의 값에따라  양수 음수 0을 출력하는 코드입니다.
				삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요. 
				*/
				
				int num = 0;
				
				if(num > 0){
					System.out.printf("양수\n");
				}else if(num < 0){
					System.out.printf("음수\n");
				}else{
					num = 0;
					System.out.printf("0\n");
				}
				
				String result = null;
				result = (num>0) ? "양수":((num<0)? "음수":"0");
				System.out.printf("num은 %s이다", result);
				
					}

}
