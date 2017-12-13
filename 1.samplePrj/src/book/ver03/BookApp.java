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
				new Book("삼국유사","일연","민음사","111-222-33",15000),
				new Book("식물의 힘","스티븐 리치","여문책","111-999-555",11000),
				new Book("리니지","신일숙","글벗","111-222-777",7000)
		};
		
		 BookMgr bm = null;
		 
			try {
				bm = new BookMgr();
			} catch (FileNotFoundException e) {
				bm = new BookMgr(book);
			}
				
		Scanner scanner = new Scanner(System.in);
			
		Q:while(true){
			System.out.println("개인 도서 관리 어플리케이션 v03");
			System.out.println("------------------------------------------------");
			
			do{
				System.out.printf("1.도서 등록  2.도서 검색  3.도서 목록 보기  4.도서 삭제   0.종료%n");
				System.out.printf("원하시는 메뉴 번호를 선택하세요:");
				try{
					key = scanner.nextInt();
					scanner.nextLine(); 
					if(0<=key&&key<=4) break;
					
				}catch(InputMismatchException e){
					System.out.println("번호를 다시 입력해주세요.");
					scanner.nextLine(); 
				}
			}while(!(0<=key&&key<=4));
									
			System.out.println("===============================================");
			
			switch(key){
			case 1: 
				System.out.printf("1.도서 등록%n");
				
				Book data = new Book();
				
				System.out.printf("도서명을 입력해주세요: ");
				title = scanner.nextLine();
				data.setTitle(title);
				
				System.out.printf("작가명을 입력해주세요: ");
				author = scanner.nextLine();
				data.setAuthor(author);
				
				System.out.printf("출판사를 입력해주세요: ");
				publisher = scanner.nextLine(); 
				data.setPublisher(publisher);
				
				System.out.printf("ISBN을 입력해주세요: ");
				isbn = scanner.nextLine();
				data.setIsbn(isbn);
				
				System.out.printf("도서정가를 입력해주세요: ");
				price = Integer.parseInt(scanner.nextLine());
				data.setPrice(price);
				System.out.println();
			    
				bm.addBook(data);
				
				break;
				
			case 2:
				System.out.printf("2.도서 검색%n");
				System.out.printf("도서 정보를 입력하세요:");
				input = scanner.nextLine();
				bm.searchBook(input);
				break;
				
			case 3:
				System.out.println("3.도서 목록 보기");
				try{
					bm.printBookList();
				}catch(NullPointerException e){
					System.out.println("책 목록이 없습니다.");
				}
				
				System.out.println();
			break;
			
			case 4:
				System.out.println("4.도서 삭제");
				System.out.print("삭제할 도서 정보를 입력하세요:");
				input = scanner.nextLine();
				bm.deleteBook(input);
				break;
				
			case 0:
				System.out.println("도서 어플리케이션을 종료합니다.\n");
				System.exit(0);
			}
		}			
	}
}


	