package day19.prob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//=====================   문제 1.  제출 문제  =======================

//문제 2. 다음의 메서드 매개변수로 전달되는 
//      첫번째 문자열을 두번째 문자열의 구분자로 잘라내어 
//	Set 구조에 저장한 후 리턴하는 메서드를 구현하시오. 
//단, String 클래스의 split() 메서드와 StringTokenizer를 사용해서는 안된다. 
//그리고 제공된 메인 메서드는 변경하지 않는다

public class Prob2 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000#";
		Set<String> strs = stringSplit(str, "#");
		
		System.out.println("=== 문자열 처리 결과 ===");
			Iterator<String> it = strs.iterator();
			while (it.hasNext()) {
				String data = (String) it.next();
				System.out.println(data);
			}
		}

	private static Set<String> stringSplit(String str1, String str2) {
		
		Set<String> data= new HashSet<>();

		String str = "";	//string merge 준비
		int count = 0;	//str 문자열 인덱스 초기화
		
		for(int i=0; i<str1.length(); i++){
			
			str += str1.charAt(i);
			count++;
						
		 if(str1.charAt(i) == str2.charAt(0)){		//구분 문자가 str1문자열에서 발견되면 Set add작업 수행
				data.add(str.substring(0, count-1));//구분 문자(#)까지 count 인덱스에 포함되므로 count-1
				count = 0;
				str="";
		}else if(i == str1.length()-1){	
			//구분 문자가 문자열 마지막에 오지 않는 이와 같은 경우 마무리 add작업 
			if(!str.equals(""))	data.add(str.substring(0, count-1));
			}
		}
		return data;
	}
}

//<<처리 결과>>

//=== 문자열 처리 결과 ===
//PROD-001
//X-note
//Samsung
//3
//600000
