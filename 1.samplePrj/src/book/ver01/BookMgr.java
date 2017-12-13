package book.ver01;

import java.util.Scanner;

public class BookMgr{
	
		final int BASE = 100;
		int index = BASE;
	 	int count = 0;
	 	int counter = 0;
	 	boolean flag = false;
	 	
		Book[] bookList = new Book[BASE]; 
		Book[] tmpbookList = new Book[index];
		BookApp bookselectmenu = new BookApp();
		Scanner scanner = new Scanner(System.in);
						
		BookMgr(){
			System.out.println("Start");
		}	
		
	
		BookMgr(Book[] data){ 		//생성자 초기화 -> 생성자로 값을 넣어주는 Book객체 배열 초기화
					System.arraycopy(data, 0, bookList, count, data.length);	
					count = count + data.length;
		}
		
		public void addBook(Book book){	
			if(count >= bookList.length){	//bookList의 배열 인덱스가 초과되는 순간 기본배열 길이에 count를 더해주고 copy한 후 배열주소를 복사한다.
				index = BASE+count;
				Book[] tmpbookList = new Book[index];
				System.arraycopy(bookList, 0, tmpbookList, 0, bookList.length);
				bookList = tmpbookList;
			}else{
			bookList[count] = book;
			bookList[count].setId(count);	//도서 id는 count증가 전 count로 설정해야 배열 인덱스와 동일하게 자동으로 변동된다.
				 count++;
				}
			}
	
		public void searchBook(String input){
			int counter = 0;
			SEARCH: for(int j=0; j<count; j++){
				if(input.equals(bookList[j].getTitle())||equals(bookList[j].getAuthor())||input.equals(bookList[j].getPublisher())){
					System.out.printf("id:%d 도서명:%s 작가명:%s 출판사:%s%n%n",bookList[j].getId(),bookList[j].getTitle(),bookList[j].getAuthor(),bookList[j].getPublisher());
						counter ++;
					}else{
						continue SEARCH;
					}
				}
				if(counter == 0){
					System.out.println("찾으시는 도서가 없습니다.\n");
					System.out.println();
				}
		}
		
		public void printBookList(){
			System.out.println("================ 책 목록 ================");
			for(int i=0; i<count;i++){
				System.out.printf("id:%d 도서명:%s 작가명:%s 출판사:%s%n",
						bookList[i].getId(),bookList[i].getTitle(),bookList[i].getAuthor(),bookList[i].getPublisher());
			}
			System.out.println();
		}
		
		public void deleteBook(String input){
			boolean flag = true;
			DELETE: for(int i=0; i<count; i++){
				counter++;
				flag = input.equals(bookList[i].getId())||input.equals(bookList[i].getTitle())||input.equals(bookList[i].getAuthor())||input.equals(bookList[i].getPublisher());
						if(flag == true){
							System.out.println("삭제할 도서");
							bookList[i].display();
							counter++;
							System.out.println("=============================================");
							
						QUESTION: while(true){
							System.out.print("정말 삭제하시겠습니까?(y/n)");
							input = scanner.nextLine();
								if(input.equalsIgnoreCase("n")){
								break DELETE;
									}else if(input.equalsIgnoreCase("y")){
								System.arraycopy(bookList, i+1, bookList, i, count-i-1);
								count --;
								
								for(int id=0; id<count; id++){	//삭제 후 감소한 count에 맞춰서 id를 재등록한다.
									bookList[id].setId(id);	
								}
								
								System.out.println("삭제 성공했습니다.");
								System.out.println();
								counter++;
								continue DELETE;
									}else{
								continue QUESTION;
									}
							}
						
						}else{
							continue DELETE;
						}
					}
				if(!flag)
				System.out.println("삭제할 도서를 찾을 수 없습니다.");
				System.out.println();
			}
	
		public void printTotalPrice(){
			int pricesum=0;
			System.out.println("=== 책 가격의 총합 ===");
			for(int i=0; i<count;i++){
				pricesum += bookList[i].getPrice();         
			}
			System.out.println(pricesum);
		}
}




