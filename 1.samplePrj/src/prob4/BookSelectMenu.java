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
			System.out.printf("1.도서 등록  2.도서 검색 3.도서 목록 보기  0.종료%n");
			System.out.printf("원하시는 메뉴 번호를 선택하세요:");
			key = Integer.parseInt(scanner.nextLine());
			System.out.println("======================================");
			
			i++;
			data[i] = new Book();
			
			switch(key){
			case 1: 
				System.out.printf("1.도서 등록%n");
				System.out.printf("도서 id등록: ");
				int id = Integer.parseInt(scanner.nextLine());
				System.out.printf("도서명: ");
				String title = scanner.nextLine();
				data[i].setTitle(title);
				System.out.println("작가명: ");
				String author = scanner.nextLine();
				data[i].setAuthor(author);
				System.out.printf("출판사: ");
				String publisher = scanner.nextLine(); 
				data[i].setPublisher(publisher);
				mgr.addBook(data[i]); 
				break;
				
			case 2:
				System.out.printf("2.도서 검색%n");
				System.out.printf("도서명을 입력하세요:");
				title = scanner.nextLine();
				//author = scanner.nextLine(); //도서명,작가, 출판사 모두 검색의 요소가 되어야한다.
				for(int j=0; j>i; j++){
					if(mgr.bookList[j].getTitle().equals(title)){
						System.out.printf("id:%d, 도서명:%s, 작가명:%s, 출판사:%s",mgr.bookList[j].getId(),mgr.bookList[j].getTitle(),mgr.bookList[j].getAuthor(),mgr.bookList[j].getPublisher());
					}else{
							System.out.println("찾으시는 도서가 없습니다.");
					}
				}
				break;
				
			case 3:
				System.out.println("3.도서 목록 보기");
				mgr.printBookList();
			}
		}while(key!=0);
			System.out.println("도서 어플리케이션을 종료합니다.");	
	}
}


