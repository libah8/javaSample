package day16.lang;

import java.util.Arrays;

public class P469 {

	public static void main(String[] args) {
		String[] ss = {"x","aa","bb","44"};
		System.out.println(Arrays.toString(ss));
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		System.out.println("x".compareTo("aa"));
		System.out.println("aa".compareTo("bb"));
		System.out.println("aa".compareTo("aa"));
		
		String msg = "Hello java test...";
		char[] msgarr = msg.toCharArray();
		System.out.println(msg);
		System.out.println(msg.indexOf('j'));
		System.out.println(msg.indexOf('a',7));
		System.out.println(msg.indexOf("java"));
		System.out.println(msg.indexOf("javap"));
		
		System.out.println(msg.substring(msg.indexOf('t')));
		System.out.println(msg.substring(msg.lastIndexOf(' ')+1));
	
		String data = "È«±æµ¿ / 90/70/77";
		String[] datas = data.split("/");
		
		int sum = 0;
		for(int i=1; i<datas.length;i++){
			sum += Integer.parseInt(datas[i].trim());
		}
		System.out.printf("ÀÌ¸§:%s ÃÑÁ¡:%d Æò±Õ:%f",datas[0],sum,sum/3.0);
	}
	
}
