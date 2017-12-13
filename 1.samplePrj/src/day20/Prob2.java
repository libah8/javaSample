package day20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Prob2 {
	Vector<String>  moveToVector(String datas[]){
		if(datas==null||datas.length==0){	//�پ��� ȯ���� �����ϰ� �׽�Ʈ ����
			System.out.println("ó���� �����Ͱ� �ʿ��մϴ�.");
			return null;
		}
		Vector<String> data = new Vector<String>(); //jdk 1.6�������� �̷��� �ϼ��ؾ��ߴ�.
		for(int i=datas.length-1; i>=0; i--){
			data.add(datas[i]);
		}
		return data;
	}
	public static void main(String[] args) {
		Prob2 p = new Prob2();
		String[] d = {"1","2","3","4","5"};
		Vector<String> list = p.moveToVector(d);
	//	Vector<String> list = p.moveToVector(null);	//�پ��� ȯ���� �����ϰ� �׽�Ʈ ����.
		System.out.println(list);
	}
}


/*<< ���� ���� >>
�Է� �迭: 
   {��1��,��2��,��3��,��4��,��5��};
���ϵǴ� Vector : 
   ��5��, ��4��,��3��, ��2��, ��1���� ������ ����� Vector
*/
