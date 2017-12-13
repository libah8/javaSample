package book.ver03;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BookMgr{	 	
	 	
	 	private Map<String,Book> bookList = new HashMap<>();
	 	FileBook file = new FileBook();
		Scanner scanner = new Scanner(System.in);
		String fileName = "c://file/book.data";
		boolean flag = false;
		
		public BookMgr() throws FileNotFoundException{
			
			bookList = (Map<String,Book>)file.read(fileName);
			
			if(bookList == null || bookList.size()==0){
				String fileName = "c://file/sample1.txt";
				try(Scanner s = new Scanner(new File(fileName))){
					//bookList = new HashMap<String,Book>();
					while(s.hasNextLine()){
						String readLine = s.nextLine();
						String[] data = readLine.split("/");
						bookList.put(data[3], new Book(data[0],data[1],data[2],data[3],Integer.parseInt(data[4])));
					}
			}
		}			
		Thread job = new AutoSave();
		job.start();
	}
		
		public BookMgr(Book[] book) {
			for(int i=0;i<book.length;i++){
				bookList.put(book[i].getIsbn(),book[i]);	
			}
		}	
		
		public void save(){
			file.save(bookList, fileName);
		}
		
		public void addBook(Book book){	
			bookList.put(book.getIsbn(),book);
			file.save(bookList, fileName);
		}
	
		public void searchBook(String input){
			int counter = 0;
			//bookList = (Map<String,Book>)file.read(fileName);
			Iterator it = bookList.keySet().iterator();
		
				SEARCH: while (it.hasNext()) {
					String key = (String) it.next();
						if(input.equals((bookList.get(key)).getTitle())||input.equals((bookList.get(key)).getAuthor())||input.equals((bookList.get(key)).getPublisher())){
						System.out.println((bookList.get(key)).toString());
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
				//bookList = (Map<String,Book>)file.read(fileName);
				Iterator it = bookList.keySet().iterator();
					while (it.hasNext()) {
						String key = (String) it.next();
						System.out.println(bookList.get(key).toString());
					}
		}
		
		
		public void deleteBook(String input){
			
			boolean flag = false;
			
			int counter = 0;
			//bookList = (Map<String,Book>)file.read(fileName);
			Iterator<String> it = bookList.keySet().iterator();
			DELETE: while(it.hasNext()){
				counter++;
				String key = (String) it.next();
				flag = input.equals(bookList.get(key).getTitle())||input.equals(bookList.get(key).getAuthor())||input.equals(bookList.get(key).getPublisher());
						if(flag == true){
							System.out.println("삭제할 도서");
							bookList.get(key).toString();
					
							System.out.println("=============================================");
							
						QUESTION: while(true){
							System.out.print("정말 삭제하시겠습니까?(y/n)");
							input = scanner.nextLine();
								if(input.equalsIgnoreCase("n")){
								break DELETE;
									}else if(input.equalsIgnoreCase("y")){
								
								bookList.remove(key);
								System.out.println("삭제 성공했습니다.");
								System.out.println();
								
								continue DELETE;
									}else{
										continue QUESTION;
									}
							}
						
						}else if(flag == false){
							if(counter==bookList.size()){
								System.out.println("삭제할 도서가 존재하지 않습니다.");
							}else{
								continue DELETE;	
							}
					}
				}
			}
	
		
		public void printTotalPrice(){
			int sum=0;
			
			System.out.println("=== 책 가격의 총합 ===");
			//bookList = (Map<String,Book>)file.read(fileName);
			Iterator<String> it = bookList.keySet().iterator();
			while (it.hasNext()) {
				 String key = it.next();
				 sum += bookList.get(key).getPrice();     
			}
			System.out.println(sum);
		}
		
		class AutoSave extends Thread{
			@Override
			public void run(){
				while(true){
					try {
						Thread.sleep(50000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					file.save(bookList, fileName);
					System.out.println("AutoSave....");
				}
			}
		}

}





