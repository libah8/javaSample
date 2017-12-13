package day16.lang;

public class P464 {

	public static void main(String[] args) {
		String msg = "Hello java test~~~~";
		System.out.println(msg);
		System.out.println(msg.replace('~', '!'));//바뀐 값을 리턴해주기는 하지만
		
		System.out.println(msg);//String은 읽기 전용이므로 원래 값은 바뀌지 않는다.
		
		System.out.println(msg = msg.replace('~', '!')); //주소를 바꿔주는 방법 밖에는 없다.
		
		msg.concat(" sample");
		System.out.println(msg);
		System.out.println(msg = msg.concat(" sample"));
		
		StringBuffer sb = new StringBuffer("StringBuffer test"); //읽고 쓰기가 가능해진다.
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
