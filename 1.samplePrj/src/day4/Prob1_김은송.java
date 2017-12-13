package day4;

public class Prob1_김은송 {

	public static void main(String[] args) {
		/*Prob1. 클래스의 main() 에서
		 주어진 문자 내용을 역순으로 출력하할 수 있도록 
		 main 메서드를 작성하세요. 
		 
		-	문자열 내용을 역순으로 출력
		-	입력으로 주어진 문자열  :   "Java Programming" 

		처리 결과의 예 : 
		gnimmargorP avaJ

		package day4;
		public class Prob1 {
			public static void main(String[] args) {
				String strData  =  "Java Programming";
				// TODO 
		
			}
		} */
		
		String strData = "Java Programming";
		char c = ' ';
		int nLength = strData.length();
		//int index = strData.length() - 1;
		//System.out.println(nLength); //16
		
		for(int index = strData.length()-1; index >= 0; index--){
			c = strData.charAt(index);
			System.out.print(c);
		}

	}

}
