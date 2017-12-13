package day4;

public class P157 {

	public static void main(String[] args) {
		char c = 'a', d='A';
		
		System.out.println("영어 소문자 코드값 확인\n");
		for(int count=0; count<26; count++){
			//char c = 'a', d='A'; for문 안에 변수가 있을 경우 똑같은 값이 반복된다.
			System.out.printf("%c %d, %c %d%n", c, (int)c++, d, (int)d++);
			
			//System.out.println(c+" "+(int)(c++)+","+d+" "+(int)(d++));
		
		}
		
	}

}
