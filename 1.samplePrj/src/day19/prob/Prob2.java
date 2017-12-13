package day19.prob;

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
		String str = "PROD-001#X-note#Samsung#3#6000000#";
		Set<String> strs = stringSplit(str, "#");
		
		System.out.println("=== ���ڿ� ó�� ��� ===");
			Iterator<String> it = strs.iterator();
			while (it.hasNext()) {
				String data = (String) it.next();
				System.out.println(data);
			}
		}

	private static Set<String> stringSplit(String str1, String str2) {
		
		Set<String> data= new HashSet<>();

		String str = "";	//string merge �غ�
		int count = 0;	//str ���ڿ� �ε��� �ʱ�ȭ
		
		for(int i=0; i<str1.length(); i++){
			
			str += str1.charAt(i);
			count++;
						
		 if(str1.charAt(i) == str2.charAt(0)){		//���� ���ڰ� str1���ڿ����� �߰ߵǸ� Set add�۾� ����
				data.add(str.substring(0, count-1));//���� ����(#)���� count �ε����� ���ԵǹǷ� count-1
				count = 0;
				str="";
		}else if(i == str1.length()-1){	
			//���� ���ڰ� ���ڿ� �������� ���� �ʴ� �̿� ���� ��� ������ add�۾� 
			if(!str.equals(""))	data.add(str.substring(0, count-1));
			}
		}
		return data;
	}
}

//<<ó�� ���>>

//=== ���ڿ� ó�� ��� ===
//PROD-001
//X-note
//Samsung
//3
//600000
