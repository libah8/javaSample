package day4;

public class P157 {

	public static void main(String[] args) {
		char c = 'a', d='A';
		
		System.out.println("���� �ҹ��� �ڵ尪 Ȯ��\n");
		for(int count=0; count<26; count++){
			//char c = 'a', d='A'; for�� �ȿ� ������ ���� ��� �Ȱ��� ���� �ݺ��ȴ�.
			System.out.printf("%c %d, %c %d%n", c, (int)c++, d, (int)d++);
			
			//System.out.println(c+" "+(int)(c++)+","+d+" "+(int)(d++));
		
		}
		
	}

}
