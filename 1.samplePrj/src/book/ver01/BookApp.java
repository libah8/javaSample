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
			System.out.println("개인 도서관리 어플리케이션");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				do{
					System.out.printf("1.도서 등록  2.도서 검색  3.도서 목록 보기  4.도서 삭제  0.종료%n");
					System.out.printf("원하시는 메뉴 번호를 선택하세요:");
					key = scanner.nextLine();
					}while(!key.equals("1")&&!key.equals("2")&&!key.equals("3")&&!key.equals("4")&&!key.equals("0"));
					
			System.out.println("===============================================");
			
			switch(key){
			case "1": 
				System.out.printf("1.도서 등록%n");
				
				 if(i==bookmenu.index){	//Book객체 배열의 마지막 요소의 인덱스가 Book객체 배열길이와 같을 경우 배열요소의 개수를 초과 
					bookmenu.index = bookmenu.index+bookmenu.BASE;	 
					bookmenu.tmpdata = new Book[bookmenu.index];
					System.arraycopy(bookmenu.data, 0, bookmenu.tmpdata, 0, bookmenu.data.length);
					bookmenu.data = bookmenu.tmpdata; //새로운 배열에 원본 배열을 복사해서 주소를 복사한다.
				 }
				 
				bookmenu.data[i] = new Book();
				
				//bookmenu.data[i].setId(i); //도서 id를 저장한다.
				
				System.out.printf("도서명을 입력해주세요: ");
				title = scanner.nextLine();
				bookmenu.data[i].setTitle(title);
				
				System.out.printf("작가명을 입력해주세요: ");
				author = scanner.nextLine();
				bookmenu.data[i].setAuthor(author);
				
				System.out.printf("출판사를 입력해주세요: ");
				publisher = scanner.nextLine(); 
				bookmenu.data[i].setPublisher(publisher);
				
				System.out.println();
			    
				mgr.addBook(bookmenu.data[i]);
		
				i++; // Book객체 배열의 인덱스를 증가시킨다.
				
				break;
				
			case "2":
				System.out.printf("2.도서 검색%n");
				System.out.printf("도서 정보를 입력하세요:");
				input = scanner.nextLine();
				mgr.searchBook(input);
				break;
				
			case "3":
				System.out.println("3.도서 목록 보기");
				mgr.printBookList();
				System.out.println();
			break;
			
			case "4":
				System.out.println("4.도서 삭제");
				System.out.print("삭제할 도서 정보를 입력하세요:");
				input = scanner.nextLine();
				mgr.deleteBook(input);
				break;
			}
		}while(!key.equals("0")); 
			System.out.println("도서 어플리케이션을 종료합니다.\n");
		
	}
}
	