package day19.prob2;

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
		String str = "PROD-001#X-note#Samsung#3#6000000";
		
		//Set<String> strs = stringSplit(str, "#");
		Set<String> list = stringSplit(str, "#");
		//Set<String> list = Prob1.stringSplit(str, "#"); //static메소드 이므로 Prob1이 생략되어있다.
		System.out.println("=== 문자열 처리 결과 ===");
		System.out.println(list);	
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data);			
			}
		}

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> set = new HashSet<>();
		int p = -1;
		
		//p = str1.indexOf("#", p+1);
		//set.add(str1.substring(0,p));
		
		do{
			if(p+1 >= str1.length()) break;
			set.add(str1.substring(p+1, p=str1.indexOf("#", p+1)));	
		}while(p != -1);
		
		return set;
	}
}

//<<처리 결과>>

//=== 문자열 처리 결과 ===
//PROD-001
//X-note
//Samsung
//3
//600000
