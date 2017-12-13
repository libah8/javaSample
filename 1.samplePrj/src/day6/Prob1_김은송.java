package day6;

import java.util.Arrays;

public class Prob1_������ {

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("�迭�� �����  ���� �Ķ���ͷ� �Է��� �ּ���.");
			return;
		}

		int[] num = new int[Integer.parseInt(args[0])];
		
		//1~45 ���� �̿� �ʱ�ȭ�� �ߺ� ����
		for(int i=0; i<num.length; i++){
			num[i] = (int)(Math.random()*45)+1;
				for(int j=0; j<i; j++){
					do{
						if(num[j] == num[i]){	
							num[i] = (int)(Math.random()*45)+1;
							}		
					}while(num[j]==num[i]); //���࿡ �ٽ� �Ҵ�� ������ �� �ٽ� ���� �迭 ��ҵ�� ���� ���� �ȴٸ� ���� ����� �ʿ��ϹǷ� do~while���� ���.
					
				}
		}
		
		System.out.println("���� num");
		System.out.println(Arrays.toString(num));
		
		//����
		 
		//int[] src = num; //�ּҸ� ����ȴ�. �����Ͱ� ���������� �ʴ´�.
		int[] target = new int[num.length];
		
		/*for(int i=0; i<src.length; i++){
			src[i] = num[i];
		}*/ //for������ ����
		
		System.arraycopy(num, 0, target, 0, num.length); // arraycopy�� ��������
		
		//����
		for(int i=0; i<num.length-1; i++){
			for(int j=i+1; j<num.length;j++){
				if(num[i] > num[j]){
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		
		System.out.println("����:"+Arrays.toString(target));
		System.out.println("����:"+Arrays.toString(num));
	}

	}

