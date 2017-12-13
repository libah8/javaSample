package day5;

public class P189 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		System.out.println(names[0]+names[1]+names[2]);
		
		char[] chars = new char[names.length];
		System.out.println(chars[0]);
		System.out.println(chars[0]+","+chars[1]+","+chars[2]);
		
		int[] score;
		score = new int[5];
		
		for(int i=0; i<score.length; i++){
			System.out.print(score[i]+", ");
		}
		
		System.out.println("\n=======================");
		for(int data :score){
			System.out.println(data+" ");
		}
		
		for(String name :names){
			System.out.println(name);
		}
	}

}
