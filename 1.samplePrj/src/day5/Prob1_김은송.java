package day5;

public class Prob1_������ {

	public static void main(String[] args) {
		
		/*[*] ���� ��ȣ��(Classical Cryptography)���� ����ϴ� ��� �� 
		��Caesar Cipher�� �� 
		��ȣȭ�� ����� �Ǵ� ������ ���ڵ��� ���ĺ� ���� 
		����° ������ ���ڷ� ġȯ�ϴ� ������ ġȯ ��ȣ���
		(��, a�� d��, b�� e��, �� , x�� a��, y�� b��, z�� c��)�Դϴ�.  
		��everyday we have is one more than we deserve�� ��� ���ڿ��� ���� 
		Caesar Cipher �� �����Ͽ� ��ȣȭ�� ���ڿ� ���� �Ʒ��� ���� ����ϵ��� 
		Prob1�� Ŭ������ main �Լ��� �ϼ��Ͻʽÿ�. 
		(��, ���鿡 ���ؼ��� ġȯ�� �������� �ʽ��ϴ�.)

		��ȣȭ�� ���ڿ� : everyday we have is one more than we deserve
		��ȣȭ�� ���ڿ� : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh
		String sourceString = 
				"everyday we have is one more than we deserve";
				String encodedString = ""; 
				
				// ���α׷��� ������ ����.	
				// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�. 
				
				// ���α׷� ������ ��.
				System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
				System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);*/
		
		String sourceString = "everyday we have is one more than we deserve";
		
		String encodedString = ""; 
				
		for(int i=0; i<sourceString.length(); i++){
			char nResult = (char)(sourceString.charAt(i)+3);//���� �ϳ��� ������ +3�� �Ѵ�.
			char nResult2 = (char)(sourceString.charAt(i)-23);//���� �ϳ��� ������ -23�� �Ѵ�.
			
			if(sourceString.charAt(i) < 120 && sourceString.charAt(i)!=32){
			 encodedString += nResult;
			 //String encodedString = 1+1+"1";
			 //encodedString = encodedString + nResult;
			 //���⼭ ������ ���� String�� �ּҸ� ��������� �Ϸ��� �ϸ� �ȵȴٴ� ���̴�.  
			 //String�� ��������� �Ұ��ϴ�.�׷��� StringŸ������ String merge�Ǵ� ���̴�.
			 //�����ϰ� �������� String�� ������ String�� �ȴ�. 
			}else if(sourceString.charAt(i)==32){
				 encodedString += (char)32;
			}else{
				encodedString += nResult2;
			}	
		}
		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
	}
}

/*}*/
		
		

	

