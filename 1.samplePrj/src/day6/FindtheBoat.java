package day6;

import java.util.Arrays;
import java.util.Scanner;

public class FindtheBoat {

	public static void main(String[] args) {
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
			//   1 2 3 4 5 6 7 8 9
				{0,0,0,0,0,0,1,0,0},//1
				{1,1,1,1,0,0,1,0,0},//2
				{0,0,0,0,0,0,1,0,0},//3
				{0,0,0,0,0,0,1,0,0},//4
				{0,0,0,0,0,0,0,0,0},//5
				{1,1,0,1,0,0,0,0,0},//6
				{0,0,0,1,0,0,0,0,0},//7
				{0,0,0,1,0,0,0,0,0},//8
				{0,0,0,0,0,1,1,1,0},//9
				
		};
		
			//1�࿡ ���ȣ��, 1���� ����ȣ�� �����Ѵ�.
			for(int i=1; i<board.length; i++){
				board[0][i]=board[i][0]=(char)(i+'0'); //���ڸ� ���ڷ� ��ȯ�Ѵ�.
			}
			Scanner scanner = new Scanner(System.in);
			
			while(true){
			System.out.print("��ǥ�� �Է����ּ��� ex)12(00�� �Է��ϸ� ����)>");
			String input = scanner.nextLine();
			
			if(input.length() == 2){
				x = input.charAt(0)-'0'; //���ڸ� ���ڷ� ��ȯ�Ѵ�. ��ǥ�� ���ؾ��ϹǷ�.
				y = input.charAt(1)-'0';	
				
				if(x==0 && y==0)	
					break;
			}		
			
			if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE){
				System.out.println("���ڸ� �ٽ� �Է����ּ���.");
				continue;
			}
			
			//shipBoard[x-1][y-1]�� ���� 1�̸� 'O'�� board[x][y]�����Ѵ�.
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
			
			//�迭 board�� ������ ȭ�鿡 ����Ѵ�.
			for(int i=0; i<board.length; i++){
				for(int j=0; j<board.length; j++){
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			

		}
		
	}

}
