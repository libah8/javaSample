package day5;

public class P206_1 {

	public static void main(String[] args) {
		int[] scorse = {99,98,78,97,100};
		String[] names = {"ȫ�浿","��浿","�ڱ浿","�ֱ浿","�̱浿"};
		/*names�� �ִ� �̸����� �ٲ�����*/
		int stringLength = names[0].length(); //length������ �迭�� ����Ѵ�.
		int arrayLength = names.length;
		System.out.println(arrayLength);
		//System.out.println(stringLength);
		
		for(int i=0; i<scorse.length; i++){
			for(int j=0; j<stringLength; j++){
				System.out.printf("%c", names[i].charAt(j));
			}
			System.out.println();
		}

	}

}
