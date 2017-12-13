package day6;

import java.util.Arrays;

public class Prob1_김은송 {

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("배열의 사이즈를  실행 파라미터로 입력해 주세요.");
			return;
		}

		int[] num = new int[Integer.parseInt(args[0])];
		
		//1~45 난수 이용 초기화와 중복 제거
		for(int i=0; i<num.length; i++){
			num[i] = (int)(Math.random()*45)+1;
				for(int j=0; j<i; j++){
					do{
						if(num[j] == num[i]){	
							num[i] = (int)(Math.random()*45)+1;
							}		
					}while(num[j]==num[i]); //만약에 다시 할당된 난수가 또 다시 이전 배열 요소들과 같은 값이 된다면 막을 방법이 필요하므로 do~while문을 썼다.
					
				}
		}
		
		System.out.println("원본 num");
		System.out.println(Arrays.toString(num));
		
		//원본
		 
		//int[] src = num; //주소만 복사된다. 데이터가 보존되지는 않는다.
		int[] target = new int[num.length];
		
		/*for(int i=0; i<src.length; i++){
			src[i] = num[i];
		}*/ //for문으로 복사
		
		System.arraycopy(num, 0, target, 0, num.length); // arraycopy로 원본저장
		
		//정렬
		for(int i=0; i<num.length-1; i++){
			for(int j=i+1; j<num.length;j++){
				if(num[i] > num[j]){
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		
		System.out.println("원본:"+Arrays.toString(target));
		System.out.println("정렬:"+Arrays.toString(num));
	}

	}

