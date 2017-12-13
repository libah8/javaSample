package day6;

import java.util.Arrays;

public class P220 {

	public static void main(String[] args) {
		int[][] num = new int[4][3];
		for(int i=0; i<num.length; i++){
			for(int j=0; j<num[i].length; j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

		int two[][] = {{3,2,1},{5,4,3,2,1},{1,2}};
		
		for(int i=0; i<two.length; i++){
			for(int j=0; j<two[i].length; j++){
				System.out.print(two[i][j]);
			}
			System.out.println();
		}
		
	}

}
