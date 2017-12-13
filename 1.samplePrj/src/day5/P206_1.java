package day5;

public class P206_1 {

	public static void main(String[] args) {
		int[] scorse = {99,98,78,97,100};
		String[] names = {"홍길동","고길동","박길동","최길동","이길동"};
		/*names에 있는 이름들을 다꺼내기*/
		int stringLength = names[0].length(); //length변수는 배열에 사용한다.
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
