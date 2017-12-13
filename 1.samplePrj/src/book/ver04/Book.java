package book.ver04;

import java.io.Serializable;

public class Book implements Comparable<Book>,Serializable{
		
	private String title; 
	private int price;
	private String author;
	private String publisher;	
	private String isbn;
	
	public Book() {
		
	}
	
	public Book(String title, String author, String publisher, String isbn, int price) {

		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.price = price;
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
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String toString(){
		StringBuilder str = new StringBuilder();
		
		str.append("[");
		str.append("도서명:");
		str.append(title);
		str.append( ", 작가명:");
		str.append(author);
		str.append(", 출판사:");
		str.append(publisher);
		str.append(", ISBN:");
		str.append(isbn);
		str.append(", 도서정가:");
		str.append(price);
		str.append("]");
		
		return str.toString();
	}
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}


