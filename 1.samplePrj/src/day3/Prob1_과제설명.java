package day3;

public class Prob1_�������� {

	public static void main(String[] args) {
		//char c ='a', d = 'A'; //-32 +32
				//System.out.println((c)+" "+(int)(c++)+" "+(d)+" "+(int)(d++));
				
				  /*
		        ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�.
		        ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� 
			�ҹ��ڷ� �����ϴ� �ڵ带 �ϼ� �մϴ�.
		  	*/
				char ch ='a';
				char lowerCase= ('A'<= ch && ch <= 'Z')?(char)(ch+32):ch;
				System.out.print("ch:"+ch);
				System.out.println(" to lowerCase :"+lowerCase);
				
				/*
				 �Ʒ��� ���� num�� ��������  ��� ���� 0�� ����ϴ� �ڵ��Դϴ�.
				���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���. 
				*/
				
				int num = 0;
				
				if(num > 0){
					System.out.printf("���\n");
				}else if(num < 0){
					System.out.printf("����\n");
				}else{
					num = 0;
					System.out.printf("0\n");
				}
				
				String result = null;
				result = (num>0) ? "���":((num<0)? "����":"0");
				System.out.printf("num�� %s�̴�", result);
				
					}

}
