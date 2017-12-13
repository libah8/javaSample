package day5;

public class P206 {

	public static void main(String[] args) {
		int[] scorse = {99,98,78,97,100};
		String[] names = {"홍길동","고길동","박길동","최길동","이길동"};
		/*names에 있는 이름들을 다꺼내기*/
		/*int result = names[0].length();
		System.out.println(result);
		
		for(int i=0; i<scorse.length; i++){
			for(int j=0; i<names[i].length(); i++){
				System.out.printf("%c", names[i].charAt(j));
			}
		}*/
		
		for(int i=0; i<scorse.length; i++){
			 
			System.out.printf("%c** %d%n", names[i].charAt(0), scorse[i]);
		}		
		System.out.println("====================================");
		for(int data :scorse){
			System.out.println(data);
		}
		for(String data :names){
			System.out.println(data);
			}

	}

}
