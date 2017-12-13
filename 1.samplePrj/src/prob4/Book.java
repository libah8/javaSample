package prob4;
/*Book Ŭ������ ��������
1. å ����(title)�� ����(price)������ �����ϴ� ��������� �־�� �Ѵ�.
2. ��������� ��� private ���������ڸ� ������ �Ѵ�. 
3. ��������� ��� �ʱ�ȭ�ϴ� ������ �޼��尡 �־�� �Ѵ�. 
4. ��������� ���� �����ϰ� �����ϴ� setter/getter �޼��尡 �־�� �Ѵ�.
setTitle(String title) : ������� title ���� �����ϴ� �޼ҵ�
String getTitle() : ������� title ���� ��ȯ�ϴ� �޼ҵ�
    void setPrice(int price) : ������� price ���� �����ϴ� �޼ҵ�
int getPrice() : ������� price ���� ��ȯ�ϴ� �޼ҵ� 
5. setter/getter �޼���� ��� public ���������ڸ� ������ �Ѵ�. 

[Prob4 ������]
=== å ��� ===
Java Program
JSP Program
SQL Fundamentals
JDBC Program
EJB Program

=== å ������ ���� ===
��ü å ������ �� : 132000
*/
public class Book {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String title; 
	private int price;
	private String author;
	private String publisher;
	
	
	
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

	public Book(){}
	
	public Book(String title, int price) {
		this.setTitle(title);
		this.setPrice(price);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void setPrice(int price) {
		if(price <0){
			System.out.println("å ������ 0�� �̻��Դϴ�.");
			return;
		}
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}
