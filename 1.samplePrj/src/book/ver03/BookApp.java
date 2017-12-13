package book.ver03;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {

		int key = 0;
		String title =null;
		String author =null;
		String publisher =null;
		int price = 0;
		String isbn = null;
		String input = null;
		boolean flag = true;
		int id = 0;
		
		
		
		 Book[] book = {
				new Book("�ﱹ����","�Ͽ�","������","111-222-33",15000),
				new Book("�Ĺ��� ��","��Ƽ�� ��ġ","����å","111-999-555",11000),
				new Book("������","���ϼ�","�۹�","111-222-777",7000)
		};
		
		 BookMgr bm = null;
		 
			try {
				bm = new BookMgr();
			} catch (FileNotFoundException e) {
				bm = new BookMgr(book);
			}
				
		Scanner scanner = new Scanner(System.in);
			
		Q:while(true){
			System.out.println("���� ���� ���� ���ø����̼� v03");
			System.out.println("------------------------------------------------");
			
			do{
				System.out.printf("1.���� ���  2.���� �˻�  3.���� ��� ����  4.���� ����   0.����%n");
				System.out.printf("���Ͻô� �޴� ��ȣ�� �����ϼ���:");
				try{
					key = scanner.nextInt();
					scanner.nextLine(); 
					if(0<=key&&key<=4) break;
					
				}catch(InputMismatchException e){
					System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
					scanner.nextLine(); 
				}
			}while(!(0<=key&&key<=4));
									
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
				
				System.out.printf("ISBN�� �Է����ּ���: ");
				isbn = scanner.nextLine();
				data.setIsbn(isbn);
				
				System.out.printf("���������� �Է����ּ���: ");
				price = Integer.parseInt(scanner.nextLine());
				data.setPrice(price);
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
				try{
					bm.printBookList();
				}catch(NullPointerException e){
					System.out.println("å ����� �����ϴ�.");
				}
				
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


	