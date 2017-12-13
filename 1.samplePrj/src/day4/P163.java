package day4;

public class P163 {

	public static void main(String[] args) {
		OUT : for(int i=1; i<10; i++){
			for(int j=2; j<10; j++){
				//if(j==5) break; 
				//if(j==5) break OUT; 
				//if(j==5) continue; //5를 제외하고 재진입.
				System.out.printf("%dx%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}

	}

}
