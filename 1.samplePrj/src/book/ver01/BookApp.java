package book.ver01;

import java.util.Scanner;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class BookApp {
	final int BASE = 100;
	int index = BASE; 

	Book[] data = new Book[BASE];
	Book[] tmpdata = new Book[index];

	public static void main(String[] args) {
	
		int i = 0;
		String key = "";
		int id = 0;
		String title ="";
		String author ="";
		String publisher ="";
		String input = "";
		boolean flag = true;
	
		BookMgr mgr = new BookMgr();
		BookApp bookmenu = new BookApp();
			
		Scanner scanner = new Scanner(System.in);
			
		do{	
			System.out.println("���� �������� ���ø����̼�");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				do{
					System.out.printf("1.���� ���  2.���� �˻�  3.���� ��� ����  4.���� ����  0.����%n");
					System.out.printf("���Ͻô� �޴� ��ȣ�� �����ϼ���:");
					key = scanner.nextLine();
					}while(!key.equals("1")&&!key.equals("2")&&!key.equals("3")&&!key.equals("4")&&!key.equals("0"));
					
			System.out.println("===============================================");
			
			switch(key){
			case "1": 
				System.out.printf("1.���� ���%n");
				
				 if(i==bookmenu.index){	//Book��ü �迭�� ������ ����� �ε����� Book��ü �迭���̿� ���� ��� �迭����� ������ �ʰ� 
					bookmenu.index = bookmenu.index+bookmenu.BASE;	 
					bookmenu.tmpdata = new Book[bookmenu.index];
					System.arraycopy(bookmenu.data, 0, bookmenu.tmpdata, 0, bookmenu.data.length);
					bookmenu.data = bookmenu.tmpdata; //���ο� �迭�� ���� �迭�� �����ؼ� �ּҸ� �����Ѵ�.
				 }
				 
				bookmenu.data[i] = new Book();
				
				//bookmenu.data[i].setId(i); //���� id�� �����Ѵ�.
				
				System.out.printf("�������� �Է����ּ���: ");
				title = scanner.nextLine();
				bookmenu.data[i].setTitle(title);
				
				System.out.printf("�۰����� �Է����ּ���: ");
				author = scanner.nextLine();
				bookmenu.data[i].setAuthor(author);
				
				System.out.printf("���ǻ縦 �Է����ּ���: ");
				publisher = scanner.nextLine(); 
				bookmenu.data[i].setPublisher(publisher);
				
				System.out.println();
			    
				mgr.addBook(bookmenu.data[i]);
		
				i++; // Book��ü �迭�� �ε����� ������Ų��.
				
				break;
				
			case "2":
				System.out.printf("2.���� �˻�%n");
				System.out.printf("���� ������ �Է��ϼ���:");
				input = scanner.nextLine();
				mgr.searchBook(input);
				break;
				
			case "3":
				System.out.println("3.���� ��� ����");
				mgr.printBookList();
				System.out.println();
			break;
			
			case "4":
				System.out.println("4.���� ����");
				System.out.print("������ ���� ������ �Է��ϼ���:");
				input = scanner.nextLine();
				mgr.deleteBook(input);
				break;
			}
		}while(!key.equals("0")); 
			System.out.println("���� ���ø����̼��� �����մϴ�.\n");
		
	}
}
	