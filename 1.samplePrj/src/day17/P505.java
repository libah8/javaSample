package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505 {

	public static void main(String[] args) {
		String[] data  = {
				"javapractice","010-1234-9999","02-222-3434",
				"javapracice@naver.com","a","A","1234567","java test","f"
				};
		String pattern = "j.*";
		pattern = "(02|010)-\\d{3,4}-\\d{4}";
		
		Pattern p = Pattern.compile(pattern);
		for(int i=0;i<data.length;i++){
			Matcher matcher = p.matcher(data[i]);
			if(matcher.matches()){
				System.out.println(data[i]);
			}
		}
		System.out.println("=====main end=====");
	}

}
