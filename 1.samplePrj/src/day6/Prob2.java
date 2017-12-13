package day6;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob2 {

	public static void main(String[] args) {
		String size = JOptionPane.showInputDialog("1~45사이의 정수를 입력해주세요.");
		//System.out.println(msg);
		int[] num = new int[Integer.parseInt(size)];
		//int[] num = new int[5];
		
		num[0] = (int)(Math.random()*45)+1; //만약에 Math.random()에 4를 곱하면 무한루프에 빠진다. 배열 5번째 값을 겹치지 않게 넣기 위한 방법이 없기 때문에 끝도없이 넣어다 뺐다를 반복한다.
	
	 T:	for(int i=1; i<num.length; i++){
			num[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++){
				if(num[i]==num[j]){
					i--; //중복대상이 발견되면 for문에서 빠져간다.
					break;
					//continue를 사용하려면 바깥for문에 라벨링을 해주어야한다. countinue T;
				}
			}
			System.out.println(Arrays.toString(num));
		}
		System.out.println("최종결과");
		System.out.println(Arrays.toString(num));
	}

}
