package day15.prob;

class Dice {
	int size;
	
	Dice(int size){
		this.size = size;
	}
    int play(){
 	int number = (int)(Math.random() * size) + 1;
        return number;
    }
}


public class DiceGame {
	public static void main(String args[]){
	 		DiceGame game = new DiceGame ();
	
	 		try{
	 			int result1 = game.countSameEye(10);
		 			System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result1);
		 
		 		int result2 = game.countSameEye(-10);
		 			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		 		}catch(Exception e){
				System.out.println(e.getMessage());
			}
 	}
	
	int countSameEye(int n) throws Exception{

		Dice[] d = new Dice[2];
		int count=0;
		
			if(n<0)	{
				throw new Exception("두번째 게임에서 음수 값이 입력되었습니다.");
			}
		
			for(int i=0; i<n; i++){
			d[0] = new Dice(8);
			d[1] = new Dice(8);
			if(d[0].play() == d[1].play()) 	count += 1;
		}
		return count;	
	}
}

	


