package day3;

public class P120 {

	public static void main(String[] args) {
		char c = '!';
		boolean f1, f2;
		
		System.out.println((int)c);
		boolean result = (f1='0' <= c) && ( f2=c <= '9'); //ũ�⸦ ���ؾ� �ϱ� ������ ���θ���� �߻��Ѵ�. �ƽ�Ű �ڵ尪���ε� ��ü �����ϴ�.
		System.out.println(result);
		
		boolean result1 =  48 <= c && c <= 57; //ũ�⸦ ���ؾ� �ϱ� ������ ���θ���� �߻��Ѵ�. �ƽ�Ű �ڵ尪���ε� ��ü �����ϴ�.
		System.out.println('0'+" => " +((int)'0')); //���� 0�� �ش��ϴ� �ƽ�Ű�ڵ尪.
		System.out.println('9'+" => " +((int)'9')); //���� 9�� �ش��ϴ� �ƽ�Ű�ڵ尪.
		System.out.println(c +"���� ? "+result); //���� ���� �ƴ��� �Ǻ��ϴ� �Ǻ����� �ȴ�.
		System.out.println(c +"���� ? "+result1); //���� ���� �ƴ��� �Ǻ��ϴ� �Ǻ����� �ȴ�.
		
		boolean result3 = 'a' <= c && c <= 'z';
		System.out.println('b'+" => " +((int)'b'));
		System.out.println(c + "�� �ҹ����ΰ�? "+ result3);
		
		System.out.println(Integer.toBinaryString(11)); //11�� 2������ �ٲٱ�
		System.out.println("  "+Integer.toBinaryString(3)); //3�� 2������ �ٲٱ�
		System.out.println("  "+(11 & 3)); //11�� 3 ��Ʈ����
		System.out.println("  "+Integer.toBinaryString(11 & 3)); //��Ʈ������ 2������ �ٲٱ�
	}

}
