package day6;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob2 {

	public static void main(String[] args) {
		String size = JOptionPane.showInputDialog("1~45������ ������ �Է����ּ���.");
		//System.out.println(msg);
		int[] num = new int[Integer.parseInt(size)];
		//int[] num = new int[5];
		
		num[0] = (int)(Math.random()*45)+1; //���࿡ Math.random()�� 4�� ���ϸ� ���ѷ����� ������. �迭 5��° ���� ��ġ�� �ʰ� �ֱ� ���� ����� ���� ������ �������� �־�� ���ٸ� �ݺ��Ѵ�.
	
	 T:	for(int i=1; i<num.length; i++){
			num[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++){
				if(num[i]==num[j]){
					i--; //�ߺ������ �߰ߵǸ� for������ ��������.
					break;
					//continue�� ����Ϸ��� �ٱ�for���� �󺧸��� ���־���Ѵ�. countinue T;
				}
			}
			System.out.println(Arrays.toString(num));
		}
		System.out.println("�������");
		System.out.println(Arrays.toString(num));
	}

}
