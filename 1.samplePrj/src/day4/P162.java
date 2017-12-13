package day4;

public class P162 {

	public static void main(String[] args) {
		
		for(int j=0; j<2; j++){
			for(int i=0; i<3; i++){
				System.out.print('*'+" ");
				
			}
			System.out.println();
		}
	System.out.println("==============================");	
	
	for(int i=0; i<3; i++){
		for(int j=0; j<=i; j++){
			System.out.print('*'+" ");
		}
		System.out.println();
	}
	System.out.println("===================================");
	for(int i=1; i<4; i++){
		for(int j=0; j<i; j++){
			System.out.print('*'+" ");
		}
		System.out.println();
	}
	}

}
