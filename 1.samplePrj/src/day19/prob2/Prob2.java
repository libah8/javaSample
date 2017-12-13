package day19.prob2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//=====================   ���� 1.  ���� ����  =======================

//���� 2. ������ �޼��� �Ű������� ���޵Ǵ� 
//      ù��° ���ڿ��� �ι�° ���ڿ��� �����ڷ� �߶󳻾� 
//	Set ������ ������ �� �����ϴ� �޼��带 �����Ͻÿ�. 
//��, String Ŭ������ split() �޼���� StringTokenizer�� ����ؼ��� �ȵȴ�. 
//�׸��� ������ ���� �޼���� �������� �ʴ´�

public class Prob2 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		
		//Set<String> strs = stringSplit(str, "#");
		Set<String> list = stringSplit(str, "#");
		//Set<String> list = Prob1.stringSplit(str, "#"); //static�޼ҵ� �̹Ƿ� Prob1�� �����Ǿ��ִ�.
		System.out.println("=== ���ڿ� ó�� ��� ===");
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

//<<ó�� ���>>

//=== ���ڿ� ó�� ��� ===
//PROD-001
//X-note
//Samsung
//3
//600000
