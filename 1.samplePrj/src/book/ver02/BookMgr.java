package book.ver02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr{
	
	 	private int count = 0;
	 	int counter = 0;
	 	boolean flag = false;
	 	
	 	private List<Book> bookList = new ArrayList<Book>(1000);
	 	
		Scanner scanner = new Scanner(System.in);
						
		BookMgr() throws FileNotFoundException{
			String fileName = "C://file/book.txt";
			try(Scanner s = new Scanner(new File(fileName))){
				while(s.hasNextLine()){
				
					String readLine = s.nextLine();
					String[] data = readLine.split("/");
					bookList.add(new Book(data[0],data[1],data[2].trim()));
					
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				
			}
		}	
		
		
		public BookMgr(Book[] book) {
			for(int i=0; i<book.length;i++){
				bookList.add(book[i]);
			}
			//List<Book> d = Arrays.asList(book);
			//bookList.addAll(d);
		}


		public void addBook(Book book){	
			bookList.add(book);
			count++;
			}
	
		public void searchBook(String input){
			int counter = 0;
			SEARCH: for(Book data :bookList){
				if(input.equals(data.getTitle())||equals(data.getAuthor())||input.equals(data.getPublisher())){
					System.out.printf("id:%d ������:%s �۰���:%s ���ǻ�:%s%n%n",data.getTitle(),data.getAuthor(),data.getPublisher());
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
			for(Book data :bookList){
				System.out.printf("id:%d ������:%s �۰���:%s ���ǻ�:%s%n",
						 data.getTitle(), data.getAuthor(), data.getPublisher());
			}
			System.out.println();
		}
		
		public void deleteBook(String input){
			//Iterator������� ���ĺ���.
			/*Iterator<Book> it = bookList.iterator();
			while (it.hasNext()) {
				Book book = it.next();
				if(book.getTitle().equals(input)){
					System.out.println("���� ���� ����:"+book);
					it.remove();
				}
			}*/
			
			//�������
			boolean flag = true;
			DELETE: for(int i=0; i<bookList.size(); i++){
				counter++;
				flag = input.equals(input.equals(bookList.get(i).getTitle())||input.equals(bookList.get(i).getAuthor())||input.equals(bookList.get(i).getPublisher()));
						if(flag == true){
							System.out.println("������ ����");
							bookList.get(i).toString();
							counter++;
							System.out.println("=============================================");
							
						QUESTION: while(true){
							System.out.print("���� �����Ͻðڽ��ϱ�?(y/n)");
							input = scanner.nextLine();
								if(input.equalsIgnoreCase("n")){
								break DELETE;
									}else if(input.equalsIgnoreCase("y")){
								
								bookList.remove(i);
								
								System.out.println("���� �����߽��ϴ�.");
								System.out.println();
								
								continue DELETE;
									}else{
										continue QUESTION;
									}
							}
						
						}else if(flag == false){
							if(counter==bookList.size()){
								System.out.println("������ ������ �������� �ʽ��ϴ�.");
							}else{
								continue DELETE;	
							}
					}
				}
			}
	
		public void printTotalPrice(){
			int pricesum=0;
			System.out.println("=== å ������ ���� ===");
			for(int i=0; i<bookList.size();i++){
				pricesum += bookList.get(i).getPrice();         
			}
			System.out.println(pricesum);
		}
}




