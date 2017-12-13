package day3;

public class P120 {

	public static void main(String[] args) {
		char c = '!';
		boolean f1, f2;
		
		System.out.println((int)c);
		boolean result = (f1='0' <= c) && ( f2=c <= '9'); //크기를 비교해야 하기 때문에 프로모션이 발생한다. 아스키 코드값으로도 대체 가능하다.
		System.out.println(result);
		
		boolean result1 =  48 <= c && c <= 57; //크기를 비교해야 하기 때문에 프로모션이 발생한다. 아스키 코드값으로도 대체 가능하다.
		System.out.println('0'+" => " +((int)'0')); //숫자 0에 해당하는 아스키코드값.
		System.out.println('9'+" => " +((int)'9')); //숫자 9에 해당하는 아스키코드값.
		System.out.println(c +"숫자 ? "+result); //숫자 인지 아닌지 판별하는 판별식이 된다.
		System.out.println(c +"숫자 ? "+result1); //숫자 인지 아닌지 판별하는 판별식이 된다.
		
		boolean result3 = 'a' <= c && c <= 'z';
		System.out.println('b'+" => " +((int)'b'));
		System.out.println(c + "는 소문자인가? "+ result3);
		
		System.out.println(Integer.toBinaryString(11)); //11을 2진수로 바꾸기
		System.out.println("  "+Integer.toBinaryString(3)); //3을 2진수로 바꾸기
		System.out.println("  "+(11 & 3)); //11과 3 비트연산
		System.out.println("  "+Integer.toBinaryString(11 & 3)); //비트연산결과 2진수로 바꾸기
	}

}
