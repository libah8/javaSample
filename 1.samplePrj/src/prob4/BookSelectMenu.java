package prob4;

import java.util.Scanner;

//import prob4.Book;
//import prob4.BookMgr;
public class BookSelectMenu {

	public static void main(String[] args) {
		
		int count=0;
		
		Book[] data = new Book[100];
		BookMgr mgr = new BookMgr();
		
		int key=0;
		int i = 0;
		do{
			Scanner scanner = new Scanner(System.in);
			System.out.printf("1.���� ���  2.���� �˻� 3.���� ��� ����  0.����%n");
			System.out.printf("���Ͻô� �޴� ��ȣ�� �����ϼ���:");
			key = Integer.parseInt(scanner.nextLine());
			System.out.println("======================================");
			
			i++;
			data[i] = new Book();
			
			switch(key){
			case 1: 
				System.out.printf("1.���� ���%n");
				System.out.printf("���� id���: ");
				int id = Integer.parseInt(scanner.nextLine());
				System.out.printf("������: ");
				String title = scanner.nextLine();
				data[i].setTitle(title);
				System.out.println("�۰���: ");
				String author = scanner.nextLine();
				data[i].setAuthor(author);
				System.out.printf("���ǻ�: ");
				String publisher = scanner.nextLine(); 
				data[i].setPublisher(publisher);
				mgr.addBook(data[i]); 
				break;
				
			case 2:
				System.out.printf("2.���� �˻�%n");
				System.out.printf("�������� �Է��ϼ���:");
				title = scanner.nextLine();
				//author = scanner.nextLine(); //������,�۰�, ���ǻ� ��� �˻��� ��Ұ� �Ǿ���Ѵ�.
				for(int j=0; j>i; j++){
					if(mgr.bookList[j].getTitle().equals(title)){
						System.out.printf("id:%d, ������:%s, �۰���:%s, ���ǻ�:%s",mgr.bookList[j].getId(),mgr.bookList[j].getTitle(),mgr.bookList[j].getAuthor(),mgr.bookList[j].getPublisher());
					}else{
							System.out.println("ã���ô� ������ �����ϴ�.");
					}
				}
				break;
				
			case 3:
				System.out.println("3.���� ��� ����");
				mgr.printBookList();
			}
		}while(key!=0);
			System.out.println("���� ���ø����̼��� �����մϴ�.");	
	}
}


