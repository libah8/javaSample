package day20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Prob2 {
	Vector<String>  moveToVector(String datas[]){
		if(datas==null||datas.length==0){	//다양한 환경을 가정하고 테스트 수행
			System.out.println("처리할 데이터가 필요합니다.");
			return null;
		}
		Vector<String> data = new Vector<String>(); //jdk 1.6이전까지 이렇게 완성해야했다.
		for(int i=datas.length-1; i>=0; i--){
			data.add(datas[i]);
		}
		return data;
	}
	public static void main(String[] args) {
		Prob2 p = new Prob2();
		String[] d = {"1","2","3","4","5"};
		Vector<String> list = p.moveToVector(d);
	//	Vector<String> list = p.moveToVector(null);	//다양한 환경을 가정하고 테스트 수행.
		System.out.println(list);
	}
}


/*<< 실행 예시 >>
입력 배열: 
   {“1”,”2”,”3”,”4”,”5”};
리턴되는 Vector : 
   ”5”, “4”,”3”, ”2”, “1”의 순서로 저장된 Vector
*/
