package day7;

public class Prob1 {
	/*문제1. Prob1내에 leftPad 메쏘드를 작성하십시오. 
    leftPad 메쏘드의 속성은 다음과 같습니다.

1.	메소드 시그니처 : 
     public String leftPad(String str, int size, char padChar)

2.	입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
     문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.

3.	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
          큰 경우에는 원본 문자열(str)을 그대로 리턴한다.

실행 예) 
leftPad(“SDS”, 6, ‘#’)    ###SDS 
leftPad(“SDS”, 5, ‘$’)    $$SDS
leftPad(“SDS”, 2, ‘&’)    SDS
*/

	public String leftPad(String str, int size, char padChar) {
		String tmp = "";
		
		if(str.length()<size){
			
			for(int i=0; i<(size-str.length());i++){	//만약 for문 i값을 테스트하고 싶다면 int num=size-str.length()로 검사
				tmp += padChar; //str = padChar+str; ->이렇게 하면 str.length()값이 변하기 때문에 제대로된 값이 안나온다.
				//아니면 str = padChar+str; 
				//for문 바깥에 int tmp = size-str.length();으로 설정해주어도 된다.
				//그리고 for(int i=0; i<tmp; i++)
			}
			tmp += str;
			
		}else{
			return str; //tmp = str;
		}
	return tmp;
	}
	
	public static void main(String[] args) {		//같은 클래스에 main()메소드가 와도 상관없다. 
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SDS", 6, '#') );//예측 "###SDS"이 나올 것이다.
		System.out.println( prob1.leftPad("SDS", 6, '#').equals("###SDS")); //예측을 테스트해보자. -> true
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') ); 
		
	}
}

