package book.ver01;

public class Book {
		
	private int id;
	private String title; 
	private int price;
	private String author;
	private String publisher;	
	
	public Book() {
		
	}
	
	public Book(int id, String title, int price, String author, String publisher) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	public void display(){
		String d = "[도서id:"+ id + ", 도서명:" + title + ", 작가명:" + author + ", 출판사:" + publisher + "]";
		System.out.println(d);
	}
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("[도서id:");
		str.append(id);
		str.append(", 도서명:");
		str.append(title);
		str.append( ", 작가명:");
		str.append(author);
		str.append(", 출판사:");
		str.append(publisher);
		str.append("]");
		
		return str.toString();
	}
}
