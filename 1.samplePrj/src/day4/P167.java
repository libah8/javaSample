package day4;

public class P167 {

	public static void main(String[] args) {
		
		int count = 0;
		while(count<5){
			System.out.println("Hello java");
			count++;
		}
		
		boolean flag = true;
		while(flag){
			System.out.println("~~~~~~~~");
			//if(count == 5) flag = !flag;
			if(count == 5) break;
		}
		System.out.println("Main End");
	}

}
