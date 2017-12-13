package day7;

public class Prob2 {
	
	public static String leftPad(String str, int size, char padChar) {
		
		if(str.length()>size){
			return str; 	
		}
		int tmp = size-str.length();
		for(int i=0; i<tmp;i++){	
			str = padChar+str;  
		}	
		return str;
	}
	
	public static void main(String[] args) {		//같은 클래스에 main()메소드가 와도 상관없다. 
		Prob2 p = new Prob2();
		
		String s = Prob2.leftPad("SDS", 7, '!');
		System.out.println(s.equals("!!!!SDS")); //예측(두 문자열을 비교한다)
		System.out.println(s);//눈으로만 예측하는 것은 완벽하지가 않다. 위의 예측방법이 더 나은 방법같다.
		
		
	}
}

