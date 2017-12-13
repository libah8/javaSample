package prob4;

import java.util.Scanner;

public class BookMgr{
	
		int count = 0;
		Book[] bookList = new Book[100]; 
		
		BookMgr(){}
		
		BookMgr(Book[] data){ 		//��ü�迭 �ʱ�ȭ
					System.arraycopy(data, 0, bookList, count, data.length);	
					count = count + data.length;
		}
		
		
		
		public void addBook(Book data){
				bookList[count] = data;
				 count++;
			}

		public void printBookList(){
			System.out.println("=== å ��� ===");
			for(int i=0; i<count;i++){
				System.out.printf("id:%d, ������:%s, �۰���:%s, ���ǻ�:%s%n",bookList[i].getId(),bookList[i].getTitle(),bookList[i].getAuthor(),bookList[i].getPublisher());
			}
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




