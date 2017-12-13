package book.ver02;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * ArrayList����
 * 
 * ����ó�� �̿ϼ�
 * key
 * book������� 
 * @author student
 *
 */

public class BookApp {

	public static void main(String[] args) {

		int key = 0;
		String title ="";
		String author ="";
		String publisher ="";
		String input = "";
		boolean flag = true;
		
		Book[] book = {
				new Book("�ﱹ����","�Ͽ�","������"),
				new Book("Űģ","��ø��� �ٳ���","���е���"),
				new Book("������","���ϼ�","�س�")
		};
		
		BookMgr bm = null;
		
		try{
			bm = new BookMgr();
		}catch(FileNotFoundException e){
			bm = new BookMgr(book);
		}
			
		Scanner scanner = new Scanner(System.in);
			
		Q:while(true){
			System.out.println("���� ���� ���� ���ø����̼� v02");
			System.out.println("------------------------------------------------");
			
			do{
				System.out.printf("1.���� ���  2.���� �˻�  3.���� ��� ����  4.���� ����  0.����%n");
				System.out.printf("���Ͻô� �޴� ��ȣ�� �����ϼ���:");
				try{
					key = scanner.nextInt();
					scanner.nextLine(); 
					if(0<=key&&key<=4) break;
					
				}catch(InputMismatchException e){
					System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
					scanner.nextLine(); 
					//scanner.nextLine()->nextInt()�� �Է¹ް� ���� �ִ� ���͸� �������ش�.
					//try ������ scanner.nextLine()�� ����ϸ� ���ܰ� �߻����� �� 
					//���Ͱ� �������� �ʾƼ� ���� ������ ���Եȴ�.
				}
			}while(0<=key&&key<=4);
									
			System.out.println("===============================================");
			
			switch(key){
			case 1: 
				System.out.printf("1.���� ���%n");
				
				Book data = new Book();
				
				System.out.printf("�������� �Է����ּ���: ");
				title = scanner.nextLine();
				data.setTitle(title);
				
				System.out.printf("�۰����� �Է����ּ���: ");
				author = scanner.nextLine();
				data.setAuthor(author);
				
				System.out.printf("���ǻ縦 �Է����ּ���: ");
				publisher = scanner.nextLine(); 
				data.setPublisher(publisher);
				
				System.out.println();
			    
				bm.addBook(data);
				
				break;
				
			case 2:
				System.out.printf("2.���� �˻�%n");
				System.out.printf("���� ������ �Է��ϼ���:");
				input = scanner.nextLine();
				bm.searchBook(input);
				break;
				
			case 3:
				System.out.println("3.���� ��� ����");
				bm.printBookList();
				System.out.println();
			break;
			
			case 4:
				System.out.println("4.���� ����");
				System.out.print("������ ���� ������ �Է��ϼ���:");
				input = scanner.nextLine();
				bm.deleteBook(input);
				break;
				
			case 0:
				System.out.println("���� ���ø����̼��� �����մϴ�.\n");
				System.exit(0);
			}
		}			
	}
}


	