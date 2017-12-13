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
		 			System.out.println("���� ������ 8���� �ֻ��� 2���� ������ ���� ���� ���� Ƚ�� : " + result1);
		 
		 		int result2 = game.countSameEye(-10);
		 			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		 		}catch(Exception e){
				System.out.println(e.getMessage());
			}
 	}
	
	int countSameEye(int n) throws Exception{

		Dice[] d = new Dice[2];
		int count=0;
		
			if(n<0)	{
				throw new Exception("�ι�° ���ӿ��� ���� ���� �ԷµǾ����ϴ�.");
			}
		
			for(int i=0; i<n; i++){
			d[0] = new Dice(8);
			d[1] = new Dice(8);
			if(d[0].play() == d[1].play()) 	count += 1;
		}
		return count;	
	}
}

	


