package day16.lang;

public class P464 {

	public static void main(String[] args) {
		String msg = "Hello java test~~~~";
		System.out.println(msg);
		System.out.println(msg.replace('~', '!'));//�ٲ� ���� �������ֱ�� ������
		
		System.out.println(msg);//String�� �б� �����̹Ƿ� ���� ���� �ٲ��� �ʴ´�.
		
		System.out.println(msg = msg.replace('~', '!')); //�ּҸ� �ٲ��ִ� ��� �ۿ��� ����.
		
		msg.concat(" sample");
		System.out.println(msg);
		System.out.println(msg = msg.concat(" sample"));
		
		StringBuffer sb = new StringBuffer("StringBuffer test"); //�а� ���Ⱑ ����������.
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(" sample");
		System.out.println(sb);
		
		String s = sb.toString();
		System.out.println(s);

	}

}
