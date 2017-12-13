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
		
	
		BookMgr(Book[] data){ 		//������ �ʱ�ȭ -> �����ڷ� ���� �־��ִ� Book��ü �迭 �ʱ�ȭ
					System.arraycopy(data, 0, bookList, count, data.length);	
					count = count + data.length;
		}
		
		public void addBook(Book book){	
			if(count >= bookList.length){	//bookList�� �迭 �ε����� �ʰ��Ǵ� ���� �⺻�迭 ���̿� count�� �����ְ� copy�� �� �迭�ּҸ� �����Ѵ�.
				index = BASE+count;
				Book[] tmpbookList = new Book[index];
				System.arraycopy(bookList, 0, tmpbookList, 0, bookList.length);
				bookList = tmpbookList;
			}else{
			bookList[count] = book;
			bookList[count].setId(count);	//���� id�� count���� �� count�� �����ؾ� �迭 �ε����� �����ϰ� �ڵ����� �����ȴ�.
				 count++;
				}
			}
	
		public void searchBook(String input){
			int counter = 0;
			SEARCH: for(int j=0; j<count; j++){
				if(input.equals(bookList[j].getTitle())||equals(bookList[j].getAuthor())||input.equals(bookList[j].getPublisher())){
					System.out.printf("id:%d ������:%s �۰���:%s ���ǻ�:%s%n%n",bookList[j].getId(),bookList[j].getTitle(),bookList[j].getAuthor(),bookList[j].getPublisher());
						counter ++;
					}else{
						continue SEARCH;
					}
				}
				if(counter == 0){
					System.out.println("ã���ô� ������ �����ϴ�.\n");
					System.out.println();
				}
		}
		
		public void printBookList(){
			System.out.println("================ å ��� ================");
			for(int i=0; i<count;i++){
				System.out.printf("id:%d ������:%s �۰���:%s ���ǻ�:%s%n",
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
							System.out.println("������ ����");
							bookList[i].display();
							counter++;
							System.out.println("=============================================");
							
						QUESTION: while(true){
							System.out.print("���� �����Ͻðڽ��ϱ�?(y/n)");
							input = scanner.nextLine();
								if(input.equalsIgnoreCase("n")){
								break DELETE;
									}else if(input.equalsIgnoreCase("y")){
								System.arraycopy(bookList, i+1, bookList, i, count-i-1);
								count --;
								
								for(int id=0; id<count; id++){	//���� �� ������ count�� ���缭 id�� �����Ѵ�.
									bookList[id].setId(id);	
								}
								
								System.out.println("���� �����߽��ϴ�.");
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
				System.out.println("������ ������ ã�� �� �����ϴ�.");
				System.out.println();
			}
	
		public void printTotalPrice(){
			int pricesum=0;
			System.out.println("=== å ������ ���� ===");
			for(int i=0; i<count;i++){
				pricesum += bookList[i].getPrice();         
			}
			System.out.println(pricesum);
		}
}




