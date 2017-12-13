package book.ver02;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * ArrayList변경
 * 
 * 예외처리 미완성
 * key
 * book멤버변수 
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
				new Book("삼국유사","일연","민음사"),
				new Book("키친","요시모토 바나나","문학동네"),
				new Book("리니지","신일숙","해남")
		};
		
		BookMgr bm = null;
		
		try{
			bm = new BookMgr();
		}catch(FileNotFoundException e){
			bm = new BookMgr(book);
		}
			
		Scanner scanner = new Scanner(System.in);
			
		Q:while(true){
			System.out.println("개인 도서 관리 어플리케이션 v02");
			System.out.println("------------------------------------------------");
			
			do{
				System.out.printf("1.도서 등록  2.도서 검색  3.도서 목록 보기  4.도서 삭제  0.종료%n");
				System.out.printf("원하시는 메뉴 번호를 선택하세요:");
				try{
					key = scanner.nextInt();
					scanner.nextLine(); 
					if(0<=key&&key<=4) break;
					
				}catch(InputMismatchException e){
					System.out.println("번호를 다시 입력해주세요.");
					scanner.nextLine(); 
					//scanner.nextLine()->nextInt()를 입력받고 남아 있는 엔터를 소진해준다.
					//try 블럭에서 scanner.nextLine()을 사용하면 예외가 발생했을 때 
					//엔터가 소진되지 않아서 무한 루프를 돌게된다.
				}
			}while(0<=key&&key<=4);
									
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
				bm.printBookList();
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


	