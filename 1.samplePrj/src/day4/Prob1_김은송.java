package day4;

public class Prob1_������ {

	public static void main(String[] args) {
		/*Prob1. Ŭ������ main() ����
		 �־��� ���� ������ �������� ������� �� �ֵ��� 
		 main �޼��带 �ۼ��ϼ���. 
		 
		-	���ڿ� ������ �������� ���
		-	�Է����� �־��� ���ڿ�  :   "Java Programming" 

		ó�� ����� �� : 
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
