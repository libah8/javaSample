package day20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Prob1 {

	public static void main(String[] args) {
		
		
		Prob1 p = new Prob1();
		int nLength = 0;
		String[] data={};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Է��� �迭 ����:");
		nLength = Integer.parseInt(scanner.nextLine());
		data = new String[nLength];
		
		System.out.println("�迭 �Է�(�Է�����0):");
		for(int i=0; i < data.length;i++){
			data[i] = scanner.nextLine();
			if(data[i].equals("0")) break;
		}
		
		
		System.out.printf("�Է¹迭:%s%n", Arrays.toString(data));
		//System.out.printf("�Է¹迭:%s%n", data); //1 �ϳ��� ���
		
		Vector<String> rDatas = p.moveToVector(data);
		
		//System.out.printf("���ϵǴ� Vector :%s", Arrays.toString(rDatas.toArray()));
		System.out.println(rDatas);

	}
	
	 Vector<String>  moveToVector(String datas[]){
		
		Vector<String> vector= new Vector<>();
		
			for(int i=datas.length-1; i >= 0; i--){
			vector.add(datas[i]);
		}
		return vector;
	}
}


/*<< ���� ���� >>
�Է� �迭: 
   {��1��,��2��,��3��,��4��,��5��};
���ϵǴ� Vector : 
   ��5��, ��4��,��3��, ��2��, ��1���� ������ ����� Vector
*/
