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
		
		System.out.println("입력할 배열 길이:");
		nLength = Integer.parseInt(scanner.nextLine());
		data = new String[nLength];
		
		System.out.println("배열 입력(입력종료0):");
		for(int i=0; i < data.length;i++){
			data[i] = scanner.nextLine();
			if(data[i].equals("0")) break;
		}
		
		
		System.out.printf("입력배열:%s%n", Arrays.toString(data));
		//System.out.printf("입력배열:%s%n", data); //1 하나만 출력
		
		Vector<String> rDatas = p.moveToVector(data);
		
		//System.out.printf("리턴되는 Vector :%s", Arrays.toString(rDatas.toArray()));
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


/*<< 실행 예시 >>
입력 배열: 
   {“1”,”2”,”3”,”4”,”5”};
리턴되는 Vector : 
   ”5”, “4”,”3”, ”2”, “1”의 순서로 저장된 Vector
*/
