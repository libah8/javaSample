package day7;

import java.util.Arrays;

public class Student {
	String name;
	int[] score = new int[3];
	double sum;
	double avg;
	
	public void process(){
		sum = 0; //sum을 초기화를 시키지 않으면 process()를 다시 호출할 때 기존의 값에 더해지기 때문이다. 
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}
		avg = sum /score.length;
	}
	
	public void display(){
		System.out.println("============= 성적 처리 결과 표============ ");
		System.out.println("이름 :"+name);
		System.out.println("성적 :"+Arrays.toString(score));
		System.out.println("총점 :"+sum);
		System.out.println("평균 :"+avg);
		System.out.println("=====================================");
	}
}
